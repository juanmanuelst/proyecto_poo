package models;

public class HistoriaClinica {
    private int Cod_Historial;
    private int Cod_Paciente;
    private int Cod_Doctor;
    private int Cod_RecetaMedica;
    private String Diagnostico;
    private String FechaAtencion;

    public HistoriaClinica(int Cod_Historial, int Cod_Paciente, int Cod_Doctor, int Cod_RecetaMedica, String Diagnostico, String FechaAtencion) {
        this.Cod_Historial = Cod_Historial;
        this.Cod_Paciente = Cod_Paciente;
        this.Cod_Doctor = Cod_Doctor;
        this.Cod_RecetaMedica = Cod_RecetaMedica;
        this.Diagnostico = Diagnostico;
        this.FechaAtencion = FechaAtencion;
    }
    
     public int getCod_Historial() {
        return Cod_Historial;
    }
    
    public int getCod_Paciente() {
        return Cod_Paciente;
    }
    
    public int getCod_Doctor() {
        return Cod_Doctor;
    }
    
    public int getCod_RecetaMedica() {
        return Cod_RecetaMedica;
    }
    
    public String getDiagnostico() {
        return Diagnostico;
    }

    public void setDiagnostico(String Diagnostico) {
        this.Diagnostico = Diagnostico;
    }
    
    public String getFechaAtencion() {
        return FechaAtencion;
    }

    public void setFechaAtencion(String FechaAtencion) {
        this.FechaAtencion = FechaAtencion;
    } 
}
