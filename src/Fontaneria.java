public class Fontaneria extends Servicio {
    private boolean corteAgua;
    private TipoMaterial tipoMaterial;

    public Fontaneria(String id, String descripcion, double duracionHoras, boolean corteAgua,
            TipoMaterial tipoMaterial) {
        super(id, descripcion, duracionHoras);
        this.corteAgua = corteAgua;
        this.tipoMaterial = tipoMaterial;
    }

    public boolean isCorteAgua() {
        return corteAgua;
    }

    public TipoMaterial getTipoMaterial() {
        return tipoMaterial;
    }

    @Override
    public double calcularCosto() {

        double costo = 40000;

        if (corteAgua) {
            costo += 10000;
        }

        return costo;
    }

}