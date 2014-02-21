/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.house.service;


public interface HouseInterface {
    
    public boolean lightsOn();
    public boolean lightsOff();
    public int      doors(int door);
    public float   area(float width,float breadth);
    public String  owners();
    public void     alarm(); //for timeout
    public String  houseType();
    public String  family();
   
}
