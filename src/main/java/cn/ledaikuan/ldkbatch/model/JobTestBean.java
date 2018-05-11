package cn.ledaikuan.ldkbatch.model;

public class JobTestBean {

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getJob_time() {
        return job_time;
    }

    public void setJob_time(String job_time) {
        this.job_time = job_time;
    }

    public int getUser_status() {
        return user_status;
    }

    public void setUser_status(int user_status) {
        this.user_status = user_status;
    }

    //主键的标识属性
    private Integer id;
    
    //短信发送手机号
    private String user_name;
    
    //短信发送手机号
    private String password;
    
    //短信发送手机号
    private String job_time;
    
    //短信发送手机号
    private int user_status;
    
}
