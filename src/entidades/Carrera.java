package entidades;

/**
 *
 * @author Nícolas Castillo (tecncr@NCR-TOSHIBA)
 */

public class Carrera {

    public Carrera(int codigo, int vacantes, int ciclos, int creditos) {
        this.codigo = codigo;
        this.vacantes = vacantes;
        this.ciclos = ciclos;
        this.creditos = creditos;
    }
    
    private int codigo;
    private int vacantes;
    private int ciclos;
    private int creditos;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getVacantes() {
        return vacantes;
    }

    public void setVacantes(int vacantes) {
        this.vacantes = vacantes;
    }

    public int getCiclos() {
        return ciclos;
    }

    public void setCiclos(int ciclos) {
        this.ciclos = ciclos;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }
}
