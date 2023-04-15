public class Computador {
    private Data data;
    private String marca;

    public Computador(){
        this.data = new Data();
        this.marca = " ";
    }
    public Computador setData(int dia, int mes, int ano){
        this.data.setDia(dia);
        this.data.setMes(mes);
        this.data.setAno(ano);

        return this;
    }

    public String toString() {
        return "Marca: " + this.marca + " Data: " + this.data.getDia() + "/" + this.data.getMes() + "/" + this.data.getAno();
    }

    public String getMarca() {
        return marca;
    }

    public Computador setMarca(String marca) {
        this.marca = marca;
        return this;
    }
}
