package appinventario;

public class Venta {
    // Atributos
    private int    idVenta;
    private String fecha;
    private float  subtotal;
    private float  total;
    
    // Constructores
    public Venta () {
        idVenta  = 0;
        fecha    = "";
        subtotal = 0;
        total    = 0;
    }
    
    public Venta ( int id, String fecha, float subtotal, float total ) {
        this.idVenta  = id;
        this.fecha    = fecha;
        this.subtotal = subtotal;
        this.total    = total;
    }

    // Getters y setters
    public int getIdVenta () {
        return idVenta;
    }

    public void setIdVenta ( int idVenta ) {
        this.idVenta = idVenta;
    }

    public String getFecha () {
        return fecha;
    }

    public void setFecha ( String fecha ) {
        this.fecha = fecha;
    }

    public float getSubtotal () {
        return subtotal;
    }

    public void setSubtotal ( float subtotal ) {
        this.subtotal = subtotal;
    }

    public float getTotal () {
        return total;
    }

    public void setTotal ( float total ) {
        this.total = total;
    }
}
