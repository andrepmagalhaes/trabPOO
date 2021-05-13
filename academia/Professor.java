package academia;
import java.io.Serializable;

import java.util.ArrayList;

public class Professor extends Pessoa implements Serializable {
    
    //private ArrayList<Aula> aulas;
    private double salario;
    private double disponivel;
    private ArrayList<Aula> aulas;
    
    public Professor(String nome, String login, String senha, double salario)
    {
        super(nome, login, senha);
        this.aulas = new ArrayList<Aula>();
        this.salario = salario;
        //this.aulas = new ArrayList<Aula>();
    }

    public ArrayList<Aula> getAulas()
    {
        return this.aulas;
    }
    public void addAula(Aula aula)
    {
        this.aulas.add(aula);
    }
    /*
compareTo(anotherDate)
    public void updateSalario(double s){
        this.salario += s;
    }*/

    public double getSalario(){
        return this.salario;
    }

    public String getDisponivel(){
        return String.valueOf(this.disponivel);
    }
    public void setDisponivel(double x){
        this.disponivel += x;
    }

    @Override
     public boolean equals(Object o) {
          if (o instanceof Professor) {
               o = (String) o;
          }
          return o.equals(this.getLogin());
     }
}
