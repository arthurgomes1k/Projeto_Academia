
public class Usuario {
    
    protected String nome;
    protected String senha;
    protected String acesso;
    protected String email;
    protected String numero_contato;
    protected boolean online = false;

    public void verificarLogin(String email, String senha){
        if(getEmail().equals(email) && getSenha().equals(senha)){
            setOnline(true);
            System.out.println("Login realizado com sucesso!");
            System.out.println();
        }else{
            setOnline(false);
            System.out.println("Senha incorreta!");
            System.out.println();
            
        }
    }        

    public void acessarPerfil(){}
    

    //Sets e Gets Padrões
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getSenha() {
        return senha;
    }

    public void setAcesso(String acesso) {
        this.acesso = acesso;
    }

    public String getAcesso() {
        return acesso;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNumero_contato() {
        return numero_contato;
    }

    public void setNumero_contato(String numero_contato) {
        this.numero_contato = numero_contato;
    }

    public boolean getOnline() {
        return online;
    }

    public void setOnline(boolean online) {
        this.online = online;
    }
}
