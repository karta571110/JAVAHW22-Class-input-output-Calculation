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
        System.out.println("�п�J�p�����u�ƶq:");
        AllServitor = scanner.next();
    }
    public void setServitordata() {

while (i<Integer.parseInt(AllServitor))
        for ( i = 0; i < Integer.parseInt(AllServitor); i++) {
            System.out.println("�п�J��"+(i+1)+"����u�s��:");
            num[i] = scanner.next();
            System.out.println("�п�J���u�m�W:");
            name[i] = scanner.next();
            System.out.println("�п�J���~:");
            hoursalary[i] = scanner.next();
            System.out.println("�п�J�u�@�ɼ�:");
            worktime[i] = scanner.next();
        }
    }

    public void calc() {
        float hs, wt;
        for (i = 0; i < Integer.parseInt(AllServitor); i++){
            hs = Float.parseFloat(hoursalary[i]);
        wt = Float.parseFloat(worktime[i]);
        monthsalary[i] = String.valueOf(hs * wt);
        System.out.println("\n���u�s��:" + num[i] + "\n���u�m�W:" + name[i] + "\n���~:" + hoursalary[i] + "\n�u�@�ɼ�:" + worktime[i] + "\n�리�J:" + monthsalary[i]);
    }
}
}
