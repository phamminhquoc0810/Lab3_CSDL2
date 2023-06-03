package phamminhquoc.demo.services;

import phamminhquoc.demo.entity.User;
import phamminhquoc.demo.repository.IRoleRepository;
import phamminhquoc.demo.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class UserService {
    @Autowired
    private IUserRepository userRepository;

    @Autowired
    private IRoleRepository roleRepository;
    public void save(User user){
        userRepository.save(user);
        Long userId=userRepository.getUserIdByUsername(user.getUsername());
        Long roleId=roleRepository.getRoleIdbyName("USER");
        if(roleId !=0 && userId !=0){
            userRepository.addRoleToUser(userId,roleId);
        }
    }


}
