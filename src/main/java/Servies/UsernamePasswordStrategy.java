package Servies;

import Core.Authentification;
import Models.ModelsSIngIn;

import java.util.ArrayList;

public class UsernamePasswordStrategy implements Authentification {
    public static ArrayList<ModelsSIngIn> ModelsSIngIns = new ArrayList<ModelsSIngIn>();

    @Override
    public boolean authenticate(String username, String password) {
        for (ModelsSIngIn logine :ModelsSIngIns ){
            if(logine.getEmail().equals(username) && logine.getPassword().equals(password) ){
                return true;
            }


        }
        return false;
    }

    @Override
    public boolean Singip(String username, String password) {
        if (username.length() != 0 || password.length() != 0){
            for(ModelsSIngIn checkemail :ModelsSIngIns ){
                if(checkemail.getEmail().equals(username)){
                    return true;
                }
            }
        }
        return false;
    }
}
