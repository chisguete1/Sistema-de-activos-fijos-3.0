package modelo;

public class Depreciacion {
    private int idDepreciacion;
    private int idActivo;
    private String fechaCalculo;
    private double valorDepreciado;
    private double valorActual;

    public int getIdDepreciacion() {
        return idDepreciacion;
    }

    public void setIdDepreciacion(int idDepreciacion) {
        this.idDepreciacion = idDepreciacion;
    }

    public int getIdActivo() {
        return idActivo;
    }

    public void setIdActivo(int idActivo) {
        this.idActivo = idActivo;
    }

    public String getFechaCalculo() {
        return fechaCalculo;
    }

    public void setFechaCalculo(String fechaCalculo) {
        this.fechaCalculo = fechaCalculo;
    }

    public double getValorDepreciado() {
        return valorDepreciado;
    }

    public void setValorDepreciado(double valorDepreciado) {
        this.valorDepreciado = valorDepreciado;
    }

    public double getValorActual() {
        return valorActual;
    }

    public void setValorActual(double valorActual) {
        this.valorActual = valorActual;
    }

    
}
