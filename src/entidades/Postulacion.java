package entidades;

import java.time.LocalDate;

/**
 *
 * @author Nícolas Castillo (tecncr@NCR-TOSHIBA)
 */

public class Postulacion {

    public Postulacion(int codigo, Postulante p, Carrera primeraOpc, Carrera segundaOpc, LocalDate fechaPost) {
        this.codigo = codigo;
        this.p = p;
        this.primeraOpc = primeraOpc;
        this.segundaOpc = segundaOpc;
        this.fechaPost = fechaPost;
        ajustarMonto();
    }
    
    private int codigo;
    private Postulante p;
    private Carrera primeraOpc;
    private Carrera segundaOpc;
    private LocalDate fechaPost;
    private float monto;
    private final float UIT = 3600.0f;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Postulante getP() {
        return p;
    }

    public void setP(Postulante p) {
        this.p = p;
    }

    public Carrera getPrimeraOpc() {
        return primeraOpc;
    }

    public void setPrimeraOpc(Carrera primeraOpc) {
        this.primeraOpc = primeraOpc;
    }

    public Carrera getSegundaOpc() {
        return segundaOpc;
    }

    public void setSegundaOpc(Carrera segundaOpc) {
        this.segundaOpc = segundaOpc;
    }

    public LocalDate getFechaPost() {
        return fechaPost;
    }

    public void setFechaPost(LocalDate fechaPost) {
        this.fechaPost = fechaPost;
    }

    public float getMonto() {
        return monto;
    }

    private void ajustarMonto() {
        switch (getP().getDc().getTcol()){
            case ESTATAL:
                monto = 0.05f * UIT;
                break;
            case SEMIESTATAL:
                monto = 0.1f * UIT;
                break;
            case PRIVADO:
                monto = 0.2f * UIT;
                break;
        }
    }
    
    public String mostrarMonto(){
        ajustarMonto();
        return "\nMonto a pagar: S/ "+getMonto();
    }
    
}
