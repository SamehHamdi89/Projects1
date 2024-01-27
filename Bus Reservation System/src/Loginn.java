import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JFrame;

public class Loginn 
{
    public String un;
    boolean flag = false;
    
    public boolean check_UserName_password(String username, String password) throws FileNotFoundException
    { 
         try{
             
            String link = "C:\\Users\\sameh\\Desktop\\BusTTReservation\\Bus Reservation\\Register.txt";
            
            FileReader  fr = new FileReader(link);
            BufferedReader br = new BufferedReader(fr);
            
            String line,user,pass;
            
            while((line = br.readLine()) != null)
            {
                user = line.split(", ")[6];
                pass = line.split(", ")[7];

                if(user.equals(username) && pass.equals(password))
                {
                    flag = true;
                    break;
                }
            }
                return flag;        
            }
           catch(IOException  e)
           {
               System.out.println("ERROR: "+e.getMessage());      
           }
         return false;  
    }            
               
     public static void main(String[] args) 
     {
         Login L = new Login();
         L.setVisible(true);
         L.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
     }
    
}
