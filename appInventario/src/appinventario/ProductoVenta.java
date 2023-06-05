package appinventario;

public class ProductoVenta {
    // Atributos
    private int    codigo;
    private int    prodCantidad;
    private float  prodTotal;
    private int    idVenta;
    private int    idProd;
    
    // Constructores
    public ProductoVenta () {
        codigo       = 0;
        prodCantidad = 0;
        prodTotal    = 0;
        idVenta      = 0;
        idProd       = 0;
    }
    
    public ProductoVenta ( int codigo, int prodCantidad, float prodTotal, int idVenta, int idProd ) {
        this.codigo       = codigo;
        this.prodCantidad = prodCantidad;
        this.prodTotal    = prodTotal;
        this.idVenta      = idVenta;
        this.idProd       = idProd;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getProdCantidad() {
        return prodCantidad;
    }

    public void setProdCantidad(int prodCantidad) {
        this.prodCantidad = prodCantidad;
    }

    public float getProdTotal() {
        return prodTotal;
    }
    
    public void setProdTotal(float prodTotal) {
        this.prodTotal = prodTotal;
    }

    public int getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(int idVenta) {
        this.idVenta = idVenta;
    }

    public int getIdProd() {
        return idProd;
    }

    public void setIdProd(int idProd) {
        this.idProd = idProd;
    }
}
