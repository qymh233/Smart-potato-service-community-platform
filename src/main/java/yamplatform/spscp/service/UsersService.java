package yamplatform.spscp.service;

import yamplatform.spscp.pojo.Users;

public interface UsersService {
    //查询一条数据
    public Users SelectOne(String nickname);
    //插入一条用户
    public int InsertUsers(Users users);
    //更新一条用户
    public int UpdateUsers(Users users);
}
