package yamplatform.spscp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import yamplatform.spscp.mapper.LiveMsgsMapper;
import yamplatform.spscp.pojo.LiveMsgs;
import yamplatform.spscp.pojo.PhotoLibrarys;
import yamplatform.spscp.pojo.Users;

import java.util.List;

@Service
public class LiveMsgsServiceImpl implements LiveMsgsService{
    @Autowired
    LiveMsgsMapper liveMsgsMapper;
    @Autowired
    UsersService usersService;
    @Override
    public LiveMsgs SelectOne(Integer id) {
        LiveMsgs liveMsg=liveMsgsMapper.SelectOne(id);
        Users user=usersService.SelectOnebyid(liveMsg.getUid());
        liveMsg.setUser(user);
        return liveMsg;
    }
    @Override
    public int InsertLiveMsgs(LiveMsgs liveMsgs) {
        int t=liveMsgsMapper.InsertLiveMsgs(liveMsgs);
        return t;
    }
    @Override
    public List<LiveMsgs> LiveMsgsList() {
        List<LiveMsgs> liveMsgsList=liveMsgsMapper.LiveMsgsList();
        if(liveMsgsList!=null){
            for (LiveMsgs l:liveMsgsList){
                Users user=usersService.SelectOnebyid(l.getUid());
                l.setUser(user);
            }
        }
        return liveMsgsList;
    }

    @Override
    public int UpdateLiveMsgsRecont(Integer id, String recont) {
        int t=liveMsgsMapper.UpdateLiveMsgsRecont(id,recont);
        return t;
    }

    @Override
    public int Count() {
        int t=liveMsgsMapper.Count();
        return t;
    }

    @Override
    public List<LiveMsgs> Listpage(Integer page, Integer lim) {
        page=(page-1)*lim;
        List<LiveMsgs> liveMsgsList=liveMsgsMapper.Listpage(page,lim);
        if(liveMsgsList!=null){
            for (LiveMsgs l:liveMsgsList){
                Users user=usersService.SelectOnebyid(l.getUid());
                l.setUser(user);
            }
        }
        return liveMsgsList;
    }}
