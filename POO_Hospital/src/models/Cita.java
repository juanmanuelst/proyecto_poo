package models;

public class Cita {
    
    private int Cod_Cita;
    private int Cod_Paciente;
    private int Cod_Doctor ;
    private int Cod_Hospital;
    private String Fecha;
    private String Horario;

    public Cita(int Cod_Cita, int Cod_Paciente, int Cod_Doctor, int Cod_Hospital, String Fecha, String Horario) {
        this.Cod_Cita = Cod_Cita;
        this.Cod_Paciente = Cod_Paciente;
        this.Cod_Doctor = Cod_Doctor;
        this.Cod_Hospital = Cod_Hospital;
        this.Fecha = Fecha;
        this.Horario = Horario;
    }

    public int getCod_Cita() {
        return Cod_Cita;
    }

    public void setCod_Cita(int Cod_Cita) {
        this.Cod_Cita = Cod_Cita;
    }

    public int getCod_Paciente() {
        return Cod_Paciente;
    }

    public void setCod_Paciente(int Cod_Paciente) {
        this.Cod_Paciente = Cod_Paciente;
    }

    public int getCod_Doctor() {
        return Cod_Doctor;
    }

    public void setCod_Doctor(int Cod_Doctor) {
        this.Cod_Doctor = Cod_Doctor;
    }

    public int getCod_Hospital() {
        return Cod_Hospital;
    }

    public void setCod_Hospital(int Cod_Hospital) {
        this.Cod_Hospital = Cod_Hospital;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }

    public String getHorario() {
        return Horario;
    }

    public void setHorario(String Horario) {
        this.Horario = Horario;
    }


}