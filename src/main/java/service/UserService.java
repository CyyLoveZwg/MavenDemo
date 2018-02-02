package service;

import model.User;

import java.util.List;

/**
 * Created by Roger on 2015/9/17.
 */
public interface UserService {
    public List<User> selectAll();
    public void createUser();
}
