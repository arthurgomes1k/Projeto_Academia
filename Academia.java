
import java.util.ArrayList;

public class Academia {

    private String nome_da_academia;
    private Administrador administrador;
    ArrayList<Plano> planos = new ArrayList();
    private Financeiro financeiro;
    ArrayList<Cliente> clientes = new ArrayList();
    ArrayList<Personal_trainer> personais = new ArrayList();
    ArrayList<Secretario> secretarios = new ArrayList();
    ArrayList<Cliente> inadimplentes = new ArrayList();
    ArrayList<String> treino_A = new ArrayList();
    ArrayList<String> treino_B = new ArrayList();
    ArrayList<String> treino_C = new ArrayList();

    public void criarPlanos(){
        Plano classic = new Plano();
        classic.setNome_do_plano("Classic");
        classic.setValor(100);
        classic.setQuantidade_de_alunos(50);

        Plano master = new Plano();
        master.setNome_do_plano("Master");
        master.setValor(200);
        master.setQuantidade_de_alunos(100);

        Plano muscle = new Plano();
        muscle.setNome_do_plano("Muscle");
        muscle.setValor(300);
        muscle.setQuantidade_de_alunos(200);

        planos.add(classic);
        planos.add(master);
        planos.add(muscle);
    }


    //Sets e Gets Padrões

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

    public ArrayList<Plano> getPlanos() {
        return planos;
    }

    public void setPlanos(ArrayList<Plano> planos) {
        this.planos = planos;
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

    public void setTreino_A(ArrayList<String> treino_A) {
        this.treino_A = treino_A;
    }
    
    public ArrayList<String> getTreino_A() {
        return treino_A;
    }

    public void setTreino_B(ArrayList<String> treino_B) {
        this.treino_B = treino_B;
    }

    public ArrayList<String> getTreino_B() {
        return treino_B;
    }

    public void setTreino_C(ArrayList<String> treino_C) {
        this.treino_C = treino_C;
    }

    public ArrayList<String> getTreino_C() {
        return treino_C;
    }

}
