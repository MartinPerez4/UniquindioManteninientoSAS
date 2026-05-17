public class Carpinteria extends Servicio {
    private boolean isTrabajoEstructural;
    private boolean herramientaPesada;
    
    
    public Carpinteria(String id, String descripcion, double duracionHoras, boolean isTrabajoEstructural,
            boolean herramientaPesada) {
        super(id, descripcion, duracionHoras);
        this.isTrabajoEstructural = isTrabajoEstructural;
        this.herramientaPesada = herramientaPesada;
    }

    public boolean isTrabajoEstructural() {
        return isTrabajoEstructural;
    }

    public void setTrabajoEstructural(boolean isTrabajoEstructural) {
        this.isTrabajoEstructural = isTrabajoEstructural;
    }

    public boolean isHerramientaPeada() {
        return herramientaPesada;
    }

    public void setHerramientaPeada(boolean herramientaPeada) {
        this.herramientaPesada = herramientaPeada;
    }

    @Override
    public double calcularCosto() {

        double costo = 60000;

        if (herramientaPesada) {
            costo += 15000;
        }

        return costo;
    }


    

}
