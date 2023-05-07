package com.app.lab1;

import static javax.print.attribute.standard.MediaSizeName.A;

public class App {
    public static void main(String[] args) {
        System.out.println(section1());
        System.out.println(section2());
        System.out.println(section3());
        System.out.println(section4());
    }

    public static String section4() {
        int num=42;
        char letter='A';
        StringBuilder stringBuilder=new StringBuilder();
        if (num%2==0){
            stringBuilder.append("Even");
        }else {
            stringBuilder.append("Odd");
        }
        stringBuilder.append("\n");
        switch (letter){
            case 'A':
                stringBuilder.append("Excellent");
                break;
            case 'B':
                stringBuilder.append("Good");
                break;
            case 'C':
                stringBuilder.append("Average");
                break;
            case 'D':
                stringBuilder.append("Poor");
                break;
            case 'F':
                stringBuilder.append("Fail");
                break;
            default:
                stringBuilder.append("Invalid grade");
                break;
        }
        return stringBuilder.toString();
    }

    private static String section3() {
        int num=42;
        int i;
        StringBuilder stringBuilder=new StringBuilder();
        for (i=1;i<=10;i++){
            stringBuilder.append((i*i)).append("\n");
        }while (num<100){
            num*=2;
            stringBuilder.append(num).append("\n");
        }
        return stringBuilder.toString();
    }

    public static String section2() {
        int num=42;
        float average= 95.5F;
        int sum=num+25;
        float product=average*2;
        int modulus=num%10;
        boolean isTrue=true;
        boolean logicalAnd=isTrue&&false;
        StringBuilder stringBuilder=new StringBuilder();
        stringBuilder.append("sum:").append(sum).append("\n");
        stringBuilder.append("product:").append(product).append("\n");
        stringBuilder.append("modulus:").append(modulus).append("\n");
        stringBuilder.append("logicalAnd:").append(logicalAnd);
        return stringBuilder.toString();
    }

    public static String section1() {
        int num=42;
        float average= 95.5F;
        char letter='A';
        boolean iTrue=true;
        StringBuilder stringBuilder=new StringBuilder();
        stringBuilder.append("num:").append(num).append("\n");
        stringBuilder.append("average:").append(average).append("\n");
        stringBuilder.append("letter:").append(letter).append("\n");
        stringBuilder.append("isTrue:").append(iTrue);
        return stringBuilder.toString();
    }

}
