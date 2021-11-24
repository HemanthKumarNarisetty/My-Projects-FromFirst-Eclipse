package revisionProgramming;

public class SwapACharacter {

	public static void main(String[] args) {

		String str="hemanth";
		char [] ch=str.toCharArray();
		String str1="";
		for(int i=0;i<ch.length-1;i++)
		{
			for(int j=i;j<i+1;j++)
			{
				char temp=ch[j];
				ch[j]=ch[j+1];
				ch[j+1]=temp;
			}
			for(int j=0;j<ch.length;j++)
			{
				System.out.print(ch[j]);
			}
			System.out.println();
		}
	}

}
