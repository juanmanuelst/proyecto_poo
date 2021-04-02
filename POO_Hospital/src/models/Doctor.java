package models;

public class Doctor {
    private int Cod_Doctor ;
    private String Nombre_Doctor;
    private String Apellido_Doctor;
    private String Especialidad;
    private String Turno;
    private String Telefono;

    public Doctor(int Cod_Doctor, String Nombre_Doctor, String Apellido_Doctor, String Especialidad, String Turno, String Telefono) {
        this.Cod_Doctor = Cod_Doctor;
        this.Nombre_Doctor = Nombre_Doctor;
        this.Apellido_Doctor = Apellido_Doctor;
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

    public String getNombre_Doctor() {
        return Nombre_Doctor;
    }

    public void setNombre_Doctor(String Nombre_Doctor) {
        this.Nombre_Doctor = Nombre_Doctor;
    }

    public String getApellido_Doctor() {
        return Apellido_Doctor;
    }

    public void setApellido_Doctor(String Apellido_Doctor) {
        this.Apellido_Doctor = Apellido_Doctor;
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

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }
    
}