import java.util.Scanner;

public class Personal_trainer extends Usuario{

    private String horario_inicio;
    private String horario_saida;
    private Academia academia;

    Scanner input = new Scanner(System.in);


    public void realizarLogin(String email, String senha){
        verificarLogin(email, senha);
    }

    public void registrarCliente() { 
        System.out.println("====== Digite as informações do cliente ======");
        System.out.println("Nome: ");
        String nome = input.nextLine().toUpperCase();
        System.out.println("Email: ");
        String email = input.nextLine().toUpperCase();
        System.out.println("Numero de contato: ");
        String numero_contato = input.nextLine().toUpperCase();
        System.out.println("Senha: ");
        String senha = input.nextLine().toUpperCase();
        Cliente cliente = new Cliente();
        cliente.setNome(nome);
        cliente.setEmail(email);
        cliente.setNumero_contato(numero_contato);
        cliente.setSenha(senha);
        cliente.setAcesso("Cliente");
        academia.getClientes().add(cliente);

    }

    public void gerarTesteCliente(){
        while(true){
            System.out.println(" DIGITE O NOME DO ALUNO: ");
            String nome = input.nextLine().toUpperCase();
            System.out.println();
            for(int cliente = 0; cliente < academia.getClientes().size(); cliente++){
                if(academia.getClientes().get(cliente).getNome().equals(nome)){
                    Avaliacao avaliacao = new Avaliacao();
                    avaliacao.setCliente(academia.getClientes().get(cliente));
                    System.out.println("SEXO: ");
                    String sexo = input.nextLine().toUpperCase();
                    System.out.println("IDADE : ");
                    int idade = input.nextInt();
                    System.out.println("PESO :");
                    double peso = input.nextDouble();
                    System.out.println("ALTURA: ");
                    double altura = input.nextDouble();
                    System.out.println("BIOTIPO: ");
                    String biotipo = input.nextLine().toUpperCase();
                    System.out.println("OBJETIVO: ");
                    String objetivo = input.nextLine().toUpperCase();
                    System.out.println("DATA DE AVALIAÇÃO: ");
                    String data = input.nextLine().toUpperCase();
                    avaliacao.setSexo(sexo);
                    avaliacao.setIdade(idade);
                    avaliacao.setPeso(peso);
                    avaliacao.setAltura(altura);
                    avaliacao.setBiotipo(biotipo);
                    avaliacao.setObjetivo(objetivo);
                    avaliacao.setData_avaliacao(data);
                    avaliacao.setMassaCorporal();
                    avaliacao.setTaxa_metabolica_basal();
                    break;
                }else if (cliente == (academia.getClientes().size() - 1)) {
                    System.out.println("Usuario não encontrado");
                } 
            }
        }
    }

