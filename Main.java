package Projeto_Academia;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    Administrador dono = new Administrador();
    Academia oxygym = new Academia();
    

    dono.setAcademia(oxygym);

    dono.realizarRegistro("Raniere", "123", "raniere@gmail.com", "(83)96019365");
    dono.realizarLogin("raniere@gmail.com", "123");

    dono.registrarCliente();
    dono.acessarClientes();
    dono.acessarPerfil();
  }
}

