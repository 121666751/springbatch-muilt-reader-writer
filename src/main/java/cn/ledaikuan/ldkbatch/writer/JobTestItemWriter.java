package cn.ledaikuan.ldkbatch.writer;

import java.util.List;

import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;

import cn.ledaikuan.ldkbatch.db.entity.JobTest;
import cn.ledaikuan.ldkbatch.db.serviceImpl.JobTestServiceImpl;
import cn.ledaikuan.ldkbatch.model.JobTestBean;

public class JobTestItemWriter implements ItemWriter<JobTestBean>{

    @Autowired
    private JobTestServiceImpl jobTestServiceImpl;
    
    @Override
    public void write(List<? extends JobTestBean> items) throws Exception {
        System.out.println("write");
        if(items == null || items.size()<1)return;
        System.out.println("write size ="+items.size());
        for(JobTestBean bean:items){
            if(jobTestServiceImpl == null){
                System.err.println("jobTestServiceImpl == null");
                continue;
            }
            JobTest jobTest = jobTestServiceImpl.findJobTestById(bean.getId());
            if(BeanCompareEntity(bean,jobTest)){
                jobTestServiceImpl.updateJobTest(jobTest);
            }
        }
        
    }
    
    private boolean BeanCompareEntity(JobTestBean bean ,JobTest jobTest){
        boolean needUpdate = false;
        if(!StringUtils.isEmpty(bean.getJob_time())){
            if(!bean.getJob_time().equals(jobTest.getJobTime())){
                jobTest.setJobTime(bean.getJob_time());
                needUpdate = true;
            }
        }
        if(jobTest.getUserStatus()!=bean.getUser_status()){
            jobTest.setUserStatus(bean.getUser_status());
            needUpdate = true;
        }
        return needUpdate;
    }

}
