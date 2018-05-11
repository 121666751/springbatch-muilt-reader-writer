package cn.ledaikuan.ldkbatch.collection;

public class CollectionAppBean {

    public String getAPP_ID() {
        return APP_ID;
    }

    public void setAPP_ID(String aPP_ID) {
        APP_ID = aPP_ID;
    }

    public String getAPPNAME() {
        return APPNAME;
    }

    public void setAPPNAME(String aPPNAME) {
        APPNAME = aPPNAME;
    }

    public String getAPPVERSION() {
        return APPVERSION;
    }

    public void setAPPVERSION(String aPPVERSION) {
        APPVERSION = aPPVERSION;
    }

    public String getCreate_time() {
        return create_time;
    }

    public void setCreate_time(String create_time) {
        this.create_time = create_time;
    }

    private String APP_ID;
    
    private String APPNAME;
    
    private String APPVERSION;
    
    private String create_time;
    
}
