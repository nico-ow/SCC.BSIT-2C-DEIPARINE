
package bsit.pkg2c;
import java.util.Scanner;

public class Grade {
      public void sGrades(){
        
    Scanner oha = new Scanner(System.in);
    Grades[] gr = new Grades[100];
    
        System.out.print("Enter no. of students: ");
        int ns = oha.nextInt();
        
        for (int i = 0;i < ns; i++){
            System.out.println("Enter details of student "+(i+1));
            System.out.print("ID: ");
            int id = oha.nextInt();
            System.out.print("Name: ");
            String name = oha.next();
            System.out.printf("P: " );
            double p = oha.nextDouble();
            System.out.print("M: " );
            double m = oha.nextDouble();
            System.out.print("PF: " );
            double pf = oha.nextDouble();
            System.out.print("F: " );
            double f = oha.nextDouble();
            
            gr[i] = new Grades();
            gr[i].addGrades(id, name, p, m, pf, f);
        }
          double ave = 0;
        for(int i = 0; i < ns; i++){
       
    }
        int passed=0, failed=0;
       for (int i=0; i < ns; i++){
            if (((gr[i].p + gr[i].m + gr[i].p + gr[i].f)/4) > 3.0){
            failed = failed + 1;
        } else  {
              passed = passed + 1;
              }
            gr[i].viewGrades();
        }
    
        System.out.println("No. of Students: "+ns);
        System.out.println("Total Class Average: "+ave);
        System.out.println("No of Passed: "+failed);
        System.out.println("No. of Failed: "+passed);    
    }

 }