package mapper;

import model.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Roger on 2015/9/17.
 */
@Repository("userMapper")
public interface UserMapper {
    @Select("select * from user")
    @Results(value = {@Result(id = true, property = "id", column = "id"),
                @Result(property = "name", column = "name")})
    public List<User> selectAll();
    @Insert("insert into user(id, name) values (#{id}, #{name})")
    void createUser(User user);
}
