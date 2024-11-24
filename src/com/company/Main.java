package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("Задание 1");

        int age = 17;
        boolean isAdult = age >= 18;

        if (isAdult) {
            System.out.println("Если возраст человека равен " + age + " то он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен " + age + " он не достиг совершеннолетия, нужно немного подождать");
        }

        System.out.println("Задание 2");

        int temp = 6;
        if (temp < 5) {
            System.out.println("На улице " + temp + " градусов, нужно надеть шапку");
        }
        if (temp > 5) {
            System.out.println("На улице " + temp + " градусов, можно идти без шапки");
        }

        System.out.println("Задание 3");

        int speed = 59;
        if (speed < 60) {
            System.out.println("Если скорость " + speed +  ", то можно ездить спокойно");
        }
        if (speed > 60) {
            System.out.println("Если скорость " + speed +  ", то придется заплатить штраф");
        }


        System.out.println("Задание 4");

        int age2 = 5;
        if (age2 >= 2 && age2 <= 6){
            System.out.println("Если возраст человека равен " + age2 + ", то ему нужно ходить в детский сад");
        } else if (age2 >= 7 && age2 <= 17){
            System.out.println("Если возраст человека равен " + age2 + ", то ему нужно ходить в школу");
        } else if (age2 >= 18 && age2 <= 24){
            System.out.println("Если возраст человека равен " + age2 + ", то ему нужно ходить в институт");
        } else if (age2 > 24){
            System.out.println("Если возраст человека равен " + age2 + ", то ему нужно ходить на работу");
        }

        System.out.println("Задание 5");

        int babyAge = 10;
        if (babyAge < 5){
            System.out.println("Если возраст ребенка равен " + babyAge + ", то ему нельзя кататься на аттракционе");
        } else if (babyAge > 5 && babyAge < 14){
            System.out.println("Если возраст ребенка равен " + babyAge + ", то ему можно кататься на аттракционе в сопровождении взрослого");
        } else if (babyAge > 14){
            System.out.println("Если возраст ребенка равен " + babyAge + ", то ему можно кататься на аттракционе без сопровождения взрослого");
        }

        System.out.println("Задание 6");

        int seatsOccupied = 0;
        int capacity = 102;
        int sittingPlaces = 60;

        if (seatsOccupied >= capacity) {
            System.out.println("Вагон полностью забит");
        } else  if (seatsOccupied >= 60 && seatsOccupied < 102) {
            System.out.println("В вагоне есть " + (capacity - seatsOccupied) + " места для поездки стоя");
        } else {
            System.out.println("В вагоне есть " + (sittingPlaces - seatsOccupied) + " места для поездки сидя и " + (capacity - sittingPlaces) + " места для поездки стоя");
        }

        System.out.println("Задание 7");

        int one = 55;
        int two = 66;
        int three = 3;

        if (one > two){
            if (one > three) {
                System.out.println(one);
            } else {
                System.out.println(three);
            }
        } else if (one < two) {
            if (two < three){
                System.out.println(three);
            } else {
                System.out.println(two);
            }
        }
    }
}
