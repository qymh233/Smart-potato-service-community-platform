package yamplatform.spscp.service;

import org.springframework.stereotype.Service;
import yamplatform.spscp.pojo.Users;
@Service
public class UsersServiceImpl implements UsersService{
    @Override
    public Users SelectOne(String nickname) {
        return null;
    }

    @Override
    public int InsertUsers(Users users) {
        return 0;
    }

    @Override
    public int UpdateUsers(Users users) {
        return 0;
    }
}
