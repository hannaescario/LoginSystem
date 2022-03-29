import java.util.HashMap;

public class IDandPassword {

     HashMap<String, String> logininfo = new HashMap<String, String>();

     IDandPassword(){

         logininfo.put("Hanna","graham");
         logininfo.put("Cookie" ,"password");
         logininfo.put("Programmer" ,"cookies12");
     }

     protected HashMap getLoginInfo(){
         return logininfo;
     }
    }

