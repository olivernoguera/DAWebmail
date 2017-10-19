package java.com.sigmobile.dawebmail.database;

import com.orm.SugarRecord;

import java.io.Serializable;

public class CoAddress extends SugarRecord<CoAddress> implements Serializable {

    private String email;
    private String userName;

    private static final String TAG = "CoAddress";
    
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }


}
