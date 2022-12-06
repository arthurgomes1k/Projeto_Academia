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
                    System.out.println("Nome: " + academia.getClientes().get(cliente).getNome());
                    System.out.println("Email: " + academia.getClientes().get(cliente).getEmail());
                    System.out.println("Contato: " + academia.getClientes().get(cliente).getNumero_contato());
                    System.out.println("Acesso: " + academia.getClientes().get(cliente).getAcesso());
                    System.out.println("Data de vencimento: " + academia.getClientes().get(cliente).getData_de_vencimento());
                    break;
                }else if (cliente == (academia.getClientes().size() - 1)) {
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
                    System.out.println("====== HISTÓRICO DE TESTES ======");
                    for(int avaliacao = 0; avaliacao < academia.getClientes().get(cliente).getAvaliacoes().size(); avaliacao++){
                        System.out.println((avaliacao + 1) + "º AVALIAÇÃO: " + academia.getClientes().get(cliente).getAvaliacoes().get(avaliacao).getData_avaliacao());
                    }
                }else if (cliente == (academia.getClientes().size() - 1)) {
                    System.out.println("Usuario não encontrado");
                }                  
            } 
        }
    }

    public void gerarRelatorioCliente() {
        
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
                System.out.println(" DIGITE O NOME DO EXERCICIO ");
                System.out.println("EXERCICIO: ");
                String exercicio = input.nextLine().toUpperCase();
                for(int exercicios = 0; exercicios < academia.getTreino_A().size(); exercicios++){
                    if(academia.getTreino_A().get(exercicios).equals(exercicio)){
                        academia.getTreino_A().remove(exercicios);
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
                System.out.println(" DIGITE O NOME DO EXERCICIO ");
                System.out.println("EXERCICIO: ");
                String exercicio = input.nextLine().toUpperCase();
                for(int exercicios = 0; exercicios < academia.getTreino_B().size(); exercicios++){
                    if(academia.getTreino_B().get(exercicios).equals(exercicio)){
                        academia.getTreino_B().remove(exercicios);
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
                System.out.println(" DIGITE O NOME DO EXERCICIO ");
                System.out.println("EXERCICIO: ");
                String exercicio = input.nextLine().toUpperCase();
                for(int exercicios = 0; exercicios < academia.getTreino_C().size(); exercicios++){
                    if(academia.getTreino_C().get(exercicios).equals(exercicio)){
                        academia.getTreino_C().remove(exercicios);
                    }else if (exercicios == (academia.getTreino_C().size() - 1)) {
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
                System.out.println("Personais Trainers: ");
                for(int personal = 0 ; personal < academia.getPersonais().size(); personal++ ){
                  System.out.println(academia.getPersonais().get(personal).nome);                  
                }               
            }

            if(escolha.equals("2")){
                System.out.println("Secretarios: ");
                for(int secretario = 0 ; secretario < academia.getSecretarios().size(); secretario++ ){
                  System.out.println(academia.getSecretarios().get(secretario).nome);
              }
            }

            else{
                System.out.println("====== O que deseja ver? ======");
                System.out.println("====== 1 -> Lista de Personal Trainer ======");
                System.out.println("====== 2 -> Lista Secretario ======");  
            }
        }
    }

    public void acessarPaginaDeHorarios() {
        
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
            System.out.println(" DESEJA PROCURAR OUTRO CLIENTE? ");
            System.out.println(" 1 - SIM    2 - NÃO");
            String escolha = input.nextLine().toUpperCase();
            if(escolha.equals("2")){
                break;
            }
                        
            }
        }
    }

    public void acessarTreinoAluno(){

    }

    public void removerTreino(){

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
