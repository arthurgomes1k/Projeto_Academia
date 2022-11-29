package Projeto_Academia;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Administrador dono = new Administrador();
        Academia oxygym = new Academia();

        dono.realizarRegistro("Arthur", "1234", "Administrador", "adm@gmail.com", "(12)1234-1234");
        dono.registrarFuncionario("Raniere", "12345", "raniere@gmail.com", "99999-9999");


    }

}