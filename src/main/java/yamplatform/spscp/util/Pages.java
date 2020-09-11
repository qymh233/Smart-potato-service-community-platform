package yamplatform.spscp.util;

import java.util.List;

public class Pages {
    //分页
    public static List<?> listSub(List<?> list, Integer page, Integer limit){

        List<?> subList;
        if(((page - 1) * limit + limit) <= list.size()) {
            subList = list.subList((page - 1) * limit, (page - 1) * limit + limit);
        }else{
            subList = list.subList((page - 1) * limit, list.size());
        }
        return  subList;
    }

}
