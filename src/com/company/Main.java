package com.company;

public class Main {

    public static void main(String[] args) {

        numb test= new numb();
        test.displayInfo();
        System.out.println("Возвращенное значение " + test.r);
    }
}
class numb{
    int r = 10;
    void displayInfo(){
        System.out.println("Значение поля " + r);
    }
}


