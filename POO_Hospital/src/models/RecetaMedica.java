package models;

public class RecetaMedica {
    private int Cod_RecetaMedica;
    private int Cod_Medicamento;
    private String Cantidad;
    private String FechaAtencion;

    public RecetaMedica(int Cod_RecetaMedica, int Cod_Medicamento, String Cantidad, String FechaAtencion) {
        this.Cod_RecetaMedica = Cod_RecetaMedica;
        this.Cod_Medicamento = Cod_Medicamento;
        this.Cantidad = Cantidad;
        this.FechaAtencion = FechaAtencion;
    }
    
    public int getCod_RecetaMedica() {
        return Cod_RecetaMedica;
    }
    
    public int getCod_Medicamento() {
        return Cod_Medicamento;
    }
    
    public String getCantidad() {
        return Cantidad;
    }

    public void setCantidad(String Cantidad) {
        this.Cantidad = Cantidad;
    }
    
    public String getFechaAtencion() {
        return FechaAtencion;
    }

    public void setFechaAtencion(String FechaAtencion) {
        this.FechaAtencion = FechaAtencion;
    }
}
