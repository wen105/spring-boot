package resource;

import application.domain.User;
import application.domain.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by wen on 2017/3/17.
 * rest资源
 */
@RestController
public class UserResource {

    @Autowired
    private UserMapper userMapper;

    @RequestMapping(value = "find")
    public User index() {
        return userMapper.findByName("wen");
    }
}
