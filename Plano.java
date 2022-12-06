
public class Plano {

    
    private String nome_do_plano;
    private int valor;
    private int quantidade_de_alunos; 
    

    public void setNome_do_plano(String nome_do_plano) {
        this.nome_do_plano = nome_do_plano;
    }
    
    public String getNome_do_plano() {
        return nome_do_plano;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
    
    public void setQuantidade_de_alunos(int quantidade_de_alunos) {
        this.quantidade_de_alunos = quantidade_de_alunos;
    }

    public int getQuantidade_de_alunos() {
        return quantidade_de_alunos;
    }
    
}
