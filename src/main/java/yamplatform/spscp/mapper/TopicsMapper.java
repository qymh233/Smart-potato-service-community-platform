package yamplatform.spscp.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import yamplatform.spscp.pojo.Topics;

import java.util.List;

@Mapper
@Repository
public interface TopicsMapper {

    //查询一条数据
    public Topics SelectOne(@Param("id") Integer id);
    //插入一条帮助
    public int InsertTopics(@Param("topics") Topics topics);
    //更新一条帮助
    public int UpdateTopics(@Param("topics") Topics topics);
    //查询列表
    public List<Topics>  TopicsList();
    //查询列表byuid
    public List<Topics>  TopicsListbyuid(@Param("uid") Integer uid);
    //条件查询
    public List<Topics>  TopicsListbyxin();
    public List<Topics>  TopicsListbyxin_ten();
    public List<Topics>  TopicsListbyre();
    public List<Topics>  TopicsListbyre_ten();
    public List<Topics>  TopicsListbyjin();
    public List<Topics>  TopicsListbyjin_ten();

}
