package Projeto_Academia;


public class Avaliacao {

    private Cliente cliente;
    private String sexo;
    private double peso;
    private double altura;
    private int idade;
    private String biotipo;
    private double gordura_corporal;
    private double taxa_metabolica_basal = 0;
    private String objetivo;
    private String data_avaliacao;
    private double gasto_calorico;
    private double calorias;
    private double massaCorporal;

    public void setMassaCorporal() {
        double imc = getPeso()/(getAltura()*getAltura());
    }

    public void setTaxa_metabolica_basal(double calorias) { 

        if(getSexo().equals("Mulher")){
             
            if(getIdade() > 10 && getIdade() < 18){
                taxa_metabolica_basal = 13.384 * getPeso() + 692.6;
            }
            else if(getIdade() > 18 && getIdade() < 30){
                taxa_metabolica_basal = 14.818 * getPeso() + 486.6;
            }
            else if(getIdade() > 30 && getIdade() < 60){
                taxa_metabolica_basal = 8.126 * getPeso() + 845.6;
            }
            else if(getIdade() > 60){
                taxa_metabolica_basal = 9.082 * getPeso() + 658.5;
            }
            
        if(getSexo().equals("Homem")){
            if(getIdade() > 10 && getIdade() < 18){
                taxa_metabolica_basal = 17.686 * getPeso() + 658.2;
            }
            else if(getIdade() > 18 && getIdade() < 30){
                taxa_metabolica_basal = 15.057 * getPeso() + 692.2;
            }
            else if(getIdade() > 30 && getIdade() < 60){
                taxa_metabolica_basal = 11.472 * getPeso() + 873.1;
            }
            else if(getIdade() > 60){
                taxa_metabolica_basal = 11.711 * getPeso() + 587.7;
            }
        }
    }
    }

    //Sets e Gets Padrões
    public double getMassaCorporal() {
        return massaCorporal;
    }
    public double getGasto_calorico() {
        return gasto_calorico;

    }
    public void setGasto_calorico(double gasto_calorico) {
        this.gasto_calorico = gasto_calorico;
    }
    public void setCalorias(double calorias) {
        this.calorias = calorias;
    }
    public double getCalorias() {
        return calorias;
    }
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getBiotipo() {
        return biotipo;
    }

    public void setBiotipo(String biotipo) {
        this.biotipo = biotipo;
    }

    public double getGordura_corporal() {
        return gordura_corporal;
    }

    public void setGordura_corporal(double gordura_corporal) {
        this.gordura_corporal = gordura_corporal;
    }

    public String getObjetivo() {
        return objetivo;
    }

    public void setObjetivo(String objetivo) {
        this.objetivo = objetivo;
    }

    public String getData_avaliacao() {
        return data_avaliacao;
    }

    public void setData_avaliacao(String data_avaliacao) {
        this.data_avaliacao = data_avaliacao;
    }
    public double getTaxa_metabolica_basal() {
        return taxa_metabolica_basal;
    }

}
