package yamplatform.spscp.controller;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import yamplatform.spscp.pojo.LiveMsgs;
import yamplatform.spscp.pojo.Users;
import yamplatform.spscp.service.LiveMsgsService;

import java.util.List;

@Controller
@RequestMapping("/LiveMsgs")
@SessionAttributes({"user"})
public class LiveMsgsController {
    @Autowired
    LiveMsgsService liveMsgsService;
    //留言查看
    @RequestMapping("/LiveMsgs_see")
    public String LiveMsgs_see(Model model){
        List<LiveMsgs> liveMsgsList=liveMsgsService.LiveMsgsList();
        model.addAttribute("liveMsgsList",liveMsgsList);
        return "views/LiveMsgshtml/LiveMsgs_see";
    }
    //添加留言
    @RequestMapping("/LiveMsgs_add")
    public String LiveMsgs_add(Model model, @Param("cont")String cont){
        Users user=(Users)model.getAttribute("user");
        LiveMsgs liveMsg=new LiveMsgs();
        liveMsg.setUid(user.getId());
        liveMsg.setContent(cont);
        liveMsgsService.InsertLiveMsgs(liveMsg);
        List<LiveMsgs> liveMsgsList=liveMsgsService.LiveMsgsList();
        model.addAttribute("liveMsgsList",liveMsgsList);
        return "views/LiveMsgshtml/LiveMsgs_see";
    }
}
