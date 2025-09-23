package Unit3;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;


public class PropertyClass
{
    public static void main(String[] args) {
        try{FileReader fr = new FileReader("C:\\Users\\Jitesh\\Downloads\\Pilot\\src\\Unit3\\db.properties");
            Properties p= new Properties();
            p.load(fr);
            System.out.println(p.getProperty("user"));
            System.out.println(p.getProperty("coupon"));
            System.out.println(p.getProperty("pass"));
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
