import java.util.Scanner;
import java.util.ArrayList;

public class Cliente extends Usuario { 

    private Academia academia;
    private Avaliacao dados;
    private int data_de_vencimento;
    ArrayList<Avaliacao> avaliacoes = new ArrayList();
    ArrayList<String> mensaliades = new ArrayList();
    private Treino treino_aluno;
    ArrayList<Treino> treinos_do_aluno = new ArrayList();
    Scanner input = new Scanner(System.in);

    public void realizarLogin(String email, String senha){
        verificarLogin(email, senha);
    }

    @Override
    public void acessarPerfil(Cliente nome) {
        System.out.println("Perfil de " + nome.getNome());
        System.out.println();
        System.out.println("Nome: " + getNome());
        System.out.println("Email: " + getEmail());
        System.out.println("Contato: " + getNumero_contato());
        System.out.println("Acesso: " + getAcesso());
    }

    public void acessarTreinoAluno(){
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
                for(int treino = 0; treino < getTreinos_do_aluno().size(); treino++){
                    if(getTreinos_do_aluno().get(treino).getTipo_de_treino().equals("TIPO A")){
                        System.out.println();
                        System.out.println(getTreinos_do_aluno().get(treino).getListaDeTreinos());
                    }else if(treino == getTreinos_do_aluno().size() - 1){
                        System.out.println();
                        System.out.println("TREINO NÃO REGISTRADO");
                    }
                }
            }
            else if(escolha.equals("B")){
                for(int treino = 0; treino < getTreinos_do_aluno().size(); treino++){
                    if(getTreinos_do_aluno().get(treino).getTipo_de_treino().equals("TIPO B")){
                        System.out.println();
                        System.out.println(getTreinos_do_aluno().get(treino).getListaDeTreinos());
                    }else if(treino == getTreinos_do_aluno().size() - 1){
                        System.out.println();
                        System.out.println("TREINO NÃO REGISTRADO");
                    }
                }   
            }
            else if(escolha.equals("C")){
                for(int treino = 0; treino < getTreinos_do_aluno().size(); treino++){
                    if(getTreinos_do_aluno().get(treino).getTipo_de_treino().equals("TIPO C")){
                        System.out.println();
                        System.out.println(getTreinos_do_aluno().get(treino).getListaDeTreinos());
                    }else if(treino == getTreinos_do_aluno().size() - 1){
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


    public void acessarTesteCliente(){
        System.out.println("AVALIAÇÃO DE "+ getNome() + "DATA: " + getDados().getData_avaliacao());
        System.out.println();
        System.out.println("NOME: " + getDados().getCliente());
        System.out.println("SEXO: " + getDados().getSexo());
        System.out.println("PESO: " + getDados().getPeso());
        System.out.println("ALTURA: " + getDados().getAltura());
        System.out.println("IDADE: " + getDados().getIdade());
        System.out.println("BIOTIPO: " + getDados().getBiotipo());
        System.out.println("TAXA METABOLICA: " + getDados().getBiotipo());
        System.out.println("IMC: " + getDados().getMassaCorporal());
        System.out.println("OBJETIVO: " + getDados().getObjetivo());
    }

    public void acessarHistoricoTestes(){
        System.out.println("====== HISTÓRICO DE TESTES ======");
        for(int avaliacao = 0; avaliacao < getAvaliacoes().size(); avaliacao++){
            System.out.println((avaliacao + 1) + "º AVALIAÇÃO: " + getAvaliacoes().get(avaliacao).getData_avaliacao());
        }
    }

    public void relatorioCliente(){
        int ultimo = getAvaliacoes().size() - 1;
        int penultimo = getAvaliacoes().size() - 2;
        System.out.println("RELATÓRIO DO ALUNO " + getNome());
        System.out.println();
        if(getAvaliacoes().get(ultimo).getPeso() < getAvaliacoes().get(penultimo).getPeso()){
            System.out.println("Você perdeu peso");
            System.out.println("Seu peso mudou de " + getAvaliacoes().get(penultimo).getPeso() + "kilos para " + getAvaliacoes().get(ultimo).getPeso() + "kilos");
        }
        else if(getAvaliacoes().get(ultimo).getPeso() > getAvaliacoes().get(penultimo).getPeso()){
            System.out.println("Você ganhou peso");
            System.out.println("Seu peso mudou de " + getAvaliacoes().get(penultimo).getPeso() + "kilos para " + getAvaliacoes().get(ultimo).getPeso() + "kilos");
        }
        else{
            System.out.println("Seu peso continua igual");
        }
        if(getAvaliacoes().get(ultimo).getTaxa_metabolica_basal() < getAvaliacoes().get(penultimo).getTaxa_metabolica_basal()){
            System.out.println();
            System.out.println("Sua taxa metabolica diminuiu de " + getAvaliacoes().get(penultimo).getTaxa_metabolica_basal() + "para " + getAvaliacoes().get(ultimo).getTaxa_metabolica_basal());
        }
        else if(getAvaliacoes().get(ultimo).getTaxa_metabolica_basal() > getAvaliacoes().get(penultimo).getTaxa_metabolica_basal()){
            System.out.println();
            System.out.println("Sua taxa metabolica aumentou de " + getAvaliacoes().get(penultimo).getTaxa_metabolica_basal() + "para " + getAvaliacoes().get(ultimo).getTaxa_metabolica_basal());
        }
        else{
            System.out.println();
            System.out.println("Sua taxa metabolica continua igual");
        }
        if(getAvaliacoes().get(ultimo).getMassaCorporal() < getAvaliacoes().get(penultimo).getMassaCorporal()){
            System.out.println();
            System.out.println("Seu IMC diminuiu");
            System.out.println("Sua massa corporal mudou de " + getAvaliacoes().get(penultimo).getMassaCorporal() + "para " + getAvaliacoes().get(ultimo).getMassaCorporal());
        }
        else if(getAvaliacoes().get(ultimo).getMassaCorporal() > getAvaliacoes().get(penultimo).getMassaCorporal()){
            System.out.println();
            System.out.println("Seu IMC aumentou");
            System.out.println("Sua massa corporal mudou de " + getAvaliacoes().get(penultimo).getMassaCorporal() + "para " + getAvaliacoes().get(ultimo).getMassaCorporal());
        }
        else{
            System.out.println();
            System.out.println("Seu IMC continua igual");
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

    //Sets e Gets Padrões

    public void setAcademia(Academia academia) {
        this.academia = academia;
    }

    public Academia getAcademia() {
        return academia;
    }
    
    public void setDados(Avaliacao dados) {
        this.dados = dados;
    }

    public Avaliacao getDados() {
        return dados;
    }

    public void setData_de_vencimento(int data_de_vencimento) {
        this.data_de_vencimento = data_de_vencimento;
    }

    public int getData_de_vencimento() {
        return data_de_vencimento;
    }

    public void setAvaliacoes(ArrayList<Avaliacao> avaliacoes) {
        this.avaliacoes = avaliacoes;
    }

    public ArrayList<Avaliacao> getAvaliacoes() {
        return avaliacoes;
    }

    public void setTreino_aluno(Treino treino_aluno) {
        this.treino_aluno = treino_aluno;
    }

    public Treino getTreino_aluno() {
        return treino_aluno;
    }
    
    public void setTreinos_do_aluno(ArrayList<Treino> treinos_do_aluno) {
        this.treinos_do_aluno = treinos_do_aluno;
    }

    public ArrayList<Treino> getTreinos_do_aluno() {
        return treinos_do_aluno;
    }

    public void setNumero_de_contato(String numero_contato) {
    }

}
