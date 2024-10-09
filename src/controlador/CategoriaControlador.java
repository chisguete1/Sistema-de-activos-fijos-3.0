package controlador;
import conexion.Database;
import modelo.Categoria;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class CategoriaControlador {

    public boolean registrarCategoria(Categoria categoria) {
    Connection connection = Database.getConnection();
    boolean registrado = false;

    if (connection != null) {
        try {
            String query = "INSERT INTO Categorias (nombre_categoria, descripcion) VALUES (?, ?)";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1, categoria.getNombre());
            statement.setString(2, categoria.getDescripcion());

            registrado = statement.executeUpdate() > 0;

        } catch (SQLException e) {

        } finally {
            Database.closeConnection(connection);
        }
    }

    return registrado;
}

    public ArrayList<Categoria> obtenerCategorias() {
        ArrayList<Categoria> categorias = new ArrayList<>();
        Connection connection = Database.getConnection();

        if (connection != null) {
            try {
                String query = "SELECT * FROM Categorias";
                PreparedStatement statement = connection.prepareStatement(query);
                ResultSet resultSet = statement.executeQuery();

                while (resultSet.next()) {
                    Categoria cate = new Categoria();
                    cate.setIdCategoria(resultSet.getInt("id_categoria"));
                    cate.setNombre(resultSet.getString("nombre_categoria"));
                    cate.setDescripcion(resultSet.getString("descripcion"));
                    categorias.add(cate);
                }

            } catch (SQLException e) {
                
            } finally {
                Database.closeConnection(connection);
            }
        }

        return categorias;
    }

    public boolean actualizarCategoria(Categoria categoria) {
    Connection connection = Database.getConnection();
    boolean actualizado = false;

    if (connection != null) {
        try {
            String query = "UPDATE Categorias SET nombre_categoria = ?, descripcion = ? WHERE id_categoria = ?";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1, categoria.getNombre());
            statement.setString(2, categoria.getDescripcion());
            statement.setInt(3, categoria.getIdCategoria());

            actualizado = statement.executeUpdate() > 0;

        } catch (SQLException e) {
            
        } finally {
            Database.closeConnection(connection);
        }
    }

    return actualizado;
}

    public boolean eliminarCategoria(int idCategoria) {
        Connection connection = Database.getConnection();
        boolean eliminado = false;

        if (connection != null) {
            try {
                String query = "DELETE FROM Categorias WHERE id_categoria = ?";
                PreparedStatement statement = connection.prepareStatement(query);
                statement.setInt(1, idCategoria);

                eliminado = statement.executeUpdate() > 0;

            } catch (SQLException e) {
                
            } finally {
                Database.closeConnection(connection);
            }
        }

        return eliminado;
    }
}

