public abstract class JogoEstado {
    public abstract String getEstado();

    public boolean adquirir(Jogo jogo) {
        return false;
    }

    public boolean instalar(Jogo jogo) {
        return false;
    }

    public boolean jogar(Jogo jogo) {
        return false;
    }

    public boolean fechar(Jogo jogo) {
        return false;
    }

    public boolean desinstalar(Jogo jogo) {
        return false;
    }

    public boolean atualizar(Jogo jogo) {
        return false;
    }

    public boolean finalizarAtualizacao(Jogo jogo) {
        return false;
    }
}
