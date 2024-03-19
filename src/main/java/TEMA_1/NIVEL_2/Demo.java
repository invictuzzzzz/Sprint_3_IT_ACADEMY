package TEMA_1.NIVEL_2;

import TEMA_1.NIVEL_2.Address.Address;
import TEMA_1.NIVEL_2.Contact.*;
import TEMA_1.NIVEL_2.Contact.CreatorContact;
import TEMA_1.NIVEL_2.Phone.Phone;

import java.util.Scanner;
import java.util.ArrayList;

public class Demo {
    private Scanner scanner;
    private ArrayList<Contact> contacts = new ArrayList<>();

    public Demo(Scanner scanner) {
        this.scanner = scanner;
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
        System.out.println("Select an option:\n" +
                "1. Create a new contactn.\n" +
                "2. View existing contacts.\n" +
                "3. Exit");
    }

    private int selectCountryOption() {
        System.out.println("Select a country:\n" +
                "1. Spain.\n" +
                "2. France.\n" +
                "3. Germany");
        return scanner.nextInt();
    }

    private Contact createContact() {

        int option = selectCountryOption();

        String[] contactInfo = getContactInfo();
        String street = contactInfo[0];
        int number = Integer.parseInt(contactInfo[1]);
        String city = contactInfo[2];
        String postalCode = contactInfo[3];
        String phoneNumber = contactInfo[4];
        String name = contactInfo[5];


        CreatorContact creator = selectContactCreator(option);
        Phone phone = creator.createPhone(phoneNumber);
        Address address = creator.createAddress(street, number, city, postalCode);
        return new Contact(name, phone, address);
    }

    private CreatorContact selectContactCreator(int option) {

        CreatorContact creator = null;

        switch (option) {
            case 1:
                creator = new CreatorContactSpain();
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
                Contact contact = contacts.get(i);

                System.out.println(contact.getName());
                contact.getFullAddress();
                contact.call();
            }
        }
    }
}
