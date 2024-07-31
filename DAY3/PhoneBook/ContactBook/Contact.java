package DAY3.PhoneBook.ContactBook;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Contact {

    HashMap<String,Address> Loader = new HashMap<>();


    public void createContact(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your First Name");
        String firstName = sc.next();
        System.out.println("Enter your Last Name");
        String lastName = sc.next();
        System.out.println("Enter your Address");
        String address = sc.next();
        System.out.println("Enter your City");
        String city = sc.next();
        System.out.println("Enter your State");
        String state = sc.next();
        System.out.println("Enter your Zip");
        String zip = sc.next();
        System.out.println("Enter your Email");
        String email = sc.next();
        System.out.println("Enter your PhoneNumber");
        String phoneNumber = sc.next();

        Address allDetails = new Address(firstName,lastName,address,city,state,zip,phoneNumber,email);


        Loader.put(allDetails.getFirstName(),allDetails);

    }

    public void displayIndividualContact(String firstName){
        if(Loader.containsKey(firstName)){
            System.out.println("---->" + Loader.get(firstName));
        }
        else {
            System.out.println("No person found name with this :" + firstName);
        }

    }

    public void diplayContacts(){
        for (Map.Entry<String,Address> traverse : Loader.entrySet()){
            System.out.println(traverse.getKey());
            Address address = traverse.getValue();
            System.out.println(address.toString());
        }
    }

    public void updateContact(String name){

        if (Loader.containsKey(name)){
            System.out.println("Choose what do you want yo update!");
            System.out.println("1. First Name");
            System.out.println("2. Last Name");
            System.out.println("3. Address");
            System.out.println("4. City");
            System.out.println("5. State");
            System.out.println("6. Zip");
            System.out.println("7. PhoneNumber");
            System.out.println("8. Email");


        Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            Address address = Loader.get(name);
            switch (n){
                case 1:
                    System.out.println("Enter updated first name for user");
                    String updatedName = sc.next();

                    address.setFirstName(updatedName);
                    Loader.remove(name);
                    Loader.put(updatedName, address);
                    break;

                case 2:
                    System.out.println("Enter last name for update user");
                    String updatedLastName = sc.next();
                    address.setLastName(updatedLastName);
                    break;





            }
        }
        else{
            System.out.println("No User found in Address Book with name this " + name);
        }

    }

    public void deleteContact(String name) {
        if(Loader.containsKey(name)){
            Loader.remove(name);
        }
        else {
            System.out.println("No person found with name : " + name + " int the contacts");
        }

    }

}

