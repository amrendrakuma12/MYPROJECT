package nt.MavenProject;

/**
 * Hello world!
 *
 */
public class App 
{


	
	public int sum(int x,int y)
	{
		return x+y;
	}
    public static void main( String[] args )
    {
       App apps=new App();
       System.out.println("Sum"+apps.sum(10, 20));
    }
}
