package Projeto_Academia;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {   

        Scanner input = new Scanner(System.in);
        Administrador dono = new Administrador();
        Academia oxygym = new Academia();
        Personal_trainer arthur = new Personal_trainer();
        Cliente pablo = new cliente();
        Avaliacao avpablo = new Avaliacao()


        arthur.setNome("Arthur");
        arthur.setSenha("123");
        arthur.setAcesso("Funcionario");
        arthur.setEmail("a@gmail.com");
        arhut.setNumero_contato("(12)3456-7890")
        arthur.setHorario_inicio("14:00");
        arthur.setHorario_saida("18:00");
        
        avpablo.setNome(pablo);
        avpablo.setSexo("Homem");
        avpablo.setAltura(1.75);
        avpablo.setPeso(56.3);
        avpablo.setIdade(18);
        avpablo.setBiotipo("ectomorfo");
        avpablo.setGordura_corporal(10);
        avpablo.setObjetivo("Hipertrofia");
        pablo.setNome("Pablo");
        pablo.setSenha("321");
        pablo.setAcesso("Cliente");
        pablo.setEmail("p@gmail.com");
        pablo.setDados(avpablo);
        
        oxygym.setNome_da_academia("Oxygym");
        oxygym.setAdministrador(dono);
        dono.setAcademia(oxygym);

        dono.registrarCliente(pablo);
        dono.acessarClientes();
        

        

    }
    
}
