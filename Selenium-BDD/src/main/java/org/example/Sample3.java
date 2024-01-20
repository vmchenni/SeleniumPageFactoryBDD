package org.example;

import org.junit.Test;

import java.util.Random;
import java.util.stream.IntStream;

public class Sample3 {
    @Test
    public void fntest(){
        System.out.println("Hello");
        int leftLimit = 66;
        int rightLimit = 90;
        int targetStringLength = 5;
        Random random = new Random();

////        **********************************Alphabets******************************
        String generatedString = random.ints(leftLimit, rightLimit + 1)
                .limit(targetStringLength)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();

//        **********************************Numeric Value******************************
        Random r = new Random();
//        IntStream randomNumber= random.ints(1111,9999);
        int randomNumber = (int) ((Math.random() * (9999 - 1111)) + 1111);
        System.out.println(randomNumber);
////        **********************************Check Digit******************************
        String checkDigit=random.ints(leftLimit, rightLimit + 1)
                .limit(1)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();
////
        String panNumber=generatedString+randomNumber+checkDigit;
        System.out.println(panNumber);
    }
}
