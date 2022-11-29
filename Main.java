import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    Administrador dono = new Administrador();
    Academia oxygym = new Academia();

    dono.setAcademia(oxygym);

    dono.realizarRegistro("Arthur", "1234", "adm@gmail.com", "(12)1234-1234");

    dono.registrarFuncionario();
    dono.acessarFuncionarios();
    dono.removerFuncionario();
    dono.acessarFuncionarios();

  }

}