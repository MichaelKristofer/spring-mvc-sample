package by.sample;

import by.sample.entity.User;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class UserService {

    private final List<User> userList = new ArrayList<>();

    public void save(User user){
        userList.add(user);
    }

    public User containsAuth(User user){
        for (User user1 : userList) {
            if(user1.getName().equals(user.getName()) && user1.getLastName().equals(user.getLastName())){
                return user;
            } else {
                return null;
            }
        }
        return null;
    }
}
