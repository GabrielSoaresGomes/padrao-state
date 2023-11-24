import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;


public class JogoTest {
    Jogo jogo;

    @BeforeEach
    public void setUp() {
        jogo = new Jogo();
    }

    // Jogo Não Adquirido

    @Test
    public void deveAdquirirJogoNaoAdquirido() {
        jogo.setEstado(JogoEstadoNaoAdquirido.getInstance());
        assertTrue(jogo.adquirir());
        assertEquals(JogoEstadoAdquirido.getInstance(), jogo.getEstado());
    }

    @Test
    public void naoDeveInstalarJogoNaoAdquirido() {
        jogo.setEstado(JogoEstadoNaoAdquirido.getInstance());
        assertFalse(jogo.instalar());
    }

    @Test
    public void naoDeveJogarJogoNaoAdquirido() {
        jogo.setEstado(JogoEstadoNaoAdquirido.getInstance());
        assertFalse(jogo.jogar());
    }

    @Test
    public void naoDeveFecharJogoNaoAdquirido() {
        jogo.setEstado(JogoEstadoNaoAdquirido.getInstance());
        assertFalse(jogo.fechar());
    }

    @Test
    public void naoDeveDesinstalarJogoNaoAdquirido() {
        jogo.setEstado(JogoEstadoNaoAdquirido.getInstance());
        assertFalse(jogo.desinstalar());
    }

    @Test
    public void naoDeveAtualizarJogoNaoAdquirido() {
        jogo.setEstado(JogoEstadoNaoAdquirido.getInstance());
        assertFalse(jogo.atualizar());
    }

    @Test
    public void naoDeveFinalizarAtualizacaoJogoNaoAdquirido() {
        jogo.setEstado(JogoEstadoNaoAdquirido.getInstance());
        assertFalse(jogo.finalizarAtualizacao());
    }

    // Jogo Adquirido

    @Test
    public void naoDeveAdquirirJogoAdquirido() {
        jogo.setEstado(JogoEstadoAdquirido.getInstance());
        assertFalse(jogo.adquirir());
    }

    @Test
    public void deveInstalarJogoAdquirido() {
        jogo.setEstado(JogoEstadoAdquirido.getInstance());
        assertTrue(jogo.instalar());
        assertEquals(JogoEstadoInstalado.getInstance(), jogo.getEstado());
    }

    @Test
    public void naoDeveJogarJogoAdquirido() {
        jogo.setEstado(JogoEstadoAdquirido.getInstance());
        assertFalse(jogo.jogar());
    }

    @Test
    public void naoDeveFecharJogoAdquirido() {
        jogo.setEstado(JogoEstadoAdquirido.getInstance());
        assertFalse(jogo.fechar());
    }

    @Test
    public void naoDeveDesinstalarJogoAdquirido() {
        jogo.setEstado(JogoEstadoAdquirido.getInstance());
        assertFalse(jogo.desinstalar());
    }

    @Test
    public void naoDeveAtualizarJogoAdquirido() {
        jogo.setEstado(JogoEstadoAdquirido.getInstance());
        assertFalse(jogo.atualizar());
    }

    @Test
    public void naoDeveFinalizarAtualizacaoJogoAdquirido() {
        jogo.setEstado(JogoEstadoAdquirido.getInstance());
        assertFalse(jogo.finalizarAtualizacao());
    }

    // Jogo Instalado

    @Test
    public void naoDeveAdquirirJogoInstalado() {
        jogo.setEstado(JogoEstadoInstalado.getInstance());
        assertFalse(jogo.adquirir());
    }

    @Test
    public void naoDeveInstalarJogoInstalado() {
        jogo.setEstado(JogoEstadoInstalado.getInstance());
        assertFalse(jogo.instalar());
    }

    @Test
    public void deveJogarJogoInstalado() {
        jogo.setEstado(JogoEstadoInstalado.getInstance());
        assertTrue(jogo.jogar());
        assertEquals(JogoEstadoJogando.getInstance(), jogo.getEstado());
    }

