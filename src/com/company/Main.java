package com.company;

public class Main {

    public static void main(String[] args) {
        int age = 60;

        if(age < 50){
            System.out.println("Young");
        }
        else{
            System.out.println("old");
            if (age> 75){
                System.out.println("really old");
            }
            else{
                System.out.println("not that old lol");
            }
        }

    }
}
