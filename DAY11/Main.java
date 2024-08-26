import java.io.*;
import java.util.ArrayList;
import java.util.List;

class Policy {
    private String policyId;
    private String holderName;
    private int amount;

    public String getPolicyId() {
        return policyId;
    }

    public String getHolderName() {
        return holderName;
    }

    public int getAmount() {
        return amount;
    }

    public Policy(String policyId, String holderName, int amount) {
        this.policyId = policyId;
        this.holderName = holderName;
        this.amount = amount;
    }
}

class PolicyManager {

    List<Policy> policies = new ArrayList<>();

    public void readPolicies(String inputFile) {
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                if (data.length == 3) {
                    String policyId = data[0].trim();
                    String holderName = data[1].trim();
                    int amount = Integer.parseInt(data[2].trim());
                    policies.add(new Policy(policyId, holderName, amount));
                }
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public void writeSummary(String outputFile) {
        int totalPolicies = policies.size();
        int totalAmount = policies.stream().mapToInt(Policy::getAmount).sum();
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {
            writer.write("Total Number of Policies: " + totalPolicies);
            writer.newLine();
            writer.write("Total Policy Amount: " + totalAmount);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}

public class Main {
    public static void main(String[] args) {
        PolicyManager manager = new PolicyManager();
        manager.readPolicies("policies.txt");
        manager.writeSummary("summary.txt");
    }
}
