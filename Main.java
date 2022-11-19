package projeto_academia_002;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {   

        Scanner input = new Scanner(System.in);
        Administrador dono = new Administrador();
        Academia oxygym = new Academia();

        oxygym.setNome_da_academia("Oxygym");
        oxygym.setAdministrador(dono);
        dono.setAcademia(oxygym);

        String cliente = input.nextLine();

        dono.registrarCliente(cliente);
        dono.acessarClientes();
        dono.removerCliente(cliente);

        System.out.println("teste git");

        

    }
    
}
