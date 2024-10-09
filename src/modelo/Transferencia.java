package modelo;

public class Transferencia {
    private int idTransferencia;
    private int idActivo;
    private String fechaTransferencia;
    private int idCarreraOrigen;
    private int idDepartamentoOrigen;
    private int idCarreraDestino;
    private int idDepartamentoDestino;
    private String motivo;

    public int getIdTransferencia() {
        return idTransferencia;
    }

    public void setIdTransferencia(int idTransferencia) {
        this.idTransferencia = idTransferencia;
    }

    public int getIdActivo() {
        return idActivo;
    }

    public void setIdActivo(int idActivo) {
        this.idActivo = idActivo;
    }

    public String getFechaTransferencia() {
        return fechaTransferencia;
    }

    public void setFechaTransferencia(String fechaTransferencia) {
        this.fechaTransferencia = fechaTransferencia;
    }

    public int getIdCarreraOrigen() {
        return idCarreraOrigen;
    }

    public void setIdCarreraOrigen(int idCarreraOrigen) {
        this.idCarreraOrigen = idCarreraOrigen;
    }

    public int getIdDepartamentoOrigen() {
        return idDepartamentoOrigen;
    }

    public void setIdDepartamentoOrigen(int idDepartamentoOrigen) {
        this.idDepartamentoOrigen = idDepartamentoOrigen;
    }

    public int getIdCarreraDestino() {
        return idCarreraDestino;
    }

    public void setIdCarreraDestino(int idCarreraDestino) {
        this.idCarreraDestino = idCarreraDestino;
    }

    public int getIdDepartamentoDestino() {
        return idDepartamentoDestino;
    }

    public void setIdDepartamentoDestino(int idDepartamentoDestino) {
        this.idDepartamentoDestino = idDepartamentoDestino;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    
}

