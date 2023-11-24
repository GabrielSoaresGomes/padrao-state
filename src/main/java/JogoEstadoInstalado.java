public class JogoEstadoInstalado extends JogoEstado{
    private JogoEstadoInstalado() {}
    private static JogoEstadoInstalado instance = new JogoEstadoInstalado();
    public static JogoEstadoInstalado getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Instalado";
    }

    public boolean jogar(Jogo jogo) {
        jogo.setEstado(JogoEstadoJogando.getInstance());
        return true;
    }

    public boolean desinstalar(Jogo jogo) {
        jogo.setEstado(JogoEstadoAdquirido.getInstance());
        return true;
    }

    public boolean atualizar(Jogo jogo) {
        jogo.setEstado(JogoEstadoAtualizando.getInstance());
        return true;
    }
}
