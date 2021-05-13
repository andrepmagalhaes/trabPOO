package academia;
import java.io.Serializable;

public class Pessoa implements Serializable{
    private String nome;
    private String login;
    private String senha;

    public Pessoa(String nome, String login, String senha)
    {
        this.nome = nome;
        this.login = login;
        this.senha = senha;
    }

    public String getNome()
    {
        return this.nome;
    }

    public String getLogin()
    {
        return this.login;
    }

    public String getSenha()
    {
        return this.senha;
    }
    
    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public void setSenha(String senha)
    {
        this.senha = senha;
    }
}
