package ru.skypro;

public class Main {

    public static void main(String[] args) {
        System.out.println("Задание №1");
        int[] firstArr = new int[3];
        firstArr[0] = 1;
        firstArr[1] = 2;
        firstArr[2] = 3;

        double[] secondArr = {1.57, 7.654, 9.986};
        boolean[] thirdArr = {true, false, true, false};
        System.out.println("_____");

        System.out.println("Задание №2");
        for (int i = 0; i < firstArr.length; i++) {
            System.out.print(firstArr[i]);
            if(i!= firstArr.length-1) {
                System.out.print(",");
            }
        }
        System.out.println();

        for (int i = 0; i < secondArr.length; i++) {
            System.out.print(secondArr[i]);
            if(i!= secondArr.length-1) {
                System.out.print(",");
            }
        }
        System.out.println();

        for (int i = 0; i < thirdArr.length; i++) {
            System.out.print(thirdArr[i]);
            if(i!= thirdArr.length-1) {
                System.out.print(",");
            }
        }
        System.out.println();
        System.out.println("_____");

        System.out.println("Задание №3");
        for (int i = firstArr.length-1; i >= 0; i--) {
            System.out.print(firstArr[i]);
            if(i!= 0) {
                System.out.print(",");
            }
        }
        System.out.println();

        for (int i = secondArr.length-1; i >= 0; i--) {
            System.out.print(secondArr[i]);
            if(i!= 0) {
                System.out.print(",");
            }
        }
        System.out.println();

        for (int i = thirdArr.length-1; i >= 0; i--) {
            System.out.print(thirdArr[i]);
            if(i!= 0) {
                System.out.print(",");
            }
        }
        System.out.println();
        System.out.println("_____");

        System.out.println("Задание №4");
        for (int i = 0; i < firstArr.length; i++) {
            if (firstArr[i] % 2 != 0) {
                firstArr[i] = firstArr[i] + 1;
            }
            System.out.print(firstArr[i]);
            if(i!= firstArr.length-1) {
                System.out.print(",");
            }
        }
        System.out.println();
    }
}
