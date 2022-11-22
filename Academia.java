package Projeto_Academia;

import java.util.ArrayList;

public class Academia {

    private String nome_da_academia;
    private Administrador administrador;
    private Financeiro financeiro;
    ArrayList<String> clientes = new ArrayList();
    ArrayList<String> funcionarios = new ArrayList();
    ArrayList<String> inadimplentes = new ArrayList();
    ArrayList<String> treinos = new ArrayList();




    //Sets e Gets Padrões

    public void setNome_da_academia(String nome_da_academia) {
        this.nome_da_academia = nome_da_academia;
    }

    public String getNome_da_academia() {
        return nome_da_academia;
    }

    public void setAdministrador(Administrador administrador) {
        this.administrador = administrador;
    }

    public Administrador getAdministrador() {
        return administrador;
    }

    public ArrayList<String> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<String> clientes) {
        this.clientes = clientes;
    }

    public ArrayList<String> getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(ArrayList<String> funcionarios) {
        this.funcionarios = funcionarios;
    }

    public void setInadimplentes(ArrayList<String> inadimplentes) {
        this.inadimplentes = inadimplentes;
    }

    public ArrayList<String> getInadimplentes() {
        return inadimplentes;
    }

    public void setTreinos(ArrayList<String> treinos) {
        this.treinos = treinos;
    }

    public ArrayList<String> getTreinos() {
        return treinos;
    }

}
