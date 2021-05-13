package academia;
import java.io.Serializable;

import java.util.ArrayList;

//oi ia ai bom ?
//n 
public class Aluno extends Pessoa implements Serializable{
   private int nivel;
   private double peso;
   private double altura;
   private double imc;
   private double mensalidade;
   private double pendente;
   private boolean shouldPay;
//private ArrayList<Aula> aulas;
   private ArrayList<Aula> aulas;
   //private Agenda agenda;
   
   public Aluno(String nome, String login, String senha, int nivel, double peso, double altura, double mensalidade)
   {
        super(nome, login, senha);
        aulas = new ArrayList<Aula>();
        this.nivel = nivel;
        this.peso = peso;
        this.altura = altura;
        this.mensalidade = mensalidade;
        this.shouldPay = false;
   }

  //@Override
  //public void compareTo() {}

   public void setMensalidade(double m){
        this.mensalidade = m;
   }

   public double getMensalidade(){
        return this.mensalidade;
   }

   public void setPendente(double x){
        pendente += x;
   }

   public String getPendente(){
        return String.valueOf(pendente);
   }

   public boolean getShouldPay()
   {
        return this.shouldPay;
   }

   public void updateShouldPay(boolean val)
   {
        this.shouldPay = val;
   }

   public int getNivel()
   {
        return this.nivel;
   }

   public void setNivel(int nivel)
   {
        this.nivel = nivel;
   }

   public double getPeso()
   {
        return this.peso;
   }

   public void setPeso(double peso)
   {
        this.peso = peso;
        calcImc();
   }

   public double getAltura()
   {
        return this.altura;

    }

   public void setAltura(double altura)
   {
        this.altura = altura;
        calcImc();
   }

   private void calcImc()
   {
       this.imc = this.peso / (this.altura * this.altura);
   }

   public double getImc()
   {
       return this.imc;
   }

   public void addAula(/*Aula aula,*/ Aula aula)
   {
        //this.aulas.add(aula);
        this.aulas.add(aula);
   }

   public ArrayList<Aula> getAulas()
   {
        return this.aulas;
   }
}
