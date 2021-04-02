package models;

public class Doctor extends Persona{
    private int Cod_Doctor ;
    private String Especialidad;
    private String Turno;

    public Doctor(int Cod_Doctor, String Nombre_Doctor, String Apellido_Doctor, String Especialidad, String Turno, String Telefono) {
        this.Cod_Doctor = Cod_Doctor;
        this.Nombre = Nombre_Doctor;
        this.Apellido = Apellido_Doctor;
        this.Especialidad = Especialidad;
        this.Turno = Turno;
        this.Telefono = Telefono;
    }

    public int getCod_Doctor() {
        return Cod_Doctor;
    }

    public void setCod_Doctor(int Cod_Doctor) {
        this.Cod_Doctor = Cod_Doctor;
    }

    public String getEspecialidad() {
        return Especialidad;
    }

    public void setEspecialidad(String Especialidad) {
        this.Especialidad = Especialidad;
    }

    public String getTurno() {
        return Turno;
    }

    public void setTurno(String Turno) {
        this.Turno = Turno;
    }    
}