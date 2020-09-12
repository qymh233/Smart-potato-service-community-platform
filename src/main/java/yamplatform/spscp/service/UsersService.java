package yamplatform.spscp.service;

import yamplatform.spscp.pojo.Users;

import java.util.List;

public interface UsersService {
    //查询一条数据
    public Users SelectOne(String username,String password);
    public Users SelectOnebyid(Integer id);
    //插入一条用户
    public int InsertUsers(Users users);
    //更新一条用户
    public int UpdateUsers(Users users);
    //查询所有用户
    public List<Users> usersList();
    //删除用户
    public int DeleteUsers(Integer id);
}
