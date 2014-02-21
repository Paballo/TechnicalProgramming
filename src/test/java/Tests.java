/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.mycompany.house.config.AppConfig;
import com.mycompany.house.service.HouseInterface;
import junit.framework.Assert;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.testng.annotations.Test;


public class Tests {
    
      public static HouseInterface house;
    public static ApplicationContext ctx;
    
    public Tests() {
    }
        
    @Test
    public void testSame()
    {
        
        Assert.assertSame("Mansion", "Mansion");
    }
    
    public void testNotSame()
    {
        Assert.assertNotSame("Mansion", "mansion");
    }
    
     @Test
     public void testArea(){
         
         float area = house.area(5,5);
         Assert.assertEquals(25, area, 24.5);
     
     }
     
     


     @Test
     public void testObject() {
         
        String surname  = "Green";
        String race     = "mixed";
        String religion = "catholic";
        
         String famie = (surname+race+religion);
         
         Assert.assertEquals(famie, house.family());
     
     }
      @Test(timeOut=6)
    public void testTimeOut() {
    
        house.alarm();
        
       
        
    }
    
     @Test
     public void testTrue() {
         
         
        Assert.assertEquals(true, house.lightsOn());
    }
      @Test
     public void testFalse() {
         
         Assert.assertEquals(false, house.lightsOff());
     }
     @Test
    public void testInteger() 
    {
        Assert.assertEquals(2, house.doors(1));
    }
      @Test
    public void houseType() {
    
        String houseT[] = {"mansion","apartment"};
        
         
        
        Assert.assertEquals(houseT[1], house.houseType());
    }


    @org.testng.annotations.BeforeClass
    public static void setUpClass() throws Exception {
          ctx = new AnnotationConfigApplicationContext(AppConfig.class);
         house =(HouseInterface)ctx.getBean("area");
    }

    @org.testng.annotations.AfterClass
    public static void tearDownClass() throws Exception {
    }

    @org.testng.annotations.BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @org.testng.annotations.AfterMethod
    public void tearDownMethod() throws Exception {
    }
}
