package cn.ledaikuan.ldkbatch.processor;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;

import cn.ledaikuan.ldkbatch.collection.CollectionAppBean;
import cn.ledaikuan.ldkbatch.collection.CollectionBean;
import cn.ledaikuan.ldkbatch.collection.CollectionCallLogBean;
import cn.ledaikuan.ldkbatch.collection.CollectionContactBean;
import cn.ledaikuan.ldkbatch.collection.CollectionLocationBean;
import cn.ledaikuan.ldkbatch.db.entity.Apps;
import cn.ledaikuan.ldkbatch.db.entity.CallLog;
import cn.ledaikuan.ldkbatch.db.entity.CallLog20170912Old;
import cn.ledaikuan.ldkbatch.db.entity.CallLog20171123;
import cn.ledaikuan.ldkbatch.db.entity.CallLog20180119;
import cn.ledaikuan.ldkbatch.db.entity.Contact;
import cn.ledaikuan.ldkbatch.db.entity.Contact20170912;
import cn.ledaikuan.ldkbatch.db.entity.Contact20171123;
import cn.ledaikuan.ldkbatch.db.entity.Contact20180119;
import cn.ledaikuan.ldkbatch.db.entity.Location;
import cn.ledaikuan.ldkbatch.db.serviceImpl.Apps20171123Service;
import cn.ledaikuan.ldkbatch.db.serviceImpl.AppsService;
import cn.ledaikuan.ldkbatch.db.serviceImpl.CallLog20170912OldService;
import cn.ledaikuan.ldkbatch.db.serviceImpl.CallLog20170912Service;
import cn.ledaikuan.ldkbatch.db.serviceImpl.CallLog20171123Service;
import cn.ledaikuan.ldkbatch.db.serviceImpl.CallLog20180119Service;
import cn.ledaikuan.ldkbatch.db.serviceImpl.CallLogService;
import cn.ledaikuan.ldkbatch.db.serviceImpl.Contact20170912Service;
import cn.ledaikuan.ldkbatch.db.serviceImpl.Contact20171123Service;
import cn.ledaikuan.ldkbatch.db.serviceImpl.Contact20180119Service;
import cn.ledaikuan.ldkbatch.db.serviceImpl.ContactService;
import cn.ledaikuan.ldkbatch.db.serviceImpl.LocationService;
import cn.ledaikuan.ldkbatch.model.CollectionItemReaderModel;

public class CollectionProcessor implements ItemProcessor<CollectionItemReaderModel,CollectionBean>{

    //注入service
    @Autowired
    private ContactService contactService;
    @Autowired
    private Contact20170912Service contact20170912Service;
    @Autowired
    private Contact20171123Service contact20171123Service;
    @Autowired
    private Contact20180119Service contact20180119Service;
    
    //注入service
    @Autowired
    private CallLogService callLogService;
    @Autowired
    private CallLog20170912Service callLog20170912Service;
    @Autowired
    private CallLog20171123Service callLog20171123Service;
    @Autowired
    private CallLog20180119Service callLog20180119Service;
    @Autowired
    private CallLog20170912OldService callLog20170912OldService;
    
    //注入service
    @Autowired
    private LocationService locationService;
    
    //注入service
    @Autowired
    private AppsService appsService;
    @Autowired
    private Apps20171123Service apps20171123Service;
    
    @Override
    public CollectionBean process(CollectionItemReaderModel item) throws Exception {
        if(item == null)return null;
        String customerId = item.getCustomerId();
        String applicationId = item.getApplicationId();
        if(StringUtils.isEmpty(customerId) || StringUtils.isEmpty(applicationId))return null;
        CollectionBean bean = new CollectionBean();
        bean.setContaclList(getCollectionContactArray(customerId,applicationId));
        bean.setCallLogList(getCollectionCallLogArray(customerId,applicationId));
        bean.setLocationList(getCollectionLocationArray(customerId,applicationId));
        bean.setAppList(getCollectionAppBeanArray(customerId,applicationId));
        return bean;
    }

