package task1;
import lombok.SneakyThrows;
import java.sql.*;

public class Database {
    private static Database instance;
    private final Connection connection;

    @SneakyThrows
    private Database() {
        connection = DriverManager.getConnection("jdbc:sqlite:test.db");
        String sql = "CREATE TABLE USER" +
                "(id    integer primary key autoincrement," +
                "name   text," +
                "email  text," +
                "age    integer)";
        query(sql);
    }

    public static Database getInstance() {
        if (instance == null){
            instance = new Database();
        }
        return instance;
    }

    @SneakyThrows
    public void query(String sql){
        Statement statement = connection.createStatement();
        statement.executeUpdate(sql);
        statement.close();
    }
}
