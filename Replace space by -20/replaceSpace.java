
public class ReplaceSpace {
	
	public String replaceSpace(String s)
	{
		int count=0;
		if(s.isEmpty())
			return null;
		
		else
		{
			for(int i = 0;i<s.length();i++)
			{
				if(s.charAt(i)==' ')
				{
					count++;
				}
				System.out.println(count);
				
			}
			if(count==0)
				return s;
			else
			{
				int newlength = s.length()+(count*2);
				char[] ch=new char[newlength];
				ch[newlength-1]='\0';
				for(int i = s.length()-1;i>=0;i--)
				{
					if(s.charAt(i)==' ')
					{
						ch[newlength-1]='0';
						ch[newlength-2]='2';
						ch[newlength-3]='%';
						newlength=newlength-3;
					}
					else
					{
						ch[newlength-1] = s.charAt(i);
						newlength--;
					}
				}
				String result = new String(ch);
				return result;
			}
		}
		
	}

	
	public static void main(String args[])
	{
		String s="This is an example String";
		UniqueChara obj = new UniqueChara();
		System.out.println(obj.replaceSpace(s));
	}

}
