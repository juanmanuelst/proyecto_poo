package models;

public class Paciente extends Persona{
    private int Cod_Paciente;
    private int Edad;
    private String Sexo;
    private String Direccion;

    public Paciente(int Cod_Paciente, String DNI, String Nombre, String Apellido, int Edad, String Sexo, String Direccion, String Telefono) {
        this.Cod_Paciente = Cod_Paciente;
        this.DNI = DNI;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Edad = Edad;
        this.Sexo = Sexo;
        this.Direccion = Direccion;
        this.Telefono = Telefono;
    }

    public int getCod_Paciente() {
        return Cod_Paciente;
    }

    public void setCod_Paciente(int Cod_Paciente) {
        this.Cod_Paciente = Cod_Paciente;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }   
}
