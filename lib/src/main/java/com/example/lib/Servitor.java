package com.example.lib;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Servitor {
    String AllServitor;
    int i;
    String num[] = new String[999999];
    String hoursalary[] = new String[999999];
    String worktime[] = new String[999999];
    String monthsalary[] = new String[999999];
    String name[] = new String[999999];

    Scanner scanner = new Scanner(System.in);
    public void setAllServitor(){
        System.out.println("請輸入妳的員工數量:");
        AllServitor = scanner.next();
    }
    public void setServitordata() {

while (i<Integer.parseInt(AllServitor))
        for ( i = 0; i < Integer.parseInt(AllServitor); i++) {
            System.out.println("請輸入第"+(i+1)+"位員工編號:");
            num[i] = scanner.next();
            System.out.println("請輸入員工姓名:");
            name[i] = scanner.next();
            System.out.println("請輸入時薪:");
            hoursalary[i] = scanner.next();
            System.out.println("請輸入工作時數:");
            worktime[i] = scanner.next();
        }
    }

    public void calc() {
        float hs, wt;
        for (i = 0; i < Integer.parseInt(AllServitor); i++){
            hs = Float.parseFloat(hoursalary[i]);
        wt = Float.parseFloat(worktime[i]);
        monthsalary[i] = String.valueOf(hs * wt);
        System.out.println("\n員工編號:" + num[i] + "\n員工姓名:" + name[i] + "\n時薪:" + hoursalary[i] + "\n工作時數:" + worktime[i] + "\n月收入:" + monthsalary[i]);
    }
}
}
