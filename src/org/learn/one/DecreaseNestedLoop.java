package org.learn.one;
/*program
5 4 3 2 1
4 3 2 1
3 2 1
2 1
1
*/
public class DecreaseNestedLoop {
void d1() {
	
	for (int i = 5; i >= 1; i--)
	{
	   
	  for (int j =i; j >= 1; j--)
	   {
		   System.out.print(" " +j);
	   }
		System.out.println();
			
		}
	}
	public static void main(String[] args) {
		DecreaseNestedLoop decreaseNestedLoop= new DecreaseNestedLoop();
		decreaseNestedLoop.d1();

	}

}
