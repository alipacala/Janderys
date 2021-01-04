package Datos;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import Negocio.Entidad.Estudiante;
import java.text.SimpleDateFormat;

public class Estudiantes {

    static Connection conexion;
    static Statement comando;
    static ResultSet resultado;
    static boolean estadoResultado;

    public static boolean GuardarEstudiante(Estudiante estudiante) throws SQLException {

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd");
        String cadenaFechaNac = simpleDateFormat.format(estudiante.FechaNac);

        conexion = Conexion.Conectar(conexion);
        comando = Conexion.CrearComando(comando);

        String consulta = String.format(
                "INSERT INTO Estudiantes VALUES (null, '%s', '%s', %s, %s, %s, '%s', '%s', '%s', '%s', '%s')",
                estudiante.Nombres, estudiante.Apellidos, estudiante.Genero, estudiante.Telefono, estudiante.Celular,
                cadenaFechaNac, estudiante.Email, estudiante.Carrera, estudiante.Ciudad, estudiante.Direccion);

        estadoResultado = comando.execute(consulta);
        conexion.close();

        return estadoResultado;

    }

    public static boolean ModificarEstudiante(Estudiante estudiante) throws SQLException {

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd");
        String cadenaFechaNac = simpleDateFormat.format(estudiante.FechaNac);

        conexion = Conexion.Conectar(conexion);
        comando = Conexion.CrearComando(comando);

        String consulta = String.format(
                "UPDATE Estudiantes SET Nombres = '%s', Apellidos = '%s', Genero = %s, Telefono = %s, Celular = %s, FechaNac = '%s', Email = '%s', Carrera = '%s', Ciudad = '%s', Direccion = '%s' WHERE Id = %s",
                estudiante.Nombres, estudiante.Apellidos, estudiante.Genero, estudiante.Telefono, estudiante.Celular,
                cadenaFechaNac, estudiante.Email, estudiante.Carrera, estudiante.Ciudad, estudiante.Direccion,
                estudiante.Id);

        estadoResultado = comando.execute(consulta);
        conexion.close();

        return estadoResultado;

    }

    public static boolean EliminarEstudiante(int id) throws SQLException {

        conexion = Conexion.Conectar(conexion);
        comando = Conexion.CrearComando(comando);

        String consulta = String.format("DELETE FROM Estudiantes WHERE Id = " + id);

        estadoResultado = comando.execute(consulta);
        conexion.close();

        return estadoResultado;

    }

    public static ResultSet Listar() throws SQLException {

        conexion = Conexion.Conectar(conexion);
        comando = Conexion.CrearComando(comando);

        String consulta = "SELECT * FROM Estudiantes";

        resultado = comando.executeQuery(consulta);
        conexion.close();

        return resultado;

    }

    public static ResultSet BuscarPorId(int id) throws SQLException {

        conexion = Conexion.Conectar(conexion);
        comando = Conexion.CrearComando(comando);

        String consulta = "SELECT * FROM Estudiantes WHERE Id = " + id;

        resultado = comando.executeQuery(consulta);
        conexion.close();

        return resultado;

    }

    public static ResultSet BuscarPorCampo(String campo, String valor) throws SQLException {

        conexion = Conexion.Conectar(conexion);
        comando = Conexion.CrearComando(comando);

        String consulta = "SELECT * FROM Estudiantes WHERE " + campo + " LIKE '" + valor + "%'";

        resultado = comando.executeQuery(consulta);
        conexion.close();

        return resultado;

    }

}
