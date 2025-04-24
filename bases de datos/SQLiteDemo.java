import java.sql.*;

public class SQLiteDemo {
    public static void main(String[] args) {
        String url = "jdbc:sqlite:mi_basededatos.db";

        try {
            Connection conn = DriverManager.getConnection(url);
            if (conn != null) {
                Statement stmt = conn.createStatement();
                stmt.execute("CREATE TABLE IF NOT EXISTS personas (id INTEGER PRIMARY KEY, nombre TEXT)");
                // stmt.execute("INSERT INTO personas(nombre) VALUES ('Juan')");

                ResultSet rs = stmt.executeQuery("SELECT * FROM personas");
                while (rs.next()) {
                    System.out.println(rs.getInt("id") + ": " + rs.getString("nombre"));
                }
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}