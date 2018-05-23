package cn.ledaikuan.ldkbatch;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
    
    protected static Logger logger = LoggerFactory.getLogger(App.class);
    
    public static void main( String[] args ){

        String[] springConfig  = 
            {   "classpath*:spring/database/database.xml", 
                "classpath*:spring/batch/config/context.xml",
                "classpath*:spring/batch/jobs/job-collection.xml" 
            };
        
        ApplicationContext context = 
                new ClassPathXmlApplicationContext(springConfig);
        boolean initSuccess = context.containsBean("dataSource");
        System.out.println("initSuccess : " + initSuccess);
        
        JobLauncher jobLauncher = (JobLauncher) context.getBean("jobLauncher");
        Job job = (Job) context.getBean("collectionJob");

        String startTime = "2018-03-17 00:00:00";
        String endTime = "2018-03-18 00:00:00";
        String contactFile = "/cvs/20180317/phone_list_20180317.csv";
        String callLogFile = "/cvs/20180317/call_log_20180317.csv";
        String locationFile = "/cvs/20180317/location_list_20180317.csv";
        String appFile = "/cvs/20180317/app_list_20180317.csv";
        
        try {

            JobParameters param = new JobParametersBuilder()
                    .addString("tag", "loanacct_tag")
                    .addString("startTime", startTime)
                    .addString("endTime", endTime)
                    
                    .addString("contactFile", contactFile)
                    .addString("callLogFile", callLogFile)
                    .addString("locationFile", locationFile)
                    .addString("appFile", appFile)
                    
                    .toJobParameters();
            JobExecution execution = jobLauncher.run(job, param);
            System.out.println("Exit Status : " + execution.getStatus());

        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("Done");
        
        startTime = "2018-03-18 00:00:00";
        endTime = "2018-03-19 00:00:00";
        contactFile = "/cvs/20180318/phone_list_20180318.csv";
        callLogFile = "/cvs/20180318/call_log_20180318.csv";
        locationFile = "/cvs/20180318/location_list_20180318.csv";
        appFile = "/cvs/20180318/app_list_20180318.csv";
        
        try {

            JobParameters param = new JobParametersBuilder()
                    .addString("tag", "loanacct_tag")
                    .addString("startTime", startTime)
                    .addString("endTime", endTime)
                    
                    .addString("contactFile", contactFile)
                    .addString("callLogFile", callLogFile)
                    .addString("locationFile", locationFile)
                    .addString("appFile", appFile)
                    
                    .toJobParameters();
            JobExecution execution = jobLauncher.run(job, param);
            System.out.println("Exit Status : " + execution.getStatus());

        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("Done");
        
    }
    
    /*
    public static void main( String[] args ){

        String[] springConfig  = 
            {   "classpath*:spring/database/database.xml", 
                "classpath*:spring/batch/config/context.xml",
                "classpath*:spring/batch/jobs/job-multi-type-reader.xml" 
            };
        
        ApplicationContext context = 
                new ClassPathXmlApplicationContext(springConfig);
        boolean initSuccess = context.containsBean("dataSource");
        System.out.println("initSuccess : " + initSuccess);
        
        JobLauncher jobLauncher = (JobLauncher) context.getBean("jobLauncher");
        Job job = (Job) context.getBean("multiTypeSingleFileJob");

        try {

            JobParameters param = new JobParametersBuilder()
                    .addString("inputFilePath",
                            "/cvs/multitype/input.csv")
                    .addString("outputFilePathStudent",
                            "/cvs/multitype/student.txt")
                    .addString("outputFilePathGoods",
                            "/cvs/multitype/goods.csv")
                    .toJobParameters();
            JobExecution execution = jobLauncher.run(job, param);
            System.out.println("Exit Status : " + execution.getStatus());

        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("Done");
    }*/
    
    /*
    public static void main( String[] args ){

        String[] springConfig  = 
            {   "classpath*:spring/database/database.xml", 
                "classpath*:spring/batch/config/context.xml",
                "classpath*:spring/batch/jobs/job-multi-file-reader.xml" 
            };
        
        ApplicationContext context = 
                new ClassPathXmlApplicationContext(springConfig);
        boolean initSuccess = context.containsBean("dataSource");
        System.out.println("initSuccess : " + initSuccess);
        
        JobLauncher jobLauncher = (JobLauncher) context.getBean("jobLauncher");
        Job job = (Job) context.getBean("readMultiFileJob");

        try {

            JobParameters param = new JobParametersBuilder()
                    .toJobParameters();
            JobExecution execution = jobLauncher.run(job, param);
            System.out.println("Exit Status : " + execution.getStatus());

        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("Done");
    }*/


    /*
    public static void main( String[] args ){

        String[] springConfig  = 
            {   "classpath*:spring/database/database.xml", 
                "classpath*:spring/batch/config/context.xml",
                "classpath*:spring/batch/jobs/job-quartz.xml" 
            };
        
        try{
            ApplicationContext context = 
                    new ClassPathXmlApplicationContext(springConfig);
            boolean initSuccess = context.containsBean("dataSource");
            logger.info("initSuccess : " + initSuccess);
        }catch(Exception e){
            e.printStackTrace();
        }

    
    }*/
}
