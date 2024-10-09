package controlador;
import conexion.Database;
import modelo.Carrera;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class CarreraControlador {

    public boolean registrarCarrera(Carrera carrera) {
    Connection connection = Database.getConnection();
    boolean registrado = false;

    if (connection != null) {
        try {
            String query = "INSERT INTO Carreras (nombre_carrera, descripcion) VALUES (?, ?)";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1, carrera.getNombre());
            statement.setString(2, carrera.getDescripcion());

            registrado = statement.executeUpdate() > 0;

        } catch (SQLException e) {
            System.out.println("Error al registrar carrera: " + e.getMessage());
        } finally {
            Database.closeConnection(connection);
        }
    }

    return registrado;
}

    public ArrayList<Carrera> obtenerCarreras() {
        ArrayList<Carrera> carreras = new ArrayList<>();
        Connection connection = Database.getConnection();

        if (connection != null) {
            try {
                String query = "SELECT * FROM Carreras";
                PreparedStatement statement = connection.prepareStatement(query);
                ResultSet resultSet = statement.executeQuery();

                while (resultSet.next()) {
                    Carrera carrera = new Carrera();
                    carrera.setIdCarrera(resultSet.getInt("id_carrera"));
                    carrera.setNombre(resultSet.getString("nombre_Carrera"));
                    carrera.setDescripcion(resultSet.getString("descripcion"));
                    carreras.add(carrera);
                }

            } catch (SQLException e) {
                System.out.println("Error al obtener carreras: " + e.getMessage());
            } finally {
                Database.closeConnection(connection);
            }
        }

        return carreras;
    }

    public boolean actualizarCarrera(Carrera carrera) {
    Connection connection = Database.getConnection();
    boolean actualizado = false;

    if (connection != null) {
        try {
            String query = "UPDATE Carreras SET nombre_carrera = ?, descripcion = ? WHERE id_carrera = ?";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1, carrera.getNombre());
            statement.setString(2, carrera.getDescripcion());
            statement.setInt(3, carrera.getIdCarrera());

            actualizado = statement.executeUpdate() > 0;

        } catch (SQLException e) {
            System.out.println("Error al actualizar carrera: " + e.getMessage());
        } finally {
            Database.closeConnection(connection);
        }
    }

    return actualizado;
}
}

