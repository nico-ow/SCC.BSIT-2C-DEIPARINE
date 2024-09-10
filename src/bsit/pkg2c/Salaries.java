
package bsit.pkg2c;
import java.util.Scanner;


public class Salaries {
    int id;
    String name;
    double rate,hour,deduction;
    
    public void addDetails(int sid, String sname,double srate, double shour, double sdeduction){
        this.id = sid;
        this.name = sname;
        this.rate = srate;
        this.hour = shour;
        this.deduction = sdeduction;
        
    }
    public void viewDetails (){
        double totalGross = rate * hour;
        double netPay = totalGross - (double)deduction;
        System.out.printf("%-10s %-20s %-10s %-10s %-10s %-10s %-10s","ID","NAME","RATE","HOUR","GROSS","DEDUCTION","NETPAY");
        System.out.println("");
        System.out.printf("%-10d %-20s %-10.2f %-10.2f %-10.2f %-10s %-10.2f",
             this.id, this.name, rate,hour,totalGross,deduction,netPay);
    }
}
