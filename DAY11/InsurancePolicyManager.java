import java.io.*;

public class InsurancePolicyManager {
    public static void main(String[] args) {
        String inputFile = "policies.txt";
        String outputFile = "summary.txt";
        int totalPolicies = 0;
        int totalAmount = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                if (data.length == 3) {
                    int amount = Integer.parseInt(data[2].trim());
                    totalPolicies++;
                    totalAmount += amount;
                }
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {
            writer.write("Total Number of Policies: " + totalPolicies);
            writer.newLine();
            writer.write("Total Policy Amount:" + totalAmount);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}