
import java.util.Scanner;

public class Administrador extends Usuario {

    private String cpf; 
    private Academia academia;
    private Plano plano;

    Scanner input = new Scanner(System.in);

    public void realizarRegistro(String nome, String cpf, String email, String numero_contato, String senha) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.numero_contato = numero_contato;
        this.senha = senha;
        this.acesso = "Administrador";
        
    }

    public void realizarLogin(String email, String senha){
        verificarLogin(email, senha);
    }

    public void registrarFuncionario(){
          System.out.println();  
          System.out.println("====== Qual será a função do funcionário no sistema ======");
          System.out.println("====== 1 -> Personal Trainer ======");
          System.out.println("====== 2 -> Secretario ======");
          System.out.println();
          while(true){
                
              String escolha = input.nextLine().toUpperCase();
              if(escolha.equals("1")){
                  System.out.println("====== Digite as informações do personal ======");
                  System.out.println("Nome: ");
                  String nome = input.nextLine().toUpperCase();
                  System.out.println("Email: ");
                  String email = input.nextLine().toUpperCase();
                  System.out.println("Numero de contato: ");
                  String numero_contato = input.nextLine().toUpperCase();
                  System.out.println("Senha: ");
                  String senha = input.nextLine().toUpperCase();
                  System.out.println("Inicio de expediente: ");
                  String horario_inicial = input.nextLine().toUpperCase();
                  System.out.println("Fim de expediente: ");
                  String horario_saida = input.nextLine().toUpperCase();
                  Personal_trainer personal = new Personal_trainer();
                  personal.setNome(nome);
                  personal.setEmail(email);
                  personal.setNumero_contato(numero_contato);
                  personal.setSenha(senha);
                  personal.setAcesso("Funcionario");
                  personal.setHorario_inicio(horario_inicial);
                  personal.setHorario_saida(horario_saida);
                  academia.getPersonais().add(personal);
                  break;
                }
              if(escolha.equals("2")){
                  System.out.println("====== Digite as informações do secretario ======");
                  System.out.println("Nome: ");
                  String nome = input.nextLine().toUpperCase();
                  System.out.println("Email: ");
                  String email = input.nextLine().toUpperCase();
                  System.out.println("Numero de contato: ");
                  String numero_contato = input.nextLine().toUpperCase();
                  System.out.println("Senha: ");
                  String senha = input.nextLine().toUpperCase();
                  String horario_inicial = input.nextLine().toUpperCase();
                  System.out.println("Fim de expediente: ");
                  String horario_saida = input.nextLine().toUpperCase();
                  Personal_trainer personal = new Personal_trainer();
                  Secretario secretario = new Secretario();
                  secretario.setNome(nome);
                  secretario.setEmail(email);
                  secretario.setNumero_contato(numero_contato);
                  secretario.setSenha(senha);
                  secretario.setAcesso("Funcionario");
                  secretario.setHorario_inicio(horario_inicial);
                  secretario.setHorario_saida(horario_saida);
                  academia.getSecretarios().add(secretario);
                  break;
              }
              else{
                System.out.println();
                System.out.println("====== Qual será a função do funcionário no sistema ======");
                System.out.println("====== 1 -> Personal Trainer ======");
                System.out.println("====== 2 -> Secretario ======");    
              }
          }
       }

    public void acessarFuncionarios(){
        System.out.println("====== O que deseja ver? ======");
        System.out.println("====== 0 -> Não exibir nada ======");
        System.out.println("====== 1 -> Lista de Personal Trainer ======");
        System.out.println("====== 2 -> Lista Secretario ======");

        while(true){
            
            String escolha = input.nextLine().toUpperCase();

            if(escolha.equals("0")){
                break;
            }

            if(escolha.equals("1")){
                System.out.println();
                System.out.println("Personais Trainers: ");
                for(int personal = 0 ; personal < academia.getPersonais().size(); personal++ ){
                  System.out.println(academia.getPersonais().get(personal).nome);                  
                }
                break;               
            }

            if(escolha.equals("2")){
                System.out.println();
                System.out.println("Secretarios: ");
                for(int secretario = 0 ; secretario < academia.getSecretarios().size(); secretario++ ){
                  System.out.println(academia.getSecretarios().get(secretario).nome);
                }
                break;
            }

            else{
                System.out.println();
                System.out.println("====== O que deseja ver? ======");
                System.out.println("====== 0 -> Não exibir nada ======");
                System.out.println("====== 1 -> Lista de Personal Trainer ======");
                System.out.println("====== 2 -> Lista Secretario ======");  
            }
        }
    }
    
    public void removerFuncionario(){ 
        while(true){

            System.out.println("-- Quem você deseja remover? --");
            System.out.println("Nome: ");
            String remover = input.nextLine().toUpperCase();
            System.out.println();
            System.out.println("====== Qual é a função deste funcionario? ======");
            System.out.println("====== 1 -> Personal Trainer ======");
            System.out.println("====== 2 -> Secretario ======");
            System.out.println();
                
            String escolha = input.nextLine().toUpperCase();
            if(escolha.equals("1")){
                for(int personal = 0; personal < academia.getPersonais().size(); personal++){
                    if(academia.getPersonais().get(personal).nome.equals(remover)){
                        academia.getPersonais().remove(personal);
                    }else if (personal == (academia.getPersonais().size() - 1)) {
                        System.out.println("Usuario não encontrado");
                    }         
                }
                System.out.println();
                System.out.println(" DESEJA CONTINUAR REMOVENDO? ");
                System.out.println(" 1 - SIM    2 - NÃO");
                escolha = input.nextLine().toUpperCase();
                if(escolha.equals("1")){
                    continue;
                }
                else if(escolha.equals("2")){
                    break;
                }
                
            }
            
            if(escolha.equals("2")){
                for(int secretario = 0; secretario < academia.getSecretarios().size(); secretario ++){
                    if(academia.getSecretarios().get(secretario).nome.equals(remover)){
                        academia.getSecretarios().remove(secretario);
                    }else if (secretario == (academia.getSecretarios().size() - 1)) {
                        System.out.println("Usuario não encontrado");
                    }         
                }
                System.out.println();
                System.out.println(" DESEJA CONTINUAR REMOVENDO? ");
                System.out.println(" 1 - SIM    2 - NÃO");
                escolha = input.nextLine().toUpperCase();
                if(escolha.equals("1")){
                    continue;
                }
                else if(escolha.equals("2")){
                    break;
                }
            }
            else{
                System.out.println("====== Qual será a função do funcionário no sistema ======");
                System.out.println("====== 1 -> Personal Trainer ======");
                System.out.println("====== 2 -> Secretario ======");    
            }
        }
    }

    public void registrarCliente(String nome, String email, String numero_de_contato, String senha) {
        Cliente cliente = new Cliente();
        cliente.setNome(nome);
        cliente.setEmail(email);
        cliente.setNumero_contato(numero_de_contato);
        cliente.setSenha(senha);
        cliente.setAcesso("Cliente");
        academia.getClientes().add(cliente);

    }

    public void gerarTesteCliente(Cliente nome, String sexo, int idade, double peso, double altura, String biotipo, String objetivo, String data){
        Avaliacao avaliacao = new Avaliacao();
        avaliacao.setCliente(nome);
        avaliacao.setSexo(sexo);
        avaliacao.setIdade(idade);
        avaliacao.setPeso(peso);
        avaliacao.setAltura(altura);
        avaliacao.setBiotipo(biotipo);
        avaliacao.setObjetivo(objetivo);
        avaliacao.setData_avaliacao(data);
        avaliacao.setMassaCorporal();
        avaliacao.setTaxa_metabolica_basal();
        nome.setDados(avaliacao);
        nome.getAvaliacoes().add(avaliacao);
    }

    public void acessarClientes() {

        System.out.println("Clientes: ");
        for(int cliente = 0 ; cliente < academia.getClientes().size(); cliente++ ){
            System.out.println(academia.getClientes().get(cliente).getNome());                  
        }    
    }

    public void removerCliente(String nome) {
        for(int cliente = 0; cliente < academia.getClientes().size(); cliente++){
            if(academia.getClientes().get(cliente).getNome().equals(nome)){
                academia.getClientes().remove(cliente);
                System.out.println("Cliente removido");
                break;
            }else if (cliente == (academia.getClientes().size() - 1)) {
                System.out.println("Usuario não encontrado");
            }                  
        }
    }

    public void acessarReceitaDaAcademia() {
        System.out.println("Receita: " + academia.getFinanceiro().getReceita());
        
    }

    public void acessarDespesasDaAcademia(){
        System.out.println("Despesas: " + academia.getFinanceiro().getDespesas());
    }

    @Override
    public void acessarPerfil() {
        System.out.println("Perfil de " + getNome());
        System.out.println();
        System.out.println("Nome: " + getNome());
        System.out.println("Email: " + getEmail());
        System.out.println("Contato: " + getNumero_contato());
        System.out.println("Acesso: " + getAcesso());
    }
    

    public void acessarPerfilClientes(Cliente nome) {
        System.out.println("Nome: " + nome.getNome());
        System.out.println("Email: " + nome.getEmail());
        System.out.println("Contato: " + nome.getNumero_contato());
        System.out.println("Acesso: " + nome.getAcesso());
        System.out.println("Data de vencimento: " + nome.getData_de_vencimento());
                   
    }

    public void acessarPerfilFuncionario() {
        System.out.println("====== Perfil do funcionario ======");
        System.out.println("====== Qual é a função do funcionário no sistema ======");
        System.out.println("====== 1 -> Personal Trainer ======");
        System.out.println("====== 2 -> Secretario ======");
        
        while(true){
            String escolha = input.nextLine().toUpperCase();
            if(escolha.equals("1")){
                System.out.println();
                System.out.println(" Digite o nome do Personal Trainer: ");
                String nome = input.nextLine().toUpperCase();
                    for(int personal = 0; personal < academia.getPersonais().size(); personal++){
                        if(academia.getPersonais().get(personal).nome.equals(nome)){
                            System.out.println();
                            System.out.println("Nome: " + academia.getPersonais().get(personal).getNome());
                            System.out.println("Email: " + academia.getPersonais().get(personal).getEmail());
                            System.out.println("Contato: " + academia.getPersonais().get(personal).getNumero_contato());
                            System.out.println("Acesso: " + academia.getPersonais().get(personal).getAcesso()); 
                            System.out.println("Horario de atividade: " + academia.getPersonais().get(personal).getHorario_inicio() + "até " + academia.getPersonais().get(personal).getHorario_saida());        
                        }else if (personal == (academia.getPersonais().size() - 1)) {
                            System.out.println("Usuario não encontrado");
                        }
                    }
                break;
            }

            if(escolha.equals("2")){
                System.out.println();
                System.out.println(" Digite o nome do Secretário");
                String nome = input.nextLine().toUpperCase();
                    for(int secretario = 0; secretario < academia.getSecretarios().size(); secretario++){
                        if(academia.getSecretarios().get(secretario).nome.equals(nome)){
                            System.out.println();
                            System.out.println("Nome: " + academia.getSecretarios().get(secretario).getNome());
                            System.out.println("Email: " + academia.getSecretarios().get(secretario).getEmail());
                            System.out.println("Contato: " + academia.getSecretarios().get(secretario).getNumero_contato());
                            System.out.println("Acesso: " + academia.getSecretarios().get(secretario).getAcesso()); 
                            System.out.println("Horario de atividade: " + academia.getSecretarios().get(secretario).getHorario_inicio() + "até " + academia.getSecretarios().get(secretario).getHorario_saida());
                        }else if (secretario == (academia.getSecretarios().size() - 1)) {
                            System.out.println("Usuario não encontrado");
                        }
                    }
                break;
            }

            else{
                System.out.println("====== Qual será a função do funcionário no sistema ======");
                System.out.println("====== 1 -> Personal Trainer ======");
                System.out.println("====== 2 -> Secretario ======");
            }  
        
        }
    }

    public void acessarTesteCliente(Cliente nome){
        System.out.println();
        System.out.println("====== AVALIAÇÃO ======");
        System.out.println("====== DATA: " + nome.getDados().getData_avaliacao() + "======");
        System.out.println();
        System.out.println("NOME: " + nome.getNome());
        System.out.println("SEXO: " + nome.getDados().getSexo());
        System.out.println("IDADE: " + nome.getDados().getIdade());
        System.out.println("PESO: " + nome.getDados().getPeso());
        System.out.println("ALTURA: " + nome.getDados().getAltura());
        System.out.println("BIOTIPO: " + nome.getDados().getBiotipo());
        System.out.println("OBJETIVO: " + nome.getDados().getObjetivo());
        System.out.println("TAXA METABOLICA: " + nome.getDados().getTaxa_metabolica_basal());
        System.out.println("IMC: " + nome.getDados().getMassaCorporal());
        System.out.println();                   
    }

    public void acessarHistoricoDeTesteDoCliente(Cliente nome) {
        System.out.println();
        System.out.println("====== HISTÓRICO DE TESTES ======");
        for(int avaliacao = 0; avaliacao < nome.getAvaliacoes().size(); avaliacao++){
            System.out.println((avaliacao + 1) + "º AVALIAÇÃO: " + nome.getAvaliacoes().get(avaliacao).getData_avaliacao());
        }                       
    }

    public void gerarRelatorioCliente(Cliente nome) {
        int ultimo = (nome.getAvaliacoes().size() - 1);
        int penultimo = (nome.getAvaliacoes().size() - 2);
        System.out.println("RELATÓRIO DO ALUNO " + nome.getNome());
        System.out.println();
        if(nome.getAvaliacoes().get(ultimo).getPeso() < nome.getAvaliacoes().get(penultimo).getPeso()){
            System.out.println("Você perdeu peso");
            System.out.println("Seu peso mudou de " + nome.getAvaliacoes().get(penultimo).getPeso() + "kilos para " + nome.getAvaliacoes().get(ultimo).getPeso() + "kilos");
        }
        else if(nome.getAvaliacoes().get(ultimo).getPeso() > nome.getAvaliacoes().get(penultimo).getPeso()){
            System.out.println("Você ganhou peso");
            System.out.println("Seu peso mudou de " + nome.getAvaliacoes().get(penultimo).getPeso() + "kilos para " + nome.getAvaliacoes().get(ultimo).getPeso() + "kilos");
        }
        else{
            System.out.println("Seu peso continua igual");
        }
        if(nome.getAvaliacoes().get(ultimo).getTaxa_metabolica_basal() < nome.getAvaliacoes().get(penultimo).getTaxa_metabolica_basal()){
            System.out.println();
            System.out.println("Sua taxa metabolica diminuiu de " + nome.getAvaliacoes().get(penultimo).getTaxa_metabolica_basal() + "para " + nome.getAvaliacoes().get(ultimo).getTaxa_metabolica_basal());
        }
        else if(nome.getAvaliacoes().get(ultimo).getTaxa_metabolica_basal() > nome.getAvaliacoes().get(penultimo).getTaxa_metabolica_basal()){
            System.out.println();
            System.out.println("Sua taxa metabolica aumentou de " + nome.getAvaliacoes().get(penultimo).getTaxa_metabolica_basal() + "para " + nome.getAvaliacoes().get(ultimo).getTaxa_metabolica_basal());
        }
        else{
            System.out.println();
            System.out.println("Sua taxa metabolica continua igual");
        }




        if(nome.getAvaliacoes().get(ultimo).getMassaCorporal() < nome.getAvaliacoes().get(penultimo).getMassaCorporal()){
            System.out.println();
            System.out.println("Seu IMC diminuiu");
            System.out.println("Sua massa corporal mudou de " + nome.getAvaliacoes().get(penultimo).getMassaCorporal() + "para " + nome.getAvaliacoes().get(ultimo).getMassaCorporal());
        }
        else if(nome.getAvaliacoes().get(ultimo).getMassaCorporal() > nome.getAvaliacoes().get(penultimo).getMassaCorporal()){
            System.out.println();
            System.out.println("Seu IMC aumentou");
            System.out.println("Sua massa corporal mudou de " + nome.getAvaliacoes().get(penultimo).getMassaCorporal() + "para " + nome.getAvaliacoes().get(ultimo).getMassaCorporal());
        }
        else{
            System.out.println();
            System.out.println("Seu IMC continua igual");
        }                    
    }

    public void adicionarTreinoSistema(){
        System.out.println(" DIGITE O TIPO DO EXERCICIO QUE SERÁ ADICIONADO ");
        System.out.println();
        System.out.println(" TIPO A = EXERCICIOS DE PEITO, OMBRO E TRICEPS");
        System.out.println(" TIPO B = EXERCICIOS DE COSTA, ABDOMEM E BICEPS");
        System.out.println(" TIPO C = EXERCICIOS DE PARTE INFERIOR");
        while(true){
            System.out.println();
            System.out.println("TIPO: ");
            String escolha = input.nextLine().toUpperCase();
            if(escolha.equals("A")){
                System.out.println(" DIGITE O NOME DO EXERCICIO ");
                System.out.println("EXERCICIO: ");
                String exercicio = input.nextLine().toUpperCase();
                academia.getTreino_A().add(exercicio);
                System.out.println();
                System.out.println(" DESEJA CONTINUAR ADICIONANDO? ");
                System.out.println(" 1 - SIM    2 - NÃO");
                escolha = input.nextLine().toUpperCase();
                if(escolha.equals("2")){
                    break;
                }
            }
            else if(escolha.equals("B")){
                System.out.println(" DIGITE O NOME DO EXERCICIO ");
                System.out.println("EXERCICIO: ");
                String exercicio = input.nextLine().toUpperCase();
                academia.getTreino_B().add(exercicio);
                System.out.println();
                System.out.println(" DESEJA CONTINUAR ADICIONANDO? ");
                System.out.println(" 1 - SIM    2 - NÃO");
                escolha = input.nextLine().toUpperCase();
                if(escolha.equals("2")){
                    break;
                }
            }
            else if(escolha.equals("C")){
                System.out.println(" DIGITE O NOME DO EXERCICIO ");
                System.out.println("EXERCICIO: ");
                String exercicio = input.nextLine().toUpperCase();
                academia.getTreino_C().add(exercicio);
                System.out.println();
                System.out.println(" DESEJA CONTINUAR ADICIONANDO? ");
                System.out.println(" 1 - SIM    2 - NÃO");
                escolha = input.nextLine().toUpperCase();
                if(escolha.equals("2")){
                    break;
                }
            }
        }
    }

    public void acessarTreinosSistema() {
        System.out.println(" LISTA DE EXERCICIOS ");
        System.out.println();
        System.out.println(" DIGITE PARA EXIBIR");
        System.out.println(" TIPO A = EXERCICIOS DE PEITO, OMBRO E TRICEPS");
        System.out.println(" TIPO B = EXERCICIOS DE COSTA, ABDOMEM E BICEPS");
        System.out.println(" TIPO C = EXERCICIOS DE PARTE INFERIOR");
        while(true){
            System.out.println();
            System.out.println("TIPO: ");
            String escolha = input.nextLine().toUpperCase();
            if(escolha.equals("A")){
                for(int exercicios = 0; exercicios < academia.getTreino_A().size(); exercicios++){
                    System.out.println(academia.getTreino_A().get(exercicios));
                }
            }
            else if(escolha.equals("B")){
                for(int exercicios = 0; exercicios < academia.getTreino_B().size(); exercicios++){
                    System.out.println(academia.getTreino_B().get(exercicios));
                }
            }
            else if(escolha.equals("C")){
                for(int exercicios = 0; exercicios < academia.getTreino_C().size(); exercicios++){
                    System.out.println(academia.getTreino_C().get(exercicios));
                }
            }
            System.out.println();
            System.out.println(" DESEJA ACESSAR MAIS TREINOS? ");
            System.out.println(" 1 - SIM    2 - NÃO");
            escolha = input.nextLine().toUpperCase();
            if(escolha.equals("2")){
                break;
            }
        }
    }

    public void removerTreinoSistema(){
        System.out.println(" DIGITE O TIPO DO EXERCICIO QUE SERÁ ADICIONADO ");
        System.out.println();
        System.out.println(" TIPO A = EXERCICIOS DE PEITO, OMBRO E TRICEPS");
        System.out.println(" TIPO B = EXERCICIOS DE COSTA, ABDOMEM E BICEPS");
        System.out.println(" TIPO C = EXERCICIOS DE PARTE INFERIOR");
        while(true){
            System.out.println();
            System.out.println("TIPO: ");
            String escolha = input.nextLine().toUpperCase();
            if(escolha.equals("A")){
                System.out.println();
                System.out.println(" DIGITE O NOME DO EXERCICIO ");
                System.out.println("EXERCICIO: ");
                String exercicio = input.nextLine().toUpperCase();
                for(int exercicios = 0; exercicios < academia.getTreino_A().size(); exercicios++){
                    if(academia.getTreino_A().get(exercicios).equals(exercicio)){
                        academia.getTreino_A().remove(exercicios);
                        break;
                    }else if (exercicios == (academia.getTreino_A().size() - 1)) {
                        System.out.println("Exercicio não encontrado");
                    } 
                }
                System.out.println();
                System.out.println(" DESEJA CONTINUAR REMOVENDO? ");
                System.out.println(" 1 - SIM    2 - NÃO");
                escolha = input.nextLine().toUpperCase();
                if(escolha.equals("2")){
                    break;
                }
            }
            else if(escolha.equals("B")){
                System.out.println();
                System.out.println(" DIGITE O NOME DO EXERCICIO ");
                System.out.println("EXERCICIO: ");
                String exercicio = input.nextLine().toUpperCase();
                for(int exercicios = 0; exercicios < academia.getTreino_B().size(); exercicios++){
                    if(academia.getTreino_B().get(exercicios).equals(exercicio)){
                        academia.getTreino_B().remove(exercicios);
                        break;
                    }else if (exercicios == (academia.getTreino_B().size() - 1)) {
                        System.out.println("Exercicio não encontrado");
                    } 
                }
                System.out.println();
                System.out.println(" DESEJA CONTINUAR REMOVENDO? ");
                System.out.println(" 1 - SIM    2 - NÃO");
                escolha = input.nextLine().toUpperCase();
                if(escolha.equals("2")){
                    break;
                }
                
            }
            else if(escolha.equals("C")){
                System.out.println();
                System.out.println(" DIGITE O NOME DO EXERCICIO ");
                System.out.println("EXERCICIO: ");
                String exercicio = input.nextLine().toUpperCase();
                for(int exercicios = 0; exercicios < academia.getTreino_C().size(); exercicios++){
                    if(academia.getTreino_C().get(exercicios).equals(exercicio)){
                        academia.getTreino_C().remove(exercicios);
                        break;
                    }else if (exercicios == (academia.getTreino_C().size() - 1)) {
                        System.out.println("Exercicio não encontrado");
                    } 
                }
    
                }
            System.out.println();
            System.out.println(" DESEJA CONTINUAR REMOVENDO? ");
            System.out.println(" 1 - SIM    2 - NÃO");
            escolha = input.nextLine().toUpperCase();
            if(escolha.equals("2")){
                break;
            }
        }
    }

    public void acessarPaginaDeHorarios() {
        System.out.println("====== PÁGINA DE HORÁRIOS ======");
        System.out.println();
        System.out.println("-- PERSONAIS -- ");
        for(int personais = 0; personais < academia.getPersonais().size(); personais++){
            System.out.println(academia.getPersonais().get(personais).getNome()+":" + academia.getPersonais().get(personais).getHorario_inicio() + "à" + academia.getPersonais().get(personais).getHorario_saida()  );
        }
        System.out.println();
        System.out.println(" -- SECRETARIOS -- ");
        for(int secretarios = 0; secretarios < academia.getPersonais().size(); secretarios++){
            System.out.println(academia.getPersonais().get(secretarios).getNome()+":" + academia.getPersonais().get(secretarios).getHorario_inicio() + "à" + academia.getPersonais().get(secretarios).getHorario_saida()  );
        }
    }

    public void adicionarTreinosAluno(Cliente nome) {
        boolean voltar = false;
        System.out.println(" DIGITE O TIPO DO EXERCICIO QUE SERÁ ADICIONADO ");
        System.out.println();
        System.out.println(" TIPO A = EXERCICIOS DE PEITO, OMBRO E TRICEPS ");
        System.out.println(" TIPO B = EXERCICIOS DE COSTA, ABDOMEM E BICEPS ");
        System.out.println(" TIPO C = EXERCICIOS DE PARTE INFERIOR ");
        while(voltar == false){
            System.out.println();
            System.out.println("TIPO: ");
            String escolha = input.nextLine().toUpperCase();                                       
            if(escolha.equals("A")){
               Treino treino = new Treino();
               treino.setCliente(nome);
               treino.setTipo_de_treino("TIPO A");
               for(int exercicios = 0; exercicios < academia.getTreino_A().size(); exercicios++){
                    System.out.println(academia.getTreino_A().get(exercicios));
               }
               while(true){
                    System.out.println(" DIGITE O NOME DO EXERCICIO PARA ADICIONAR AO TREINO ");
                    String exercicio = input.nextLine().toUpperCase();
                    for(int exercicios = 0; exercicios < academia.getTreino_A().size(); exercicios++){
                        if(academia.getTreino_A().get(exercicios).toUpperCase().equals(exercicio)){
                            treino.getListaDeTreinos().add(exercicio);
                            break;
                        }else if(exercicios == (academia.getTreino_A().size() - 1)){
                            System.out.println("EXERCICIO NÃO REGISTRADO NO SISTEMA");
                        }
                    }
                    System.out.println("DESEJA CONTINUAR ADICIONANDO EXERCICIOS?");
                    System.out.println(" 1 - SIM    2 - NÃO");
                    escolha = input.nextLine().toUpperCase();
                    if(escolha.equals("1")){
                        break;
                    }
                    else if(escolha.equals("2")){
                        nome.getTreinos_do_aluno().add(treino);
                        voltar = true;
                        break;
                    }
                }
                  
            }          
            else if(escolha.equals("B")){
                Treino treino = new Treino();
                treino.setCliente(nome);
                treino.setTipo_de_treino("TIPO B");
                for(int exercicios = 0; exercicios < academia.getTreino_B().size(); exercicios++){
                        System.out.println(academia.getTreino_B().get(exercicios));
                }
                while(true){
                    System.out.println(" DIGITE O NOME DO EXERCICIO PARA ADICIONAR AO TREINO ");
                    String exercicio = input.nextLine().toUpperCase();
                    for(int exercicios = 0; exercicios < academia.getTreino_B().size(); exercicios++){
                        if(academia.getTreino_B().get(exercicios).equals(exercicio)){
                           treino.getListaDeTreinos().add(exercicio);
                           break;
                        }else if(exercicios == (academia.getTreino_B().size() - 1)){
                           System.out.println("EXERCICIO NÃO REGISTRADO NO SISTEMA");
                        }
                    }
                        System.out.println("DESEJA CONTINUAR ADICIONANDO EXERCICIOS?");
                        System.out.println(" 1 - SIM    2 - NÃO");
                        escolha = input.nextLine().toUpperCase();
                        if(escolha.equals("1")){
                            break;
                        }
                        else if(escolha.equals("2")){
                            nome.getTreinos_do_aluno().add(treino);
                            voltar = true;
                            break;
                        }
                }
            }
            else if(escolha.equals("C")){
                Treino treino = new Treino();
                treino.setCliente(nome);
                treino.setTipo_de_treino("TIPO C");
                for(int exercicios = 0; exercicios < academia.getTreino_C().size(); exercicios++){
                        System.out.println(academia.getTreino_C().get(exercicios));
                }
                while(true){
                    System.out.println(" DIGITE O NOME DO EXERCICIO PARA ADICIONAR AO TREINO ");
                    String exercicio = input.nextLine().toUpperCase();
                    for(int exercicios = 0; exercicios < academia.getTreino_C().size(); exercicios++){
                        if(academia.getTreino_C().get(exercicios).equals(exercicio)){
                            treino.getListaDeTreinos().add(exercicio);
                            break;
                        }
                        else if(exercicios == (academia.getTreino_C().size() - 1)){
                            System.out.println("EXERCICIO NÃO REGISTRADO NO SISTEMA");
                        }
                    }
                    System.out.println("DESEJA CONTINUAR ADICIONANDO EXERCICIOS?");
                    System.out.println(" 1 - SIM    2 - NÃO");
                    escolha = input.nextLine().toUpperCase();
                    if(escolha.equals("1")){
                        break;
                    }
                    else if(escolha.equals("2")){
                        nome.getTreinos_do_aluno().add(treino);
                        voltar = true;
                        break;
                    }
                }
            }
        }
    }                   

    public void acessarTreinoAluno(Cliente nome){
        System.out.println(" DIGITE O TIPO DO EXERCICIO QUE SERÁ ADICIONADO ");
        System.out.println();
        System.out.println(" TIPO A = EXERCICIOS DE PEITO, OMBRO E TRICEPS ");
        System.out.println(" TIPO B = EXERCICIOS DE COSTA, ABDOMEM E BICEPS ");
        System.out.println(" TIPO C = EXERCICIOS DE PARTE INFERIOR ");
        while(true){
            System.out.println();
            System.out.println("TIPO: ");
            String escolha = input.nextLine().toUpperCase();
            if(escolha.equals("A")){
                for(int treino = 0; treino < nome.getTreinos_do_aluno().size(); treino++){
                    if(nome.getTreinos_do_aluno().get(treino).getTipo_de_treino().equals("TIPO A")){
                        System.out.println();
                        System.out.println(nome.getTreinos_do_aluno().get(treino).getListaDeTreinos());
                    }else if(treino == nome.getTreinos_do_aluno().size() - 1){
                        System.out.println();
                        System.out.println("TREINO NÃO REGISTRADO");
                    }
                }
            }
            else if(escolha.equals("B")){
                for(int treino = 0; treino < nome.getTreinos_do_aluno().size(); treino++){
                    if(nome.getTreinos_do_aluno().get(treino).getTipo_de_treino().equals("TIPO B")){
                        System.out.println();
                        System.out.println(nome.getTreinos_do_aluno().get(treino).getListaDeTreinos());
                    }else if(treino == nome.getTreinos_do_aluno().size() - 1){
                        System.out.println();
                        System.out.println("TREINO NÃO REGISTRADO");
                    }
                }   
            }
            else if(escolha.equals("C")){
                for(int treino = 0; treino < nome.getTreinos_do_aluno().size(); treino++){
                    if(nome.getTreinos_do_aluno().get(treino).getTipo_de_treino().equals("TIPO C")){
                        System.out.println();
                        System.out.println(nome.getTreinos_do_aluno().get(treino).getListaDeTreinos());
                    }else if(treino == nome.getTreinos_do_aluno().size() - 1){
                        System.out.println();
                        System.out.println("TREINO NÃO REGISTRADO");
                    }
                }
            }
            System.out.println();
            System.out.println("DESEJA VER MAIS TREINOS DESTE ALUNO?");
            System.out.println(" 1 - SIM    2 - NÃO");
            escolha = input.nextLine().toUpperCase();
            if(escolha.equals("2")){
                break;
            }
                 
        }
    }                    

    public void removerTreinoAluno(Cliente nome){
        System.out.println(" DIGITE O TIPO DO EXERCICIO QUE SERÁ ADICIONADO ");
        System.out.println();
        System.out.println(" TIPO A = EXERCICIOS DE PEITO, OMBRO E TRICEPS ");
        System.out.println(" TIPO B = EXERCICIOS DE COSTA, ABDOMEM E BICEPS ");
        System.out.println(" TIPO C = EXERCICIOS DE PARTE INFERIOR ");
        while(true){
            System.out.println();
            System.out.println("TIPO: ");
            String escolha = input.nextLine().toUpperCase();
            if(escolha.equals("A")){
                for(int treino = 0; treino < nome.getTreinos_do_aluno().size(); treino++){
                    if(nome.getTreinos_do_aluno().get(treino).getTipo_de_treino().equals("TIPO A")){
                        System.out.println();
                        System.out.println(nome.getTreinos_do_aluno().get(treino).getListaDeTreinos());
                        System.out.println();
                        System.out.println(" O QUE DESEJA REMOVER? ");
                        System.out.println("EXERCICIO: ");
                        String exercicio = input.nextLine().toUpperCase();
                        for(int exercicios = 0; exercicios < nome.getTreinos_do_aluno().get(treino).getListaDeTreinos().size(); exercicios++){
                            if(nome.getTreinos_do_aluno().get(treino).getListaDeTreinos().get(exercicios).equals(exercicio)){
                                nome.getTreinos_do_aluno().get(treino).getListaDeTreinos().remove(exercicios);
                            }else if(exercicios == nome.getTreinos_do_aluno().get(treino).getListaDeTreinos().size() - 1){
                                System.out.println();
                                System.out.println("EXERCICIO NÃO ENCONTRADO");
                            }            
                        }
                    }else if(treino == nome.getTreinos_do_aluno().size() - 1){
                        System.out.println();
                        System.out.println("TREINO NÃO REGISTRADO");
                    }
                }
            }
            else if(escolha.equals("B")){
                for(int treino = 0; treino < nome.getTreinos_do_aluno().size(); treino++){
                    if(nome.getTreinos_do_aluno().get(treino).getTipo_de_treino().equals("TIPO B")){
                        System.out.println();
                        System.out.println(nome.getTreinos_do_aluno().get(treino).getListaDeTreinos());
                        System.out.println();
                        System.out.println(" O QUE DESEJA REMOVER? ");
                        System.out.println("EXERCICIO: ");
                        String exercicio = input.nextLine().toUpperCase();
                        for(int exercicios = 0; exercicios < nome.getTreinos_do_aluno().get(treino).getListaDeTreinos().size(); exercicios++){
                            if(nome.getTreinos_do_aluno().get(treino).getListaDeTreinos().get(exercicios).equals(exercicio)){
                                nome.getTreinos_do_aluno().get(treino).getListaDeTreinos().remove(exercicios);
                            }else if(exercicios == nome.getTreinos_do_aluno().get(treino).getListaDeTreinos().size() - 1){
                                System.out.println();
                                System.out.println("EXERCICIO NÃO ENCONTRADO");
                            }            
                        }
                    }else if(treino == nome.getTreinos_do_aluno().size() - 1){
                        System.out.println();
                        System.out.println("TREINO NÃO REGISTRADO");
                    }
                }
            }
            else if(escolha.equals("C")){
                for(int treino = 0; treino < nome.getTreinos_do_aluno().size(); treino++){
                    if(nome.getTreinos_do_aluno().get(treino).getTipo_de_treino().equals("TIPO C")){
                        System.out.println();
                        System.out.println(nome.getTreinos_do_aluno().get(treino).getListaDeTreinos());
                        System.out.println();
                        System.out.println(" O QUE DESEJA REMOVER? ");
                        System.out.println("EXERCICIO: ");
                        String exercicio = input.nextLine().toUpperCase();
                        for(int exercicios = 0; exercicios < nome.getTreinos_do_aluno().get(treino).getListaDeTreinos().size(); exercicios++){
                            if(nome.getTreinos_do_aluno().get(treino).getListaDeTreinos().get(exercicios).equals(exercicio)){
                                nome.getTreinos_do_aluno().get(treino).getListaDeTreinos().remove(exercicios);
                            }else if(exercicios == nome.getTreinos_do_aluno().get(treino).getListaDeTreinos().size() - 1){
                                System.out.println();
                                System.out.println("EXERCICIO NÃO ENCONTRADO");
                            }            
                        }
                    }else if(treino == nome.getTreinos_do_aluno().size() - 1){
                        System.out.println();
                        System.out.println("TREINO NÃO REGISTRADO");
                    }
                }
            }
            System.out.println();
            System.out.println("DESEJA CONTINUAR REMOVENDO TREINOS?");
            System.out.println(" 1 - SIM    2 - NÃO");
            escolha = input.nextLine().toUpperCase();
            if(escolha.equals("2")){
                break;
            }
                 
        }
    }                   

    // SETS E GETS
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }
    
    public void setAcademia(Academia academia) {
        this.academia = academia;
    }

    public Academia getAcademia() {
        return academia;
    }

    public void setPlano(Plano plano) {
        this.plano = plano;
    }

    public Plano getPlano() {
        return plano;
    }

}