    private ArrayList<CollectionContactBean> getCollectionContactArray(String customerId,String applicationId){
        String getTime = customerId.substring(0, 8);
        ArrayList<CollectionContactBean> resultList = new ArrayList<CollectionContactBean>();
        CollectionContactBean bean ;
        if(isRegisterTimeAfterDayTime(customerId,"20180120")){
            ArrayList<Contact20180119> list = (ArrayList<Contact20180119>) contact20180119Service.findAllContact20180119ByCustomerId(customerId);
            if(list == null || list.size()<1)return null;
            for(Contact20180119 contact:list){
                bean = new CollectionContactBean();
                bean.setAPP_ID(applicationId);
                bean.setName(contact.getName());
                bean.setNumber(contact.getNumber());
                bean.setCreate_time(getTime);
                resultList.add(bean);
            }
            return resultList;
        }
        
        if(isRegisterTimeAfterDayTime(customerId,"20171123")){
            ArrayList<Contact20171123>list = (ArrayList<Contact20171123>) contact20171123Service.findAllContact20171123ByCustomerId(customerId);
            if(list == null || list.size()<1)return null;
            for(Contact20171123 contact:list){
                bean = new CollectionContactBean();
                bean.setAPP_ID(applicationId);
                bean.setName(contact.getName());
                bean.setNumber(contact.getNumber());
                bean.setCreate_time(getTime);
                resultList.add(bean);
            }
            return resultList;
        }
        
        if(isRegisterTimeAfterDayTime(customerId,"20170912")){
            ArrayList<Contact20170912> list = (ArrayList<Contact20170912>) contact20170912Service.findAllContact20170912ByCustomerId(customerId);
            if(list == null || list.size()<1)return null;
            for(Contact20170912 contact:list){
                bean = new CollectionContactBean();
                bean.setAPP_ID(applicationId);
                bean.setName(contact.getName());
                bean.setNumber(contact.getNumber());
                bean.setCreate_time(getTime);
                resultList.add(bean);
            }
            return resultList;
        }
        
        ArrayList<Contact> list = (ArrayList<Contact>) contactService.findAllContactByCustomerId(customerId);
        if(list == null || list.size()<1)return null;
        for(Contact contact:list){
            bean = new CollectionContactBean();
            bean.setAPP_ID(applicationId);
            bean.setName(contact.getName());
            bean.setNumber(contact.getNumber());
            bean.setCreate_time(getTime);
            resultList.add(bean);
        }
        return resultList;
    }
    
