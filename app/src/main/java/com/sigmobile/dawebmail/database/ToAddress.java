package java.com.sigmobile.dawebmail.database;

import java.io.Serializable;
import com.orm.SugarRecord;

public class ToAddress extends SugarRecord<ToAddress> implements Serializable {

    private String email;
    private String userName;

    private static final String TAG = "ToAddress";

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
