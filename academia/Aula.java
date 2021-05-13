package academia;

import java.io.Serializable;
import java.util.ArrayList;

public class Aula implements Serializable{
    private Professor professor;
    private String nome;
    private ArrayList<Equipamento> equipamentos;

    public Aula(Professor professor, String nome, ArrayList<Equipamento> equipamentos)
    {
        this.professor = professor;
        this.nome = nome;
        this.equipamentos = new ArrayList<Equipamento>(equipamentos);
    }

    public Professor getProfessor()
    {
        return this.professor;
    }

    public String getNome(){
        return this.nome;
    }

    public ArrayList<Equipamento> getEquipamentos()
    {
        return this.equipamentos;
    }
}
