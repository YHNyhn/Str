package zifuchuan;

import java.util.*;
public class zifu 
{
		 public static void main(String[] args)
		 {
			 Scanner hn =new Scanner(System.in);
			 System.out.println("请输入要查询的诗句：");
			 String str=hn.nextLine();
			 STR(str);
		 }
			    

			private static void STR(String str) {
				// TODO Auto-generated method stub
				String str1 = "不";
				int d = 0;
				for(int j =0;j<str.length();j++)
				{
					if(str.charAt(j)=='不')
					{
						d++;
					}
				}
			 System.out.println("字符串中 不 共出现"+d+"次");
		 }


			public void T(String str, String string) {
				// TODO Auto-generated method stub
				
			}
	}