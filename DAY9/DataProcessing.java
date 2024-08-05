package DAY9;

class DataProcessingException extends Exception {
    public DataProcessingException(String message) {
        super(message);
    }
}

class DataProcessing {
    public static void main(String[] args) {
        try {
            processData("invalidData");
        } catch (DataProcessingException e) {
            System.out.println("Checked Exception: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Unchecked Exception: " + e.getMessage());
        }
    }

    private static void processData(String data) throws DataProcessingException {
        if ("invalidData".equals(data)) {
            throw new DataProcessingException("Data is invalid.");
        }
        if (data == null) {
            throw new IllegalArgumentException("Data cannot be null.");
        }
        System.out.println("Data processed successfully.");
    }
}
