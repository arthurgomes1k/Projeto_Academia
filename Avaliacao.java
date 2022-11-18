package projeto_academia_002;

public class Avaliacao {

private Cliente nome;
private double peso;
private double altura;
private int idade;
private String biotipo;
private double gordura_corporal;
private double taxa_metabolica_basal;
private String objetivo;


public Cliente getNome() {
    return nome;
}

public void setNome(Cliente nome) {
    this.nome = nome;
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
