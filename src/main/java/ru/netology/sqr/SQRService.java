package ru.netology.sqr;


public class SQRService {

    public int calculate(int lowestLimit, int highestLimit) {

        int count = 0;
        for (int i = 10; i <= 99; i++) {
            if (i * i >= lowestLimit && i * i <= highestLimit)
                count = count + 1;
        }


        return count;
    }
}

