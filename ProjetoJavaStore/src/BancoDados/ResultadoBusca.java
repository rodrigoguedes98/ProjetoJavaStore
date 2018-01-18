package BancoDados;

public class ResultadoBusca {
    private int id;
    private String nome;
    private int juridico;
    private String idcliente;
    private String razaoSocial_Rg;
    private String endereco;
    private String login;
    private String senha;
public ResultadoBusca(){
    
}
    public ResultadoBusca(int id, String nome, int juridico, String idcliente, String razaoSocial_Rg, String endereco, String login, String senha) {
        this.id = id;
        this.nome = nome;
        this.juridico = juridico;
        this.idcliente = idcliente;
        this.razaoSocial_Rg = razaoSocial_Rg;
        this.endereco = endereco;
        this.login = login;
        this.senha = senha;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public int getJuridico() {
        return juridico;
    }

    public String getIdcliente() {
        return idcliente;
    }

    public String getRazaoSocial_Rg() {
        return razaoSocial_Rg;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getLogin() {
        return login;
    }

    public String getSenha() {
        return senha;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setJuridico(int juridico) {
        this.juridico = juridico;
    }

    public void setIdcliente(String idcliente) {
        this.idcliente = idcliente;
    }

    public void setRazaoSocial_Rg(String razaoSocial_Rg) {
        this.razaoSocial_Rg = razaoSocial_Rg;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    
    
}

