package yamplatform.spscp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import yamplatform.spscp.mapper.ManagersMapper;
import yamplatform.spscp.pojo.Managers;

@Service
public class ManagersServiceImpl implements ManagersService{
    @Autowired
    ManagersMapper managersMapper;

    @Override
    public Managers SelectOne(String username,String password) {
        Managers managers=managersMapper.SelectOne(username);
        if(managers==null){
            return null;
        }else if(!password.equals(managers.getPassword())){
            return  null;
        }else {
            return managers;
        }
    }

    @Override
    public Managers SelectOnebyid(Integer id) {
        Managers user=managersMapper.SelectOnebyid(id);
        return user;
    }
}
