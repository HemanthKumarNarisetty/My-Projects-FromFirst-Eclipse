
package strings;

public class P16 {
	/**
	 * Duplicate characters in a string 
	 * @param args
	 */

	public static void main(String[] args) {

		String str="mango is a fruit";
		char[] ch=str.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			boolean done=false;
			for(int j=0;j<i;j++)
			{
				if(ch[i]==ch[j])
				{
					done=true;
					break;
				}
			}
			if(!done)
			{
				for(int j=i+1;j<ch.length;j++)
				{
					if(ch[i]==ch[j])
					{
						System.out.println(ch[i]);
					}
				}
			}
		}
		
	}

}
