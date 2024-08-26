import java.util.ArrayList;
import java.util.List;

class DatabaseConnection {
    private boolean inUse;

    public DatabaseConnection() {
        this.inUse = false;
    }

    public boolean isInUse() {
        return inUse;
    }

    public void setInUse(boolean inUse) {
        this.inUse = inUse;
    }

    public void connect() {
        System.out.println("Connecting to the database...");
    }

    public void disconnect() {
        System.out.println("Disconnecting from the database...");
    }
}

class ConnectionPool {
    private List<DatabaseConnection> availableConnections;
    private List<DatabaseConnection> usedConnections;
    private static final int MAX_CONNECTIONS = 10;

    public ConnectionPool() {
        availableConnections = new ArrayList<>();
        usedConnections = new ArrayList<>();
        for (int i = 0; i < MAX_CONNECTIONS; i++) {
            availableConnections.add(new DatabaseConnection());
        }
    }

    public synchronized DatabaseConnection borrowConnection() {
        if (availableConnections.isEmpty()) {
            System.out.println("No available connections. Please wait.");
            return null;
        }
        DatabaseConnection connection = availableConnections.remove(availableConnections.size() - 1);
        connection.setInUse(true);
        usedConnections.add(connection);
        return connection;
    }

    public synchronized void returnConnection(DatabaseConnection connection) {
        if (connection != null && connection.isInUse()) {
            connection.setInUse(false);
            usedConnections.remove(connection);
            availableConnections.add(connection);
        }
    }

    public int getAvailableConnectionsCount() {
        return availableConnections.size();
    }

    public int getUsedConnectionsCount() {
        return usedConnections.size();
    }
}
public class ObjectPoolPattern {
    public static void main(String[] args) {
        ConnectionPool pool = new ConnectionPool();

        DatabaseConnection connection1 = pool.borrowConnection();
        if (connection1 != null) {
            connection1.connect();
        }

        DatabaseConnection connection2 = pool.borrowConnection();
        if (connection2 != null) {
            connection2.connect();
        }

        pool.returnConnection(connection1);
        pool.returnConnection(connection2);

        System.out.println("Available connections: " + pool.getAvailableConnectionsCount());
        System.out.println("Used connections: " + pool.getUsedConnectionsCount());
    }
}