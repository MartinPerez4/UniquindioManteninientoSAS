import java.util.List;

public class OrdenServicio {
    private int numero;
    private Tecnico tecnico;
    private Vivienda vivienda;
    private Servicio servicio;
    private List<Material> materiales;


    public OrdenServicio(int numero, Tecnico tecnico, Vivienda vivienda, Servicio servicio, List<Material> materiales) {
        this.numero = numero;
        this.tecnico = tecnico;
        this.vivienda = vivienda;
        this.servicio = servicio;
        this.materiales = materiales;
    }


    public int getNumero() {
        return numero;
    }


    public void setNumero(int numero) {
        this.numero = numero;
    }


    public Tecnico getTecnico() {
        return tecnico;
    }


    public void setTecnico(Tecnico tecnico) {
        this.tecnico = tecnico;
    }


    public Vivienda getVivienda() {
        return vivienda;
    }


    public void setVivienda(Vivienda vivienda) {
        this.vivienda = vivienda;
    }


    public Servicio getServicio() {
        return servicio;
    }


    public void setServicio(Servicio servicio) {
        this.servicio = servicio;
    }


    public List<Material> getMateriales() {
        return materiales;
    }


    public void setMateriales(List<Material> materiales) {
        this.materiales = materiales;
    }

    public double calcularCostoTotal() {
        return servicio.calcularCosto();
    }

    

}
