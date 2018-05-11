package cn.ledaikuan.ldkbatch.db.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.ledaikuan.ldkbatch.db.daoImpl.JobTestDaoImpl;
import cn.ledaikuan.ldkbatch.db.entity.JobTest;

//@Service
public class JobTestServiceImpl {

    @Autowired
    private JobTestDaoImpl jobTestDaoImpl;
    
    public JobTest findJobTestById(int id){
        return jobTestDaoImpl.get(JobTest.class, id);
    }
    
    public void updateJobTest(JobTest jobTest){
        jobTestDaoImpl.update(jobTest);
    }
    
}
