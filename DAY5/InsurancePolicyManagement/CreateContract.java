package DAY5.InsurancePolicyManagement;

import java.util.HashMap;
import java.util.Scanner;

public class CreateContract extends Policy{

    static HashMap<Integer,Policy> hm = new HashMap<>();

    public CreateContract(int policyNumber, String name, String date, String coverageType, double premiumAmmount) {
        super(policyNumber, name, date, coverageType, premiumAmmount);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Policy Number");
        int PolicyNumber = sc.nextInt();
        String Name = sc.next();
        String Date = sc.next();
        String CoverageType = sc.next();;
        double PremiumAmmount = sc.nextDouble();
        Policy p1 = new Policy(PolicyNumber,Name,Date,CoverageType,PremiumAmmount);
        p1.setPolicyNumber(PolicyNumber);
        p1.setName(Name);
        p1.setDate(Date);
        p1.setPremiumAmmount(PremiumAmmount);
        p1.setCoverageType(CoverageType);
        hm.put(PolicyNumber, p1);
    }
}
