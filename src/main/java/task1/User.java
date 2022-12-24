package task1;

public class User {
    private final String name;
    private final String email;
    private final int age;
    private final Database database;

    public User(String name, String email, int age) {

        this.name = name;
        this.email = email;
        this.age = age;
        this.database = Database.getInstance();
    }

    public void save(){
        String sql = String.format("insert into user (email, name, age) values ('%s', '%s', %d);", email, name, age);
        database.query(sql);
    }
}
