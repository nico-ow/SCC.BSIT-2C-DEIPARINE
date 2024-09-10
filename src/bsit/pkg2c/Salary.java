
package bsit.pkg2c;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Salary {
    
    public void SalaryGen(){
        Salaries[] netpay = new Salaries[100];
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter no. of employees:");
        int nums = sc.nextInt();
        
        for(int i=0; i<nums; i++){
            System.out.println("Enter details of employee no."+(i+1)+":");
            System.out.print("ID: ");
            int id = sc.nextInt();
            System.out.print("Name: ");
            String name = sc.next();
            System.out.print("Rate: ");
            double rate = sc.nextDouble();
            System.out.print("Hours: ");
            double hour = sc.nextDouble();
            System.out.print("Deduction:");
            double deduction = sc.nextDouble();
            netpay[i] = new Salaries();
            netpay[i].addDetails(id,name,rate,hour,deduction);                      
        }
        for(int i=0; i<nums; i++){
            netpay[i].viewDetails();
        }
        
        Scanner input = new Scanner(System.in);
        DecimalFormat deci = new DecimalFormat("₱##,###.00");
        
        String name;
        String date;
        int age, rate ,work ,deduction;
        double salary;
         
        System.out.print("Enter Date: ");
        date = input.nextLine();
        System.out.print("Enter your name: ");
        name = input.nextLine();
        System.out.print("Age:");
        age = input.nextInt();
        System.out.print("Rate:");
        rate = input.nextInt();
        System.out.print("Hours work:");
        work = input.nextInt();
        System.out.print("Deduction:");
        deduction = input.nextInt();
        
        System.out.println("------------------------------------------------------");
        
        System.out.println("Date:"+date);
        System.out.println("Name:"+name);
        System.out.println("Age:"+age);
        
        double totalGross = rate * work;
        System.out.println("Total Gross: "+deci.format(totalGross));
        System.out.println("Deduction: "+deci.format(deduction));
        
        System.out.println("------------------------------------------------------");
        
        double netPay = totalGross - (double) deduction;
        System.out.println("Netpay: "+deci.format(netPay));
    }
}
