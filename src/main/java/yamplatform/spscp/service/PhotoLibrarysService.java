package yamplatform.spscp.service;

import yamplatform.spscp.pojo.PhotoLibrarys;
import yamplatform.spscp.pojo.Rellinks;

import java.util.List;

public interface PhotoLibrarysService {
    //查询一条数据
    public PhotoLibrarys SelectOne(Integer id);
    //插入
    public int InsertPhotoLibrarys(PhotoLibrarys photoLibrarys);
    //更新
    public int UpdatePhotoLibrarys(PhotoLibrarys photoLibrarys);
    //查询列表
    public List<PhotoLibrarys> PhotoLibrarysList();
    //删除
    public int Delete(Integer id);
    //模糊查询
    public List<PhotoLibrarys> likelist(List<String> findlikelist);
    //总数
    public int Count();
    //分页
    public List<PhotoLibrarys> Listpage(Integer page, Integer lim);
}
