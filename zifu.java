package zifuchuan;

import java.util.*;
public class zifu 
{
		 public static void main(String[] args)
		 {
			 Scanner hn =new Scanner(System.in);
			 System.out.println("������Ҫ��ѯ��ʫ�䣺");
			 String str=hn.nextLine();
			 STR(str);
		 }
			    

			private static void STR(String str) {
				// TODO Auto-generated method stub
				String str1 = "��";
				int d = 0;
				for(int j =0;j<str.length();j++)
				{
					if(str.charAt(j)=='��')
					{
						d++;
					}
				}
			 System.out.println("�ַ����� �� ������"+d+"��");
		 }


			public void T(String str, String string) {
				// TODO Auto-generated method stub
				
			}
	}