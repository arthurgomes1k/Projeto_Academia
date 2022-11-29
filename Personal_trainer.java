
public class Personal_trainer extends Usuario{

    private String horario_inicio;
    private String horario_saida;
    private Academia academia;

    public void realizarLogin() {
        
    }

    public void registrarCliente() {
        
    }

    public void acessarClientes() {
        
    }

    public void acessarPerfilCliente() {
        
    }

    public void acessarHistoricoDeTesteDoCliente() {
        
    }

    public void gerarRelatorioCliente() {
        
    }

    public void acessarTreinos() {

    }

    public void acessarPersonais() {
        
    }

    public void acessarPaginaDeHorarios() {
        
    }
    
    public void criar_lista_treinos(Cliente cliente) {
        Treino treinos = new Treino();
        treinos.setCliente(cliente);
        cliente.setTreino_aluno(treinos);
    }

    public void adicionarTreino(Cliente cliente, String treino){  
        cliente.getTreino_aluno().getListaDeTreinos().add(treino);
        
        
    }

    //Sets e Gets Padrões
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

    public void setAcademia(Academia academia) {
        this.academia = academia;
    }

    public Academia getAcademia() {
        return academia;
    }

}
