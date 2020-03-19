package com.epam.TDDJunitTask;

public class DeletingAs {
	public static String del(String string)
	{
		int strlen=string.length();
		String result="";
		if(strlen>=1)
		{
			if(string.charAt(0)!='A')
				result=string;
			if(string.charAt(0)=='A') {
				if(strlen>2)
					result=string.substring(1);
			}
			if(strlen>=2&&string.charAt(0)=='A'&& string.charAt(1)=='A')
				result=string.substring(2);
			if(string.charAt(0)!='A'&&string.charAt(1)=='A')
				result=string.substring(0,1)+string.substring(2);
				
		}
		return result;
	}

}
