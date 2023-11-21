public class Pasajero {

    private String nombre;
    private String numeroPasaporte;
    private int edad;
    private String preferenciasAlimenticias;

    public Pasajero(String nombre, String numeroPasaporte, int edad, String preferenciasAlimenticias) {
        this.nombre = nombre;
        this.numeroPasaporte = numeroPasaporte;
        this.edad = edad;
        this.preferenciasAlimenticias = preferenciasAlimenticias;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumeroPasaporte() {
        return numeroPasaporte;
    }

    public void setNumeroPasaporte(String numeroPasaporte) {
        this.numeroPasaporte = numeroPasaporte;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getPreferenciasAlimenticias() {
        return preferenciasAlimenticias;
    }

    public void setPreferenciasAlimenticias(String preferenciasAlimenticia){}

}