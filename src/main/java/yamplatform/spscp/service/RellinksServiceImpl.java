package yamplatform.spscp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import yamplatform.spscp.mapper.RellinksMapper;
import yamplatform.spscp.pojo.Rellinks;

import java.util.List;

@Service
public class RellinksServiceImpl implements RellinksService{
    @Autowired
    RellinksMapper rellinksMapper;
    @Override
    public Rellinks SelectOne(Integer id) {
        Rellinks rellink=rellinksMapper.SelectOne(id);
        return rellink;
    }

    @Override
    public int InsertRellinks(Rellinks rellinks) {
        int t=rellinksMapper.InsertRellinks(rellinks);
        return t;
    }

    @Override
    public int UpdateRellinks(Rellinks rellinks) {
        int t=rellinksMapper.UpdateRellinks(rellinks);
        return t;
    }

    @Override
    public List<Rellinks> RellinksList() {
        List<Rellinks> rellinksList=rellinksMapper.RellinksList();
        return rellinksList;
    }
}
