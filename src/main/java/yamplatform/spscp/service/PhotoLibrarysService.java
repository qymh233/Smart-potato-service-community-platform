package yamplatform.spscp.service;

import yamplatform.spscp.pojo.PhotoLibrarys;

import java.util.List;

public interface PhotoLibrarysService {
    //查询一条数据
    public PhotoLibrarys SelectOne(Integer id);
    //插入一条帮助
    public int InsertPhotoLibrarys(PhotoLibrarys photoLibrarys);
    //更新一条帮助
    public int UpdatePhotoLibrarys(PhotoLibrarys photoLibrarys);
    //查询列表
    public List<PhotoLibrarys> PhotoLibrarysList();
}