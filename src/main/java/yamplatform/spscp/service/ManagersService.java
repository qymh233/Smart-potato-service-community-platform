package yamplatform.spscp.service;

import yamplatform.spscp.pojo.Managers;

public interface ManagersService {
    //查询一个
    public Managers SelectOne(String username, String password);
    public Managers SelectOnebyid(Integer id);
}
