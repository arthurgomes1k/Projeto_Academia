package Projeto_Academia;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Administrador dono = new Administrador();
        Academia oxygym = new Academia();

        dono.realizarRegistro("Arthur", "1234", "Administrador", "adm@gmail.com", "(12)1234-1234");

        while (!dono.online) {
            System.out.print("Digite seu email: ");
            String email = input.nextLine();
            System.out.print("Digite sua senha: ");
            String senha = input.nextLine();
            pablo.realizarLogin(email, senha);
        }
    }

}