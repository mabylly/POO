import java.time.Duration;
import java.time.LocalDateTime;
import java.time.chrono.ChronoLocalDate;

public class Estacionamento {
    private String tipoVeiculo;
    private String placa;
    private LocalDateTime entrada;
    private LocalDateTime saida;

    public Estacionamento() {
        this.tipoVeiculo = " ";
        this.placa = " ";
        this.entrada = LocalDateTime.now();
        this.saida = LocalDateTime.now();
    }
    public Estacionamento(String tipoVeiculo, String placa, LocalDateTime entrada) {
        this.tipoVeiculo = tipoVeiculo;
        this.placa = placa;
        this.entrada = entrada;
    }

    public void setSaida(LocalDateTime saida) {
        this.saida = saida;
        this.calcularValor();
    }

    public String getTipoVeiculo() { return tipoVeiculo; }

    public String getPlaca() { return placa; }

    public LocalDateTime getEntrada() { return entrada; }

    public LocalDateTime getSaida() { return saida; }

    public double calcularValor() {
        Duration duracao = Duration.between(entrada, saida);
        long minutos = duracao.toMinutes();

        if (minutos <= 30) {
            return 0.0;
        } else if (minutos <= 60) {
            return 10.0;
        } else {
            return 20.0;
        }
    }
}