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
                avaliacao.setNome(academia.getClientes().get(cliente));
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
