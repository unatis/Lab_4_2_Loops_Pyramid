package com;

public class Main {

    public static void main(String[] args) {

        int HeightSize = 10;
        int WidthSize = 10;

        for(int i = 0; i < HeightSize; i++){

            for(int j = 0; j <= i; j++){

                System.out.print("*");

            }
            System.out.print("\n");
        }

    }
}
