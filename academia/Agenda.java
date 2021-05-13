package academia;

import java.util.Date;
import java.util.ArrayList;
import java.util.Collections;
import java.io.Serializable;

public class Agenda implements Serializable{
    public ArrayList<Dia> dias;

    public Agenda() {
        dias = new ArrayList<Dia>();
    }

    public void newDia(Date data)
    {
        Dia aux = new Dia(data);
        dias.add(aux);
        Collections.sort(dias);
    }

    public Dia findDia(Date dateFind)
    {
        String date1 = String.format("%d-%d-%d", dateFind.getDate(), dateFind.getMonth() + 1, dateFind.getYear() + 1900);
        String date2;
        for(Dia dia : this.dias)
        {
            date2 = String.format("%d-%d-%d", dia.data.getDate(), dia.data.getMonth() + 1, dia.data.getYear() + 1900);
            if((date1).compareTo(date2) == 0)
            {
                return dia;
            }
        }

        return null;
    }

    public void addAppointment(Date data, int[] horarios, Aluno aluno, Professor professor, ArrayList<Equipamento> equipamentos){
        Dia aux = findDia(data);

        if( aux != null)
        {   
            int index = 0;
            for(int horario : horarios)
            {
                aux.horarios.get(horario).findEquipamento(equipamentos.get(index)).alugarEquipamento(professor, aluno);
                index++;
            }
        }
    }

    public class Dia implements Comparable<Dia>, Serializable{
        public ArrayList<Horario> horarios;
        public Date data;

        public Dia(Date data) {
            horarios = new ArrayList<Horario>();
            for (int i = 0; i < 29; i++) {
                horarios.add(new Horario());
            }

            this.data = data;
        }

        @Override
        public int compareTo(Dia u) {
            return this.data.compareTo(u.data);
        }

        @Override
        public boolean equals(Object o) {
            if (o instanceof Dia) {
                o = (Date) o;
            }
            return o.equals(this.data);
        }

    }

    public class Horario implements Serializable{
        public ArrayList<DisponibilidadeEquipamento> disponibilidadeEquipamentos;

        public Horario() {
            disponibilidadeEquipamentos = new ArrayList<DisponibilidadeEquipamento>();

            for (Equipamento equipamento : Academia.equipamentos) {
                disponibilidadeEquipamentos.add(new DisponibilidadeEquipamento(equipamento));
            }
        }

        public DisponibilidadeEquipamento findEquipamento(Equipamento equipamento)
        {
            for(DisponibilidadeEquipamento dispEq : this.disponibilidadeEquipamentos)
            {
                if(dispEq.equipamento.toString().compareTo(equipamento.toString()) == 0)
                {
                    return dispEq;
                }
            }

            return null;
        }
    }

    public class DisponibilidadeEquipamento implements Serializable {
        private Equipamento equipamento;
        private boolean disponibilidade;
        private Professor professor;
        private Aluno aluno;

        public DisponibilidadeEquipamento(Equipamento equipamento) {
            this.equipamento = equipamento;
            this.professor = null;
            this.aluno = null;
            this.disponibilidade = true;
        }

        public Equipamento getEquipamento() {
            return this.equipamento;
        }

        public boolean getDisponibilidade() {
            return this.disponibilidade;
        }

        public void alugarEquipamento(Professor professor, Aluno aluno) {
            if(this.disponibilidade == false)
            {
                return;
            }
            this.disponibilidade = false;
            this.professor = professor;
            this.aluno = aluno;
        }

        public void devolverEquipamento() {
            this.disponibilidade = true;
            this.professor = null;
            this.aluno = null;
        }

        public Aluno getUsando(){
            return this.aluno;
        }
        public Professor getLecionando(){
            return this.professor;
        }
    }

    // private class Horario implements Comparable<Horario>
    // {
    // private Calendar horarioInicio;
    // private Calendar horarioFim;

    // public Horario(Calendar horarioInicio, Calendar horarioFim)
    // {
    // this.horarioInicio = horarioInicio;
    // this.horarioFim = horarioFim;
    // }

    // public int compare(Object x, Object y) {
    // Calendar xcal = (Calendar) x;
    // Calendar ycal = (Calendar) y;
    // if ( xcal.before(ycal) ) return -1;
    // if ( xcal.after(ycal) ) return 1;
    // return 0;
    // }

    // public Calendar getHorarioInicio()
    // {
    // return this.horarioInicio;
    // }

    // public Calendar getHorarioFim()
    // {
    // return this.horarioFim;
    // }

    // public void setHorarioInicio(Calendar newHorario)
    // {
    // this.horarioInicio = newHorario;
    // }

    // public void setHorarioFim(Calendar newHorario)
    // {
    // this.horarioFim = newHorario;
    // }
    // }
}
