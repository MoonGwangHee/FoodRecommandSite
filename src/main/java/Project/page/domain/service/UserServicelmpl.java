package Project.page.domain.service;


import Project.page.global.dao.UserMapper;
import Project.page.global.dto.user;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServicelmpl implements UserService{
    private final UserMapper userMapper;

    @Override
    public List<user> getUserList() {
        return userMapper.getUserList();
    }
}
