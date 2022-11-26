package Projeto_Academia;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {   

        Scanner input = new Scanner(System.in);
        Administrador dono = new Administrador();
        Academia oxygym = new Academia();
        
        dono.realizarRegistro("Arthur", "321", "a@gmail.com", "(32)1234-4321");
        dono.realizarLogin();

        



    }
    
}
