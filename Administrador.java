package Projeto_Academia;

public class Administrador extends Usuario {

    private Academia academia;
    private Planos plano;


    public void realizarRegistro(String nome, String senha, String acesso, String email, String numero_contato) {
        this.nome = nome;
        this.senha = senha;
        this.acesso = acesso;
        this.email = email;
        this.numero_contato = numero_contato;
        
    }

    public void realizarLogin(String email, String senha){
        verificarLogin(email, senha);
    }

    public void assinarPlano() {

    }

    public void registrarFuncionario(String nome, String senha, String email, String numero_contato){
        System.out.println("====== Qual será a função do funcionário no sistema ======");
        System.out.println("====== 1 -> Personal Trainer ======");
        System.out.println("====== 2 -> Secretario ======");
        boolean continuar = true;
        while(continuar == true){
            
            String escolha = input.nextLine();
            if(escolha == "1"){
                Personal_trainer personal = new Personal_trainer();
                personal.setNome(nome);
                personal.setSenha(senha);
                personal.setAcesso("Funcionario");
                personal.setEmail(email);
                personal.setNumero_contato(numero_contato);
                academia.getPersonais().add(personal);
                continuar = false;
            }
            if(escolha == "2"){
                Secretario secretario = new Secretario();
                secretario.setNome(nome);
                secretario.setSenha(senha);
                secretario.setAcesso("Funcionario");
                secretario.setEmail(email);
                secretario.setNumero_contato(numero_contato);
                academia.getSecretarios().add(secretario);
                continuar = false;
            }
            else{
                System.out.println("====== Qual será a função do funcionário no sistema ======");
                System.out.println("====== 1 -> Personal Trainer ======");
                System.out.println("====== 2 -> Secretario ======");    
            }
        }
    }

    public void acessarPersonais(){
        
    }

    public void removerFuncionario(String nome){
        
    }

    public void registrarCliente(String nome) {    

    }

    public void removerCliente(String nome) {
        
    }

    public void acessarRelatorioAcademia() {
        
    }

    @Override
    public void acessarPerfil() {
        
    }
    
    public void acessarClientes() {

    }

    public void acessarPerfilUsuario() {

    }

    public void acessarTesteCliente(){

    }

    public void acessarHistoricoTestes(){

    }

    public void relatorioCliente(){

    }

    public void adicionarTreinos(String treino){

    }

    @Override
    public void acessarTreinos(){

    }

    public void removerTreinos(){

    }

    public void imprimitTreino(){

    }

    //Sets e Gets Padrões

    public void setAcademia(Academia academia) {
        this.academia = academia;
    }

    public Academia getAcademia() {
        return academia;
    }

    public void setPlano(Planos plano) {
        this.plano = plano;
    }

    public Planos getPlano() {
        return plano;
    }

}