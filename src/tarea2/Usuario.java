
package tarea2;

/**
 *
 * @author Nicole
 */
public class Usuario {
    
    private String nombreUnico;
    private String contraseña;
    private String nombreCompleto;
    private String tipoIdentificacion;
    private String identificacion;
    private String tipoUsuario;

    public Usuario() {
    }

    public Usuario(String nombreUnico, String contraseña, String nombreCompleto, String tipoIdentificacion, String identificacion, String tipoUsuario) {
        this.nombreUnico = nombreUnico;
        this.contraseña = contraseña;
        this.nombreCompleto = nombreCompleto;
        this.tipoIdentificacion = tipoIdentificacion;
        this.identificacion = identificacion;
        this.tipoUsuario = tipoUsuario;
    }

    public String getNombreUnico() {
        return nombreUnico;
    }

    public void setNombreUnico(String nombreUnico) {
        this.nombreUnico = nombreUnico;
    }

    
    public String getContraseña() {
        return contraseña;
    }

    
    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    
    public String getNombreCompleto() {
        return nombreCompleto;
    }

    
    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    
    public String getTipoIdentificacion() {
        return tipoIdentificacion;
    }

    
    public void setTipoIdentificacion(String tipoIdentificacion) {
        this.tipoIdentificacion = tipoIdentificacion;
    }

    
    public String getIdentificacion() {
        return identificacion;
    }

    
    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

   
    public String getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    @Override
    public String toString() {
        return "Usuario{" + "nombreUnico=" + nombreUnico + ", contrase\u00f1a=" + contraseña + ", nombreCompleto=" + nombreCompleto + ", tipoIdentificacion=" + tipoIdentificacion + ", identificacion=" + identificacion + ", tipoUsuario=" + tipoUsuario + '}';
    }
    
}
