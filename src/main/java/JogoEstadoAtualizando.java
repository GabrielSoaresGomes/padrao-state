public class JogoEstadoAtualizando extends JogoEstado {
    private JogoEstadoAtualizando() {}
    private static JogoEstadoAtualizando instance = new JogoEstadoAtualizando();
    public static JogoEstadoAtualizando getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Atualizando";
    }

    public boolean finalizarAtualizacao(Jogo jogo) {
        jogo.setEstado(JogoEstadoAdquirido.getInstance());
        return true;
    }
}
