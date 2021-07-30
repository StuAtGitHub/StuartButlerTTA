/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author rach2
 */
public class myRectangleTestClass {
    
    public myRectangleTestClass() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    @Test
    public void myRectTest1()
    {
        Rectangle myRect=new Rectangle(2,4);
        double actualR=myRect.draw();
        double expectedR=8;
        
        assertEquals(actualR,expectedR,2);
    }
    
   @Test
    public void myRectTest2()
    {
        Rectangle myRect=new Rectangle(1.0,4.0);
        double actualR=myRect.draw();
        double expectedR=4;
        
        assertEquals(actualR,expectedR,2);
    }
    
    @Test
    public void myRectTest3()
    {
        Rectangle myRect=new Rectangle(-1,5);
        double actualR=myRect.draw();
        double expectedR=0;
        
        assertEquals(actualR,expectedR,2);
    }
     
    
    
}
