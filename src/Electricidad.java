public class Electricidad extends Servicio {
    private boolean trabajoAlturas;
    private int cantCircuitos;

    public Electricidad(String id, String descripcion, double duracionHoras, boolean trabajoAlturas, int cantCircuitos) {
        super(id, descripcion, duracionHoras);

        this.trabajoAlturas = trabajoAlturas;
        this.cantCircuitos = cantCircuitos;
    }

    public boolean isTrabajoAlturas() {
        return trabajoAlturas;
    }

    public int getCantCircuitos() {
        return cantCircuitos;
    }

    @Override
    public double calcularCosto() {

        double costo = 50000;

        if (trabajoAlturas) {
            costo += 20000;
        }

        return costo;
    }

}