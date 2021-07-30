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
public class myCircleTestClass {
    
    public myCircleTestClass() {
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
    public void myCircleTest1()
    {
    Circle myCircle = new Circle(2);
    double actualR=myCircle.draw();
    double expectedR=12.56;

    assertEquals(actualR,expectedR,2);
    }
    @Test
    public void myCircleTest2()
    {
    Circle myCircle = new Circle(4.0);
    double actualR=myCircle.draw();
    double expectedR=50.26;

    assertEquals(actualR,expectedR,2);
    }
    @Test
    public void myCircleTest3()
    {
    Circle myCircle = new Circle(-2);
    double actualR=myCircle.draw();
    double expectedR=0;

    assertEquals(actualR,expectedR,2);
    }
    
    
}
