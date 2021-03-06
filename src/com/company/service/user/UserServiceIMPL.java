package com.company.service.user;

import com.company.config.ConfigReadAndWriteFile;
import com.company.model.User;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class UserServiceIMPL implements IUserService {
    public static String PATH_USER = ConfigReadAndWriteFile.PATH + "user.txt";
    public static List<User> userList = new ConfigReadAndWriteFile<User>().readFromFile(PATH_USER);

    @Override
    public List<User> findAll() {
        new ConfigReadAndWriteFile<User>().writeToFile(PATH_USER, userList);
        return userList;
    }

    @Override
    public void save(User user) {
        userList.add(user);
    }

    @Override
    public boolean existedByUsername(String username) {
        for (int i = 0; i < userList.size(); i++) {
            if(username.equals(userList.get(i).getUsername())){
                return true;
            }
        }
        return false;
    }
}
