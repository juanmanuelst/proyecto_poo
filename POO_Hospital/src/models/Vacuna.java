
package models;
public class Vacuna {
    private int Cod_Vacuna;
    private String Nombre;
    private String Marca;
    private String Precio;
    private String Contacto;
    private String Pagina_Web;
    private String Pais_de_Procedencia;

    public Vacuna(int Cod_Vacuna, String Nombre, String Marca, String Precio, String Contacto, String Pagina_Web, String Pais_de_Procedencia) {
        this.Cod_Vacuna = Cod_Vacuna;
        this.Nombre = Nombre;
        this.Marca = Marca;
        this.Precio = Precio;
        this.Contacto = Contacto;
        this.Pagina_Web = Pagina_Web;
        this.Pais_de_Procedencia = Pais_de_Procedencia;
    }

    public int getCod_Vacuna() {
        return Cod_Vacuna;
    }

    public void setCod_Vacuna(int Cod_Vacuna) {
        this.Cod_Vacuna = Cod_Vacuna;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public String getPrecio() {
        return Precio;
    }

    public void setPrecio(String Precio) {
        this.Precio = Precio;
    }

    public String getContacto() {
        return Contacto;
    }

    public void setContacto(String Contacto) {
        this.Contacto = Contacto;
    }

    public String getPagina_Web() {
        return Pagina_Web;
    }

    public void setPagina_Web(String Pagina_Web) {
        this.Pagina_Web = Pagina_Web;
    }

    public String getPais_de_Procedencia() {
        return Pais_de_Procedencia;
    }

    public void setPais_de_Procedencia(String Pais_de_Procedencia) {
        this.Pais_de_Procedencia = Pais_de_Procedencia;
    }
    
        }
