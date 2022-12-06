import java.util.Scanner;

public class testes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Administrador dono = new Administrador();
        Academia academia = new Academia();
        academia.criarPlanos();
        
        
        Personal_trainer personal = new Personal_trainer();
        Cliente cliente = new Cliente();
        personal.setAcademia(academia);
        cliente.setAcademia(academia);
        cliente.setNome("Pablo".toUpperCase());
        academia.getClientes().add(cliente);
        personal.adicionarTreinoSistema();
        personal.adicionarTreinosAluno();
        
        //RESOLVER PARTE DE ADICIONAR TREINOS
        
    }
    
}
