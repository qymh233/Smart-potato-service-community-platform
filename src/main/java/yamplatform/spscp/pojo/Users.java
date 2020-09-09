package yamplatform.spscp.pojo;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Users {
    private Integer id;
    private String username;
    private String password;
    private String nickname; // 昵称
    private String sex = "男";
    private String picture = "/img/ds-java.png"; // 头像
    private String email = "";
    private String comefrom = ""; // 来自
    private String introduction = ""; // 个人简介
    private String profession = ""; // 职业，专业
    private Integer gradeIntegral=0;
    private Integer integral = 50; // 积分
    private Integer roleId = 0; // 权限
    private Integer clock = 0; // 未读消息
    private Integer topCount = 0; // 帖子数
    private Integer comCount = 0; // 评论数
    private Date registerTime;
    private Integer status; // 0表示未禁用，1表示禁用
    private Integer usersGradeid;//用户等级编号


    private Grades usersGrade; // 等级

    // 集合，一对多
    private Set<Topics> userTopics = new HashSet<Topics>();
    private Set<Comments> userComments = new HashSet<Comments>();

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getComefrom() {
        return comefrom;
    }

    public void setComefrom(String comefrom) {
        this.comefrom = comefrom;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public Integer getGradeIntegral() {
        return gradeIntegral;
    }

    public void setGradeIntegral(Integer gradeIntegral) {
        this.gradeIntegral = gradeIntegral;
    }

    public Integer getIntegral() {
        return integral;
    }

    public void setIntegral(Integer integral) {
        this.integral = integral;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public Integer getClock() {
        return clock;
    }

    public void setClock(Integer clock) {
        this.clock = clock;
    }

    public Integer getTopCount() {
        return topCount;
    }

    public void setTopCount(Integer topCount) {
        this.topCount = topCount;
    }

    public Integer getComCount() {
        return comCount;
    }

    public void setComCount(Integer comCount) {
        this.comCount = comCount;
    }

    public Date getRegisterTime() {
        return registerTime;
    }

    public void setRegisterTime(Date registerTime) {
        this.registerTime = registerTime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getUsersGradeid() {
        return usersGradeid;
    }

    public void setUsersGradeid(Integer usersGradeid) {
        this.usersGradeid = usersGradeid;
    }

    public Grades getUsersGrade() {
        return usersGrade;
    }

    public void setUsersGrade(Grades usersGrade) {
        this.usersGrade = usersGrade;
    }

    public Set<Topics> getUserTopics() {
        return userTopics;
    }

    public void setUserTopics(Set<Topics> userTopics) {
        this.userTopics = userTopics;
    }

    public Set<Comments> getUserComments() {
        return userComments;
    }

    public void setUserComments(Set<Comments> userComments) {
        this.userComments = userComments;
    }


    @Override
    public String toString() {
        return "Users{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", nickname='" + nickname + '\'' +
                ", sex='" + sex + '\'' +
                ", picture='" + picture + '\'' +
                ", email='" + email + '\'' +
                ", comefrom='" + comefrom + '\'' +
                ", introduction='" + introduction + '\'' +
                ", profession='" + profession + '\'' +
                ", gradeIntegral=" + gradeIntegral +
                ", integral=" + integral +
                ", roleId=" + roleId +
                ", clock=" + clock +
                ", topCount=" + topCount +
                ", comCount=" + comCount +
                ", registerTime=" + registerTime +
                ", status=" + status +
                ", usersGrade=" + usersGrade +
                ", userTopics=" + userTopics +
                ", userComments=" + userComments +
                '}';
    }
}
