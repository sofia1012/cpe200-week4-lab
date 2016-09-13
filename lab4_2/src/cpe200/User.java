package cpe200;

/**
 * Created by pruet on 6/9/2559.
 */
public class User {
    public String userName;
    public String password;

    public User() {
    }

    public boolean setUserName(String name) {
        if (!name.matches("(^[a-zA-Z]+)([a-zA-Z0-9]*)")) {
            return false;
        }
        if(name.length()<8){
            return false;
        }

        userName=name;
        return true;
    }

    public boolean setPassword(String name) {
        int connect = 0;
        if (name.length() < 12) {
            return false;
        }
        if (name.length() >= 12) {
            connect++;
        }
        if (name.matches("(.*)([0-9]+)(.*)")) {
            connect++;
        }
        if (name.matches("(.*)([a-z]+)(.*)")) {
            connect++;
        }
        if (name.matches("(.*)([A-Z]+)(.*)")) {
            connect++;
        }
        if (connect == 4) {
            password = name;
            return true;
        } else {
            return false;
        }
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }
}
