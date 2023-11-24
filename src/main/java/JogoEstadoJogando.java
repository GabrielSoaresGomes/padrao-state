public class JogoEstadoJogando extends JogoEstado{
    private JogoEstadoJogando() {}
    private static JogoEstadoJogando instance = new JogoEstadoJogando();
    public static JogoEstadoJogando getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Jogando";
    }

    public boolean fechar(Jogo jogo) {
        jogo.setEstado(JogoEstadoInstalado.getInstance());
        return true;
    }
}
