package Projeto_Academia;

public class Avaliacao {

    private Cliente nome;
    private String sexo;
    private double peso;
    private double altura;
    private int idade;
    private String biotipo;
    private double gordura_corporal;
    private double taxa_metabolica_basal = 0;
    private String objetivo;


    public Cliente getNome() {
        return nome;
    }

    public void setNome(Cliente nome) {
        this.nome = nome;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getSexo() {
        return sexo;
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
        if(getSexo() == "Mulher"){
            if(10 < getIdade() < 18){
                taxa_metabolica_basal = 12.2 * getPeso() + 746;
            }
            else if(18 < getIdade() < 30){
                taxa_metabolica_basal = 14.7 * getPeso() + 496;
            }
            else if(30 < getIdade() < 60){
                taxa_metabolica_basal = 8.7 * getPeso() + 829;
            }
            else if(getIdade() > 60){
                taxa_metabolica_basal = 10.5 * getPeso() + 596;
            }
        if(getSexo() == "Homem"){
            if(10 < getIdade() < 18){
                taxa_metabolica_basal = 17.5 * getPeso() + 651;
            }
            else if(18 < getIdade() < 30){
                taxa_metabolica_basal = 15.3 * getPeso() + 679;
            }
            else if(30 < getIdade() < 60){
                taxa_metabolica_basal = 11.6 * getPeso() + 879;
            }
            else if(getIdade() > 60){
                taxa_metabolica_basal = 13.5 * getPeso() + 487;
            }
        }
    }
    }

    public double getTaxa_metabolica_basal() {
        return taxa_metabolica_basal;
    }

    public void setTaxa_metabolica_basal(double taxa_metabolica_basal) {
        this.taxa_metabolica_basal = taxa_metabolica_basal;
    }

    public String getObjetivo() {
        return objetivo;
    }

    public void setObjetivo(String objetivo) {
        this.objetivo = objetivo;
    }

}
