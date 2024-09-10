
package bsit.pkg2c;


public class Accounts {
    
    int id;
    String name, email, username, password;
    
    public void addDetails(int aid, String aname, String aemail, String auser, String apass){
        
        this.id = aid;
        this.name = aname;
        this.email = aemail;
        this.username = auser;
        this.password = apass;
    }
    
    public void viewDetails(){
        
        System.out.println("----------------------------------------------------------------------------------------------------------------");
        System.out.printf("%-15s %-15s %-20s %-15s %-20s","ID","NAME","EMAIL","USERNAME","PASSWORD");
        System.out.println("----------------------------------------------------------------------------------------------------------------");
        System.out.printf("%-15s %-15s %-20s %-15s %-20s",this.id,this.name,this.email,this.username,this.password);
    }
    
    public boolean passwordVerifier(String password){
        String regex = "^(?=.*[0-9])(?=.*[A-Z])(?=.*[!?@#$%^&_+=()])(?=\\S+$).{8,}$";
        return password.matches(regex);
    }
}
