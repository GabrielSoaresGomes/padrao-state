public class JogoEstadoNaoAdquirido extends JogoEstado{
    private JogoEstadoNaoAdquirido() {}
    private static JogoEstadoNaoAdquirido instance = new JogoEstadoNaoAdquirido();
    public static JogoEstadoNaoAdquirido getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Não Adquirido";
    }

    public boolean adquirir(Jogo jogo) {
        jogo.setEstado(JogoEstadoAdquirido.getInstance());
        return true;
    }


}
