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


public class myComStrTestClass {
    
    public myComStrTestClass() {
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
    public void myComTest1()
    {
    
        String Str1="1";
        String Str2="0";
        String expectR="10";
        
        ComStr myComStr = new ComStr();
        String actualR=myComStr.combine(Str1, Str2);
        
        assertEquals(actualR,expectR);
        
    }
    @Test
    public void myComTest2()
    {
    
        String Str1="hi";
        String Str2="bye";
        String expectR="hibye";
        
        ComStr myComStr = new ComStr();
        String actualR=myComStr.combine(Str1, Str2);
        
        assertEquals(actualR,expectR);
        
    }
    @Test
    public void myComTest3()
    {
    
        String Str1="10";
        String Str2="number";
        String expectR="10number";
        
        ComStr myComStr = new ComStr();
        String actualR=myComStr.combine(Str1, Str2);
        
        assertEquals(actualR,expectR);
        
    }
    @Test
    public void myComTest4()
    {
    
        String Str1="age";
        String Str2="29";
        String expectR="age29";
        
        ComStr myComStr = new ComStr();
        String actualR=myComStr.combine(Str1, Str2);
        
        assertEquals(actualR,expectR);
        
    }
    
}
