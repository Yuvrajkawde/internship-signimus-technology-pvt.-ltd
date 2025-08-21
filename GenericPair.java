package com.generics;

class Pair<T ,U>{
    private T name;
    private U age;

    public T getName() {
        return name;
    }

    public void setName(T name) {
        this.name = name;
    }

    public U getAge() {
        return age;
    }

    public void setAge(U age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "name=" + name +
                ", age=" + age +
                '}';
    }

    public <T extends Number> void swap(T a, T b){
        Integer aa = a.intValue();//8
        Integer bb  = b.intValue();//9
        System.out.println("before swapping a : "+aa+ " b : " +bb);
        Integer temp= aa;//8
        aa = bb;//9
        bb = temp;//8
        System.out.println("after swapping a : "+aa+ " b : " +bb);

    }

    public <U extends Number> void compareNum(U i, U i1, U i2) {
       Integer j = i.intValue();
       Integer j1 = i1.intValue();
       Integer j2 = i2.intValue();
       //   5  6    5  4
        if (j>j1 && j> j2){
            System.out.println("greatest number is " + j);

        } else if (j1>j2 && j1> j) {
            System.out.println("greatest number is " + j1);
        }else if (j2>j && j2> j1){
          System.out.println("greatest number is " + j2);
        }
    }
}
public class GenericPair {
    public static void main(String[] args) {

        Pair<String, Integer> pair = new Pair();
        pair.setName("yuvraj");
        pair.setAge(32);
        System.out.println(pair);

        Pair<Integer, Integer> pair1 = new Pair();
        pair1.swap(8, 9);

        Pair<Integer, Integer> pair2 = new Pair();
        pair1.compareNum(8, 9 ,11);
    }
}
