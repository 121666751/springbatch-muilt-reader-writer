package cn.ledaikuan.ldkbatch.collection;

import java.util.ArrayList;

public class CollectionBean {

    public ArrayList<CollectionContactBean> getContaclList() {
        return contaclList;
    }

    public void setContaclList(ArrayList<CollectionContactBean> contaclList) {
        this.contaclList = contaclList;
    }

    public ArrayList<CollectionCallLogBean> getCallLogList() {
        return callLogList;
    }

    public void setCallLogList(ArrayList<CollectionCallLogBean> callLogList) {
        this.callLogList = callLogList;
    }

    public ArrayList<CollectionAppBean> getAppList() {
        return appList;
    }

    public void setAppList(ArrayList<CollectionAppBean> appList) {
        this.appList = appList;
    }

    private ArrayList<CollectionContactBean> contaclList;
    
    private ArrayList<CollectionCallLogBean> callLogList;
    
    private ArrayList<CollectionAppBean> appList;
    
    public ArrayList<CollectionLocationBean> getLocationList() {
        return locationList;
    }

    public void setLocationList(ArrayList<CollectionLocationBean> locationList) {
        this.locationList = locationList;
    }

    private ArrayList<CollectionLocationBean> locationList;
}
