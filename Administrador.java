
import java.util.Scanner;

public class Administrador extends Usuario {

    private String cpf; 
    private Academia academia;
    private Plano plano;

    Scanner input = new Scanner(System.in);

    public void realizarRegistro(String nome, String cpf, String email, String numero_contato, String senha) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.numero_contato = numero_contato;
        this.senha = senha;
        this.acesso = "Administrador";
        
    }

    public void realizarLogin(String email, String senha){
        verificarLogin(email, senha);
    }

    public void registrarFuncionario(){
          System.out.println("====== Qual será a função do funcionário no sistema ======");
          System.out.println("====== 1 -> Personal Trainer ======");
          System.out.println("====== 2 -> Secretario ======");
          while(true){
                
              String escolha = input.nextLine().toUpperCase();
              if(escolha.equals("1")){
                  System.out.println("====== Digite as informações do personal ======");
                  System.out.println("Nome: ");
                  String nome = input.nextLine().toUpperCase();
                  System.out.println("Email: ");
                  String email = input.nextLine().toUpperCase();
                  System.out.println("Numero de contato: ");
                  String numero_contato = input.nextLine().toUpperCase();
                  System.out.println("Senha: ");
                  String senha = input.nextLine().toUpperCase();
                  Personal_trainer personal = new Personal_trainer();
                  personal.setNome(nome);
                  personal.setEmail(email);
                  personal.setNumero_contato(numero_contato);
                  personal.setSenha(senha);
                  personal.setAcesso("Funcionario");
                  academia.getPersonais().add(personal);
                  break;
                }
              if(escolha.equals("2")){
                  System.out.println("====== Digite as informações do secretario ======");
                  System.out.println("Nome: ");
                  String nome = input.nextLine().toUpperCase();
                  System.out.println("Email: ");
                  String email = input.nextLine().toUpperCase();
                  System.out.println("Numero de contato: ");
                  String numero_contato = input.nextLine().toUpperCase();
                  System.out.println("Senha: ");
                  String senha = input.nextLine().toUpperCase();
                  Secretario secretario = new Secretario();
                  secretario.setNome(nome);
                  secretario.setEmail(email);
                  secretario.setNumero_contato(numero_contato);
                  secretario.setSenha(senha);
                  secretario.setAcesso("Funcionario");
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
            
            String escolha = input.nextLine().toUpperCase();

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
        String remover = input.nextLine().toUpperCase();
        System.out.println("====== Qual é a função deste funcionario? ======");
        System.out.println("====== 1 -> Personal Trainer ======");
        System.out.println("====== 2 -> Secretario ======");
        while(true){
                
            String escolha = input.nextLine().toUpperCase();
            if(escolha.equals("1")){
                for(int personal = 0; personal < academia.getPersonais().size(); personal++){
                    if(academia.getPersonais().get(personal).nome.equals(remover)){
                        academia.getPersonais().remove(personal);
                    }else if (personal == (academia.getPersonais().size() - 1)) {
                        System.out.println("Usuario não encontrado");
                    }         
                }
                break;
            }
            
            if(escolha.equals("2")){
                for(int secretario = 0; secretario < academia.getSecretarios().size(); secretario ++){
                    if(academia.getSecretarios().get(secretario).nome.equals(remover)){
                        academia.getSecretarios().remove(secretario);
                    }else if (secretario == (academia.getSecretarios().size() - 1)) {
                        System.out.println("Usuario não encontrado");
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
        String nome = input.nextLine().toUpperCase();
        System.out.println("Email: ");
        String email = input.nextLine().toUpperCase();
        System.out.println("Numero de contato: ");
        String numero_contato = input.nextLine().toUpperCase();
        System.out.println("Senha: ");
        String senha = input.nextLine().toUpperCase();
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
        String remover = input.nextLine().toUpperCase();
        for(int cliente = 0; cliente < academia.getClientes().size(); cliente++){
            if(academia.getClientes().get(cliente).nome.equals(remover)){
                academia.getClientes().remove(cliente);
            }else if (cliente == (academia.getClientes().size() - 1)) {
                System.out.println("Usuario não encontrado");
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
        System.out.println("Acesso: " + getAcesso());
    }
    

    public void acessarPerfilClientes() {
        System.out.println(" Digite o nome do cliente");
        String nome = input.nextLine().toUpperCase();
        for(int cliente = 0; cliente < academia.getClientes().size(); cliente++){
            if(academia.getClientes().get(cliente).nome.equals(nome)){
                System.out.println("Nome: " + academia.getClientes().get(cliente).getNome());
                System.out.println("Email: " + academia.getClientes().get(cliente).getEmail());
                System.out.println("Contato: " + academia.getClientes().get(cliente).getNumero_contato());
                System.out.println("Acesso: " + academia.getClientes().get(cliente).getAcesso());
                System.out.println("Data de vencimento: " + academia.getClientes().get(cliente).getData_de_vencimento());
            }else if (cliente == (academia.getClientes().size() - 1)) {
                System.out.println("Usuario não encontrado");
            }         
        }
    }

    public void acessarPerfilFuncionario() {
        System.out.println("====== Perfil do funcionario ======");
        System.out.println("====== Qual é a função do funcionário no sistema ======");
        System.out.println("====== 1 -> Personal Trainer ======");
        System.out.println("====== 2 -> Secretario ======");
        
        while(true){
            String escolha = input.nextLine().toUpperCase();
            if(escolha.equals("1")){
                System.out.println(" Digite o nome do Personal Trainer: ");
                String nome = input.nextLine().toUpperCase();
                    for(int personal = 0; personal < academia.getPersonais().size(); personal++){
                        if(academia.getPersonais().get(personal).nome.equals(nome)){
                            System.out.println("Nome: " + academia.getPersonais().get(personal).getNome());
                            System.out.println("Email: " + academia.getPersonais().get(personal).getEmail());
                            System.out.println("Contato: " + academia.getPersonais().get(personal).getNumero_contato());
                            System.out.println("Acesso: " + academia.getPersonais().get(personal).getAcesso()); 
                            System.out.println("Horario de atividade: " + academia.getPersonais().get(personal).getHorario_inicio() + "até " + academia.getPersonais().get(personal).getHorario_saida());
                            break;          
                        }else if (personal == (academia.getPersonais().size() - 1)) {
                            System.out.println("Usuario não encontrado");
                        }
                        

                    }
                break;
            }

            if(escolha.equals("2")){
                System.out.println(" Digite o nome do Secretário");
                String nome = input.nextLine().toUpperCase();
                    for(int secretario = 0; secretario < academia.getSecretarios().size(); secretario++){
                        if(academia.getSecretarios().get(secretario).nome.equals(nome)){
                            System.out.println("Nome: " + academia.getSecretarios().get(secretario).getNome());
                            System.out.println("Email: " + academia.getSecretarios().get(secretario).getEmail());
                            System.out.println("Contato: " + academia.getSecretarios().get(secretario).getNumero_contato());
                            System.out.println("Acesso: " + academia.getSecretarios().get(secretario).getAcesso()); 
                            System.out.println("Horario de atividade: " + academia.getSecretarios().get(secretario).getHorario_inicio() + "até " + academia.getSecretarios().get(secretario).getHorario_saida());
                            break;
                        }else if (secretario == (academia.getSecretarios().size() - 1)) {
                            System.out.println("Usuario não encontrado");
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

    public void acessarTesteCliente(){

    }

    public void acessarHistoricoTestes(){

    }

    public void relatorioCliente(){

    }

    public void adicionarTreinos(){
        System.out.println("====== Treinos da academia ======");
    }

    @Override
    public void acessarTreinos(){

    }

    public void removerTreinos(){

    }

    public void imprimitTreino(){

    }

    //Sets e Gets Padrões


    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }
    
    public void setAcademia(Academia academia) {
        this.academia = academia;
    }

    public Academia getAcademia() {
        return academia;
    }

    public void setPlano(Plano plano) {
        this.plano = plano;
    }

    public Plano getPlano() {
        return plano;
    }

}