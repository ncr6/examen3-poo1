package entidades;

/**
 *
 * @author Nícolas Castillo (tecncr@NCR-TOSHIBA)
 */

public class DatosColegio {

    public DatosColegio(String nombreCol, int anioEgreso, TipoColegio tcol) {
        this.nombreCol = nombreCol;
        this.anioEgreso = anioEgreso;
        this.tcol = tcol;
    }
    
    private String nombreCol;
    private int anioEgreso;
    private TipoColegio tcol;

    public String getNombreCol() {
        return nombreCol;
    }

    public void setNombreCol(String nombreCol) {
        this.nombreCol = nombreCol;
    }

    public int getAnioEgreso() {
        return anioEgreso;
    }

    public void setAnioEgreso(int anioEgreso) {
        this.anioEgreso = anioEgreso;
    }

    public TipoColegio getTcol() {
        return tcol;
    }

    public void setTcol(TipoColegio tcol) {
        this.tcol = tcol;
    }
    
    @Override
    public String toString(){
        String tipocol = "";
        
        switch (tcol){
            case ESTATAL:
                tipocol = "Estatal";
                break;
            case PRIVADO:
                tipocol = "Privado";
                break;
            case SEMIESTATAL:
                tipocol = "Semi-estatal";
                break;
        }
        
        return "Datos del Colegio del Postulante: " +
               "\nNombre del colegio: " + getNombreCol() +
               "\nAño de egreso: " + getAnioEgreso() +
               "\nTipo de Colegio: " + tipocol;
    }
}
