package Projeto_Academia;

import java.util.ArrayList;

public class Treino{
  ArrayList<String> listaDeTreinos = new ArrayList();
  
  private Usuario cliente;
  private Usuario personal;
  private String tipo_de_treino;

  

  public ArrayList<String> getListaDeTreinos() {
      return listaDeTreinos;
  }

  public void setListaDeTreinos(ArrayList<String> listaDeTreinos) {
      this.listaDeTreinos = listaDeTreinos;
  }

  public Usuario getCliente() {
      return cliente;
  }

  public void setCliente(Usuario cliente) {
      this.cliente = cliente;
  }

  public Usuario getPersonal() {
      return personal;
  }

  public void setPersonal(Usuario personal) {
      this.personal = personal;
  }

  public String getTipo_de_treino() {
      return tipo_de_treino;
  }

  public void setTipo_de_treino(String tipo_de_treino) {
      this.tipo_de_treino = tipo_de_treino;
  }

}