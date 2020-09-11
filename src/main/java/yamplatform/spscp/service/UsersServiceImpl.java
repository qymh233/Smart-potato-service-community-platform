package yamplatform.spscp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import yamplatform.spscp.mapper.UsersMapper;
import yamplatform.spscp.pojo.Users;
@Service
public class UsersServiceImpl implements UsersService{
    @Autowired
    UsersMapper usersMapper;
    @Override
    public Users SelectOne(String username,String password) {
        Users user=usersMapper.SelectOne(username);
        if(user==null){
            return null;
        }else if(!password.equals(user.getPassword())){
            return  null;
        }else {
            return user;
        }
    }

    @Override
    public Users SelectOnebyid(Integer id) {
        Users user=usersMapper.SelectOnebyid(id);
        return user;
    }

    @Override
    public int InsertUsers(Users users) {
        return 0;
    }

    @Override
    public int UpdateUsers(Users users) {
        usersMapper.UpdateUsers(users);
        return 0;
    }
}
