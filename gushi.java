package zifuchuan;
import java.util.*;
public class gushi {
 public static void main(String[] args) {
 //定义一个数组 将内容放到数组里。
	 String str =new String("汉皇重色思倾国御宇多年求不得杨家有女初长成养在深闺人未识天生丽质难自弃一朝选在君王侧回眸一笑百媚生六宫粉黛无颜色春寒赐浴华清池温泉水滑洗凝脂侍儿扶起娇无力始是新承恩泽时云鬓花颜金步摇芙蓉帐暖度春宵春宵苦短日高起从此君王不早朝承欢侍宴无闲暇春从春游夜专夜后宫佳丽三千人三千宠爱在一身金屋妆成娇侍夜玉楼宴罢醉和春姊妹弟兄皆列土可怜光彩生门户遂令天下父母心不重生男重生女骊宫高处入青云仙乐风飘处处闻缓歌慢舞凝丝竹尽日君王看不足渔阳鼙鼓动地来惊破霓裳羽衣曲九重城阙烟尘生千乘万骑西南行翠华摇摇行复止西出都门百余里六军不发无奈何宛转蛾眉马前死花钿委地无人收翠翘金雀玉搔头君王掩面救不得回看血泪相和流黄埃散漫风萧索云栈萦纡登剑阁峨嵋山下少人行旌旗无光日色薄蜀江水碧蜀山青圣主朝朝暮暮情行宫见月伤心色夜雨闻铃肠断声天旋地转回龙驭到此踌躇不能去" ); 
  int x=0;
  int y=7;
  int r=7;
  int s=14;
  int t;
  
  //定义数组个数 排好顺序
  String a[]=new String[52];
  //循环，每两个数组为一行
  for(int i=0;i<52;i=i+2) 
  {
   a[i]=str.substring(x,y);
   t=i+1;
   //在奇数数组后加逗号，在偶数数组后加句号，并换行。
   a[t]=str.substring(r,s);
   System.out.print(a[i]+","+a[t]+"。"+"\n");      
      x=x+14;
      y=y+14;
      s=s+14;
      r=r+14;
   
      
      
    }
  
  
 }
 
	 
 
 public static void main1(String[] args)
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



	public void A(String str) {
		// TODO Auto-generated method stub
		
	}
 }

 
 