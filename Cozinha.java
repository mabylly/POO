public class Cozinha {
    private int tiposRefeicao = 0;
    private int qtdePanelas = 0;
    public Cozinha() {
        this.tiposRefeicao = 0;
        this.qtdePanelas = 0;
    }
    public Cozinha(int tiposRefeicao, int qtdePanelas) {
        this.tiposRefeicao = tiposRefeicao;
        this.qtdePanelas = qtdePanelas;
    }

    public String toString() {
        return "Tipos de refeição: " + this.tiposRefeicao + "\nQuantidade de panelas: " + this.qtdePanelas;
    }

    public void setQtdePanelas(int qtdePanelas) {
        this.qtdePanelas = qtdePanelas;
    }
    public int getQtdePanelas() {
        return this.qtdePanelas;
    }
    public void setTiposRefeicao(int tiposRefeicao) {
        this.tiposRefeicao = tiposRefeicao;
    }
    public int getTiposRefeicao() {
        return this.tiposRefeicao;
    }
}
