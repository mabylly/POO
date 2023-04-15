public class Descobrir {
    public Descobrir(){

    }
    public int sortearFuncionarios(Padaria padaria){
        return (int) (Math.random() * padaria.getQuantidadeFuncionarios());

    }

    public int sortearFuncionarios(int quantidadeFuncionarios){
        return (int) (Math.random() * quantidadeFuncionarios);

    }
}
