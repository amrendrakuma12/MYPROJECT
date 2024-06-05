package nt.MavenProject;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;


public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void addPositve()
    {
    	int a=10;
    	int b=20;
    	int expected=30;
    	App app=new App();
    	int actual=app.sum(a, b);
        assertEquals(expected, actual);
    }
    @Test
    public void addnegative()
    {
    	int a=-10;
    	int b=-20;
    	int expected=-30;
    	App app=new App();
    	int actual=app.sum(a, b);
        assertEquals(expected, actual);
    }
    @Test
    public void addMixed()
    {
    	int a=10;
    	int b=-20;
    	int expected=-10;
    	App app=new App();
    	int actual=app.sum(a, b);
        assertEquals(expected, actual);
    }
}
