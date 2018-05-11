package cn.ledaikuan.ldkbatch.model;

public class CashBackUserClassify extends CashBackUserField{

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public int getPushType() {
        return pushType;
    }

    public void setPushType(int pushType) {
        this.pushType = pushType;
    }

    private String userType;
    
    private int pushType;
}
