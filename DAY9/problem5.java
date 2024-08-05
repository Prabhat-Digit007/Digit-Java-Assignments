package DAY9;


class TransactionException extends Exception {
    public TransactionException(String message) {
        super(message);
    }
}

public class problem5 {
    public static void main(String[] args) {
        try {
            handleTransaction("TX12345");
        } catch (TransactionException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private static void handleTransaction(String transactionId) throws TransactionException {
        try {
            processTransaction(transactionId);
        } catch (TransactionException e) {
            throw new TransactionException("Failed to process transaction " + transactionId + ": " + e.getMessage());
        }
    }

    private static void processTransaction(String transactionId) throws TransactionException {
        throw new TransactionException("Transaction error occurred.");
    }
}