    private ArrayList<CollectionCallLogBean> getCollectionCallLogArray(String customerId,String applicationId){
        
        String getTime = customerId.substring(0, 8);
        ArrayList<CollectionCallLogBean> resultList = new ArrayList<CollectionCallLogBean>();
        CollectionCallLogBean bean;
        if( isRegisterTimeAfterDayTime(customerId,"20180120")){
            ArrayList<CallLog20180119> list = (ArrayList<CallLog20180119>) callLog20180119Service.findAllCallLog20180119ByCustomerId(customerId);
            if(list == null || list.size()<1)return null;
            for(CallLog20180119 calllog : list){
                bean = new CollectionCallLogBean();
                bean.setAPP_ID(applicationId);
                bean.setCall_type(calllog.getType()+"");
                bean.setCreate_time(getTime);
                bean.setDate(calllog.getDate());
                bean.setName(calllog.getName());
                bean.setNumber(calllog.getNumber());
                resultList.add(bean);
            }
            
            return resultList;
        }
        if( isRegisterTimeAfterDayTime(customerId,"20171123")){
            ArrayList<CallLog20171123> list = (ArrayList<CallLog20171123>) callLog20171123Service.findAllCallLog20171123ByCustomerId(customerId);
            if(list == null || list.size()<1)return null;
            for(CallLog20171123 calllog : list){
                bean = new CollectionCallLogBean();
                bean.setAPP_ID(applicationId);
                bean.setCall_type(calllog.getType()+"");
                bean.setCreate_time(getTime);
                bean.setDate(calllog.getDate());
                bean.setName(calllog.getName());
                bean.setNumber(calllog.getNumber());
                resultList.add(bean);
            }
            
            return resultList;
        }
        if(isRegisterTimeAfterDayTime(customerId,"20170912")){
            ArrayList<CallLog20170912Old> list = (ArrayList<CallLog20170912Old>) callLog20170912OldService.findAllyByCustomerId(customerId);
            if(list == null || list.size()<1)return null;
            for(CallLog20170912Old calllog : list){
                bean = new CollectionCallLogBean();
                bean.setAPP_ID(applicationId);
                bean.setCall_type(calllog.getType()+"");
                bean.setCreate_time(getTime);
                bean.setDate(calllog.getDate());
                bean.setName(calllog.getName());
                bean.setNumber(calllog.getNumber());
                resultList.add(bean);
            }
            
            return resultList;
        }
        
        ArrayList<CallLog> list = (ArrayList<CallLog>) callLogService.findAllCallLogByCustomerId(customerId);
        if(list == null || list.size()<1)return null;
        for(CallLog calllog : list){
            bean = new CollectionCallLogBean();
            bean.setAPP_ID(applicationId);
            bean.setCall_type(calllog.getType()+"");
            bean.setCreate_time(getTime);
            bean.setDate(calllog.getDate());
            bean.setName(calllog.getName());
            bean.setNumber(calllog.getNumber());
            resultList.add(bean);
        }
        
        return resultList;
    }
    
    private ArrayList<CollectionLocationBean> getCollectionLocationArray(String customerId,String applicationId){
        ArrayList<CollectionLocationBean> resultList = new ArrayList<CollectionLocationBean>();
        CollectionLocationBean bean;
        ArrayList<Location> list = (ArrayList<Location>) locationService.findAllLocationByCustomerId(customerId);
        if(list == null || list.size()<1)return null;
        for(Location location:list){
            bean = new CollectionLocationBean();
            bean.setAPP_ID(applicationId);
            bean.setAddr(location.getAddr());
            bean.setGeoCity(location.getGeoCity());
            bean.setLatitude(location.getLatitude());
            bean.setLongitude(location.getLongitude());
            bean.setTime(location.getTime());
            
            resultList.add(bean);
        }
        return resultList;
    }
    
    private ArrayList<CollectionAppBean> getCollectionAppBeanArray(String customerId,String applicationId){
        ArrayList<CollectionAppBean> resultList = new ArrayList<CollectionAppBean>();
        CollectionAppBean bean;
        ArrayList<Apps> list = (ArrayList<Apps>) appsService.findAllByCostomerId(customerId);
        if(list == null || list.size()<1)return null;
        String getTime = customerId.substring(0, 8);
        for(Apps app:list){
            bean = new CollectionAppBean();
            bean.setAPP_ID(applicationId);
            bean.setAPPNAME(app.getAppName());
            bean.setAPPVERSION(app.getAppVersion());
            bean.setCreate_time(getTime);
            
            resultList.add(bean);
        }
        return resultList;
    }
    
    public  boolean isRegisterTimeAfterDayTime(String customerId,String dayTime){
        if(StringUtils.isEmpty(customerId) || customerId.length() < 10 || StringUtils.isEmpty(dayTime))return false;
        String eightCustomerId = customerId.substring(0, 8);
        String customerIdRegisterTime = eightCustomerId + "000000";
        String lineTime = dayTime + "000000";
        return StringDateTime2Long(customerIdRegisterTime) >= StringDateTime2Long(lineTime);
    }
    
    public long StringDateTime2Long(String time){
        SimpleDateFormat df = new SimpleDateFormat("yyyyMMddHHmmss");//设置日期格式
        Date date = null;
        try {
            date = df.parse(time);
        } catch (ParseException e) {
            return 0;
        }
        return date.getTime();
    }

}
