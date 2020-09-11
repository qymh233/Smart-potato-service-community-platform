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
    //插入
    public int InsertTopics(@Param("topics") Topics topics);
    //更新
    public int UpdateTopics(@Param("topics") Topics topics);
    //删除
    public int DeleteTopics(@Param("id") Integer id);
    //查询列表
    public List<Topics>  TopicsList();
    //查询列表
    public List<Topics>  searchTopicsList(@Param("question") String question);
    //查询列表byuid
    public List<Topics>  TopicsListbyuid(@Param("uid") Integer uid);
    //条件查询
    //时间排序
    public List<Topics>  TopicsListbyxin();
    public List<Topics>  TopicsListbyxin_ten();
    //查询>50 ,时间排序
    public List<Topics>  TopicsListbyre();
    public List<Topics>  TopicsListbyre_ten();
    //查询>50 , 点赞>50 时间排序
    public List<Topics>  TopicsListbyjin();
    public List<Topics>  TopicsListbyjin_ten();

}
