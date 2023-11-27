package Testes;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import Login.Usuario;

public class Testeusuario {

    @Test
    public void testLoginComEmailESenhaCorretos() {
        Usuario usuario = new Usuario("duda", "duda@gmail.com", "123456", "Rua A, 123", "123456789");
        Assertions.assertTrue(usuario.login("duda@gmail.com", "123456"));
    }

    @Test
    public void testLoginComEmailIncorreto() {
        Usuario usuario = new Usuario("duda", "duda@gmail.com", "123456", "Rua A, 123", "123456789");
        Assertions.assertFalse(usuario.login("maria@gmail.com", "123456"));
    }

    @Test
    public void testLoginComSenhaIncorreta() {
        Usuario usuario = new Usuario("duda", "duda@gmail.com", "123456", "Rua A, 123", "123456789");
        Assertions.assertFalse(usuario.login("duda@gmail.com", "654321"));
    }

    @Test
    public void testLoginComEmailNulo() {
        Usuario usuario = new Usuario("duda", "duda@gmail.com", "123456", "Rua A, 123", "123456789");
        Assertions.assertFalse(usuario.login(null, "123456"));
    }

    @Test
    public void testLoginComSenhaNula() {
        Usuario usuario = new Usuario("duda", "duda@gmail.com", "123456", "Rua A, 123", "123456789");
        Assertions.assertFalse(usuario.login("duda@gmail.com", null));
        
    }
        @Test
        public void testLoginComEmailESenhaVazios() {
            Usuario usuario = new Usuario("duda", "duda@gmail.com", "123456", "Rua A, 123", "123456789");
            Assertions.assertFalse(usuario.login("", ""));
        }

        @Test
        public void testLoginComEmailInvalido() {
            Usuario usuario = new Usuario("duda", "duda@gmail.com", "123456", "Rua A, 123", "123456789");
            Assertions.assertFalse(usuario.login("duda@.com", "123456"));
        }

        @Test
        public void testLoginComSenhaMuitoCurta() {
            Usuario usuario = new Usuario("duda", "duda@gmail.com", "123456", "Rua A, 123", "123456789");
            Assertions.assertFalse(usuario.login("duda@gmail.com", "12"));
        }

        @Test
        public void testLoginComUsuarioNaoCadastrado() {
            Usuario usuario = new Usuario("duda", "duda@gmail.com", "123456", "Rua A, 123", "123456789");
            Assertions.assertFalse(usuario.login("joao@gmail.com", "654321"));
        }

        @Test
        public void testLoginComEmailESenhaNulos() {
            Usuario usuario = new Usuario("duda", "duda@gmail.com", "123456", "Rua A, 123", "123456789");
            Assertions.assertFalse(usuario.login(null, null));
        
    }
}

