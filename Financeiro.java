public class Financeiro {

    private Academia academia;
    private double receita = 0;
    private double despesas;

    //Sets e Gets Padrões

    public Academia getAcademia() {
        return academia;
    }

    public void setAcademia(Academia academia) {
        this.academia = academia;
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
    public void setReceita(){
      for(int i = 0; i < academia.getClientes().size(); i++){
        receita = receita + 80;
      }
    }
}