
import java.util.Scanner;

public class Administrador extends Usuario {

    private Academia academia;
    private Planos plano;

    Scanner input = new Scanner(System.in);

    public void realizarRegistro(String nome, String senha, String email, String numero_contato) {
        this.nome = nome;
        this.senha = senha;
        this.acesso = "Administrador";
        this.email = email;
        this.numero_contato = numero_contato;
        
    }

    public void realizarLogin(String email, String senha){
        verificarLogin(email, senha);
    }

    public void assinarPlano() {

    }

    public void registrarFuncionario(){
          System.out.println("====== Qual será a função do funcionário no sistema ======");
          System.out.println("====== 1 -> Personal Trainer ======");
          System.out.println("====== 2 -> Secretario ======");
          while(true){
                
              String escolha = input.nextLine();
              if(escolha.equals("1")){
                  System.out.println("====== Digite as informações do personal ======");
                  System.out.println("Nome: ");
                  String nome = input.nextLine();
                  System.out.println("Email: ");
                  String email = input.nextLine();
                  System.out.println("Numero de contato: ");
                  String numero_contato = input.nextLine();
                  System.out.println("Senha: ");
                  String senha = input.nextLine();
                  Personal_trainer personal = new Personal_trainer();
                  personal.setNome(nome);
                  personal.setEmail(email);
                  personal.setNumero_contato(numero_contato);
                  personal.setSenha(senha);
                  personal.setAcesso("Cliente");
                  academia.getPersonais().add(personal);
                  break;
                }
              if(escolha.equals("2")){
                  System.out.println("====== Digite as informações do secretario ======");
                  System.out.println("Nome: ");
                  String nome = input.nextLine();
                  System.out.println("Email: ");
                  String email = input.nextLine();
                  System.out.println("Numero de contato: ");
                  String numero_contato = input.nextLine();
                  System.out.println("Senha: ");
                  String senha = input.nextLine();
                  Secretario secretario = new Secretario();
                  secretario.setNome(nome);
                  secretario.setEmail(email);
                  secretario.setNumero_contato(numero_contato);
                  secretario.setSenha(senha);
                  secretario.setAcesso("Cliente");
                  academia.getSecretarios().add(secretario);
                  break;
              }
              else{
                  System.out.println("====== Qual será a função do funcionário no sistema ======");
                  System.out.println("====== 1 -> Personal Trainer ======");
                  System.out.println("====== 2 -> Secretario ======");    
              }
          }
       }

    public void acessarFuncionarios(){
        System.out.println("====== O que deseja ver? ======");
        System.out.println("====== 0 -> Não exibir nada ======");
        System.out.println("====== 1 -> Lista de Personal Trainer ======");
        System.out.println("====== 2 -> Lista Secretario ======");

        while(true){
            
            String escolha = input.nextLine();

            if(escolha.equals("0")){
                break;
            }

            if(escolha.equals("1")){
                System.out.println("Personais Trainers: ");
                for(int personal = 0 ; personal < academia.getPersonais().size(); personal++ ){
                  System.out.println(academia.getPersonais().get(personal).nome);                  
                }               
            }

            if(escolha.equals("2")){
                System.out.println("Secretarios: ");
                for(int secretario = 0 ; secretario < academia.getSecretarios().size(); secretario++ ){
                  System.out.println(academia.getSecretarios().get(secretario).nome);
              }
            }

            else{
                System.out.println("====== O que deseja ver? ======");
                System.out.println("====== 1 -> Lista de Personal Trainer ======");
                System.out.println("====== 2 -> Lista Secretario ======");  
            }
        }
    }
    
    public void removerFuncionario(){
        System.out.println("====== Quem você deseja remover? ======");
        System.out.println("Nome: ");
        String remover = input.nextLine();
        System.out.println("====== Qual é a função deste funcionario? ======");
        System.out.println("====== 1 -> Personal Trainer ======");
        System.out.println("====== 2 -> Secretario ======");
        while(true){
                
            String escolha = input.nextLine();
            if(escolha.equals("1")){
                for(int personal = 0; personal < academia.getPersonais().size(); personal++){
                    if(academia.getPersonais().get(personal).nome.equals(remover)){
                        academia.getPersonais().remove(personal);
                    }         
                }
                break;
            }
            
            if(escolha.equals("2")){
                for(int secretario = 0; secretario < academia.getSecretarios().size(); secretario ++){
                    if(academia.getSecretarios().get(secretario).nome.equals(remover)){
                        academia.getSecretarios().remove(secretario);
                    }         
                }
                break;
            }
            else{
                System.out.println("====== Qual será a função do funcionário no sistema ======");
                System.out.println("====== 1 -> Personal Trainer ======");
                System.out.println("====== 2 -> Secretario ======");    
            }
        }
    }

    public void registrarCliente() { 
        System.out.println("====== Digite as informações do cliente ======");
        System.out.println("Nome: ");
        String nome = input.nextLine();
        System.out.println("Email: ");
        String email = input.nextLine();
        System.out.println("Numero de contato: ");
        String numero_contato = input.nextLine();
        System.out.println("Senha: ");
        String senha = input.nextLine();
        Cliente cliente = new Cliente();
        cliente.setNome(nome);
        cliente.setEmail(email);
        cliente.setNumero_contato(numero_contato);
        cliente.setSenha(senha);
        cliente.setAcesso("Cliente");
        academia.getClientes().add(cliente);

    }

    public void acessarClientes() {

        System.out.println("Clientes: ");
                for(int cliente = 0 ; cliente < academia.getClientes().size(); cliente++ ){
                  System.out.println(academia.getClientes().get(cliente).nome);                  
                }    
    }

    public void removerCliente() {
        System.out.println("====== Quem você deseja remover? ======");
        System.out.println("Nome: ");
        String remover = input.nextLine();
        for(int cliente = 0; cliente < academia.getClientes().size(); cliente++){
            if(academia.getClientes().get(cliente).nome.equals(remover)){
                academia.getClientes().remove(cliente);
            }         
        }
    }

    public void acessarRelatorioAcademia() {
        
    }

    @Override
    public void acessarPerfil() {
        System.out.println("Perfil de " + getNome());
        System.out.println("Nome: " + getNome());
        System.out.println("Email: " + getEmail());
        System.out.println("Contato: " + getNumero_contato());
        System.out.println("Acesso: "getAcesso());
    }
    

    public void acessarPerfilClientes() {
        System.out.println(" Digite o nome do cliente");
        String nome = input.nextLine();
        for(int cliente = 0; cliente < academia.getClientes().size(); cliente++){
            if(academia.getClientes().get(cliente).nome.equals(nome)){
                System.out.println("Nome: " + academia.getCliente().get(cliente).getNome());
                System.out.println("Email: " + academia.getCliente().get(cliente).getEmail());
                System.out.println("Contato: " + academia.getCliente().get(cliente).getNumero_contato());
                System.out.println("Acesso: " + academia.getCliente().get(cliente).getAcesso());
                System.out.println("Data de vencimento: " + academia.getCliente.get(cliente).getData_de_vencimento());
            }         
        }
    }

    public void acessarPerfilFuncionario() {
        
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