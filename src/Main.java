public class Main {
    public static void main(String[] args) {
        DatabaseManager dbManager = new DatabaseManager();
        dbManager.addUser("John Doe", "john.doe@example.com");
        dbManager.addUser("Jane Smith", "jane.smith@example.com");
        dbManager.updateUser(1, "Johnny Doe", "johnny.doe@example.com");
        dbManager.getUserById(1);
        dbManager.getAllUsers();
    }

}