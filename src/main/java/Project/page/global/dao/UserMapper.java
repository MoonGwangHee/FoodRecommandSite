package Project.page.global.dao;


import Project.page.global.dto.user;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface UserMapper {
    List<user> getUserList();
}

