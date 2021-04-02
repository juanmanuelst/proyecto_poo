
package models;
public class Laboratorio {
   private int Cod_Laboratorio;
   private String Nombre;
   private String Ruc;
   private String Direccion;
   private String Pagina_web;
   private String Telefono;

    public Laboratorio(int Cod_Laboratorio, String Nombre, String Ruc, String Direccion, String Pagina_web, String Telefono) {
        this.Cod_Laboratorio = Cod_Laboratorio;
        this.Nombre = Nombre;
        this.Ruc = Ruc;
        this.Direccion = Direccion;
        this.Pagina_web = Pagina_web;
        this.Telefono = Telefono;
    }

    public int getCod_Laboratorio() {
        return Cod_Laboratorio;
    }

    public void setCod_Laboratorio(int Cod_Laboratorio) {
        this.Cod_Laboratorio = Cod_Laboratorio;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getRuc() {
        return Ruc;
    }

    public void setRuc(String Ruc) {
        this.Ruc = Ruc;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getPagina_web() {
        return Pagina_web;
    }

    public void setPagina_web(String Pagina_web) {
        this.Pagina_web = Pagina_web;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }
   
}