    @Test
    public void naoDeveFecharJogoInstalado() {
        jogo.setEstado(JogoEstadoInstalado.getInstance());
        assertFalse(jogo.fechar());
    }

    @Test
    public void deveDesinstalarJogoInstalado() {
        jogo.setEstado(JogoEstadoInstalado.getInstance());
        assertTrue(jogo.desinstalar());
        assertEquals(JogoEstadoAdquirido.getInstance(), jogo.getEstado());
    }

    @Test
    public void deveAtualizarJogoInstalado() {
        jogo.setEstado(JogoEstadoInstalado.getInstance());
        assertTrue(jogo.atualizar());
        assertEquals(JogoEstadoAtualizando.getInstance(), jogo.getEstado());
    }

    @Test
    public void naoDeveFinalizarAtualizacaoJogoInstalado() {
        jogo.setEstado(JogoEstadoInstalado.getInstance());
        assertFalse(jogo.finalizarAtualizacao());
    }

    // Jogo Atualizando

    @Test
    public void naoDeveAdquirirJogoAtualizando() {
        jogo.setEstado(JogoEstadoAtualizando.getInstance());
        assertFalse(jogo.adquirir());
    }

    @Test
    public void naoDeveInstalarJogoAtualizando() {
        jogo.setEstado(JogoEstadoAtualizando.getInstance());
        assertFalse(jogo.instalar());
    }

    @Test
    public void naoDeveJogarJogoAtualizando() {
        jogo.setEstado(JogoEstadoAtualizando.getInstance());
        assertFalse(jogo.jogar());
    }

    @Test
    public void naoDeveFecharJogoAtualizando() {
        jogo.setEstado(JogoEstadoAtualizando.getInstance());
        assertFalse(jogo.fechar());
    }

    @Test
    public void naoDeveDesinstalarJogoAtualizando() {
        jogo.setEstado(JogoEstadoAtualizando.getInstance());
        assertFalse(jogo.desinstalar());
    }

    @Test
    public void naoDeveAtualizarJogoAtualizando() {
        jogo.setEstado(JogoEstadoAtualizando.getInstance());
        assertFalse(jogo.atualizar());
    }

    @Test
    public void deveFinalizarAtualizacaoJogoAtualizando() {
        jogo.setEstado(JogoEstadoAtualizando.getInstance());
        assertTrue(jogo.finalizarAtualizacao());
        assertEquals(JogoEstadoAdquirido.getInstance(), jogo.getEstado());
    }

    // Jogo Jogando

    @Test
    public void naoDeveAdquirirJogoJogando() {
        jogo.setEstado(JogoEstadoJogando.getInstance());
        assertFalse(jogo.adquirir());
    }

    @Test
    public void naoDeveInstalarJogoJogando() {
        jogo.setEstado(JogoEstadoJogando.getInstance());
        assertFalse(jogo.instalar());
    }

    @Test
    public void naoDeveJogarJogoJogando() {
        jogo.setEstado(JogoEstadoJogando.getInstance());
        assertFalse(jogo.jogar());
    }

    @Test
    public void deveFecharJogoJogando() {
        jogo.setEstado(JogoEstadoJogando.getInstance());
        assertTrue(jogo.fechar());
        assertEquals(JogoEstadoInstalado.getInstance(), jogo.getEstado());
    }

    @Test
    public void naoDeveDesinstalarJogoJogando() {
        jogo.setEstado(JogoEstadoJogando.getInstance());
        assertFalse(jogo.desinstalar());
    }

    @Test
    public void naoDeveAtualizarJogoJogando() {
        jogo.setEstado(JogoEstadoJogando.getInstance());
        assertFalse(jogo.atualizar());
    }

    @Test
    public void naoDeveFinalizarAtualizacaoJogoJogando() {
        jogo.setEstado(JogoEstadoJogando.getInstance());
        assertFalse(jogo.finalizarAtualizacao());
    }
}
