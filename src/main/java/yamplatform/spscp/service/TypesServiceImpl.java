package yamplatform.spscp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import yamplatform.spscp.mapper.TypesMapper;
import yamplatform.spscp.pojo.Rellinks;
import yamplatform.spscp.pojo.Types;

import java.util.List;

@Service
public class TypesServiceImpl implements TypesService{
    @Autowired
    TypesMapper typesMapper;
    @Override
    public Types SelectOne(Integer id) {
        Types type=typesMapper.SelectOne(id);
        return type;
    }

    @Override
    public int InsertTypes(Types types) {
        int t=typesMapper.InsertTypes(types);
        return t;
    }

    @Override
    public int UpdateTypes(Types types) {
        int t=typesMapper.UpdateTypes(types);
        return t;
    }

    @Override
    public List<Types> typesList() {
        List<Types> typesList=typesMapper.typesList();
        return typesList;
    }

    @Override
    public List<Types> typesListbycid(Integer cid) {
        List<Types> typesList=typesMapper.typesListbycid(cid);
        return typesList;
    }

    @Override
    public int Delete(Integer id) {
        int t=typesMapper.Delete(id);
        return t;
    }

    @Override
    public int Count(Integer cid) {
        int t=typesMapper.Count(cid);
        return t;
    }

    @Override
    public List<Types> Listpage(Integer page, Integer lim,Integer cid) {
        page=(page-1)*lim;
        List<Types> typesList=typesMapper.Listpage(page,lim,cid);
        return typesList;
    }
}
