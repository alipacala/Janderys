package Entidades;

import java.util.Date;

public class Usuario extends Persona {

    private String Usuario;
    private String Contraseña;
    private TipoUsuario TipoUsuario;
    private boolean Estado;

    public Usuario(String Usuario, String Contraseña, TipoUsuario TipoUsuario, boolean Estado, String Dni,
            String Nombres, String Apellidos, Date FechaNac) {

        super(Dni, Nombres, Apellidos, FechaNac);

        this.Usuario = Usuario;
        this.Contraseña = Contraseña;
        this.TipoUsuario = TipoUsuario;
        this.Estado = Estado;
    }

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    public String getContraseña() {
        return Contraseña;
    }

    public void setContraseña(String Contraseña) {
        this.Contraseña = Contraseña;
    }

    public TipoUsuario getTipoUsuario() {
        return TipoUsuario;
    }

    public void setTipoUsuario(TipoUsuario TipoUsuario) {
        this.TipoUsuario = TipoUsuario;
    }

    public boolean isEstado() {
        return Estado;
    }

    public void setEstado(boolean Estado) {
        this.Estado = Estado;
    }
}
