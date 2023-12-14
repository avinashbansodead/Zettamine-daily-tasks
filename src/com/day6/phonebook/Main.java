package com.day6.phonebook;

import java.util.List;
import java.util.Scanner;

public class Main 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        PhoneBook phoneBookObj = new PhoneBook();

        while (true) 
        {
            System.out.println("Menu");
            System.out.println("1. Add Contact");
            System.out.println("2. Display all Contacts");
            System.out.println("3. Search Contact by phone");
            System.out.println("4. Remove Contact");
            System.out.println("5. Exit");
            
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice)
            {
                case 1:
                    addContact(sc, phoneBookObj);
                    break;
                case 2:
                    displayAllContacts(phoneBookObj);
                    break;
                case 3:
                    searchContactByPhone(sc, phoneBookObj);
                    break;
                case 4:
                    removeContact(sc, phoneBookObj);
                    break;
                case 5:
                    System.out.println("Exiting the program.");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }

    private static void addContact(Scanner scanner, PhoneBook phoneBookObj)
    {
        System.out.println("Add a Contact:");
        System.out.print("Enter the First Name: ");
        String firstName = scanner.next();
        System.out.print("Enter the Last Name: ");
        String lastName = scanner.next();
        System.out.print("Enter the Phone No.: ");
        long phoneNumber = scanner.nextLong();
        System.out.print("Enter the Email: ");
        String email = scanner.next();

        Contact contact = new Contact(firstName, lastName, phoneNumber, email);
        phoneBookObj.addContact(contact);
    }

    private static void displayAllContacts(PhoneBook phoneBookObj) {
        List<Contact> contacts = phoneBookObj.viewAllContacts();
        System.out.println("The contacts in the List are:");
        for (Contact contact : contacts) {
            System.out.println(
                     contact.getFirstName() +
                            "\t\t" + contact.getLastName() +
                            "\t\t" + contact.getPhoneNumber() +
                            "\t\t" + contact.getEmailId()
            );
        }
    }

    private static void searchContactByPhone(Scanner scanner, PhoneBook phoneBookObj) {
        System.out.print("Enter the Phone number to search contact: ");
        long phoneNumber = scanner.nextLong();
        Contact contact = phoneBookObj.viewContactByPhoneNo(phoneNumber);
        if (contact != null) {
            System.out.println("The contact is:\n" +
                    "First Name: " + contact.getFirstName() +
                    " | Last Name: " + contact.getLastName() +
                    " | Phone No.: " + contact.getPhoneNumber() +
                    " | Email: " + contact.getEmailId());
        } else {
            System.out.println("Contact not found.");
        }
    }

    private static void removeContact(Scanner scanner, PhoneBook phoneBookObj) {
        System.out.print("Enter the Phone number to remove: ");
        long phoneNumber = scanner.nextLong();
        System.out.print("Do you want to remove the contact (Y/N): ");
        String response = scanner.next();

        if (response.equalsIgnoreCase("Y")) {
            phoneBookObj.removeContact(phoneNumber);
        } else {
            System.out.println("Contact removal aborted.");
        }
    }
}
