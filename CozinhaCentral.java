public class CozinhaCentral extends Cozinha{
    private int quantidadeChefs;

    public CozinhaCentral(){
        super();
        this.quantidadeChefs = 0;
    }

    public CozinhaCentral(int tiposRefeicao, int qtdePanelas, int quantidadeChefs) {
        super(tiposRefeicao, qtdePanelas);
        this.quantidadeChefs = quantidadeChefs;
    }

    public String toString() {

        return super.toString() + "\nQuantidade de chefs " + this.quantidadeChefs;
    }
}
