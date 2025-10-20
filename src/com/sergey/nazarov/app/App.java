package com.sergey.nazarov.app;

public class App {
    public static void main(String[] args) {

        int mishaAge = 10;
        int katiaAge = 65;
        int jonAge = 34;

        printAges(mishaAge, katiaAge, jonAge);
    }
    public static void printAges(int age1, int age2, int age3){

        int min = -1;
        int middle = -1;
        int max = -1;

        if (age1 < age2 && age1 < age3) {
            min = age1;
        } else if (age2 < age1 && age2 < age3) {
            min = age2;
        } else {
            min = age3;
        }
        if (age1 > age2 && age1 < age3 || age1 > age3 && age1 < age2) {
            middle = age1;
        } else if (age2 > age1 && age2 < age3 || age2 > age3 && age2 < age1) {
            middle = age2;
        } else {
            middle = age3;
        }
        if (age1 > age2 && age1 > age3) {
            max = age1;
        } else if (age2 > age1 && age2 > age3) {
            max = age2;
            ;
        } else {
            max = age3;
        }
        System.out.println("min " + min + " age \n" + "middle " + middle + " age \n" + "max " + max + " age \n");
    }
}