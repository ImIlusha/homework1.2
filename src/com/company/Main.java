package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        System.out.println(number(generateRandomAge(), generateRandomTemp()));
        System.out.println(number(generateRandomAge(),generateRandomTemp()));
        System.out.println(number(generateRandomAge(),generateRandomTemp()));
        System.out.println(number(generateRandomAge(),generateRandomTemp()));
        System.out.println(number(generateRandomAge(),generateRandomTemp()));;
    }


    public static String number(int agePerson, int temperature) {

        if (agePerson >= 20 && agePerson <= 45 && temperature >= -20 && temperature <= 30) {
            return "можно идти гулять";
        } else if (agePerson <= 20 && temperature >= 0 && temperature <= 28) {
            return "можно идти гулять";
        } else if (agePerson >= 45 && temperature >= -10 && temperature <= 25) {
            return "можно идти гулять";
        } else {
            return "Оставайтесь дома";
        }


    }
    public static int generateRandomAge(){
        Random random = new Random();
        int age = random.nextInt(100);
        return age;
    }
    public static int generateRandomTemp(){
        Random random = new Random();
        int temp = random.nextInt(100);
        return temp;
    }


}

