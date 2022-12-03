package Projeto_Academia;
import java.util.ArrayList;

public class Cliente extends Usuario { 

    private Academia academia;
    private Avaliacao dados;
    private int data_de_vencimento;
    ArrayList<Avaliacao> avaliacoes = new ArrayList();
    private Treino treino_aluno;


    public void realizarLogin(String email, String senha) {
        verificarLogin(email, senha);
    }

    public void acessarPerfil(){
        
    }

    public void acessarTreinos() {
    }

    public void acessarAvaliaçãoCliente(){
        System.out.println("Nome: "+dados.getCliente());
        System.out.println("Idade: "+dados.getIdade());
        System.out.println("Altura: "+dados.getAltura());
        System.out.println("Peso: "+dados.getPeso()+"Kg");
        System.out.println("Biotipo: "+dados.getBiotipo());
        System.out.println("Imc: "+dados.getMassaCorporal());
        System.out.println("Taxa metabólica: "+dados.getTaxa_metabolica_basal());
    }

    public void acessarHistoricoTestes(){
        for(int avaliacoes = 0; avaliacoes <getAvaliacoes().size();avaliacoes++){
            System.out.println((avaliacoes +1)+"°"+" Avaliação: "+ getAvaliacoes().get(avaliacoes).getData_avaliacao());
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

}
