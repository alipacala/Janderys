package Entidades;

import java.util.Date;

public class Persona {

    private String Dni;
    private String Nombres;
    private String Apellidos;
    private Date FechaNac;

    public Persona(String Dni, String Nombres, String Apellidos, Date FechaNac) {
        this.Dni = Dni;
        this.Nombres = Nombres;
        this.Apellidos = Apellidos;
        this.FechaNac = FechaNac;
    }

    public Date getFechaNac() {
        return FechaNac;
    }

    public void setFechaNac(Date FechaNac) {
        this.FechaNac = FechaNac;
    }

    public String getDni() {
        return Dni;
    }

    public void setDni(String Dni) {
        this.Dni = Dni;
    }

    public String getNombres() {
        return Nombres;
    }

    public void setNombres(String Nombres) {
        this.Nombres = Nombres;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }
}