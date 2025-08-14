package com.thread;

class Testing implements Runnable  {
     String name;  
     public Testing(String  name){
         this.name=  name;
     }
     @Override
     public  void  run()  {
         for(int  i  =  0;  i  <  20;  i++){
             System.out.println(name+"  :   "+i);
         }        }
}
public  class  MainThrad  {
    public  static  void  main(String[]  args)  {
        Testing t1  =  new Testing("yuvraj");
        Testing t2  =  new Testing("Raj");
        Testing t3  =  new Testing("spiderman");
        Thread  thread1  =  new  Thread(t1);
        Thread  thread2  =  new  Thread(t2);
        Thread  thread3  =  new  Thread(t3);
        try  {
            Thread.sleep(3000);
        }
        catch  (InterruptedException  e)  {
            throw  new  RuntimeException(e);
        }
        thread1.start();
        thread2.start();
        t3.run();
    }
}