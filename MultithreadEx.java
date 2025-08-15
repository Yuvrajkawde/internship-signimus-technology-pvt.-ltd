package com.multiThread;

 import    java.util.*;
 import    java.util.Random;
 import    java.util.Scanner;
 class  Account    {

     private    int    balance;

     public    Account(int    balance)    {
         this.balance    =    balance;
     }

     public    int    getBalance()    {
         return    balance;
     }

     public    void    setBalance(int    balance)    {
         this.balance    =    balance;
     }

     public  synchronized  void withdraw(int    amount) {
         if    (amount    <=    balance)    {
             balance    =    balance    -    amount;
             System.out.println("amount    withdraw    &    remaining    balance    is    "+balance);
         }
         else{
             System.out.println("Insufficient    balance");
         }
     }
 }
 public    class    MultithreadEx    {
     public    static    void    main(String[]    args)    {
         Account    acc    =    new    Account(1000);
         Runnable    run    =    new    Runnable()    {
             @Override
             public    void    run()    {
                 acc.withdraw(200);
             }
         };
         Thread    t1    =    new    Thread(run);
         Thread    t2    =    new    Thread(run);
         t1.start();
         t2.start();
     }
 }
