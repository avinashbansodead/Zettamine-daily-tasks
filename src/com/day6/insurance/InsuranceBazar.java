package com.day6.insurance;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InsuranceBazar 
{
    private List<Policy> policies = new ArrayList<>();
    
    public static void main(String[] args) 
    {
        InsuranceBazar insuranceBazaar = new InsuranceBazar();
        int n;
        int key;
        String policyName;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of Policy names you want to store: ");
        n=sc.nextInt();
        
        for (int i = 0; i < n; i++) 
        {
            System.out.print("Enter the Policy ID: ");
            key = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter the Policy Name: ");
            policyName = sc.nextLine();
            insuranceBazaar.addPolicyDetails(key, policyName);

        }   
        insuranceBazaar.displayPolicy();
        System.out.println();
        System.out.print("Enter the policy type to be searched : ");
        policyName = sc.nextLine();
        for (Policy policy : insuranceBazaar.searchBasedOnPolicyType(policyName))
        {
            System.out.println(policy.getKey());
        }
        sc.close();
    }
    
    public void addPolicyDetails(int key, String policyName)
    {
        Policy p = new Policy(key, policyName);
        policies.add(p);
    }
    
    public List<Policy> searchBasedOnPolicyType(String policyName)
    {
        List<Policy> list = new ArrayList<>();
        for (Policy policy : policies) {
            if(policy.getPolicyName().contains(policyName))list.add(policy);
        }
        return list;
    }
    
    public void displayPolicy()
    {
        System.out.println();
        System.out.println("Policy Key\tPolicy Name");
        for (Policy policy : policies)
        {
            System.out.println(policy.getKey()+"\t\t"+policy.getPolicyName());
        }
    }
    
}
