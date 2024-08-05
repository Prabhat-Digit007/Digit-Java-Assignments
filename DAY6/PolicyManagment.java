package DAY6;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


class Policy{
    String policyNumber;
    String policyHolderName;
    double premiumAmount;

    public Policy(String policyNumber, String policyHolderName, double premiumAmount) {
        this.policyNumber = policyNumber;
        this.policyHolderName = policyHolderName;
        this.premiumAmount = premiumAmount;
    }

    @Override
    public String toString() {
        return "Policy{" +
                "policyNumber='" + policyNumber + '\'' +
                ", policyHolderName='" + policyHolderName + '\'' +
                ", premiumAmount=" + premiumAmount +
                '}';
    }
}
class PolicyModification{


    public void filtering(List<Policy> list) {
        List<Policy> newList = list.stream().filter(a -> a.premiumAmount>1200).collect(Collectors.toList());
        newList.forEach(System.out::println);
    }
    public void sorting(List<Policy> list){
        list.stream().sorted((a,b) -> a.policyHolderName.compareTo(b.policyHolderName)).forEach(System.out::println);

    }

    public void totalPremium(List<Policy> list) {
        double sum = list.stream().map(a -> a.premiumAmount).reduce(0.0,(a,b)->a+b);
        System.out.println("The sum : "+sum);

    }

    public void display(List<Policy> list) {
        list.stream().forEach(System.out::println);
    }

    public void premiumRange(List<Policy> list) {
        list.stream().filter(a -> a.premiumAmount>1000 && a.premiumAmount<2000).forEach(System.out::println);
    }

    public void highestPremium(List<Policy> list) {
        double max = list.stream().mapToDouble(a -> a.premiumAmount).max().orElse(0.0);
        System.out.println("The max : "+max);
    }

    public void iniitial(List<Policy> list) {
        List<Policy> inttials= list.stream().filter(a -> a.policyHolderName.startsWith("s")).collect(Collectors.toList());
        inttials.forEach(System.out::println);

    }

    public void average(List<Policy> list) {
        double average = list.stream().mapToDouble(a -> a.premiumAmount).average().orElse(0.0);
        System.out.println("The average : "+average);
    }


    public void sortingByAmount(List<Policy> list) {
        list.stream().map(a -> a.premiumAmount).sorted((a,b) -> a.compareTo(b)).forEach(System.out::println);
    }

    public void certainPremium(List<Policy> list) {
        List<Policy> newList = list.stream().filter(a -> a.premiumAmount>2000).collect(Collectors.toList());
        newList.forEach(System.out::println);
    }

    public void count(List<Policy> list) {
        long count0To1000 = list.stream().filter(policy -> policy.premiumAmount <= 1000).count();
        long count1001To2000 = list.stream().filter(policy -> policy.premiumAmount > 1000 && policy.premiumAmount <= 2000).count();
        long countAbove2000 = list.stream().filter(policy -> policy.premiumAmount > 2000).count();

        System.out.println("Number of policies with premium 0-1000: " + count0To1000);
        System.out.println("Number of policies with premium 1001-2000: " + count1001To2000);
        System.out.println("Number of policies with premium >2000: " + countAbove2000);

    }

    public void unique(List<Policy> list) {
        List<Policy> newList = list.stream()
                .map(a -> a.policyHolderName)
                .distinct()
                .map(name -> list.stream().filter(policy -> policy.policyHolderName.equals(name)).findFirst().orElse(null))
                .collect(Collectors.toList());
        newList.forEach(System.out::println);

    }

    public void substring(List<Policy> list) {
        list.stream().filter(a -> a.policyHolderName.contains("hr")).forEach(System.out::println);
    }

    public void mapping(List<Policy> list) {
    }
}

public class PolicyManagment{
    public static void main(String[] args) {


        List<Policy> list = new ArrayList<>();
        list.add(new Policy("100", "Shreya", 1200));
        list.add(new Policy("101", "Harsh", 1100));
        list.add(new Policy("102", "Maya", 1400));
        list.add(new Policy("103", "Amit", 1500));
        list.add(new Policy("104", "Ansh", 1000));
        PolicyModification policyModification= new PolicyModification();
        System.out.println(" 1. Filtered Policies by Premium Amount : ");
        policyModification.filtering(list);

        System.out.println("\n 2. Sorted Policices by Holder Name : ");
        policyModification.sorting(list);

        System.out.println("\n 3. Computed Total Premium : ");
        policyModification.totalPremium(list);

        System.out.println("\n 4. Printed Policy Details : ");
        policyModification.display(list);

        System.out.println("\n 5 . Filtered Policies by Premium Range : ");
        policyModification.premiumRange(list);

        System.out.println("\n 6 . Policies with Highest Premium : ");
        policyModification.highestPremium(list);

        System.out.println("\n 7 . Group Policies by Holder Name initial : ");
        policyModification.iniitial(list);

        System.out.println("\n 8 . Average Premium : ");
        policyModification.average(list);

        System.out.println("\n 9 . Sort Policies by Premium and Print");
        policyModification.sortingByAmount(list);

        System.out.println("\n 10 . Policy Exceeds a Perimum");
        policyModification.certainPremium(list);

        System.out.println("\n 11 . Count");
        policyModification.count(list);

        System.out.println("\n 12 . Unique Holder name :");
        policyModification.unique(list);

        System.out.println("\n 13. Policy by Substring : ");
        policyModification.substring(list);

        System.out.println("\n 14. Policy by Substring : ");
        policyModification.mapping(list);

    }


}

