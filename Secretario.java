package Projeto_Academia;

public class Secretario extends Usuario {

    private String horario_inicio;
    private String horario_saida;
    private Academia academia;


    public void setAcademia(Academia academia) {
        this.academia = academia;
    }
    
    public Academia getAcademia() {
        return academia;
    }

    public void setHorario_inicio(String horario_inicio) {
        this.horario_inicio = horario_inicio;
    }

    public String getHorario_inicio() {
        return horario_inicio;
    }

    public void setHorario_saida(String horario_saida) {
        this.horario_saida = horario_saida;
    }

    public String getHorario_saida() {
        return horario_saida;
    }
    
    
}
