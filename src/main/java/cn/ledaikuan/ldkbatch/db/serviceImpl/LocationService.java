package cn.ledaikuan.ldkbatch.db.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.ledaikuan.ldkbatch.db.daoImpl.LocationDaoImpl;
import cn.ledaikuan.ldkbatch.db.entity.Location;


@Service
public class LocationService {

    //注入UserDaoImpl
    @Autowired
    private LocationDaoImpl locationDaoImpl;
    
    
    public List<Location> findAllLocationByCustomerId(String customerId){
        if(customerId ==null)return null;
        return locationDaoImpl.findAllByCostomerId(Location.class, customerId);
    }
}
