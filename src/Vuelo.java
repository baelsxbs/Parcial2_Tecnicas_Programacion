import java.time.LocalDate;
import java.time.LocalTime;

public class Vuelo {

    private String numeroVuelo;
    private String origen;
    private String destino;
    private LocalDate fechaSalida;
    private LocalTime horaSalida;
    private int capacidadMaxima;

    public Vuelo(String numeroVuelo, String origen, String destino, LocalDate fechaSalida, LocalTime horaSalida, int capacidadMaxima) {
        this.numeroVuelo = numeroVuelo;
        this.origen = origen;
        this.destino = destino;
        this.fechaSalida = fechaSalida;
        this.horaSalida = horaSalida;
        this.capacidadMaxima = capacidadMaxima;
    }

    public String getNumeroVuelo() {
        return numeroVuelo;
    }

    public void setNumeroVuelo(String numeroVuelo) {
        this.numeroVuelo = numeroVuelo;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public LocalDate getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(LocalDate fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public LocalTime getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(LocalTime horaSalida) {
        this.horaSalida = horaSalida;
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public boolean estaDisponible() {
        return capacidadMaxima > 0;
    }


    public String toString() {
        return "Vuelo{" +
                "numeroVuelo='" + numeroVuelo + '\'' +
                ", origen='" + origen + '\'' +
                ", destino='" + destino + '\'' +
                ", fechaSalida=" + fechaSalida +
                ", horaSalida=" + horaSalida +
                ", capacidadMaxima=" + capacidadMaxima +
                '}';
    }
}

