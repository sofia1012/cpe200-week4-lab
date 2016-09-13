package cpe200;

import java.util.ArrayList;

/**
 * Created by pruet on 12/9/2559.
 */
public class Users {
    public Users() {

        userList = new ArrayList<User>();

    }
    public ArrayList<User> userList;
    User usertemp;

    public void addUser(User user)
    {
        userList.add(user);
    }

    public void addUser(String userName, String password)
    {
        usertemp.setUserName(userName);
        usertemp.setPassword(password);
        userList.add(usertemp);
    }

    public void deleteUser(User user)
    {
        userList.remove(user);
    }

    public boolean exists(User user)
    {
        if(userList.contains(user)){
            return true;
        }else {
            return false;
        }
    }

    public boolean usernameExists(String username)
    {
        if(userList.contains(username)){
            return true;
        }else{
            return false;
        }
    }

    /* This method should return null when the user with username is not in the list */
    public User getUserByUsername(String userName)
    {
        for(int i = 0; i < count(); i++){
            if(userList.get(i).userName == userName ){
                return userList.get(i);
            }
        }
        return null;
    }

    public int count()
    {
        return userList.size();
    }

    public User[] getUserArray() {
        User[] arr = new User[count()];
        for (int i = 0; i < count(); i++)
            arr[i] = userList.get(i);
        return arr;


    }
}
