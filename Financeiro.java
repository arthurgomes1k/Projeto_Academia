package Projeto_Academia;

public class Financeiro {

    private Administrador dono;
    private double receita;
    private double despesas;
    
    public Administrador getDono() {
        return dono;
    }
    public void setDono(Administrador dono) {
        this.dono = dono;
    }
    public double getReceita() {
        return receita;
    }
    public void setReceita(double receita) {
        this.receita = receita;
    }
    public double getDespesas() {
        return despesas;
    }
    public void setDespesas(double despesas) {
        this.despesas = despesas;
    }


}

