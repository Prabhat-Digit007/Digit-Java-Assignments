package DAY3.PhoneBook.AddressBook;

import DAY3.PhoneBook.ContactBook.Contact;

import java.util.Scanner;

public class AddressMain extends Contact {
    public static void main(String[] args){
        System.out.println("Welcome to Address Book");
        Scanner sc = new Scanner(System.in);
        int n = 0;
        while(n!=5) {
            System.out.println("1. Create New Contact");
            System.out.println("2. Edit Existing Contact");
            System.out.println("3. Delete Existing Contact");
            System.out.println("4. Display All Contact");
            System.out.println("5. Exit from Address Book");
            System.out.println("Choose Options");
            n = sc.nextInt();
            switch (n){
                case 1:
                    Contact contact1 = new Contact();
                    contact1.createContact();
                    contact1.diplayContacts();
                    break;
            }


        }
    }
}
