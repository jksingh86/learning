package com.knoldus.learning.java.util;

import com.knoldus.learning.java.entity.Address;
import com.knoldus.learning.java.entity.Contact;
import com.knoldus.learning.java.entity.Employee;
import java.util.ArrayList;
import java.util.List;


public class Utility {


    public List<Integer> utilNumber(List<Contact> contacts) {


        List<Integer>  numberList = new ArrayList<Integer>();
        for(Contact si : contacts ){
            numberList.add(si.getNumber());
        }
        System.out.println("Number is given " + numberList);
        return numberList;

    }

    public List<String> utilEmail(List<Contact> contacts) {

        List<String>  emailList = new ArrayList<String>();
        for(Contact si : contacts ){
            emailList.add(si.getEmail());
        }
        System.out.println("Email is given " + emailList);
        return emailList;

    }
    public List<Integer> utilPinCode(List<Address> addresses) {


        List<Integer>  pinCodeList = new ArrayList<Integer>();
        for(Address si : addresses ){
            pinCodeList.add(si.getPinCode());
        }
        System.out.println("PinCode is given " + pinCodeList);
        return pinCodeList;

    }

    public List<String> utilAddress(List<Address> addresses) {

        List<String>  addressList = new ArrayList<String>();
        for(Address si : addresses ){
            addressList.add(si.getAddress());
        }
        System.out.println("Address is given " + addressList);
        return addressList;

    }

    public List<Contact> utilNumbers(List<Employee> employeeList) {


        List<Contact>  contactLists = new ArrayList<Contact>();
        for(Employee si : employeeList ){
            contactLists = si.getContact();
        }
        System.out.println("Numberssssssssssss is given " + contactLists);
        return contactLists;

    }

}
