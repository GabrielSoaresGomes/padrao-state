public class Jogo {
    private String nome;
     private JogoEstado estado;

    public Jogo() {
         this.estado = JogoEstadoNaoAdquirido.getInstance();
    }

    public void setEstado(JogoEstado estado) {
        this.estado = estado;
    }

    public boolean adquirir() {
        return estado.adquirir(this);
    }

    public boolean instalar() {
        return estado.instalar(this);
    }

    public boolean jogar() {
        return estado.jogar(this);
    }

    public boolean fechar() {
        return estado.fechar(this);
    }

    public boolean desinstalar() {
        return estado.desinstalar(this);
    }

    public boolean atualizar() {
        return estado.atualizar(this);
    }

    public boolean finalizarAtualizacao() {
        return estado.finalizarAtualizacao(this);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome=nome;
    }

    public JogoEstado getEstado() {
        return estado;
    }
}
