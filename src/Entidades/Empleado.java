package Entidades;

import java.util.Date;

public class Empleado extends Usuario {
    
    private int Id;
    private String Cargo;

    public Empleado(int Id, String Cargo, String Usuario, String Contraseña, Entidades.TipoUsuario TipoUsuario,
            boolean Estado, String Dni, String Nombres, String Apellidos, Date FechaNac) {
        
        super(Usuario, Contraseña, TipoUsuario, Estado, Dni, Nombres, Apellidos, FechaNac);

        this.Id = Id;
        this.Cargo = Cargo;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getCargo() {
        return Cargo;
    }

    public void setCargo(String Cargo) {
        this.Cargo = Cargo;
    }
}
