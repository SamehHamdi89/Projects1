import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;


class RegisterController 
{

    static boolean addUserInfo(int ID, String FirstName, String LastName,String mail,int PhoneNo,String nationalid,String username,String password) 
    {    
         File file = new File("Register.txt");
         
        try
        {
            FileWriter Output = new FileWriter(file,true);
            
            BufferedWriter br = new BufferedWriter(Output);
            
            PrintWriter pr = new PrintWriter(br);
            
            pr.print(ID);
            pr.print(", " + FirstName);
            pr.print(", " + LastName);
            pr.print(", " + mail);
            pr.print(", " + PhoneNo);
            pr.print(", " + nationalid);
            pr.print(", " + username);
            pr.print(", " + password + "\n"); 
            pr.close();
            br.close();
            Output.close();
        }
        catch(IOException e)
        {
            System.out.println(e.getMessage());
        }
        return true;
    }
    
}
