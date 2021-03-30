package com.daelim.five;

import java.util.Scanner;

public class Cash {
    public void Money(){
        int buyer;
        int seller;
        int vat;
        int expense;
        int income;
//        int dive1;
//        int dive2;
//        int dive3;



        System.out.println("공급가는 얼마 입니까?");
        Scanner sellerScanner = new Scanner(System.in);
        String strSeller = sellerScanner.nextLine();
        seller = Integer.parseInt(strSeller);

        System.out.println("부가세는 몇% 입니까?");
        Scanner vatScanner = new Scanner(System.in);
        String strVat = vatScanner.nextLine();
        int vatStr = Integer.parseInt(strVat);

        System.out.println("손해율이 몇% 입니까?");
        Scanner expScanner = new Scanner(System.in);
        String strExp = expScanner.nextLine();
        int expStr = Integer.parseInt(strExp);

        int[] dives = new int[3];


        vat = seller*vatStr/100;
        buyer = seller + vat;
        expense = seller - (seller*expStr)/100;
        income = seller - expense;
        int income2 = seller - income;

        System.out.println("vatStr " + vatStr);
        System.out.println("buyer " + buyer);
        System.out.println("vat " + vat);
        System.out.println("seller " + seller);
        System.out.println("expense " + expense);
        System.out.println("income " + income);
        System.out.println("income2 " + income2);
        if (income2>10000){
//            dive1 = (income2/10)*5;
//            dive2 = (income2/10)*3;
//            dive3 = (income2/10)*2;
            dives[0] = (income2/10)*5;
            dives[1] = (income2/10)*3;
            dives[2] = (income2/10)*2;
        } else {
//            dive1 = (income2/10)*7;
//            dive2 = (income2/10)*2;
//            dive3 = (income2/10)*1;
            dives[0] = (income2/10)*7;
            dives[1] = (income2/10)*2;
            dives[2] = (income2/10)*1;

        }
//        System.out.println("dive1 " + dive1);
//        System.out.println("dive2 " + dive2);
//        System.out.println("dive3 " + dive3);
        System.out.println("dives[0] " + dives[0]);
        System.out.println("dives[1] " + dives[1]);
        System.out.println("dives[2] " + dives[2]);

    }

}
