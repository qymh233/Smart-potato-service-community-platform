package yamplatform.spscp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import yamplatform.spscp.mapper.CarouselMapper;
import yamplatform.spscp.pojo.Carousels;

import java.util.List;
@Service
public class CarouselsServiceImpl implements CarouselsService{
    @Autowired
    CarouselMapper carouselMapper;
    @Override
    public Carousels SelectOne(Integer id) {
        Carousels carousels=carouselMapper.SelectOne(id);
        return carousels;
    }

    @Override
    public int InsertCarousels(Carousels carousels) {
        int t=carouselMapper.InsertCarousels(carousels);
        return t;
    }

    @Override
    public int UpdateCarousels(Carousels carousels) {
        int t=carouselMapper.UpdateCarousels(carousels);
        return t;
    }

    @Override
    public List<Carousels> CarouselsList() {
        List<Carousels> carouselsList=carouselMapper.CarouselssList();
        return carouselsList;
    }

    @Override
    public int Delete(Integer id) {
        int t=carouselMapper.Delete(id);
        return t;
    }

    @Override
    public int Count() {
        int t=carouselMapper.Count();
        return t;
    }

    @Override
    public List<Carousels> Listpage(Integer page, Integer lim) {
        page=(page-1)*lim;
        List<Carousels> carouselsList=carouselMapper.Listpage(page,lim);
        return carouselsList;
    }
}
