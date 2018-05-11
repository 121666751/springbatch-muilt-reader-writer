package cn.ledaikuan.ldkbatch.writer;

import java.util.ArrayList;
import java.util.List;

import org.springframework.batch.item.ItemWriter;
//import org.springframework.batch.item.file.FlatFileItemWriter;
//import org.springframework.batch.item.file.transform.BeanWrapperFieldExtractor;
//import org.springframework.batch.item.file.transform.DelimitedLineAggregator;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.core.io.ClassPathResource;

import cn.ledaikuan.ldkbatch.collection.CollectionAppBean;
import cn.ledaikuan.ldkbatch.collection.CollectionBean;
import cn.ledaikuan.ldkbatch.collection.CollectionCallLogBean;
import cn.ledaikuan.ldkbatch.collection.CollectionContactBean;
import cn.ledaikuan.ldkbatch.collection.CollectionLocationBean;

public class CollectionItemWriter implements ItemWriter<CollectionBean>{

    public void setCvsContactFileItemWriter(ItemWriter cvsContactFileItemWriter) {
        this.cvsContactFileItemWriter = cvsContactFileItemWriter;
    }

    public void setCvsCallLogFileItemWriter(ItemWriter cvsCallLogFileItemWriter) {
        this.cvsCallLogFileItemWriter = cvsCallLogFileItemWriter;
    }

    private ItemWriter cvsContactFileItemWriter;
    
    private ItemWriter cvsCallLogFileItemWriter;
    
    public void setCvsAppFileItemWriter(ItemWriter cvsAppFileItemWriter) {
        this.cvsAppFileItemWriter = cvsAppFileItemWriter;
    }

    public void setCvsLocationFileItemWriter(ItemWriter cvsLocationFileItemWriter) {
        this.cvsLocationFileItemWriter = cvsLocationFileItemWriter;
    }

    private ItemWriter cvsAppFileItemWriter;
    
    private ItemWriter cvsLocationFileItemWriter;

    @Override
    public void write(List<? extends CollectionBean> items) throws Exception {
        System.out.println("do nothing size = "+(items==null?0:items.size()));
        if(items == null || items.size()<1)return;
        for(CollectionBean bean : items){
            ArrayList<CollectionContactBean> contactList =  bean.getContaclList();
            if(contactList !=null && contactList.size()>1){
                cvsContactFileItemWriter.write(contactList);
            }
            
            ArrayList<CollectionCallLogBean> calllogList = bean.getCallLogList();
            if(calllogList !=null && calllogList.size()>1){
                cvsCallLogFileItemWriter.write(calllogList);
            }
            
            ArrayList<CollectionAppBean> appList = bean.getAppList();
            if(appList !=null && appList.size()>1){
                cvsAppFileItemWriter.write(appList);
            }
            
            ArrayList<CollectionLocationBean> locationList = bean.getLocationList();
            if(locationList !=null && locationList.size()>1){
                cvsLocationFileItemWriter.write(locationList);
            }
        }
    }
    
//    private FlatFileItemWriter getWriter(){
//        if(cvsContactFileItemWriter != null)return cvsContactFileItemWriter;
//        
//        cvsContactFileItemWriter = new FlatFileItemWriter<>();
//        cvsContactFileItemWriter.setAppendAllowed(true);
//        cvsContactFileItemWriter.setShouldDeleteIfExists(false);
//        cvsContactFileItemWriter.setEncoding("UTF-8"); 
//        cvsContactFileItemWriter.setResource(new ClassPathResource("/cvs/201702/phone_list_201702.csv")); 
//        cvsContactFileItemWriter.setLineAggregator(new DelimitedLineAggregator<CollectionContactBean>() {
//            { 
//                setDelimiter(","); 
//                setFieldExtractor(new BeanWrapperFieldExtractor<CollectionContactBean>() {
//                    { 
//                        setNames(new String[]{"APP_ID", "name", "number", "create_time"}); 
//                    }
//                });
//            }
//        });
//        return cvsContactFileItemWriter;
//    }
}
