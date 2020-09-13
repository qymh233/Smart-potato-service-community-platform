package yamplatform.spscp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import yamplatform.spscp.mapper.NewsMapper;
import yamplatform.spscp.pojo.News;

import java.util.List;

@Service
public class NewsServiceImpl implements NewsService{
    @Autowired
    NewsMapper newsMapper;
    @Override
    public int Delete(Integer tid,Integer uid) {
        int t=newsMapper.Delete(tid,uid);
        return t;
    }

    @Override
    public List<News> NewsList(Integer uid) {
        List<News> newsList=newsMapper.NewsList(uid);
        return newsList;
    }

    @Override
    public int Insertone(News news) {
        int t=newsMapper.Insertone(news);
        return t;
    }
}
