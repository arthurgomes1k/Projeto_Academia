package Projeto_Academia;

import java.util.Scanner;


public class Personal_trainer extends Usuario{

    private String horario_inicio;
    private String horario_saida;
    private Academia academia;

    Scanner input = new Scanner(System.in);

    public void realizarLogin() {
        verificarLogin(email, senha);
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
        System.out.println("====================");
                for(int cliente = 0 ; cliente < academia.getClientes().size(); cliente++ ){
                  System.out.println(academia.getClientes().get(cliente).nome);                  
                }    
        System.out.println("====================");
    }
    public void removerCliente(){
        System.out.println("====== Quem você deseja remover? ======");
        System.out.println("Nome: ");
        String remover = input.nextLine();
        for(int cliente = 0; cliente < academia.getClientes().size(); cliente++){
            if(academia.getClientes().get(cliente).nome.equals(remover)){
                academia.getClientes().remove(cliente);
            }
        }         
    }

    public void acessarPerfilCliente() {
        System.out.println(" Digite o nome do cliente");
        String nome = input.nextLine();
        for(int cliente = 0; cliente < academia.getClientes().size(); cliente++){
            if(academia.getClientes().get(cliente).nome.equals(nome)){
                System.out.println("Nome: " + academia.getClientes().get(cliente).getNome());
                System.out.println("Email: " + academia.getClientes().get(cliente).getEmail());
                System.out.println("Contato: " + academia.getClientes().get(cliente).getNumero_contato());
                System.out.println("Acesso: " + academia.getClientes().get(cliente).getAcesso());
                System.out.println("Data de vencimento: " + academia.getClientes().get(cliente).getData_de_vencimento());
            }         
        }
    }

    public void acessarHistoricoDeTesteDoCliente() {
        
    }

    public void gerarRelatorioCliente() {
        
    }

    public void acessarTreinos() {

    }

    public void acessarFuncionarios() {
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

    public void acessarPaginaDeHorarios() {
        
    }
    
    public void criar_lista_treinos(Cliente cliente) {
        Treino treinos = new Treino();
        treinos.setCliente(cliente);
        cliente.setTreino_aluno(treinos);
    }

    public void adicionarTreino(Cliente cliente, String treino){  
        cliente.getTreino_aluno().getListaDeTreinos().add(treino);
        
        
    }
    public void gerarAvaliacaoCliente(){
        System.out.println("====== Digite as informações do cliente");
        System.out.println();
        System.out.println("Nome: ");
        String nome = input.nextLine();
        System.out.println("Sexo: ");
        String sexo = input.nextLine();
        System.out.println("Peso: ");
        double peso = input.nextDouble();
        System.out.println("Altura: ");
        int altura = input.nextInt();
        System.out.println("Idade: ");
        int idade = input.nextInt();
        System.out.println("Biotipo: ");
        String biotipo = input.nextLine();
        System.out.println("Objetivo: ");
        String objetivo = input.nextLine();
        Avaliacao avaliacao = new Avaliacao();
        avaliacao.setSexo(sexo);
        avaliacao.setPeso(peso);
        avaliacao.setAltura(altura);
        avaliacao.setIdade(idade);
        avaliacao.setBiotipo(biotipo);
        avaliacao.setObjetivo(objetivo);
        for(int cliente = 0; cliente < academia.getClientes().size(); cliente++){
            if(academia.getClientes().get(cliente).nome.equals(nome)){
                academia.getClientes().get(cliente).setDados(avaliacao);
                avaliacao.setCliente(academia.getClientes().get(cliente));
                academia.getClientes().get(cliente).getAvaliacoes().add(avaliacao);
            }
        }
    }


    //Sets e Gets Padrões
    public void setHorario_inicio(String horario_inicio) {
        this.horario_inicio = horario_inicio;
    }

    public String getHorario_inicio() {
        return horario_inicio;
    }

    public void setHorario_saida(String horario_saida) {
        this.horario_saida = horario_saida;
    }

    public String getHorario_saida() {
        return horario_saida;
    }

    public void setAcademia(Academia academia) {
        this.academia = academia;
    }

    public Academia getAcademia() {
        return academia;
    }

}
