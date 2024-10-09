package controlador;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import modelo.Usuario;
import conexion.Database;

public class UsuarioControlador {

    public Usuario autenticarUsuario(String email, String password) {
        Usuario usuario = null;
        Connection connection = Database.getConnection();

        if (connection != null) {
            try {
                String query = "SELECT * FROM Usuarios WHERE email = ? AND password = ?";
                PreparedStatement statement = connection.prepareStatement(query);
                statement.setString(1, email);
                statement.setString(2, password);
                ResultSet resultSet = statement.executeQuery();

                if (resultSet.next()) {
                    usuario = new Usuario();
                    usuario.setIdUsuario(resultSet.getInt("id_usuario"));
                    usuario.setNombre(resultSet.getString("nombre"));
                    usuario.setEmail(resultSet.getString("email"));
                    usuario.setPassword(resultSet.getString("password"));
                    usuario.setRol(resultSet.getString("rol"));
                }

            } catch (Exception e) {
                System.out.println("Error en la autenticación: " + e.getMessage());
            } finally {
                Database.closeConnection(connection);
            }
        }

        return usuario;
    }
}


