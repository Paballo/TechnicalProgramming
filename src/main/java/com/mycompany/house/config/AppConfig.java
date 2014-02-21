/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.house.config;

import com.mycompany.house.service.HouseImpl;
import com.mycompany.house.service.HouseInterface;
import org.springframework.context.annotation.Bean;

public class AppConfig {
    
    @Bean(name="lightsOn")
    public HouseInterface ligthsOn()
    {
        return new HouseImpl();
    }
    
    @Bean(name="lightsOff")
    public HouseInterface lightsOff()
    {
        return new HouseImpl();
    }
    
    @Bean(name="doors")
    public HouseInterface doors()
    {
        return new HouseImpl();
    }
    @Bean(name="area")
    public HouseInterface area()
    {
        return new HouseImpl();
    }
    @Bean(name="owners")
    public HouseInterface owners()
    {
        return new HouseImpl();
    }
    @Bean(name="alarm")
    public HouseInterface alarm()
    {
        return new HouseImpl();
    }
    @Bean(name="houseType")
    public HouseInterface houseType()
    {
        return new HouseImpl();
    }
    @Bean(name="family")
    public HouseInterface family()
    {
        return new HouseImpl();
    }
   // @Bean(name=)
    
   // @Bean(name=)
    
}
