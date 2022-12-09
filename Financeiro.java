
public class Financeiro {

    private Academia academia;
    private double receita = 0;
    private double despesas = 0;


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

    public void setReceita(){
        for(int i = 0; i < academia.getClientes().size(); i++){
          this.receita = receita + academia.getMensaliade();
        }
    }

    public double getDespesas() {
        return despesas;
    }

    public void setDespesas() {
        this.despesas = despesas + academia.getAdministrador().getPlano().getValor();
    }
}
