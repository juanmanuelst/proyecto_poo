package models;

public class TipodePrueba {
    private int Cod_TipodePrueba;
    private String NombrePrueba;

    public TipodePrueba(int Cod_TipodePrueba, String NombrePrueba) {
        this.Cod_TipodePrueba = Cod_TipodePrueba;
        this.NombrePrueba = NombrePrueba;
    }
    
    public int getCod_TipodePrueba() {
        return Cod_TipodePrueba;
    }
    
    public String getNombrePrueba() {
        return NombrePrueba;
    }

    public void setNombrePrueba(String NombrePrueba) {
        this.NombrePrueba = NombrePrueba;
    }
}
