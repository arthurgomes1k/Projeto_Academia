package Projeto_Academia;

public class Administrador extends Usuario {

    private Academia academia;
    private Planos plano;


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

    public void realizarRegistro() {
        
    }
    
    @Override
    public void realizarLogin(){

    }

    public void assinarPlano() {

    }

    public void registrarFuncionario(String nome){
        academia.funcionarios.add(nome);   

    }

    public void acessarPersonais(){
        
    }

    public void removerFuncionario(String nome){
        for(int funcionario = 0; funcionario < academia.funcionarios.size(); funcionario++){
            if (academia.funcionarios.get(funcionario).equals(nome)){
                academia.funcionarios.remove(funcionario);
                System.out.println("Funcionario " + nome + " Removido");
            }    
        }
    }

    public void registrarCliente(String nome) {  
        academia.clientes.add(nome);

    }

    public void removerCliente(String nome) {
        for(int cliente = 0; cliente < academia.clientes.size(); cliente++){
            if (academia.clientes.get(cliente).equals(nome)){
                academia.clientes.remove(cliente);
                System.out.println("Cliente " + nome + " Removido");
            }
            
        }
        
    }

    public void acessarRelatorioAcademia() {
        
    }

    @Override
    public void acessarPerfil() {
        
    }
    
    public void acessarClientes() {
        System.out.println(academia.clientes);

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
        academia.treinos.add(treino);

    }

    @Override
    public void acessarTreinos(){
        if(acamedia.treinos.size() == 0) {
            System.out.println("Lista de treinos vazia!");
        } else {
            System.out.println(academia.treinos);
        }
    }


    public void removerTreinos(){

    }

    public void imprimitTreino(){

    }


}
