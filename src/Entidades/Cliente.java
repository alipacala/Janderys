package Entidades;

import java.util.Date;

public class Cliente extends Persona {

    private int Id;
    private String Direccion;
    private String NroCelular;
    private String Email;

    public Cliente(int Id, String Direccion, String NroCelular, String Email, String Dni, String Nombres,
            String Apellidos, Date FechaNac) {

        super(Dni, Nombres, Apellidos, FechaNac);

        this.Id = Id;
        this.Direccion = Direccion;
        this.NroCelular = NroCelular;
        this.Email = Email;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getNroCelular() {
        return NroCelular;
    }

    public void setNroCelular(String NroCelular) {
        this.NroCelular = NroCelular;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }
}
