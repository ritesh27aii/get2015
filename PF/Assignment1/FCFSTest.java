import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class FCFSTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		FCFSClass obj = new FCFSClass();
		int[][] expected={{1,1,0,1,12},{2,5,8,13,19},{3,9,11,20,21},{4,25,0,25,29}};
		FCFSTest obj1 = new FCFSTest();
		
		int[][] actual = obj.FCFS(new int[]{1, 5, 9, 25},new int []{12,7,2,5});
		
		int flag=obj1.isArrayEqual(expected,actual);
		
		assertEquals(1, flag);
	}
	public int isArrayEqual(int expected[][], int actual[][])
	{
		int flag=1;
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<5;j++)
			{
				if(expected[i][j]!=actual[i][j])
				{
					flag=0;
				}
			}
		}
		return flag;
	}


}
