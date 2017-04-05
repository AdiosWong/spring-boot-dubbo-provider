package com.xinqing.dubbo.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.xinqing.dubbo.domain.City;
import com.xinqing.dubbo.service.CityService;

@Service(version = "1.0")
public class CityServiceImpl implements CityService {
	
    @Override
    public City findCityByName(String cityname) {
        return new City(1L,2L,"重庆","是我的故乡");
    }
    
}

