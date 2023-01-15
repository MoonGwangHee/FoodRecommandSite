package Project.page.domain.service;

import Project.page.global.dto.user;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.Errors;
import org.springframework.validation.FieldError;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface UserService {
    public List<user> getUserList();

}
