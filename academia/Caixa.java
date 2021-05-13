package academia;
import java.io.Serializable;

public class Caixa implements Serializable{
    private double caixa;

    public Caixa()
    {
        this.caixa = 0.0;
    }

    public double getCaixa()
    {
        return this.caixa;
    }

    public void credito(double val)
    {
        this.caixa += val;
    }

    public void debito(double val)
    {
        this.caixa -= val;
    }

    public String toString()
    {
        return String.format("%d", this.caixa);
    }
}
