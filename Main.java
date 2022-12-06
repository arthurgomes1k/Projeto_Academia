import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    Administrador dono = new Administrador();
    Academia academia = new Academia();
    academia.criarPlanos();
    

    while(true){
      System.out.println("====== TELA DE ACESSO ======");
      System.out.println();
      System.out.println(" -- DIGITE 1 PARA FAZER REGISTRO --");
      System.out.println(" -- DIGITE 2 PARA REALIZAR LOGIN --");
      System.out.println();
      
      while(true){
        
        System.out.println("Escolha: ");
        String escolha = input.nextLine();

        //TELA DE REGISTRO
        if(escolha.equals("1")){
            System.out.println("====== Digite as informações de cadastro ======");
            System.out.println("====== DIGITE 0 PARA VOLTAR ======");
            System.out.println();

            System.out.println("Nome da academia: ");
            String nome_da_academia = input.nextLine();
            if(nome_da_academia.equals("0")){
              break;
            }
            System.out.println();
            System.out.println("Nome: ");
            String nome = input.nextLine();
            if(nome.equals("0")){
              break;
            }
            System.out.println();
            System.out.println("CPF OU CNPJ: ");
            String cpf = input.nextLine();
            if(cpf.equals("0")){
              break;
            }
            System.out.println();
            System.out.println("Email: ");
            String email = input.nextLine();
            if(email.equals("0")){
              break;
            }
            System.out.println();
            System.out.println("Numero de contato: ");
            String numero_contato = input.nextLine();
            if(numero_contato.equals("0")){
              break;
            }
            System.out.println();
            System.out.println("Senha: ");
            String senha = input.nextLine();
            if(senha.equals("0")){
              break;
            }
            dono.realizarRegistro(nome, cpf, email, numero_contato, senha);
            academia.setNome_da_academia(nome_da_academia);
            System.out.println();
            System.out.println("====== PÁGINA DE PLANOS ======");
            System.out.println();
            System.out.println("====== Escolha o plano que deseja assinar");
            System.out.println();
            System.out.println(" 1 - PLANO CLASSIC ");
            System.out.println("Valor: R$" + academia.getPlanos().get(0).getValor());
            System.out.println("Quantidade de alunos: " + academia.getPlanos().get(0).getQuantidade_de_alunos());
            System.out.println();
            System.out.println(" 2 - PLANO MASTER ");
            System.out.println("Valor: R$" + academia.getPlanos().get(1).getValor());
            System.out.println("Quantidade de alunos: " + academia.getPlanos().get(1).getQuantidade_de_alunos());
            System.out.println();
            System.out.println(" 3 - PLANO MUSCLE ");
            System.out.println("Valor: R$" + academia.getPlanos().get(2).getValor());
            System.out.println("Quantidade de alunos: " + academia.getPlanos().get(2).getQuantidade_de_alunos());
            while(true){

              System.out.println("Escolha: ");
              String plano = input.nextLine();
              if(plano.equals("1")){
                System.out.println("Você assinou o Plano Classic");
                dono.setPlano(academia.getPlanos().get(0));
                break;
              }
              else if(plano.equals("2")){
                System.out.println("Você assinou o Plano Master");
                dono.setPlano(academia.getPlanos().get(1));
                break;
              }
              else if(plano.equals("2")){
                System.out.println("Você assinou o Plano Muscle");
                dono.setPlano(academia.getPlanos().get(2));
                break;
              }
              else{
                System.out.println("====== Escolha o plano que deseja assinar");
                System.out.println();
                System.out.println(" 1 - PLANO CLASSIC ");
                System.out.println("Valor: R$" + academia.getPlanos().get(0).getValor());
                System.out.println("Quantidade de alunos" + academia.getPlanos().get(0).getQuantidade_de_alunos());
                System.out.println();
                System.out.println(" 2 - PLANO MASTER ");
                System.out.println("Valor: R$" + academia.getPlanos().get(1).getValor());
                System.out.println("Quantidade de alunos" + academia.getPlanos().get(1).getQuantidade_de_alunos());
                System.out.println();
                System.out.println(" 3 - PLANO MUSCLE ");
                System.out.println("Valor: R$" + academia.getPlanos().get(2).getValor());
                System.out.println("Quantidade de alunos" + academia.getPlanos().get(2).getQuantidade_de_alunos());
              }

            }

          }

        //TELA DE LOGIN
        if(escolha.equals("2")){
          while(true){
            //VERIFICAÇÃO DE INFORMAÇÕES DE LOGIN
            System.out.println("====== Digite as informações de login ======");
            System.out.println("====== DIGITE 0 PARA VOLTAR ======");
            System.out.println();
            System.out.println("Email: ");
            String email = input.nextLine();
            if(email.equals("0")){
              break;
            }

            //ANALISAR EMAIL DO ADMINISTRADOR
            if(dono.getEmail().equals(email)){
              while(!dono.online){ 
                System.out.println();
                System.out.println("Senha: ");
                String senha = input.nextLine();
                if(senha.equals("0")){
                  break;
                } 
                dono.realizarLogin(email, senha);
              }
              break;
            }
                

            //ANALISAR EMAIL DO PERSONAL
            for(int personal = 0 ; personal < academia.getPersonais().size(); personal++ ){
              if(academia.getPersonais().get(personal).getEmail().equals(email)){
                while(!academia.getPersonais().get(personal).online){
                  System.out.println();
                  System.out.println("Senha: ");
                  String senha = input.nextLine();
                  if(senha.equals("0")){
                    break;
                  } 
                  academia.getPersonais().get(personal).realizarLogin(email, senha);
                }
                break;
              }                  
            }
                
            //ANALISAR EMAIL DO SECRETARIO
            for(int secretario = 0 ; secretario < academia.getSecretarios().size(); secretario++ ){
              if(academia.getSecretarios().get(secretario).getEmail().equals(email)){
                while(!academia.getSecretarios().get(secretario).online){
                  System.out.println();
                  System.out.println("Senha: ");
                  String senha = input.nextLine();
                  if(senha.equals("0")){
                    break;
                  }
                  academia.getSecretarios().get(secretario).realizarLogin(email, senha);
                }
                break;
              }   
            }

            for(int cliente = 0 ; cliente < academia.getClientes().size(); cliente++ ){
              if(academia.getClientes().get(cliente).getEmail().equals(email)){
                while(!academia.getClientes().get(cliente).online){
                  System.out.println();
                  System.out.println("Senha: ");
                  String senha = input.nextLine();
                  if(senha.equals("0")){
                    break;
                  }
                  academia.getClientes().get(cliente).realizarLogin(email, senha);
                }
              }
              break;
            }                  
            System.out.println("EMAIL NÃO ENCONTRADO");
            System.out.println();
          }
          break;
        }
            
        //SE SELECIONAR UMA OPÇÃO INVÁLIDA
        else{
            System.out.println("====== TELA DE ACESSO ======");
            System.out.println();
            System.out.println(" -- DIGITE 1 PARA FAZER LOGIN --");
            System.out.println(" -- DIGITE 2 PARA REALIZAR REGISTRO");
            System.out.println();
        }
      }
    }





  }
}