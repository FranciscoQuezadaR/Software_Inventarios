package appinventario;

public class Empresa {
    // Atributos
    private int    idEmpresa;
    private String nombre;
    private String giro;
    private String email;
    private String telefono;
    private String domicilio;
    
    // Constructores
    public Empresa () {
        idEmpresa     = 0;
        nombre        = "";
        giro          = "";
        email         = "";
        telefono      = "";
        domicilio     = "";
    }

    public Empresa(int idEmpresa, String nombre, String giro, String email, String telefono, String domicilio) {
        this.idEmpresa = idEmpresa;
        this.nombre = nombre;
        this.giro = giro;
        this.email = email;
        this.telefono = telefono;
        this.domicilio = domicilio;
    }

    public int getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(int idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGiro() {
        return giro;
    }

    public void setGiro(String giro) {
        this.giro = giro;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }
}
