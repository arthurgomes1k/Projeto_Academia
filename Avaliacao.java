public class Avaliacao {

    private Cliente cliente;
    private String sexo;
    private double peso;
    private double altura;
    private int idade;
    private String biotipo;
    private double taxa_metabolica_basal = 0;
    private String objetivo;
    private String data_avaliacao;
    private double massaCorporal = 0;

    public void setMassaCorporal() {
       this.massaCorporal = getPeso()/(getAltura()*getAltura());
    }

    public void setTaxa_metabolica_basal() { 

        if(getSexo().equals("MULHER")){
             
            if(getIdade() > 10 && getIdade() < 18){
               this.taxa_metabolica_basal = 13.3 * getPeso() + 692.6;
            }
            else if(getIdade() > 18 && getIdade() < 30){
               this.taxa_metabolica_basal = 14.8 * getPeso() + 486.6;
            }
            else if(getIdade() > 30 && getIdade() < 60){
               this.taxa_metabolica_basal = 8.1 * getPeso() + 845.6;
            }
            else if(getIdade() > 60){
               this.taxa_metabolica_basal = 9.0* getPeso() + 658.5;
            }
        }
            
        else if(getSexo().equals("HOMEM")){
            if(getIdade() > 10 && getIdade() < 18){
               this.taxa_metabolica_basal = 17.6 * getPeso() + 658.2;
            }
            else if(getIdade() > 18 && getIdade() < 30){
               this.taxa_metabolica_basal = 15.0 * getPeso() + 692.2;
            }
            else if(getIdade() > 30 && getIdade() < 60){
               this.taxa_metabolica_basal = 11.4 * getPeso() + 873.1;
            }
            else if(getIdade() > 60){
               this.taxa_metabolica_basal = 11.7 * getPeso() + 587.7;
            }
        }
    }


    //Sets e Gets Padrões
    public double getMassaCorporal() {
        return massaCorporal;
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