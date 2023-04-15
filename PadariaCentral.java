public class PadariaCentral extends Padaria{
    private int quantidadeFranquias;
    Descobrir descobrir = new Descobrir();
    CozinhaCentral cozinhaCentral = new CozinhaCentral();

    public PadariaCentral(){
        super();
        this.quantidadeFranquias = 0 ;
    }
    public PadariaCentral(String nomePadaria, String nomeDono, String enderecoPadaria, float vendasMensais, int quantidadeMaxPaes, int quantidadeFuncionarios, int quantidadeFranquias) {
        super(nomePadaria, nomeDono, enderecoPadaria, vendasMensais, quantidadeMaxPaes, quantidadeFuncionarios);
        this.quantidadeFranquias = quantidadeFranquias;
    }
    public int sortearFuncionarios(int quantidadeFuncionarios){
        return descobrir.sortearFuncionarios(quantidadeFuncionarios);
    }

    public String toString() {
        return super.toString() + "\nQuantidade de franquias: " + this.quantidadeFranquias;
    }

    public int getQuantidadeFranquias() {
        return quantidadeFranquias;
    }

    public void setQuantidadeFranquias(int quantidadeFranquias) {
        this.quantidadeFranquias = quantidadeFranquias;
    }
}
