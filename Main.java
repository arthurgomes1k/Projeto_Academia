package Projeto_Academia;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {   

        Scanner input = new Scanner(System.in);
        Administrador dono = new Administrador();
        Academia oxygym = new Academia();
        Personal_trainer arthur = new Personal_trainer();
        Cliente pablo = new Cliente();
        Avaliacao avpablo = new Avaliacao();


        arthur.setNome("Arthur");
        arthur.setSenha("123");
        arthur.setAcesso("Funcionario");
        arthur.setEmail("a@gmail.com");
        arthur.setNumero_contato("(12)3456-7890");
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
        
        dono.realizarRegistro("Arthur", "1234", "Administrador", "adm@gmail.com", "(12)1234-1234");

        dono.realizarLogin("adm@gmail.com", "1234");

    }
    
}
