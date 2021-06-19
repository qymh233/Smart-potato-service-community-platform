package yamplatform.spscp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import yamplatform.spscp.mapper.UsersMapper;
import yamplatform.spscp.pojo.Users;

import java.util.List;

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
        int t=usersMapper.InsertUsers(users);
        return t;
    }

    @Override
    public int UpdateUsers(Users users) {
        int t=usersMapper.UpdateUsers(users);
        return t;
    }

    @Override
    public List<Users> usersList(Integer page,Integer limit) {
        page=(page-1)*limit;
        List<Users> usersList=usersMapper.usersList(page,limit);
        return usersList;
    }

    @Override
    public int DeleteUsers(Integer id) {
        int t=usersMapper.DeleteUsers(id);
        return t;
    }

    @Override
    public int Count() {
        int t=usersMapper.Count();
        return t;
    }
}
