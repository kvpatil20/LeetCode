import java.util.HashMap;

public class UniqueChara {
	
	public String isUnique(String s)
	{
		if(s.isEmpty())
			return null;
		else
		{
		
			for(int i =0;i<s.length()-1;i++)
			{
				for(int j = i+1;j<s.length();j++)
				{
					char ch1 = s.charAt(i);
					char ch2 = s.charAt(j);
					if(ch1==ch2)
					{
						s=s.replaceFirst(Character.toString(ch2),"");
						if(i>0)i--;
						j--;
					}
				}
			}
			return s;
		}
		
	}

	
	public static void main(String args[])
	{
		String s="aaabbb";
		UniqueChara obj = new UniqueChara();
		System.out.println(obj.isUnique(s));
	}

}
