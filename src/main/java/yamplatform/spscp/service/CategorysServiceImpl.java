package yamplatform.spscp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import yamplatform.spscp.mapper.CategorysMapper;
import yamplatform.spscp.pojo.Categorys;
import yamplatform.spscp.pojo.Rellinks;
import yamplatform.spscp.pojo.Types;

import java.util.List;

@Service
public class CategorysServiceImpl implements CategorysService{
    @Autowired
    CategorysMapper categorysMapper;
    @Autowired
    TypesService typesService;
    @Override
    public Categorys SelectOne(Integer id) {
        Categorys category=categorysMapper.SelectOne(id);
        return category;
    }

    @Override
    public int InsertCategorys(Categorys categorys) {
        int t=categorysMapper.InsertCategorys(categorys);
        return t;
    }

    @Override
    public int UpdateCategorys(Categorys categorys) {
        int t=categorysMapper.UpdateCategorys(categorys);
        return t;
    }

    @Override
    public List<Categorys> CategorysList() {
        List<Categorys> categorysList=categorysMapper.CategorysList();
        if(categorysList!=null){
            for(Categorys c:categorysList){
                List<Types> typesList=typesService.typesListbycid(c.getId());
                c.setCategoryTypes(typesList);
            }
        }
        return categorysList;
    }

    @Override
    public int Delete(Integer id) {
        int t=categorysMapper.Delete(id);
        return t;
    }

    @Override
    public int Count() {
        int t=categorysMapper.Count();
        return t;
    }

    @Override
    public List<Categorys> Listpage(Integer page, Integer lim) {
        page=(page-1)*lim;
        List<Categorys> categorysList=categorysMapper.Listpage(page,lim);
        return categorysList;
    }
}
