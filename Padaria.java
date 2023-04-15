public class Padaria {
    private Cozinha cozinha = new Cozinha();
    private String nomePadaria = new String();
    private String nomeDono = new String();
    private String enderecoPadaria = new String();
    private float vendasMensais = 0;
    private int quantidadeMaxPaes = 0;
    private int quantidadeFuncionarios = 0;

    private Descobrir descobrir = new Descobrir();
    public Padaria() {
        this.nomePadaria = " ";
        this.nomeDono = " ";
        this.enderecoPadaria = " ";
        this.vendasMensais = 0 ;
        this.quantidadeMaxPaes = 0 ;
        this.quantidadeFuncionarios = 0 ;
    }

    public Padaria(String nomePadaria, String nomeDono, String enderecoPadaria, float vendasMensais, int quantidadeMaxPaes, int quantidadeFuncionarios) {
        this.nomePadaria = nomePadaria;
        this.nomeDono = nomeDono;
        this.enderecoPadaria = enderecoPadaria;
        this.vendasMensais = vendasMensais;
        this.quantidadeMaxPaes = quantidadeMaxPaes;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
    }

    public int sortearFuncionarios(){
        return descobrir.sortearFuncionarios(this);
    }

    public String toString() {
        return "Nome da padaria: " + this.nomePadaria +
                "\nNome do dono: " + this.nomeDono +
                "\nEndereço: " + this.enderecoPadaria +
                "\nVendas mensais: " + this.vendasMensais +
                "\nQuantidade max pães: " + this.quantidadeMaxPaes +
                "\nQuantidade Funcionarios: " + this.quantidadeFuncionarios;
    }

    public String getNomePadaria() {
        return nomePadaria;
    }
    public String getNomeDono() {
        return nomeDono;
    }
    public String getEnderecoPadaria() { return enderecoPadaria; }
    public int getQuantidadeMaxPaes() { return quantidadeMaxPaes; }
    public int getQuantidadeFuncionarios() { return quantidadeFuncionarios; }
    public float getVendasMensais() { return vendasMensais; }
    public void setVendasMensais(float vendasMensais) {
        this.vendasMensais = vendasMensais;
    }
    public void setQuantidadeFuncionarios(int quantidadeFuncionarios) { this.quantidadeFuncionarios = quantidadeFuncionarios; }
    public void setQuantidadeMaxPaes(int quantidadeMaxPaes) {
        this.quantidadeMaxPaes = quantidadeMaxPaes;
    }
    public void setNomePadaria(String nomePadaria) {
        this.nomePadaria = nomePadaria;
    }
    public void setNomeDono(String nomeDono) {
        this.nomeDono = nomeDono;
    }
    public void setEnderecoPadaria(String enderecoPadaria) {
        this.enderecoPadaria = enderecoPadaria;
    }
}

