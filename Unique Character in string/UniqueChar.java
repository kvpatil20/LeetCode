
public class UniqueChara {
	
	public boolean isUnique(String s)
	{
		char ch[] = s.toCharArray();
		int checker = 0;
		for(int i = 0;i<ch.length;i++)
		{
			int val = (int)s.charAt(i)-(int)('a');
			 if ((checker & (1 << val)) > 0) return false;
			 checker |= (1 << val);
		}
		return true;
	}
	
	public static void main(String args[])
	{
		String s="abcdd";
		UniqueChara obj = new UniqueChara();
		System.out.println(obj.isUnique(s));
	}

}
