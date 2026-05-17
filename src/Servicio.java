public abstract class Servicio {
    protected String id;
    protected String descripcion;
    protected double duracionHoras;

    public Servicio(String id, String descripcion, double duracionHoras) {
        this.id = id;
        this.descripcion = descripcion;
        this.duracionHoras = duracionHoras;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getDuracionHoras() {
        return duracionHoras;
    }

    public void setDuracionHoras(double duracionHoras) {
        this.duracionHoras = duracionHoras;
    }

    public abstract double calcularCosto();

    
    
}
