package entidades;

import java.time.LocalDate;

/**
 *
 * @author Nícolas Castillo (tecncr@NCR-TOSHIBA)
 */

public class Postulante {

    public Postulante(String dni, String nombre, String apellido, DatosColegio dc, LocalDate fechaReg, TPostulacion tpos) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dc = dc;
        this.fechaReg = fechaReg;
        this.tpos = tpos;
    }
    
    private String dni;
    private String nombre;
    private String apellido;
    private DatosColegio dc;
    private LocalDate fechaReg;
    private TPostulacion tpos;

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public DatosColegio getDc() {
        return dc;
    }

    public void setDc(DatosColegio dc) {
        this.dc = dc;
    }

    public LocalDate getFechaReg() {
        return fechaReg;
    }

    public void setFechaReg(LocalDate fechaReg) {
        this.fechaReg = fechaReg;
    }

    public TPostulacion getTpos() {
        return tpos;
    }

    public void setTpos(TPostulacion tpos) {
        this.tpos = tpos;
    }
    
    @Override
    public String toString(){
        String tipoPos = "";
        
        switch (tpos){
            case CEPUNT:
                tipoPos = "CEPUNT";
                break;
            case EXCELENCIA:
                tipoPos = "Premio de Excelencia";
                break;
            case ORDINARIO:
                tipoPos = "Examen Ordinario";
                break;
            case DEPORTISTA:
                tipoPos = "Deportista";
                break;
        }
        
        return "DATOS DEL POSTULANTE: " +
               "\nDNI: " + getDni() +
               "\nNombre(s): " + getNombre() +
               "\nApellido(s): " + getApellido() +
               "\nFecha de registro: " + fechaReg.toString() +
               "\nTipo de postulación: " + tipoPos +
               "\n" + getDc().toString();
    }
}
