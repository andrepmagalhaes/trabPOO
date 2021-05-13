

import academia.*;

import java.util.Date;
 
public class Main{
    
public static void main(String args[])
    {
        
        try
        {
            Academia.loadData();
            new GUI_Login();

            // //System.out.println("heheeh");
            // Academia.addEquipment("mouse");
            // Academia.addEquipment("teclado");
            // Academia.addProfessor("joselito", "hehehe", "123", 123.45);
            // //System.out.println(Academia.professores.get(0).getNome());
            // //System.out.println(Academia.aulas.size());
            // Academia.addAula(Academia.professores.get(0), "aula1", Academia.equipamentos);
            // //System.out.println(Academia.aulas.size());
            // Academia.addAluno("reginaldo", "login", "senha", 1, 12.2, 2.4, 8000.69);
            // //System.out.println(Academia.alunos.get(0).getNome());
            // //System.out.println("login " + Academia.loginAluno("login", "senha"));
            // Academia.cobrarMensalidade();
            // //Academia.pagarMensalidade(Academia.alunos.get(0));
            // Academia.pagarProfessores();
            // //Academia.addSchedule(new Date(), 0, Academia.professores.get(0), Academia.alunos.get(0), Academia.aulas.get(0));
            // Academia.loginProfessor("hehehe", "123");
            // Date da = new Date();
            // int[] a = {0, 1};
            // Academia.agenda.newDia(da);
            // Academia.addSchedule(da, a, Academia.alunos.get(0), Academia.professores.get(0), Academia.equipamentos);
            

        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        
    }
}