    public void acessarClientes() {

        System.out.println("Clientes: ");
            for(int cliente = 0 ; cliente < academia.getClientes().size(); cliente++ ){
                System.out.println(academia.getClientes().get(cliente).nome);                  
            }    
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

    public void acessarPerfilClientes() {
        System.out.println(" Digite o nome do cliente");
        while(true){
            String nome = input.nextLine().toUpperCase();
            for(int cliente = 0; cliente < academia.getClientes().size(); cliente++){
                if(academia.getClientes().get(cliente).nome.equals(nome)){
                    System.out.println();
                    System.out.println("Nome: " + academia.getClientes().get(cliente).getNome());
                    System.out.println("Email: " + academia.getClientes().get(cliente).getEmail());
                    System.out.println("Contato: " + academia.getClientes().get(cliente).getNumero_contato());
                    System.out.println("Acesso: " + academia.getClientes().get(cliente).getAcesso());
                    System.out.println("Data de vencimento: " + academia.getClientes().get(cliente).getData_de_vencimento());
                    break;
                }else if (cliente == (academia.getClientes().size() - 1)) {
                    System.out.println();
                    System.out.println("Usuario não encontrado");
                }         
            }
        }
    }

    public void acessarTesteCliente(){
        System.out.println(" DIGITE O NOME DO CLIENTE: ");
        while(true){
            System.out.println("NOME: ");
            String nome = input.nextLine().toUpperCase();
            for(int cliente = 0 ; cliente < academia.getClientes().size(); cliente++ ){
                if(academia.getClientes().get(cliente).nome.equals(nome)){
                    System.out.println();
                    System.out.println("====== AVALIAÇÃO ======");
                    System.out.println("====== DATA: " + academia.getClientes().get(cliente).getDados().getData_avaliacao() + "======");
                    System.out.println();
                    System.out.println("NOME: " + academia.getClientes().get(cliente).getNome());
                    System.out.println("SEXO: " + academia.getClientes().get(cliente).getDados().getSexo());
                    System.out.println("IDADE: " + academia.getClientes().get(cliente).getDados().getIdade());
                    System.out.println("PESO: " + academia.getClientes().get(cliente).getDados().getPeso());
                    System.out.println("ALTURA: " + academia.getClientes().get(cliente).getDados().getAltura());
                    System.out.println("BIOTIPO: " + academia.getClientes().get(cliente).getDados().getBiotipo());
                    System.out.println("OBJETIVO: " + academia.getClientes().get(cliente).getDados().getObjetivo());
                    System.out.println("TAXA METABOLICA: " + academia.getClientes().get(cliente).getDados().getTaxa_metabolica_basal());
                    System.out.println("IMC: " + academia.getClientes().get(cliente).getDados().getMassaCorporal());
                    System.out.println();

                    
                }else if (cliente == (academia.getClientes().size() - 1)) {
                    System.out.println();
                    System.out.println("Usuario não encontrado");
                }                  
            } 
        }
    }

    public void acessarHistoricoDeTesteDoCliente() {
        System.out.println(" DIGITE O NOME DO CLIENTE: ");
        while(true){
            System.out.println("NOME: ");
            String nome = input.nextLine().toUpperCase();
            for(int cliente = 0 ; cliente < academia.getClientes().size(); cliente++ ){
                if(academia.getClientes().get(cliente).nome.equals(nome)){
                    System.out.println();
                    System.out.println("====== HISTÓRICO DE TESTES ======");
                    for(int avaliacao = 0; avaliacao < academia.getClientes().get(cliente).getAvaliacoes().size(); avaliacao++){
                        System.out.println((avaliacao + 1) + "º AVALIAÇÃO: " + academia.getClientes().get(cliente).getAvaliacoes().get(avaliacao).getData_avaliacao());
                    }
                }else if (cliente == (academia.getClientes().size() - 1)) {
                    System.out.println();
                    System.out.println("Usuario não encontrado");
                }                  
            } 
        }
    }

    public void gerarRelatorioCliente() {
        while(true){
            System.out.println(" DIGITE O NOME DO ALUNO: ");
            String nome = input.nextLine().toUpperCase();
            for(int cliente = 0; cliente < academia.getClientes().size(); cliente++){
                if(academia.getClientes().get(cliente).getNome().equals(nome)){
                    int ultimo = (academia.getClientes().get(cliente).getAvaliacoes().size() - 1);
                    int penultimo = (academia.getClientes().get(cliente).getAvaliacoes().size() - 2);
                    System.out.println("RELATÓRIO DO ALUNO " + academia.getClientes().get(cliente).getNome());
                    System.out.println();
                    if(academia.getClientes().get(cliente).getAvaliacoes().get(ultimo).getPeso() < academia.getClientes().get(cliente).getAvaliacoes().get(penultimo).getPeso()){
                        System.out.println("Você perdeu peso");
                        System.out.println("Seu peso mudou de " + academia.getClientes().get(cliente).getAvaliacoes().get(penultimo).getPeso() + "kilos para " + academia.getClientes().get(cliente).getAvaliacoes().get(ultimo).getPeso() + "kilos");
                    }
                    else if(academia.getClientes().get(cliente).getAvaliacoes().get(ultimo).getPeso() > academia.getClientes().get(cliente).getAvaliacoes().get(penultimo).getPeso()){
                        System.out.println("Você ganhou peso");
                        System.out.println("Seu peso mudou de " + academia.getClientes().get(cliente).getAvaliacoes().get(penultimo).getPeso() + "kilos para " + academia.getClientes().get(cliente).getAvaliacoes().get(ultimo).getPeso() + "kilos");
                    }
                    else{
                        System.out.println("Seu peso continua igual");
                    }
                    if(academia.getClientes().get(cliente).getAvaliacoes().get(ultimo).getTaxa_metabolica_basal() < academia.getClientes().get(cliente).getAvaliacoes().get(penultimo).getTaxa_metabolica_basal()){
                        System.out.println();
                        System.out.println("Sua taxa metabolica diminuiu de " + academia.getClientes().get(cliente).getAvaliacoes().get(penultimo).getTaxa_metabolica_basal() + "para " + academia.getClientes().get(cliente).getAvaliacoes().get(ultimo).getTaxa_metabolica_basal());
                    }
                    else if(academia.getClientes().get(cliente).getAvaliacoes().get(ultimo).getTaxa_metabolica_basal() > academia.getClientes().get(cliente).getAvaliacoes().get(penultimo).getTaxa_metabolica_basal()){
                        System.out.println();
                        System.out.println("Sua taxa metabolica aumentou de " + academia.getClientes().get(cliente).getAvaliacoes().get(penultimo).getTaxa_metabolica_basal() + "para " + academia.getClientes().get(cliente).getAvaliacoes().get(ultimo).getTaxa_metabolica_basal());
                    }
                    else{
                        System.out.println();
                        System.out.println("Sua taxa metabolica continua igual");
                    }
                    if(academia.getClientes().get(cliente).getAvaliacoes().get(ultimo).getMassaCorporal() < academia.getClientes().get(cliente).getAvaliacoes().get(penultimo).getMassaCorporal()){
                        System.out.println();
                        System.out.println("Seu IMC diminuiu");
                        System.out.println("Sua massa corporal mudou de " + academia.getClientes().get(cliente).getAvaliacoes().get(penultimo).getMassaCorporal() + "para " + academia.getClientes().get(cliente).getAvaliacoes().get(ultimo).getMassaCorporal());
                    }
                    else if(academia.getClientes().get(cliente).getAvaliacoes().get(ultimo).getMassaCorporal() > academia.getClientes().get(cliente).getAvaliacoes().get(penultimo).getMassaCorporal()){
                        System.out.println();
                        System.out.println("Seu IMC aumentou");
                        System.out.println("Sua massa corporal mudou de " + academia.getClientes().get(cliente).getAvaliacoes().get(penultimo).getMassaCorporal() + "para " + academia.getClientes().get(cliente).getAvaliacoes().get(ultimo).getMassaCorporal());
                    }
                    else{
                        System.out.println();
                        System.out.println("Seu IMC continua igual");
                    }
                        
                }
            }
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
                System.out.println();
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
                System.out.println();
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
                System.out.println();
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
                        System.out.println();
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
                        System.out.println();
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
                        System.out.println();
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
    
    public void adicionarTreinosAluno() {
        while(true){
            System.out.println(" DIGITE O NOME DO ALUNO: ");
            String nome = input.nextLine().toUpperCase();
            for(int cliente = 0; cliente < academia.getClientes().size(); cliente++){
                if(academia.getClientes().get(cliente).getNome().equals(nome)){
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
                           Treino treino = new Treino();
                           treino.setCliente(academia.getClientes().get(cliente));
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
                                if(escolha.equals("2")){
                                    academia.getClientes().get(cliente).getTreinos_do_aluno().add(treino);
                                    break;
                                }
                            }
                            break;
                              
                        }          
                        else if(escolha.equals("B")){
                            Treino treino = new Treino();
                            treino.setCliente(academia.getClientes().get(cliente));
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
                                    if(escolha.equals("2")){
                                        academia.getClientes().get(cliente).getTreinos_do_aluno().add(treino);
                                        break;
                                    }
                            }
                            break;
                        }
                        else if(escolha.equals("C")){
                            Treino treino = new Treino();
                            treino.setCliente(academia.getClientes().get(cliente));
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
                                    }else if(exercicios == (academia.getTreino_C().size() - 1)){
                                        System.out.println("EXERCICIO NÃO REGISTRADO NO SISTEMA");
                                    }
                                }
                                System.out.println("DESEJA CONTINUAR ADICIONANDO EXERCICIOS?");
                                System.out.println(" 1 - SIM    2 - NÃO");
                                escolha = input.nextLine().toUpperCase();
                                if(escolha.equals("2")){
                                    academia.getClientes().get(cliente).getTreinos_do_aluno().add(treino);
                                    break;
                                }
                            }
                            break;
                        }
                    }
                }else if (cliente == (academia.getClientes().size() - 1)) {
                    System.out.println("Usuario não encontrado");
                }
            }

        System.out.println(" DESEJA PROCURAR OUTRO CLIENTE? ");
        System.out.println(" 1 - SIM    2 - NÃO");
        String escolha = input.nextLine().toUpperCase();
        if(escolha.equals("2")){
            break;
        }                
            
        }
    }

    public void acessarTreinoAluno(){
        while(true){
            System.out.println(" DIGITE O NOME DO ALUNO: ");
            String nome = input.nextLine().toUpperCase();
            for(int cliente = 0; cliente < academia.getClientes().size(); cliente++){
                if(academia.getClientes().get(cliente).getNome().equals(nome)){
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
                            for(int treino = 0; treino < academia.getClientes().get(cliente).getTreinos_do_aluno().size(); treino++){
                                if(academia.getClientes().get(cliente).getTreinos_do_aluno().get(treino).getTipo_de_treino().equals("TIPO A")){
                                    System.out.println();
                                    System.out.println(academia.getClientes().get(cliente).getTreinos_do_aluno().get(treino).getListaDeTreinos());
                                }else if(treino == academia.getClientes().get(cliente).getTreinos_do_aluno().size() - 1){
                                    System.out.println();
                                    System.out.println("TREINO NÃO REGISTRADO");
                                }
                            }
                        }
                        else if(escolha.equals("B")){
                            for(int treino = 0; treino < academia.getClientes().get(cliente).getTreinos_do_aluno().size(); treino++){
                                if(academia.getClientes().get(cliente).getTreinos_do_aluno().get(treino).getTipo_de_treino().equals("TIPO B")){
                                    System.out.println();
                                    System.out.println(academia.getClientes().get(cliente).getTreinos_do_aluno().get(treino).getListaDeTreinos());
                                }else if(treino == academia.getClientes().get(cliente).getTreinos_do_aluno().size() - 1){
                                    System.out.println();
                                    System.out.println("TREINO NÃO REGISTRADO");
                                }
                            }   
                        }
                        else if(escolha.equals("C")){
                            for(int treino = 0; treino < academia.getClientes().get(cliente).getTreinos_do_aluno().size(); treino++){
                                if(academia.getClientes().get(cliente).getTreinos_do_aluno().get(treino).getTipo_de_treino().equals("TIPO C")){
                                    System.out.println();
                                    System.out.println(academia.getClientes().get(cliente).getTreinos_do_aluno().get(treino).getListaDeTreinos());
                                }else if(treino == academia.getClientes().get(cliente).getTreinos_do_aluno().size() - 1){
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
                }else if (cliente == (academia.getClientes().size() - 1)) {
                    System.out.println();
                    System.out.println("Usuario não encontrado");
                }
                System.out.println();
                System.out.println("DESEJA PESQUISAR OUTRO ALUNO?");
                System.out.println(" 1 - SIM    2 - NÃO");
                String escolha = input.nextLine().toUpperCase();
                if(escolha.equals("2")){
                    break;
                }

            }
        }
    }

    public void removerTreinoAluno(){
        while(true){
            System.out.println(" DIGITE O NOME DO ALUNO: ");
            String nome = input.nextLine().toUpperCase();
            for(int cliente = 0; cliente < academia.getClientes().size(); cliente++){
                if(academia.getClientes().get(cliente).getNome().equals(nome)){
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
                            for(int treino = 0; treino < academia.getClientes().get(cliente).getTreinos_do_aluno().size(); treino++){
                                if(academia.getClientes().get(cliente).getTreinos_do_aluno().get(treino).getTipo_de_treino().equals("TIPO A")){
                                    System.out.println();
                                    System.out.println(academia.getClientes().get(cliente).getTreinos_do_aluno().get(treino).getListaDeTreinos());
                                    System.out.println();
                                    System.out.println(" O QUE DESEJA REMOVER? ");
                                    System.out.println("EXERCICIO: ");
                                    String exercicio = input.nextLine().toUpperCase();
                                    for(int exercicios = 0; exercicios < academia.getClientes().get(cliente).getTreinos_do_aluno().get(treino).getListaDeTreinos().size(); exercicios++){
                                        if(academia.getClientes().get(cliente).getTreinos_do_aluno().get(treino).getListaDeTreinos().get(exercicios).equals(exercicio)){
                                            academia.getClientes().get(cliente).getTreinos_do_aluno().get(treino).getListaDeTreinos().remove(exercicios);
                                        }else if(exercicios == academia.getClientes().get(cliente).getTreinos_do_aluno().get(treino).getListaDeTreinos().size() - 1){
                                            System.out.println();
                                            System.out.println("EXERCICIO NÃO ENCONTRADO");
                                        }            
                                    }
                                }else if(treino == academia.getClientes().get(cliente).getTreinos_do_aluno().size() - 1){
                                    System.out.println();
                                    System.out.println("TREINO NÃO REGISTRADO");
                                }
                            }
                        }
                        else if(escolha.equals("B")){
                            for(int treino = 0; treino < academia.getClientes().get(cliente).getTreinos_do_aluno().size(); treino++){
                                if(academia.getClientes().get(cliente).getTreinos_do_aluno().get(treino).getTipo_de_treino().equals("TIPO B")){
                                    System.out.println();
                                    System.out.println(academia.getClientes().get(cliente).getTreinos_do_aluno().get(treino).getListaDeTreinos());
                                    System.out.println();
                                    System.out.println(" O QUE DESEJA REMOVER? ");
                                    System.out.println("EXERCICIO: ");
                                    String exercicio = input.nextLine().toUpperCase();
                                    for(int exercicios = 0; exercicios < academia.getClientes().get(cliente).getTreinos_do_aluno().get(treino).getListaDeTreinos().size(); exercicios++){
                                        if(academia.getClientes().get(cliente).getTreinos_do_aluno().get(treino).getListaDeTreinos().get(exercicios).equals(exercicio)){
                                            academia.getClientes().get(cliente).getTreinos_do_aluno().get(treino).getListaDeTreinos().remove(exercicios);
                                        }else if(exercicios == academia.getClientes().get(cliente).getTreinos_do_aluno().get(treino).getListaDeTreinos().size() - 1){
                                            System.out.println();
                                            System.out.println("EXERCICIO NÃO ENCONTRADO");
                                        }            
                                    }
                                }else if(treino == academia.getClientes().get(cliente).getTreinos_do_aluno().size() - 1){
                                    System.out.println();
                                    System.out.println("TREINO NÃO REGISTRADO");
                                }
                            }
                        }
                        else if(escolha.equals("C")){
                            for(int treino = 0; treino < academia.getClientes().get(cliente).getTreinos_do_aluno().size(); treino++){
                                if(academia.getClientes().get(cliente).getTreinos_do_aluno().get(treino).getTipo_de_treino().equals("TIPO C")){
                                    System.out.println();
                                    System.out.println(academia.getClientes().get(cliente).getTreinos_do_aluno().get(treino).getListaDeTreinos());
                                    System.out.println();
                                    System.out.println(" O QUE DESEJA REMOVER? ");
                                    System.out.println("EXERCICIO: ");
                                    String exercicio = input.nextLine().toUpperCase();
                                    for(int exercicios = 0; exercicios < academia.getClientes().get(cliente).getTreinos_do_aluno().get(treino).getListaDeTreinos().size(); exercicios++){
                                        if(academia.getClientes().get(cliente).getTreinos_do_aluno().get(treino).getListaDeTreinos().get(exercicios).equals(exercicio)){
                                            academia.getClientes().get(cliente).getTreinos_do_aluno().get(treino).getListaDeTreinos().remove(exercicios);
                                        }else if(exercicios == academia.getClientes().get(cliente).getTreinos_do_aluno().get(treino).getListaDeTreinos().size() - 1){
                                            System.out.println();
                                            System.out.println("EXERCICIO NÃO ENCONTRADO");
                                        }            
                                    }
                                }else if(treino == academia.getClientes().get(cliente).getTreinos_do_aluno().size() - 1){
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
                }else if (cliente == (academia.getClientes().size() - 1)) {
                    System.out.println();
                    System.out.println("Usuario não encontrado");
                }
                System.out.println();
                System.out.println("DESEJA PESQUISAR OUTRO ALUNO?");
                System.out.println(" 1 - SIM    2 - NÃO");
                String escolha = input.nextLine().toUpperCase();
                if(escolha.equals("2")){
                    break;
                }

            }
        }
    }

    //Sets e Gets Padrões
    public void setHorario_inicio(String horario_inicio) {
        this.horario_inicio = horario_inicio;
    }

    public String getHorario_inicio() {
        return horario_inicio;
    }

    public void setHorario_saida(String horario_saida) {
        this.horario_saida = horario_saida;
    }

    public String getHorario_saida() {
        return horario_saida;
    }

    public void setAcademia(Academia academia) {
        this.academia = academia;
    }

    public Academia getAcademia() {
        return academia;
    }

}
