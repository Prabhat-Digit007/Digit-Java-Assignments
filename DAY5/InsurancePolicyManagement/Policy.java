package DAY5.InsurancePolicyManagement;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Policy {

    int PolicyNumber;
    String Name;
    String Date;
    String CoverageType;
    double PremiumAmmount;

    public Policy(int policyNumber, String name, String date, String coverageType, double premiumAmmount) {
        PolicyNumber = policyNumber;
        Name = name;
        Date = date;
        CoverageType = coverageType;
        PremiumAmmount = premiumAmmount;
    }

    public int getPolicyNumber() {
        return PolicyNumber;
    }

    public void setPolicyNumber(int policyNumber) {
        PolicyNumber = policyNumber;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }

    public String getCoverageType() {
        return CoverageType;
    }

    public void setCoverageType(String coverageType) {
        CoverageType = coverageType;
    }

    public double getPremiumAmmount() {
        return PremiumAmmount;
    }

    public void setPremiumAmmount(double premiumAmmount) {
        PremiumAmmount = premiumAmmount;
    }

    HashSet<Integer> quickLoops;
    LinkedHashSet<Integer> insertion;
    TreeSet<Integer> expiryDate;

}
