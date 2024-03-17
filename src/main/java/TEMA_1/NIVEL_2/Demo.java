package TEMA_1.NIVEL_2;

import TEMA_1.NIVEL_2.Contact.*;
import TEMA_1.NIVEL_2.Interfaces.CreatorContact;

import java.util.Scanner;
import java.util.ArrayList;

public class Demo {
    private Scanner scanner;
    private ArrayList<Contact> contacts;

    public Demo(Scanner scanner) {
        this.scanner = scanner;
        this.contacts = new ArrayList<>();
    }

    public void startMenu() {
        int option;
        do {
            printMenu();
            option = scanner.nextInt();
            switch (option) {
                case 1:
                    Contact contact = createContact();
                    contacts.add(contact);
                    System.out.println("Contact created.");
                    break;
                case 2:
                    viewContacts();
                    break;
                case 3:
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
                    break;
            }
        } while (option != 3);
    }

    private void printMenu() {
        System.out.println("Select an option:");
        System.out.println("1. Create a new contact");
        System.out.println("2. View existing contacts");
        System.out.println("3. Exit");
    }

    private int selectCountryOption() {
        System.out.println("Select a country:");
        System.out.println("1. Spain");
        System.out.println("2. France");
        System.out.println("3. Germany");
        return scanner.nextInt();
    }

    private Contact createContact() {
        int option = selectCountryOption();
        CreatorContact creator = selectContactCreator(option);
        String[] contactInfo = getContactInfo();
        String street = contactInfo[0];
        int number = Integer.parseInt(contactInfo[1]);
        String city = contactInfo[2];
        String postalCode = contactInfo[3];
        String phoneNumber = contactInfo[4];
        String name = contactInfo[5];
        return new Contact(creator, phoneNumber, street, number, city, postalCode, name);
    }

    private CreatorContact selectContactCreator(int option) {

        CreatorContact creator = null;

        switch (option) {
            case 1:
                creator = new ContactSpain();
                break;
            case 2:
                creator = new ContactFrance();
                break;
            case 3:
                creator = new ContactGermany();
                break;
            default:
                System.out.println("Invalid option");
                break;
        }
        return creator;
    }

    private String[] getContactInfo() {
        String[] contactInfo = new String[6];
        scanner.nextLine();
        System.out.println("Enter your Name: ");
        contactInfo[5] = scanner.nextLine().toUpperCase();
        System.out.println("Enter street:");
        contactInfo[0] = scanner.nextLine().toUpperCase();
        System.out.println("Enter street number:");
        contactInfo[1] = scanner.nextLine().toUpperCase();
        System.out.println("Enter city:");
        contactInfo[2] = scanner.nextLine();
        System.out.println("Enter postal code:");
        contactInfo[3] = scanner.nextLine();
        System.out.println("Enter phone number:");
        contactInfo[4] = scanner.nextLine();
        return contactInfo;
    }

    public void viewContacts() {
        if (contacts.isEmpty()) {
            System.out.println("No contacts found.");
        } else {
            System.out.println("Existing contacts:");
            for (int i = 0; i < contacts.size(); i++) {
                System.out.println("Contact " + (i + 1) + ":");
                System.out.println(contacts.get(i));
                contacts.get(i).call();
                contacts.get(i).contact();

            }
        }
    }
}
