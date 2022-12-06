
import java.util.ArrayList;

public class Cliente extends Usuario { 

    private Academia academia;
    private Avaliacao dados;
    private int data_de_vencimento;
    ArrayList<Avaliacao> avaliacoes = new ArrayList();
    ArrayList<String> mensaliades = new ArrayList();
    private Treino treino_aluno;
    ArrayList<Treino> treinos_do_aluno = new ArrayList();


    public void realizarLogin(String email, String senha){
        verificarLogin(email, senha);
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

    public void acessarTreinos() {
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

}
