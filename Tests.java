
import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

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

        dono.realizarRegistroDoAdministrador(nome, cpf, email, numero_contato,senha);
        
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

        dono.realizarRegistroDoAdministrador(nome, cpf, email, numero_contato,senha);

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


}
