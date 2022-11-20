package Aplicativo_Java;

import java.util.ArrayList;

public class Cliente extends Usuario { 

    private Avaliacao dados;
    private int data_de_vencimento;
    ArrayList<String> avaliacoes = new ArrayList();


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

    public void realizarLogin() {
        
    }

    public void acessarPerfil(){
        
    }

    public void acessarTreinos() {
        if(listaDeTreinos.size() == 0){
            System.out.println("Lista Vazia");
          }
          System.out.println(listaDeTreinos);
    }

    public void acessarTesteCliente(){

    }

    public void acessarHistoricoTestes(){

    }

    public void relatorioCliente(){

    }


    


    
    
}
