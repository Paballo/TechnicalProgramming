/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.house.service;

public class HouseImpl implements HouseInterface {
    

    @Override
    public boolean lightsOn() {
        
      boolean on = true;
      
        return on;
       
    }

    @Override
    public boolean lightsOff() {
        boolean off = false;
        return off;
        
    }

    @Override
    public int doors(int door) {
        door = 1;
        
        door++;
        return door;
        
    }

    @Override
    public float area(float width, float breadth) {
        
       float area = breadth * width;
        
        return area;
    }

    @Override
    public String owners() {
        
       
        
            return null;
        
    }

    @Override
    public void alarm() {
        
        System.out.println("Beep Beep Beep Beep Alarm On");
        
    }

    @Override
    public String houseType() {
        
        String house[] = {"mansion","apartment"};
        
        return house[1];
        
    }

    @Override
    public String family() {
        
        String surname  = "Green";
        String race     = "mixed";
        String religion = "catholic";
        
         String fam = (surname+race+religion);
         
         return fam;
    }
    
}
