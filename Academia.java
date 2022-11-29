
import java.util.ArrayList;

public class Academia {

    private String nome_da_academia;
    private Administrador administrador;
    private Planos plano;
    private Financeiro financeiro;
    ArrayList<Cliente> clientes = new ArrayList();
    ArrayList<Personal_trainer> personais = new ArrayList();
    ArrayList<Secretario> secretarios = new ArrayList();
    ArrayList<Cliente> inadimplentes = new ArrayList();
    ArrayList<String> treinos = new ArrayList();

    
    public String getNome_da_academia() {
        return nome_da_academia;
    }

    public void setNome_da_academia(String nome_da_academia) {
        this.nome_da_academia = nome_da_academia;
    }

    public Administrador getAdministrador() {
        return administrador;
    }

    public void setAdministrador(Administrador administrador) {
        this.administrador = administrador;
    }

    public void setPlano(Planos plano) {
        this.plano = plano;
    }

    public Planos getPlano() {
        return plano;
    }

    public Financeiro getFinanceiro() {
        return financeiro;
    }
    
    public void setFinanceiro(Financeiro financeiro) {
        this.financeiro = financeiro;
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }

    public ArrayList<Personal_trainer> getPersonais() {
        return personais;
    }

    public void setPersonais(ArrayList<Personal_trainer> personais) {
        this.personais = personais;
    }

    public ArrayList<Secretario> getSecretarios() {
        return secretarios;
    }

    public void setSecretarios(ArrayList<Secretario> secretarios) {
        this.secretarios = secretarios;
    }

    public ArrayList<Cliente> getInadimplentes() {
        return inadimplentes;
    }

    public void setInadimplentes(ArrayList<Cliente> inadimplentes) {
        this.inadimplentes = inadimplentes;
    }

    public ArrayList<String> getTreinos() {
        return treinos;
    }

    public void setTreinos(ArrayList<String> treinos) {
        this.treinos = treinos;
    }




    //Sets e Gets Padrões

    

}
