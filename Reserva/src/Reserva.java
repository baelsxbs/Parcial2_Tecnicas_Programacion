import java.time.LocalDate;

public class Reserva {

    private int numeroReserva;
    private Vuelo vuelo;
    private Pasajero pasajero;
    private LocalDate fechaReserva;
    private String estadoConfirmacion;

    public Reserva(int numeroReserva, Vuelo vuelo, Pasajero pasajero, LocalDate fechaReserva, String estadoConfirmacion) {
        this.numeroReserva = numeroReserva;
        this.vuelo = vuelo;
        this.pasajero = pasajero;
        this.fechaReserva = fechaReserva;
        this.estadoConfirmacion = estadoConfirmacion;
    }

    public int getNumeroReserva() {
        return numeroReserva;
    }

    public void setNumeroReserva(int numeroReserva) {
        this.numeroReserva = numeroReserva;
    }

    public Vuelo getVuelo() {
        return vuelo;
    }

    public void setVuelo(Vuelo vuelo) {
        this.vuelo = vuelo;
    }

    public Pasajero getPasajero() {
        return pasajero;
    }

    public void setPasajero(Pasajero pasajero) {
        this.pasajero = pasajero;
    }

    public LocalDate getFechaReserva() {
        return fechaReserva;
    }

    public void setFechaReserva(LocalDate fechaReserva) {
        this.fechaReserva = fechaReserva;
    }

    public String getEstadoConfirmacion() {
        return estadoConfirmacion;
    }

    public void setEstadoConfirmacion(String estadoConfirmacion) {
        this.estadoConfirmacion = estadoConfirmacion;
    }

    @Override
    public String toString() {
        return "Reserva{" +
                "numeroReserva=" + numeroReserva +
                ", vuelo=" + vuelo +
                ", pasajero=" + pasajero +
                ", fechaReserva=" + fechaReserva +
                ", estadoConfirmacion='" + estadoConfirmacion + '\'' +
                '}';
    }

    private class Vuelo {
    }

    private class Pasajero {
    }
}
