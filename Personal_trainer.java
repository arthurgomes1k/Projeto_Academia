package Projeto_Academia;

import java.util.Scanner;


public class Personal_trainer extends Usuario{

    private String horario_inicio;
    private String horario_saida;
    private Academia academia;

    Scanner input = new Scanner(System.in);

    public void realizarLogin() {
        
    }

    public void registrarCliente() {
        
    }

    public void acessarClientes() {
        
    }

    public void acessarPerfilCliente() {
        
    }

    public void acessarHistoricoDeTesteDoCliente() {
        
    }

    public void gerarRelatorioCliente() {
        
    }

    public void acessarTreinos() {

    }

    public void acessarPersonais() {
        
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
    //NGM MEXE VOU TERMINAR AMANHA PQ TO COM SONO 
    public void gerarAvaliacaoCliente(){
        System.out.println("====== Digite as informações do cliente ======");
        System.out.println("Nome: ");
        String nome = input.nextLine();
        System.out.println("Sexo: ");
        String sexo = input.nextLine();
        System.out.println("Peso:  ");
        int peso = input.nextInt();
        System.out.println("Altura: ");
        int altura = input.nextInt();
        System.out.println("Biotipo: ");
        String biotipo = input.nextLine();
        
        for(int cliente = 0 ; cliente < academia.getClientes().size(); cliente++ ){
            System.out.println(academia.getClientes().get(cliente).setDados(null));                  
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
