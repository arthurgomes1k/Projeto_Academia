import java.util.Scanner;

public class Telas {
    
    Scanner input = new Scanner(System.in);
    Administrador dono = new Administrador();
    Academia academia = new Academia();
    Financeiro financeiro = new Financeiro();
    
    public void inicializar(){
        academia.criarPlanos();
        telaDeCadastroELogin();
    }
  
    public void telaDeCadastroELogin(){
      while(true){
        System.out.println("====== TELA DE ACESSO ======");
        System.out.println();
        System.out.println(" -- DIGITE 1 PARA FAZER REGISTRO --");
        System.out.println(" -- DIGITE 2 PARA REALIZAR LOGIN --");
        System.out.println();
        
        while(true){
          
          System.out.println("Escolha: ");
          String escolha = input.nextLine().toUpperCase();
  
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
              dono.setAcademia(academia);
              academia.setNome_da_academia(nome_da_academia);
              academia.setAdministrador(dono);
              academia.setFinanceiro(financeiro);
              System.out.println();
              System.out.println("====== PÁGINA DE PLANOS ======");
              System.out.println();
              System.out.println("====== Escolha o plano que deseja assinar ======");
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
              break;
  
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
                  telaInicialAdministrador();
                }
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
              
              //ANALISAR EMAIL CLIENTES
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
              System.out.println(" -- DIGITE 1 PARA REALIZAR REGISTRO --");
              System.out.println(" -- DIGITE 2 PARA FAZER LOGIN --");
              System.out.println();
          }
        }
  
      }
    }    

    public void telaInicialAdministrador(){
        boolean voltar = false;
        while(voltar == false){
            System.out.println("====== MENU INICIAL ======");
            System.out.println();
            System.out.println("-- DIGITE 0 PARA SAIR --");
            System.out.println("-- DIGITE 1 PARA ACESSAR ALUNOS --");
            System.out.println("-- DIGITE 2 PARA ACESSAR FUNCIONARIOS --");
            System.out.println("-- DIGITE 3 PARA ACESSAR TREINOS --");
            System.out.println("-- DIGITE 4 PARA ACESSAR FINANCEIRO --");
            System.out.println("-- DIGITE 5 PARA ACESSAR PERFIL");
            System.out.println();

            while(true){
              
                System.out.println("Escolha: ");
                String escolha = input.nextLine().toUpperCase();
                if(escolha.equals("1")){
                    telaListaDeAlunos();
                }                
                else if(escolha.equals("2")){
                    System.out.println("====== PÁGINA DE FUNCIONARIOS ======");
                    System.out.println();
                    System.out.println("-- DIGITE 0 PARA VOLTAR --");
                    System.out.println("-- DIGITE 1 PARA ACESSAR LISTA DE FUNCIONARIOS --");
                    System.out.println("-- DIGITE 2 PARA CADASTRAR FUNCIONARIO");
                    System.out.println("-- DIGITE 3 PARA REMOVER FUNCIONARIO --");
                    System.out.println("-- DIGITE 4 PARA VER PERFIL DE UM FUNCIONARIO --");
                    System.out.println("-- DIGITE 5 PARA ACESSAR PÁGINA DE HORÁRIOS --");
                }
                else if(escolha.equals("3")){
                    telaTreinosSistema();
                }                  
                else if(escolha.equals("4")){
                    telaFinanceira();
                }
                else if(escolha.equals("5")){
                    dono.acessarPerfil();
                }
                else if(escolha.equals("0")){
                    voltar = true;
                    break;
                }
                else{

                    System.out.println("====== MENU INICIAL ======");
                    System.out.println();
                    System.out.println("-- DIGITE 0 PARA SAIR --");
                    System.out.println("-- DIGITE 1 PARA ACESSAR ALUNOS --");
                    System.out.println("-- DIGITE 2 PARA ACESSAR FUNCIONARIOS --");
                    System.out.println("-- DIGITE 3 PARA ACESSAR TREINOS --");
                    System.out.println("-- DIGITE 4 PARA ACESSAR FINANCEIRO --");
                    System.out.println("-- DIGITE 5 PARA ACESSAR PERFIL");
                    System.out.println();
                }
                
            }
        }
    }

    public void telaListaDeAlunos(){
        boolean voltar = false;
        while(voltar == false){
            System.out.println("====== LISTA DE CLIENTES ======");
            System.out.println();
            System.out.println("-- DIGITE 0 PARA VOLTAR --");
            System.out.println("-- DIGITE 1 PARA ACESSAR LISTA DE ALUNOS --");
            System.out.println("-- DIGITE 2 PARA CADASTRAR ALUNO --");
            System.out.println("-- DIGITE 3 PARA REMOVER ALUNO --");
            System.out.println("-- DIGITE 4 PARA ACESSAR PÁGIDA DE UM ALUNO --");
            while(true){
                System.out.println("Escolha: ");
                String escolha = input.nextLine().toUpperCase();
                if(escolha.equals("1")){
                    dono.acessarClientes();
                    break;
                }
                else if(escolha.equals("2")){
                    System.out.println("====== Digite as informações do cliente ======");
                    System.out.println("-- DIGITE 0 PARA VOLTAR --");
                    System.out.println();
                    System.out.println("Nome: ");
                    String nome = input.nextLine().toUpperCase();
                    if(nome.equals("0")){
                        break;
                    }
                    System.out.println();
                    System.out.println("Email: ");
                    String email = input.nextLine().toUpperCase();
                    if(email.equals("0")){
                        break;
                    }    
                    System.out.println();
                    System.out.println("Numero de contato: ");
                    String numero_contato = input.nextLine().toUpperCase();
                    if(numero_contato.equals("0")){
                        break;
                    }
                    System.out.println();
                    System.out.println("Senha: ");
                    String senha = input.nextLine().toUpperCase();
                    if(senha.equals("0")){
                        break;
                    }
                    dono.registrarCliente(nome, email, numero_contato, senha);
                    break;
                }
                else if(escolha.equals("3")){
                    System.out.println("====== Quem você deseja remover? ======");
                    System.out.println("-- DIGITE 0 PARA VOLTAR --");
                    System.out.println();
                    System.out.println("Nome: ");
                    String remover = input.nextLine().toUpperCase();
                    if(remover.equals("0")){
                        break;
                    }
                    System.out.println();
                    dono.removerCliente(remover);
                    break;
                }
                else if(escolha.equals("4")){
                    while(true){
                        System.out.println("-- DIGITE O NOME DO ALUNO --");
                        System.out.println("ALUNO: ");
                        String nome = input.nextLine().toUpperCase();
                        for(int aluno = 0; aluno < academia.getClientes().size(); aluno++){
                            if(academia.getClientes().get(aluno).getNome().equals(nome)){
                                telaDeUmAlunoEspecifico(academia.getClientes().get(aluno));
                            }
                        }
                    }

                }
                else if(escolha.equals("0")){
                    voltar = true;
                    break;
                }               
                else{
                    System.out.println("====== LISTA DE CLIENTES ======");
                    System.out.println();
                    System.out.println("-- DIGITE 0 PARA VOLTAR --");
                    System.out.println("-- DIGITE 1 PARA ACESSAR LISTA DE ALUNOS --");
                    System.out.println("-- DIGITE 2 PARA CADASTRAR ALUNO --");
                    System.out.println("-- DIGITE 3 PARA REMOVER ALUNO --");
                    System.out.println("-- DIGITE 4 PARA ACESSAR PÁGIDA DE UM ALUNO --");
                }
            }
        }
    }

    public void telaDeUmAlunoEspecifico(Cliente aluno){
        boolean voltar = false;
        while(voltar == false){
            System.out.println("ALUNO: " + aluno.getNome());
            System.out.println();
            System.out.println("-- DIGITE 0 PARA VOLTAR --");
            System.out.println("-- DIGITE 1 PARA FAZER AVALIAÇÃO DO ALUNO --");
            System.out.println("-- DIGITE 2 PARA ACESSAR PERFIL DO CLIENTE --");
            System.out.println("-- DIGITE 3 PARA ACESSAR ULTIMA AVALIAÇÃO DO CLIENTE");
            System.out.println("-- DIGITE 4 PARA ACESSAR HISTORICO DE AVALIAÇÕES DO CLIENTE");
            System.out.println("-- DIGITE 5 PARA GERAR RELATORIO DO CLIENTE --");
            System.out.println("-- DIGITE 6 PARA ADICIONAR TREINO DO CLIENTE --");
            System.out.println("-- DIGITE 7 PARA ACESSAR TREINOS DO ALUNO --");
            System.out.println("-- DIGITE 8 PARA REMOVER TREINO DO ALUNO");  
            while(true){
                System.out.println();
                System.out.println("Escolha: ");
                String escolha = input.nextLine().toUpperCase();
                if(escolha.equals("1")){
                    System.out.println("Sexo: ");
                    String sexo = input.nextLine().toUpperCase();
                    System.out.println("Biotipo: ");
                    String biotipo = input.nextLine().toUpperCase();
                    System.out.println("Idade: ");
                    int idade = input.nextInt();
                    System.out.println("Altura: ");
                    double altura = input.nextDouble();
                    System.out.println("Peso: ");
                    double peso = input.nextDouble();
                    System.out.println("Objetivo: ");
                    String objetivo = input.nextLine().toUpperCase();
                    System.out.println("Data de avaliação: ");
                    String data_avaliacao = input.nextLine().toUpperCase();
                    dono.gerarTesteCliente(aluno, sexo, idade, peso, altura, biotipo, objetivo, data_avaliacao);
                    break;
                }
                else if(escolha.equals("2")){
                    dono.acessarPerfilClientes(aluno);
                    break;
                }
                else if(escolha.equals("3")){
                    dono.acessarTesteCliente(aluno);
                    break;
                }
                else if(escolha.equals("4")){
                    dono.acessarHistoricoDeTesteDoCliente(aluno);
                    break;
                }
                else if(escolha.equals("5")){
                    dono.gerarRelatorioCliente(aluno);
                    break;
                }
                else if(escolha.equals("6")){
                    dono.adicionarTreinosAluno(aluno);
                    break;
                }
                else if(escolha.equals("7")){
                    dono.acessarTreinoAluno(aluno);
                    break;
                }
                else if(escolha.equals("8")){
                    dono.removerTreinoAluno(aluno);
                    break;
                }
                else if(escolha.equals("0")){
                    voltar = true;
                    break;
                }
        
            }       
        }   
        
    }

    public void telaTreinosSistema(){
        boolean voltar = false;
        while(voltar == false){
            System.out.println("-- PÁGINA DE TREINOS --");
            System.out.println();
            System.out.println("-- DIGITE 0 PARA VOLTAR --");
            System.out.println("-- DIGITE 1 PARA ACESSAR LISTA DE TREINOS --");
            System.out.println("-- DIGITE 2 PARA ADICIONAR TRENO AO SISTEMA --");
            System.out.println("-- DIGITE 3 PARA REMOVER TREINO DO SISTEMA --");
            while(true){
                System.out.println();
                System.out.println("Escolha: ");
                String escolha = input.nextLine().toUpperCase();
                if(escolha.equals("1")){
                    dono.acessarTreinosSistema();
                }
                else if(escolha.equals("2")){
                    dono.adicionarTreinoSistema();
                }
                else if(escolha.equals("3")){
                    dono.removerTreinoSistema();
                }
                else if(escolha.equals("0")){
                    voltar = true;
                    break;
                }
                else{
                    System.out.println("-- PÁGINA DE TREINOS --");
                    System.out.println();
                    System.out.println("-- DIGITE 0 PARA VOLTAR --");
                    System.out.println("-- DIGITE 1 PARA ACESSAR LISTA DE TREINOS --");
                    System.out.println("-- DIGITE 2 PARA ADICIONAR TRENO AO SISTEMA --");
                    System.out.println("-- DIGITE 3 PARA REMOVER TREINO DO SISTEMA --");
                }
            }
        }           
    }

    public void telaFinanceira(){
        boolean voltar = false;
        while(voltar == false){
            System.out.println("-- DIGITE 0 PARA VOLTAR --");
            System.out.println("-- DIGITE 1 PARA ACESSAR RECEITA --");
            System.out.println("-- DIGITE 2 PARA ACESSAR DESPESAS");
            while(true){
                System.out.println();
                System.out.println("Escolha: ");
                String escolha = input.nextLine().toUpperCase();
                if(escolha.equals("1")){
                    dono.getAcademia().getFinanceiro().getReceita();
                }
                else if(escolha.equals("2")){
                    dono.getAcademia().getFinanceiro().getDespesas();
                }
                else if(escolha.equals("0")){
                    voltar = true;
                    break;
                }
                else{
                    System.out.println("-- DIGITE 0 PARA VOLTAR --");
                    System.out.println("-- DIGITE 1 PARA ACESSAR RECEITA --");
                    System.out.println("-- DIGITE 2 PARA ACESSAR DESPESAS");
                }
            }
        }
        
        
    }

}

