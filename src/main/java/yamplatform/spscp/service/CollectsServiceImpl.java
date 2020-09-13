package yamplatform.spscp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import yamplatform.spscp.mapper.CollectsMapper;
import yamplatform.spscp.pojo.Collects;
import yamplatform.spscp.pojo.Topics;

import java.util.List;

@Service
public class CollectsServiceImpl implements CollectsService{
    @Autowired
    CollectsMapper collectsMapper;
    @Autowired
    TopicsService topicsService;
    @Override
    public int Delete(Integer id) {
        int t=collectsMapper.Delete(id);
        return t;
    }

    @Override
    public List<Collects> CollectsList(Integer uid) {
        List<Collects> collectsList=collectsMapper.CollectsList(uid);
        return collectsList;
    }

    @Override
    public int Insertone(Collects collect) {
        List<Collects> collectsList=collectsMapper.CollectsList(collect.getUid());
        int t=0;
        if(collectsList!=null){
            for (Collects c:collectsList){
                if(collect.getTid()==c.getTid()){
                    t++;
                    break;
                }
            }
        }
        if(t==0){
            t=collectsMapper.Insertone(collect);
        }
        return t;
    }
}
