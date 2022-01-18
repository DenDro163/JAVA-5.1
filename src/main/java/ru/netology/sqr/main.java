package ru.netology.sqr;

public class main {
    public static void  main(String[] args) {
        int lowestLimit = 200;
        int highestLimit = 300;
        SQRService service= new SQRService();
        int count = service.calculate(200,  300);
        System.out.println(count);
    }
}
