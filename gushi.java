package zifuchuan;
import java.util.*;
public class gushi {
 public static void main(String[] args) {
 //����һ������ �����ݷŵ������
	 String str =new String("������ɫ˼�����������󲻵������Ů���������������δʶ��������������һ��ѡ�ھ��������һЦ������������������ɫ������ԡ�������Ȫˮ��ϴ��֬�̶���������ʼ���³ж���ʱ���޻��ս�ҡܽ����ů�ȴ�����������ո���Ӵ˾������糯�л���������Ͼ���Ӵ���ҹרҹ�󹬼�����ǧ����ǧ�谮��һ�����ױ�ɽ���ҹ��¥�����ʹ���õ��ֽ���������������Ż��������¸�ĸ�Ĳ�����������Ů�깬�ߴ����������ַ�Ʈ�����Ż���������˿���վ�������������ܱ�Ķ����������������������س����̳���ǧ�����������д仪ҡҡ�и�ֹ�������Ű����������������κ���ת��ü��ǰ������ί�������մ��̽�ȸ��ɦͷ��������Ȳ��ûؿ�Ѫ��������ư�ɢ����������ջ�����ǽ������ɽ������������޹���ɫ����ˮ����ɽ��ʥ������ĺĺ���й���������ɫҹ�����峦����������ת����Ԧ���˳������ȥ" ); 
  int x=0;
  int y=7;
  int r=7;
  int s=14;
  int t;
  
  //����������� �ź�˳��
  String a[]=new String[52];
  //ѭ����ÿ��������Ϊһ��
  for(int i=0;i<52;i=i+2) 
  {
   a[i]=str.substring(x,y);
   t=i+1;
   //�����������Ӷ��ţ���ż�������Ӿ�ţ������С�
   a[t]=str.substring(r,s);
   System.out.print(a[i]+","+a[t]+"��"+"\n");      
      x=x+14;
      y=y+14;
      s=s+14;
      r=r+14;
   
      
      
    }
  
  
 }
 
	 
 
 public static void main1(String[] args)
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



	public void A(String str) {
		// TODO Auto-generated method stub
		
	}
 }

 
 