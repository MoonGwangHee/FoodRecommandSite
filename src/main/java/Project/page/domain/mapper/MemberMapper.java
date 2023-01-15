package Project.page.domain.mapper;

import Project.page.Users.UserVo;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MemberMapper {
    void saveUser(UserVo userVo);
}
