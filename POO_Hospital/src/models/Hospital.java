package models;

public class Hospital {
    private int Cod_Hospital;
    private String Nombre;
    private String Direccion;
    private String Telefono;

    public Hospital(int Cod_Hospital, String Nombre, String Direccion, String Telefono) {
        this.Cod_Hospital = Cod_Hospital;
        this.Nombre = Nombre;
        this.Direccion = Direccion;
        this.Telefono = Telefono;
    }
    
    public int getCod_Hospital() {
        return Cod_Hospital;
    }

    public void setCod_Hospital(int Cod_Hospital) {
        this.Cod_Hospital = Cod_Hospital;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }
    
    
    
    
}
