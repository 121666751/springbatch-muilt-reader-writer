package cn.ledaikuan.ldkbatch.processor;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.batch.item.ItemProcessor;

import cn.ledaikuan.ldkbatch.model.JobTestBean;

public class JobTestProcessor implements ItemProcessor<JobTestBean,JobTestBean>{

    @Override
    public JobTestBean process(JobTestBean jobTestBean) throws Exception {
        System.out.println("Process");
        JobTestBean jobTest = new JobTestBean();
        jobTest.setId(jobTestBean.getId());
        jobTest.setJob_time(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
        jobTest.setPassword(jobTestBean.getPassword());
        jobTest.setUser_name(jobTestBean.getUser_name());
        jobTest.setUser_status(Math.random()>0.5?1:0);
        return jobTest;
    }

}
