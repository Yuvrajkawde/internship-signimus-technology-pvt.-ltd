package com.encapsulation;

import java.util.Scanner;

public class BankAccount {

    private int accountNumber;
    private  String accountHolder;
    private int balance;



    public int getAccountNumber() {


        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {

        this.accountNumber = accountNumber;
    }


    public String getAccountHolder() {

        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {

        this.accountHolder = accountHolder;
    }

    public int getBalance() {

        return balance;
    }

    public void setBalance(int balance) {

        this.balance = balance;
    }

    public void deposit(int depositMoney){
        balance = balance + depositMoney;
        System.out.println(depositMoney + "rs. deposit successfully, Account balance is : " +balance);
    }

    public void withdraw(int withdrawamount){

        if(withdrawamount > balance){

            System.out.println("Withdraw Amount is more then Account Balance");
        }else {
            balance = balance - withdrawamount;
            System.out.println(withdrawamount + " Amount successfully withdrawn Account balance is : " +balance);
        }
    }


    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        BankAccount bankAccount = new BankAccount();
        bankAccount.setAccountHolder("Yuvraj KAWDE");
        bankAccount.setAccountNumber(123455276);
        bankAccount.setBalance(150000);
        System.out.println("Wellcome to Bank , Please select option 1 for deposit 2 for withdraw");
        int option =  sc.nextInt();


        switch (option){
            case 1:{
                bankAccount.deposit(12000);
                break;
            }

            case 2:{
                bankAccount.withdraw(12000);
                break;
            }

            default:{
                System.out.println(" enter option 1 or 2");
            }
        }



    }



}
