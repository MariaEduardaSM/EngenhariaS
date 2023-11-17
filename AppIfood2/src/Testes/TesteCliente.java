package Testes;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import org.junit.Test;

import Login.Cliente;
import Login.Usuario;

public class TesteCliente {

    @Test
    public void buscaestabelecimento() {
        ArrayList<Usuario> busca = new ArrayList<Usuario>();
        busca.add(new Usuario("João", "joao@email.com", null, null, null));
        busca.add(new Usuario("Maria", "maria@email.com", null, null, null));
        
        
       
        Cliente cliente = new Cliente("João", "joao@email.com", null, null, null);
        assertTrue(cliente.buscaEstabelecimento(busca, "Diego"));
        
        
    }
        
        @Test
        public void buscaEstabelecimentoComNomeValido() {
        
            ArrayList<Usuario> busca = new ArrayList<Usuario>();
            busca.add(new Usuario("João", "joao@email.com", null, null, null));
            busca.add(new Usuario("Maria", "maria@email.com", null, null, null));
            busca.add(new Usuario("Pedro", "pedro@email.com", null, null, null));
            
           
            Cliente cliente = new Cliente("João", "joao@email.com", null, null, null);
            assertTrue(cliente.buscaEstabelecimento(busca, "Maria"));
        }

        @Test
        public void buscaEstabelecimentoComNomeInvalido() {
         
            ArrayList<Usuario> busca = new ArrayList<Usuario>();
            busca.add(new Usuario("João", "joao@email.com", null, null, null));
            busca.add(new Usuario("Maria", "maria@email.com", null, null, null));
            busca.add(new Usuario("Pedro", "pedro@email.com", null, null, null));
            
           
            Cliente cliente = new Cliente("João", "joao@email.com", null, null, null);
            assertFalse(cliente.buscaEstabelecimento(busca, "Martins"));
        }

        @Test
        public void buscaEstabelecimentoComNomeVazio() {
          
            ArrayList<Usuario> busca = new ArrayList<Usuario>();
            busca.add(new Usuario("João", "joao@email.com", null, null, null));
            busca.add(new Usuario("Maria", "maria@email.com", null, null, null));
            busca.add(new Usuario("Pedro", "pedro@email.com", null, null, null));
            
           
            Cliente cliente = new Cliente("João", "joao@email.com", null, null, null);
            assertFalse(cliente.buscaEstabelecimento(busca, ""));
        }

        @Test
        public void buscaEstabelecimentoComNomeNulo() {
         
            ArrayList<Usuario> busca = new ArrayList<Usuario>();
            busca.add(new Usuario("João", "joao@email.com", null, null, null));
            busca.add(new Usuario("Maria", "maria@email.com", null, null, null));
            busca.add(new Usuario("Pedro", "pedro@email.com", null, null, null));
            
           
            Cliente cliente = new Cliente("João", "joao@email.com", null, null, null);
            assertFalse(cliente.buscaEstabelecimento(busca, null));
        }

        @Test
        public void buscaEstabelecimentoComListaVazia() {
           
            ArrayList<Usuario> busca = new ArrayList<Usuario>();
            
           
            Cliente cliente = new Cliente("João", "joao@email.com", null, null, null);
            assertFalse(cliente.buscaEstabelecimento(busca, "Maria"));
        }

        @Test
        public void buscaEstabelecimentoComListaNula() {
            
            ArrayList<Usuario> busca = null;
            
           
            Cliente cliente = new Cliente("João", "joao@email.com", null, null, null);
            assertFalse(cliente.buscaEstabelecimento(busca, "Maria"));
        }

        @Test
        public void buscaEstabelecimentoComClienteNulo() {
            
            ArrayList<Usuario> busca = new ArrayList<Usuario>();
            busca.add(new Usuario("João", "joao@email.com", null, null, null));
            busca.add(new Usuario("Maria", "maria@email.com", null, null, null));
           
        
    }
        @Test
        public void buscaestabelecimentonomes() {
            ArrayList<Usuario> busca = new ArrayList<Usuario>();
            busca.add(new Usuario("Carlos", "carlos@email.com", null, null, null));
            busca.add(new Usuario("Milene", "milene@email.com", null, null, null));
            busca.add(new Usuario("Junior", "junior@email.com", null, null, null));
            
           
            Cliente cliente = new Cliente("João", "joao@email.com", null, null, null);
            assertTrue(cliente.buscaEstabelecimento(busca, "Junior"));
            
            
        }
        @Test
        public void buscaestabelecimentoerro() {
            ArrayList<Usuario> busca = new ArrayList<Usuario>();
            busca.add(new Usuario("Carlos", "carlos@email.com", null, null, null));
            busca.add(new Usuario("Milene", "milene@email.com", null, null, null));
            busca.add(new Usuario("Junior", "junior@email.com", null, null, null));
            
           
            Cliente cliente = new Cliente("João", "joao@email.com", null, null, null);
            assertTrue(cliente.buscaEstabelecimento(busca, "Maria"));
            
            
        }
        
        
        
}
