
package models;

public class ExamenClinico {
    private int Cod_Examen;
    private String Nombre;
    private String Precio;
    private String Indicaciones;

    public ExamenClinico(int Cod_Examen, String Nombre, String Precio, String Indicaciones) {
        this.Cod_Examen = Cod_Examen;
        this.Nombre = Nombre;
        this.Precio = Precio;
        this.Indicaciones = Indicaciones;
    }

    public int getCod_Examen() {
        return Cod_Examen;
    }

    public void setCod_Examen(int Cod_Examen) {
        this.Cod_Examen = Cod_Examen;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getPrecio() {
        return Precio;
    }

    public void setPrecio(String Precio) {
        this.Precio = Precio;
    }

    public String getIndicaciones() {
        return Indicaciones;
    }

    public void setIndicaciones(String Indicaciones) {
        this.Indicaciones = Indicaciones;
    }
    
}
