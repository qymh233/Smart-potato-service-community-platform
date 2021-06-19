package yamplatform.spscp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import yamplatform.spscp.mapper.PhotoLibrarysMapper;
import yamplatform.spscp.pojo.PhotoLibrarys;
import yamplatform.spscp.pojo.Rellinks;
import yamplatform.spscp.pojo.Users;

import java.util.List;


@Service
public class PhotoLibrarysServiceImpl implements PhotoLibrarysService{
    @Autowired
    PhotoLibrarysMapper photoLibrarysMapper;
    @Autowired
    UsersService usersService;
    @Override
    public PhotoLibrarys SelectOne(Integer id) {
        PhotoLibrarys photoLibrary=photoLibrarysMapper.SelectOne(id);
        if(photoLibrary!=null){
            Users user=usersService.SelectOnebyid(photoLibrary.getUid());
            photoLibrary.setUser(user);
        }
        return photoLibrary;
    }

    @Override
    public int InsertPhotoLibrarys(PhotoLibrarys photoLibrarys) {
        int t=photoLibrarysMapper.InsertphotoLibrarys(photoLibrarys);
        return t;
    }

    @Override
    public int UpdatePhotoLibrarys(PhotoLibrarys photoLibrarys) {
        int t=photoLibrarysMapper.UpdatephotoLibrarys(photoLibrarys);
        return t;
    }

    @Override
    public List<PhotoLibrarys> PhotoLibrarysList() {
        List<PhotoLibrarys> photoLibrarysList=photoLibrarysMapper.photoLibrarysList();
        if(photoLibrarysList!=null){
            for(PhotoLibrarys c:photoLibrarysList){
                Users user=usersService.SelectOnebyid(c.getUid());
                c.setUser(user);
            }
        }
        return photoLibrarysList;
    }

    @Override
    public int Delete(Integer id) {
        int t=photoLibrarysMapper.Delete(id);
        return t;
    }

    @Override
    public List<PhotoLibrarys> likelist(List<String> findlikelist) {
        List<PhotoLibrarys> photoLibrarysList=photoLibrarysMapper.likelist(findlikelist);
        if(photoLibrarysList!=null){
            for(PhotoLibrarys c:photoLibrarysList){
                Users user=usersService.SelectOnebyid(c.getUid());
                c.setUser(user);
            }
        }
        return photoLibrarysList;
    }

    @Override
    public int Count() {
        int t=photoLibrarysMapper.Count();
        return t;
    }

    @Override
    public List<PhotoLibrarys> Listpage(Integer page, Integer lim) {
        page=(page-1)*lim;
        List<PhotoLibrarys> photoLibrarysList=photoLibrarysMapper.Listpage(page,lim);
        if(photoLibrarysList!=null){
            for(PhotoLibrarys c:photoLibrarysList){
                Users user=usersService.SelectOnebyid(c.getUid());
                c.setUser(user);
            }
        }
        return photoLibrarysList;
    }
}
