
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Tests {

    @Test
    public  void RegistroDoAdministradorTest(){
       
        Administrador dono = new Administrador();

        String nome = "Raniere";
        String cpf = "000.000";
        String email = "raniere@gmail.com";
        String numero_contato = "83996019365";
        String senha = "123";
        String administrador = "Administrador";

        dono.realizarRegistro(nome, cpf, email, numero_contato,senha);
        
        assertEquals(nome, dono.getNome());
        assertEquals(cpf, dono.getCpf());
        assertEquals(email, dono.getEmail());
        assertEquals(numero_contato, dono.getNumero_contato());
        assertEquals(senha, dono.getSenha());
        assertEquals(administrador, dono.getAcesso());

    }
    
    @Test
    public  void loginAdministradorTest(){
        
        Administrador dono = new Administrador();
        
        String nome = "Raniere";
        String cpf = "000.000";
        String email = "raniere@gmail.com";
        String numero_contato = "83996019365";
        String senha = "123";

        dono.realizarRegistro(nome, cpf, email, numero_contato,senha);

        dono.realizarLogin(email, senha);

        assertEquals(email, dono.getEmail());
        assertEquals(senha, dono.getSenha());

    
    }
    
    @Test
    public  void criarPlanoTest(){

        Academia oxygim = new Academia();

        String plano1 = "Classic";
        String plano2 = "Master";
        String plano3 = "Muscle";

        oxygim.criarPlanos();

        assertEquals(plano1, oxygim.getPlanos().get(0).getNome_do_plano());
        assertEquals(plano2, oxygim.getPlanos().get(1).getNome_do_plano());
        assertEquals(plano3, oxygim.getPlanos().get(2).getNome_do_plano());

        
    }
    @Test
    public void registrarClienteTest(){

        Academia oxygim = new Academia();
        Administrador dono = new Administrador();
        
        dono.setAcademia(oxygim);
        dono.realizarRegistro("Raniere", "000.000", "raniere@gmail.com", "83996019365","123");
        dono.realizarLogin("raniere@gmail.com", "123");

         String nome = "Arthur";
          String email = "arthur@gmail.com";
          String numero_contato = "321-123";
          String senha = "00";

        dono.registrarCliente(nome,email,numero_contato,senha);
        
       for (Cliente cliente : oxygim.getClientes()) {
        if(cliente.getNome().equals(nome)){
            assertEquals(nome, cliente.getNome());
            assertEquals(email, cliente.getEmail());
            assertEquals(numero_contato, cliente.getNumero_contato());
            assertEquals(senha, cliente.getSenha());
        }
       }
    }
}
