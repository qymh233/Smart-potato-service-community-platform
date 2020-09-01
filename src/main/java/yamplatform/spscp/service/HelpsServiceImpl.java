package yamplatform.spscp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import yamplatform.spscp.mapper.HelpsMapper;
import yamplatform.spscp.pojo.Helps;

@Service
public class HelpsServiceImpl implements HelpsService{
    @Autowired
    HelpsMapper helpsMapper;
    @Override
    public Helps SelectOne(String title) {
        Helps helps=helpsMapper.SelectOne(title);
        return helps;
    }

    @Override
    public int InsertHelp(Helps helps) {
        int t=helpsMapper.InsertHelps(helps);
        return t;
    }

    @Override
    public int UpdateHelps(Helps helps) {
        int t=helpsMapper.UpdateHelps(helps);
        return t;
    }
}