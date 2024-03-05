/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package casestudyjava;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author admin
 */
public class UserManager {
    private List<User> users = new ArrayList<>();

    public void register(String username, String password) {
        User newUser = new User(username, password);
        users.add(newUser);
    }

    public boolean login(String username, String password) {
        for (User user : users) {
            if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
                return true;
            }
        }
        return false;
    }
}
