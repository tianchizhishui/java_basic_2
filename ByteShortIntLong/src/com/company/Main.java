package com.company;

public class Main {

    public static void main(String[] args) {

        int myValue = 10000;

        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer Minmum Value =" + myMinIntValue);
        System.out.println("Integer Maxmum Value =" + myMaxIntValue);
        System.out.println("busted max value = " + (myMaxIntValue + 1));
        System.out.println("busted min value =" + (myMinIntValue - 1));

        int myMaxIntTest = 2_147_483_647;

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte Minimum Value =" + myMinByteValue);
        System.out.println("Byte Maximum Value =" + myMaxByteValue);

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short Minimum Value =" + myMinShortValue);
        System.out.println("Short Maximum Value =" + myMaxShortValue);

        long myLongValue = 100L;
        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Long Minimum Value =" + myMinLongValue);
        System.out.println("Long Maximum Value =" + myMaxLongValue);
        long bigLongLiteralValue = 2_147_483_647_342L;
        System.out.println(bigLongLiteralValue);

        short bigShortLiteralValue = 32767;

        int myTotal = (myMinIntValue / 2);

        byte myNewByteValue = (byte) (myMinByteValue / 2);

        short myNewShortValue = (short) (myMaxByteValue / 2);


        //Primitive Types Challenge,
        byte challengeByteValue = 123;
        short challengeShortValue = 22222;
        int challengeIntValue = 22222222;
        int sum = challengeByteValue + challengeIntValue + challengeShortValue;
        System.out.println("Today's sum is " + sum);
        long challengeLongValue =(long) (50000 + 10 * (sum));
        System.out.println("Force change is " + challengeLongValue);
        long longValueTest = 50000L + 10L * sum;
        System.out.println("L change is " + longValueTest);



    }
}
