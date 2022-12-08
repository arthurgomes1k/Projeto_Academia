package Projeto_Academia;

import java.util.Scanner;

public class Secretario extends Usuario {

    private String horario_inicio;
    private String horario_saida;
    private Academia academia;

    Scanner input = new Scanner(System.in);
    
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

    public void acessarMensalidade(){

    }

    // set get 

    public void realizarLogin(String email, String senha){
        verificarLogin(email, senha);
    }

    
    public void setAcademia(Academia academia) {
        this.academia = academia;
    }
    
    public Academia getAcademia() {
        return academia;
    }

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
    
    
}
