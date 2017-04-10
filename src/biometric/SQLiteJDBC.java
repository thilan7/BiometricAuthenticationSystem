package biometric;

/**
 *
 * @author Thilan K Bandara
 */
import java.sql.*;

public class SQLiteJDBC {

    private static Connection connection = null;
    private static Statement statement = null;

    private static void getConnected() throws SQLException {
        {
            try {
                Class.forName("org.sqlite.JDBC");
                connection = DriverManager.getConnection("jdbc:sqlite:biometric.db");
                statement = connection.createStatement();
            } catch (Exception e) {
                System.err.println(e.getClass().getName() + ": " + e.getMessage());
                System.exit(0);
            }
            System.out.println("Opened database successfully");
        }
    }

    public static Connection getConnection() throws SQLException {
        SQLiteJDBC.getConnected();
        return SQLiteJDBC.connection;
    }

    public static Statement getStatement() throws SQLException {
        SQLiteJDBC.getConnected();
        return SQLiteJDBC.connection.createStatement();
    }

    public static void closeConnections() throws SQLException {
        SQLiteJDBC.connection.close();
        SQLiteJDBC.statement.close();
    }

//    public static void initializeDB() {
    public static void Initialize() {

        Connection c = null;
        Statement stmt = null;
        try {
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:biometric.db");
            System.out.println("Opened database successfully");
            stmt = c.createStatement();

            String sql = "CREATE TABLE IF NOT EXISTS users "
                    + "(ID INT PRIMARY KEY  NOT NULL  ,"
                    + " USERNAME           TEXT    NOT NULL, "
                    + " ONE            REAL     NOT NULL, "
                    + " TWO            REAL     NOT NULL, "
                    + " THREE            REAL     NOT NULL, "
                    + " FOUR            REAL     NOT NULL, "
                    + " FIVE            REAL     NOT NULL, "
                    + "SIX            REAL     NOT NULL, "
                    + " SEVEN            REAL     NOT NULL, "
                    + " EIGHT            REAL     NOT NULL, "
                    + " NINE            REAL     NOT NULL, "
                    + " TEN            REAL     NOT NULL, "
                    + " ELEVEN            REAL     NOT NULL, "
                    + " TWELVE            REAL     NOT NULL, "
                    + " THIRTEEN            REAL     NOT NULL, "
                    + " FOURTEEN            REAL     NOT NULL, "
                    + " FIFTEEN            REAL     NOT NULL, "
                    + "SIXTEEN         REAL)";

            stmt.executeUpdate(sql);
            c.setAutoCommit(false);
            stmt = c.createStatement();
            sql = "INSERT INTO users (ID,USERNAME,ONE,TWO,THREE,FOUR,FIVE,SIX,SEVEN,EIGHT,NINE,TEN,ELEVEN,TWELVE,THIRTEEN,FOURTEEN,FIFTEEN,SIXTEEN) "
                    + "VALUES (125333, 'Paul', 3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3);";
            stmt.executeUpdate(sql);

            sql = "INSERT INTO users (ID,USERNAME,ONE,TWO,THREE,FOUR,FIVE,SIX,SEVEN,EIGHT,NINE,TEN,ELEVEN,TWELVE,THIRTEEN,FOURTEEN,FIFTEEN,SIXTEEN) "
                    + "VALUES (621333, 'Allen', 4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4);";
            stmt.executeUpdate(sql);

            sql = "INSERT INTO users (ID,USERNAME,ONE,TWO,THREE,FOUR,FIVE,SIX,SEVEN,EIGHT,NINE,TEN,ELEVEN,TWELVE,THIRTEEN,FOURTEEN,FIFTEEN,SIXTEEN) "
                    + "VALUES (721333, 'Teddy', 5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5);";
            stmt.executeUpdate(sql);

            sql = "INSERT INTO users (ID,USERNAME,ONE,TWO,THREE,FOUR,FIVE,SIX,SEVEN,EIGHT,NINE,TEN,ELEVEN,TWELVE,THIRTEEN,FOURTEEN,FIFTEEN,SIXTEEN) "
                    + "VALUES (821333, 'Mark', 2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2);";
            stmt.executeUpdate(sql);
           


            stmt.close();
            c.commit();
            c.close();
        } catch (Exception e) {
//            System.err.println(e.getClass().getName() + ": " + e.getMessage());
//            System.exit(0);
            

        }
        System.out.println("Table created successfully");
    }
}
