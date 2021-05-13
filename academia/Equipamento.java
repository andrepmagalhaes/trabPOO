package academia;
import java.io.Serializable;

public class Equipamento implements Serializable{
    private String nome;
    public Equipamento(String nome)
    {
        this.nome = nome;
    }

    public String toString()
    {
        return this.nome;
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Equipamento) {
            o = (String) o.toString();
        }
        return o.equals(this.toString());
    }
}
