package Project.page.domain.service;

import Project.page.Users.UserVo;
import Project.page.domain.mapper.MemberMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class MemberService {

    @Autowired
    MemberMapper memberMapper;

    @Transactional
    public void joinMember(UserVo userVo) {
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        userVo.setPassword(passwordEncoder.encode(userVo.getPassword()));
        userVo.setUserAuth("USER");
        memberMapper.saveUser(userVo);



    }
}
