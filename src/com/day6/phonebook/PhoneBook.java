package com.day6.phonebook;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
class PhoneBook 
{
    private List<Contact> phoneBook = new ArrayList<>();

    public void addContact(Contact contactObj) 
    {
        phoneBook.add(contactObj);
        System.out.println("Contact added successfully.");
    }

    public List<Contact> viewAllContacts() 
    {
        return phoneBook;
    }

    public Contact viewContactByPhoneNo(long phoneNumber) 
    {
        for (Contact contact : phoneBook)
        {
            if (contact.getPhoneNumber() == phoneNumber) 
            {
                return contact;
            }
        }
        return null;
    }

    public boolean removeContact(long phoneNumber) 
    {
        Contact contactToRemove = null;
        for (Contact contact : phoneBook)
        {
            if (contact.getPhoneNumber() == phoneNumber) 
            {
                contactToRemove = contact;
                break;
            }
        }

        if (contactToRemove != null) 
        {
            phoneBook.remove(contactToRemove);
            System.out.println("The contact is successfully deleted.");
            return true;
        } else 
        {
            System.out.println("Contact not found.");
            return false;
        }
    }
}

