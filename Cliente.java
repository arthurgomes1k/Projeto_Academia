package Projeto_Academia;
import java.util.ArrayList;

public class Cliente extends Usuario { 

    private Avaliacao dados;
    private int data_de_vencimento;
    ArrayList<String> avaliacoes = new ArrayList();
    private Treino treino_aluno;


    public void realizarLogin(String email, String senha) {
        verificarLogin(email, senha);
    }

    public void acessarPerfil(){
        
    }

    public void acessarTreinos() {
    }

    public void acessarAvaliaçãoCliente(){

    }

    public void acessarHistoricoTestes(){

    }

    public void relatorioCliente(){

    }

    //Sets e Gets Padrões

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

    public void setAvaliacoes(ArrayList<String> avaliacoes) {
        this.avaliacoes = avaliacoes;
    }

    public ArrayList<String> getAvaliacoes() {
        return avaliacoes;
    }

    public void setTreino_aluno(Treino treino_aluno) {
        this.treino_aluno = treino_aluno;
    }

    public Treino getTreino_aluno() {
        return treino_aluno;
    }

}
