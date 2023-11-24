public class JogoEstadoAdquirido extends JogoEstado{
    private JogoEstadoAdquirido() {}
    private static JogoEstadoAdquirido instance = new JogoEstadoAdquirido();
    public static JogoEstadoAdquirido getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Adquirido";
    }

    public boolean instalar(Jogo jogo) {
        jogo.setEstado(JogoEstadoInstalado.getInstance());
        return true;
    }
}
