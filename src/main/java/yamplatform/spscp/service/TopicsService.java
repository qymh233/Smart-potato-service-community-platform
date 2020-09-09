package yamplatform.spscp.service;

import yamplatform.spscp.pojo.Topics;

import java.util.List;

public interface TopicsService {
    //查询一条数据
    public Topics SelectOne(Integer id);
    //插入一条帮助
    public int InsertTopics(Topics topics);
    //更新一条帮助
    public int UpdateTopics(Topics topics);
    //查询列表
    public List<Topics>  TopicsList();
    //查询列表byuid
    public List<Topics>  TopicsListbyuid(Integer uid);
    //查询列表
    public List<Topics>  searchTopicsList(String question);
    //条件查询
    public List<Topics>  TopicsListbyxin();
    public List<Topics>  TopicsListbyxin_ten();
    public List<Topics>  TopicsListbyre();
    public List<Topics>  TopicsListbyre_ten();
    public List<Topics>  TopicsListbyjin();
    public List<Topics>  TopicsListbyjin_ten();
}
