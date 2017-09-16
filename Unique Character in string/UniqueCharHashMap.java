import java.util.HashMap;

public class UniqueChara {
	
	public boolean isUnique(String s)
	{
		HashMap<Integer, Character> map = new HashMap<>();
      	for(int i = 0; i<s.length();i++)
      	{
                     	char ch = s.charAt(i);
                     	if(map.containsValue(ch))
                     	return false;
                     	else
                     	map.put(1,ch);
      	}         	
      	return true;
	}
	
	public static void main(String args[])
	{
		String s="abcd";
		UniqueChara obj = new UniqueChara();
		System.out.println(obj.isUnique(s));
	}

}
