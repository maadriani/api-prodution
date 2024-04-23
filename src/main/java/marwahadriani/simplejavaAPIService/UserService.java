package marwahadriani.simplejavaAPIService;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.server.ResponseStatusException;

import jakarta.validation.ConstraintViolation;
import jakarta.validation.ConstraintViolationException;
import jakarta.validation.Validator;
import marwahadriani.simplejavaAPIProjectEntity.user;
import marwahadriani.simplejavaAPIProjectModel.UserRegisterRequest;
import marwahadriani.simplejavaAPIProjectRepository.UserRepository;
import marwahadriani.simplejavaAPISecurity.BCrypt;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private Validator validator;

    @Transactional
    public void register(UserRegisterRequest request){
        Set<ConstraintViolation<UserRegisterRequest>> constraintViolations = validator.validate(request);
        if (constraintViolations.size() != 0) {
            throw new ConstraintViolationException(constraintViolations);
        }

        if (userRepository.existsById(request.getUsername())) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST,"Username Alredey Registered");
        }

        user user = new user();
        user.setUsername(request.getUsername());
        user.setPassword(BCrypt.hashpw(request.getPassword(),BCrypt.gensalt()));
        user.setName(request.getName());

        userRepository.save(user);
    }
}
