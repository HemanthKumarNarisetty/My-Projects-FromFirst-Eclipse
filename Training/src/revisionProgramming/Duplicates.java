package revisionProgramming;

public class Duplicates {

	public static void main(String[] args) {
		
		
		String str="hemanth kumar";
		String str1="";
		char [] ch=str.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			boolean done=false;
			for(int j=0;j<i;j++)
			{
				if(ch[i]==ch[j])
				{
					done =true;
					break;
				}
			}
			if(!done)
			{
				str1=str1+ch[i];
			}
			
		}
		System.out.println(str1);
		
	}

}
