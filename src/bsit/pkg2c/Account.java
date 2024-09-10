
package bsit.pkg2c;
import java.util.Scanner;

public class Account {
    public void addAcc(){
        
        Scanner input = new Scanner(System.in);
        Accounts[] acc = new Accounts[100];
        
        System.out.print("Enter no. of accounts:");
        int num = input.nextInt();
        
        for (int x = 0; x<num; x++){
            acc[x] = new Accounts();
            System.out.printf("Enter detail of account %d\n", x + 1);
            
            System.out.print("Enter ID:");
            int id = input.nextInt();
            System.out.print("Enter name:");
            String name = input.nextLine();
            System.out.print("Enter email:");
            String email = input.nextLine();
            System.out.print("Enter username:");
            String username = input.nextLine();
            
            String password;
            while(true){
                
                System.out.print("Enter password:");
                password = input.nextLine();
                
                if(acc[x].passwordVerifier(password)){
                    System.out.print("Password is invalid");
                    break;
                }else{
                    System.out.println("Invalid password! Your password must contain at least:");
                    System.out.println("- Minimum length of 8 characters.");
                    System.out.println("- 1 digit.");
                    System.out.println("- 1 special character.");
                    System.out.println("- 1 uppercase letter.");
                }
                
            }
            acc[x].addDetails(id, name, email, username, password);                                  
        }
        for (int x = 0; x < num; x++){
        acc[x].viewDetails();
        }
    }
}
