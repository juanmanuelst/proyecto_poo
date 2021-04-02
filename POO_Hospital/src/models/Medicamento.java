
package models;


public class Medicamento {
    private int Cod_Medicamento;
    private String Nombre;
    private String Marca;
    private String Cantidad;
    private String Precio;
    private String Stock;
    private String Fecha_Vencimiento;

    public Medicamento(int Cod_Medicamento, String Nombre, String Marca, String Cantidad, String Precio, String Stock, String Fecha_Vencimiento) {
        this.Cod_Medicamento = Cod_Medicamento;
        this.Nombre = Nombre;
        this.Marca = Marca;
        this.Cantidad = Cantidad;
        this.Precio = Precio;
        this.Stock = Stock;
        this.Fecha_Vencimiento = Fecha_Vencimiento;
    }

    public int getCod_Medicamento() {
        return Cod_Medicamento;
    }

    public void setCod_Medicamento(int Cod_Medicamento) {
        this.Cod_Medicamento = Cod_Medicamento;
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

    public String getCantidad() {
        return Cantidad;
    }

    public void setCantidad(String Cantidad) {
        this.Cantidad = Cantidad;
    }

    public String getPrecio() {
        return Precio;
    }

    public void setPrecio(String Precio) {
        this.Precio = Precio;
    }

    public String getStock() {
        return Stock;
    }

    public void setStock(String Stock) {
        this.Stock = Stock;
    }

    public String getFecha_Vencimiento() {
        return Fecha_Vencimiento;
    }

    public void setFecha_Vencimiento(String Fecha_Vencimiento) {
        this.Fecha_Vencimiento = Fecha_Vencimiento;
    }
    
}
