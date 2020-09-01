package yamplatform.spscp.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import yamplatform.spscp.pojo.Helps;

@Mapper
@Repository
public interface HelpsMapper {
    //查询一条数据
    public Helps SelectOne(@Param("title") String title);
    //插入一条帮助
    public int InsertHelps(@Param("helps") Helps helps);
    //更新一条帮助
    public int UpdateHelps(@Param("helps") Helps helps);
}
