public class Material{
    private String nombre;
    private int cantidad;
    private boolean isReciclable;

    
    public Material(String numero, String nombre, int cantidad, boolean isReciclable){
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.isReciclable = isReciclable;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public boolean isReciclable() {
        return isReciclable;
    }

    public void setReciclable(boolean isReciclable) {
        this.isReciclable = isReciclable;
    }

    
    
}
