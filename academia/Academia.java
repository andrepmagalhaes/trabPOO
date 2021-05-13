package academia;

import java.io.IOException;
import java.util.ArrayList;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
//import java.text.ParseException;
//import java.text.SimpleDateFormat;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.Date;

public class Academia implements Serializable
{
    public static Caixa caixa = new Caixa();
    public static ArrayList<Aluno> alunos = new ArrayList<Aluno>();
    public static ArrayList<Professor> professores = new ArrayList<Professor>();
    public static ArrayList<Equipamento> equipamentos = new ArrayList<Equipamento>();
    public static ArrayList<Aula> aulas = new ArrayList<Aula>();
    public static Agenda agenda = new Agenda();
    public static Aluno currentSessionAluno = null;
    public static Professor currentSessionProfessor = null;

    // public Academia()
    // {
    //     // this.caixa = new Caixa();
    //     // this.alunos = new ArrayList<Aluno>();
    //     // this.professores = new ArrayList<Professor>();
    //     // this.equipamentos = new ArrayList<Equipamento>();
    //     // this.aulas = new ArrayList<Aula>();
    //     // this.agenda = new Agenda();
    // }

    public static int loginAluno(String login, String senha)
    {
        Aluno aluno = null;
        for(Aluno al : Academia.alunos)
        {
            if(al.getLogin().compareTo(login) == 0)
            {
                aluno = al;
            }
        }

        if(aluno == null)
        {
            return 0;
        }

        if(aluno.getSenha().compareTo(senha) == 0)
        {
            Academia.currentSessionAluno = aluno;
            return 1;
        }

        return 0;

    }

    public static int loginProfessor(String login, String senha)
    {
        Professor professor = null;

        for(Professor prof : Academia.professores)
        {
            if(prof.getLogin().compareTo(login) == 0)
            {
                professor = prof;
            }
        }

        if(professor == null)
        {
            return 0;
        }

        if(professor.getSenha().compareTo(senha) == 0)
        {
            Academia.currentSessionProfessor = professor;
            return 1;
        }

        return 0;

    }

    public static int loginAdmin(String login, String senha)
    {


        if((login.compareTo("admin") == 0) && (senha.compareTo("admin") == 0))
        {
            return 1;
        }

        return 0;

    }

    public static void addAula(Professor professor, String nome, ArrayList<Equipamento> equipamentos)
    {
        Academia.aulas.add(new Aula(professor, nome, equipamentos));
    }

    public static void addProfessor(String nome, String login, String senha, double salario)
    {
        Academia.professores.add(new Professor(nome, login, senha, salario));
    }

    public static void addAluno(String nome, String login, String senha, int nivel, double peso, double altura, double mensalidade)
    {
        Academia.alunos.add(new Aluno(nome, login, senha, nivel, peso, altura, mensalidade));
    }

    public static void addEquipment(String nome)
    {
        Academia.equipamentos.add(new Equipamento(nome));
    }

    public static void addSchedule(Date data, int[] horario, Aluno aluno, Professor professor, ArrayList<Equipamento> equipamentos)
    {
           agenda.addAppointment(data, horario, aluno, professor, equipamentos);
    }

    public static void cobrarMensalidade()
    {
        for(Aluno aluno : Academia.alunos)
        {
            aluno.updateShouldPay(true);
        }
    }

    public static void pagarMensalidade(Aluno aluno)
    {
        Academia.caixa.credito(aluno.getMensalidade());
        aluno.updateShouldPay(false);
    }

    public static void pagarProfessores()
    {
        double montanteSalarios = 0.0;

        for(Professor professor : Academia.professores)
        {
            montanteSalarios += professor.getSalario();
        }

        Academia.caixa.debito(montanteSalarios);
    }
    
    public static void saveData() throws IOException
    {
        try{
            FileOutputStream writeData = new FileOutputStream("alunosData.ser");
            ObjectOutputStream writeStream = new ObjectOutputStream(writeData);

            FileOutputStream writeData1 = new FileOutputStream("professoresData.ser");
            ObjectOutputStream writeStream1 = new ObjectOutputStream(writeData1);

            FileOutputStream writeData2 = new FileOutputStream("equipamentosData.ser");
            ObjectOutputStream writeStream2 = new ObjectOutputStream(writeData2);

            FileOutputStream writeData3 = new FileOutputStream("agendaData.ser");
            ObjectOutputStream writeStream3 = new ObjectOutputStream(writeData3);

            FileOutputStream writeData4 = new FileOutputStream("caixaData.ser");
            ObjectOutputStream writeStream4 = new ObjectOutputStream(writeData4);

            FileOutputStream writeData5 = new FileOutputStream("aulasData.ser");
            ObjectOutputStream writeStream5 = new ObjectOutputStream(writeData5);
        
            writeStream.writeObject(Academia.alunos);
            writeStream.flush();
            writeStream.close();

            writeStream1.writeObject(Academia.professores);
            writeStream1.flush();
            writeStream1.close();

            writeStream2.writeObject(Academia.equipamentos);
            writeStream2.flush();
            writeStream2.close();

            writeStream3.writeObject(Academia.agenda);
            writeStream3.flush();
            writeStream3.close();

            writeStream4.writeObject(Academia.caixa);
            writeStream4.flush();
            writeStream4.close();

            writeStream5.writeObject(Academia.aulas);
            writeStream5.flush();
            writeStream5.close();
        
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public static void loadData()
    {
        try{
            FileInputStream readData = new FileInputStream("alunosData.ser");
            ObjectInputStream readStream = new ObjectInputStream(readData);

            FileInputStream readData1 = new FileInputStream("professoresData.ser");
            ObjectInputStream readStream1 = new ObjectInputStream(readData1);

            FileInputStream readData2 = new FileInputStream("equipamentosData.ser");
            ObjectInputStream readStream2 = new ObjectInputStream(readData2);

            FileInputStream readData3 = new FileInputStream("agendaData.ser");
            ObjectInputStream readStream3 = new ObjectInputStream(readData3);

            FileInputStream readData4 = new FileInputStream("caixaData.ser");
            ObjectInputStream readStream4 = new ObjectInputStream(readData4);

            FileInputStream readData5 = new FileInputStream("aulasData.ser");
            ObjectInputStream readStream5 = new ObjectInputStream(readData5);
            
            Academia.caixa = (Caixa) readStream4.readObject();
            readStream4.close();
        
            Academia.alunos = (ArrayList<Aluno>) readStream.readObject();
            readStream.close();

            Academia.professores = (ArrayList<Professor>) readStream1.readObject();
            readStream1.close();

            Academia.equipamentos = (ArrayList<Equipamento>) readStream2.readObject();
            readStream2.close();
            
            Academia.aulas= (ArrayList<Aula>) readStream5.readObject();
            readStream5.close();

            Academia.agenda = (Agenda) readStream3.readObject();
            readStream3.close();


        }catch (Exception e) {
            e.printStackTrace();
        }
    }

}