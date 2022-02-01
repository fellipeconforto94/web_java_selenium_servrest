package Utils;

import org.json.simple.JSONObject;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Geradores {
        public String email;


        public String getEmail(){
            if(email==null || email.isEmpty()){
                SimpleDateFormat sdf = new SimpleDateFormat("ddMMYYYYHHmmssSSS");
                String random = sdf.format(new Date());
                email = "qatester+" + random + "@teste.com";

        }
            return email;
    }
    public void setEmail(String email){

            this.email = email;
        }


}
