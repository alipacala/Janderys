package Datos;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import Entidades.Empleado;

public class Empleados {
    static Connection conexion;
    static Statement comando;
    static ResultSet resultado;
    static boolean estadoResultado;

    public static boolean GuardarEmpleado(Empleado empleado) throws SQLException {

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd");
        String cadenaFechaNac = simpleDateFormat.format(empleado.getFechaNac());

        conexion = Conexion.Conectar(conexion);
        comando = Conexion.CrearComando(comando);

        String consulta = String.format(
                "INSERT INTO Empleados VALUES (null, '%s', '%s', '%s', '%s', '%s', '%s', %s, %s)", empleado.getDni(),
                empleado.getNombres(), empleado.getApellidos(), cadenaFechaNac, empleado.getUsuario(),
                empleado.getContraseña(), empleado.getTipoUsuario().getId(), empleado.isEstado(), empleado.getCargo());

        estadoResultado = comando.execute(consulta);
        conexion.close();

        return estadoResultado;

    }
    
    public static boolean ModificarEmpleado(Empleado empleado) throws SQLException {

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd");
        String cadenaFechaNac = simpleDateFormat.format(empleado.getFechaNac());

        conexion = Conexion.Conectar(conexion);
        comando = Conexion.CrearComando(comando);

        String consulta = String.format(
                "UPDATE Empleados SET Nombres = '%s', Apellidos = '%s', FechaNac = '%s', Usuario = '%s', Contrasena = '%s', IdTipoUsuario = %s, Estado = %s, Cargo = '%s' WHERE Id = %s",
                empleado.getNombres(), empleado.getApellidos(), cadenaFechaNac, empleado.getUsuario(),
                empleado.getContraseña(), empleado.getTipoUsuario().getId(), empleado.isEstado(), empleado.getCargo(),
                empleado.getId());

        estadoResultado = comando.execute(consulta);
        conexion.close();

        return estadoResultado;

    }
    
    public static ResultSet Listar() throws SQLException {

        conexion = Conexion.Conectar(conexion);
        comando = Conexion.CrearComando(comando);

        String consulta = "SELECT * FROM Empleados";

        resultado = comando.executeQuery(consulta);
        conexion.close();

        return resultado;

    }
}
