package Projeto_Academia;

import java.util.ArrayList;

public class Academia {

    private String nome_da_academia;
    private Administrador administrador;
    private Financeiro financeiro;
    ArrayList<String> clientes = new ArrayList();
    ArrayList<String> personais = new ArrayList();
    ArrayList<String> secretarios = new ArrayList();
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

    public void setPersonais(ArrayList<String> personais) {
        this.personais = personais;
    }

    public ArrayList<String> getPersonais() {
        return personais;
    }

    public void setSecretarios(ArrayList<String> secretarios) {
        this.secretarios = secretarios;
    }

    public ArrayList<String> getSecretarios() {
        return secretarios;
    }

    public void setFinanceiro(Financeiro financeiro) {
        this.financeiro = financeiro;
    }

    public Financeiro getFinanceiro() {
        return financeiro;
    }

    public void setClientes(ArrayList<String> clientes) {
        this.clientes = clientes;
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
