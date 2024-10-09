package controlador;
import conexion.Database;
import modelo.Aula;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class AulaControlador{
public boolean registrarAula(Aula aula) {
    Connection connection = Database.getConnection();
    boolean registrado = false;

    if (connection != null) {
        try {
            String query = "INSERT INTO Aulas (nombre_aula, descripcion) VALUES (?, ?)";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1, aula.getNombre());
            statement.setString(2, aula.getDescripcion());

            registrado = statement.executeUpdate() > 0;

        } catch (SQLException e) {
            System.out.println("Error al registrar aula: " + e.getMessage());
        } finally {
            Database.closeConnection(connection);
        }
    }

    return registrado;
}

    // Método para obtener todas las aulas
    public ArrayList<Aula> obtenerAulas() {
        ArrayList<Aula> aulas= new ArrayList<>();
        Connection connection = Database.getConnection();

        if (connection != null) {
            try {
                String query = "SELECT * FROM Aulas";
                PreparedStatement statement = connection.prepareStatement(query);
                ResultSet resultSet = statement.executeQuery();

                while (resultSet.next()) {
                    Aula aula = new Aula();
                    aula.setIdAula(resultSet.getInt("id_aula"));
                    aula.setNombre(resultSet.getString("nombre_aula"));
                    aula.setDescripcion(resultSet.getString("descripcion"));
                    aulas.add(aula);
                }

            } catch (SQLException e) {
                System.out.println("Error al obtener aulas: " + e.getMessage());
            } finally {
                Database.closeConnection(connection);
            }
        }

        return aulas;
    }

    // Método para actualizar una aula
    public boolean actualizarAula(Aula aula) {
    Connection connection = Database.getConnection();
    boolean actualizado = false;

    if (connection != null) {
        try {
            String query = "UPDATE Aulas SET nombre_aula = ?, descripcion = ? WHERE id_aula = ?";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1, aula.getNombre());
            statement.setString(2, aula.getDescripcion());
            statement.setInt(3, aula.getIdAula());

            actualizado = statement.executeUpdate() > 0;

        } catch (SQLException e) {
            System.out.println("Error al actualizar aulas: " + e.getMessage());
        } finally {
            Database.closeConnection(connection);
        }
    }

    return actualizado;
}
}


