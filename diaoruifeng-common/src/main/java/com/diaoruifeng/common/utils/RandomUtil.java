package com.diaoruifeng.common.utils;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;
/**
 * 
 * @ClassName: RandomUtil 
 * @Description: 随机数工具类
 * @author: 拉了拉啦啦
 * @date: 2019年6月17日 上午9:26:39
 */
public class RandomUtil {
	//方法1：返回min-max之间的随机整数（包含min和max值）
	public static int random(int min, int max){
		Random r= new Random();
		return r.nextInt(max-min+1)+min;
	}
	//方法2：在最小值min与最大值max之间截取subs个不重复的随机数。
	public static Set<Integer> subRandom (int min, int max, int subs){
		Set<Integer> set = new HashSet<Integer>();
		while (set.size()!=subs) {
			Random r= new Random();
			set.add(r.nextInt(max-min+1)+min);
		}
		return set;
	}
	//方法3：返回1个1-9,a-Z之间的随机字符。
	public static String randomCharacter (){
		String str ="123456789qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM";
		Random r= new Random();
		char index=(char)random(0,str.length()-1);
		return str.charAt(index)+"";
	}
	//方法4：返回参数length个字符串，方法内部要调用randomCharacter()方法 
	public static String randomString(int length){
		String str ="123456789qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM";
		String s="";
		for (int i = 0; i <length; i++) {
			
			Random r= new Random();
			s+=randomCharacter();
		}
		return s;
	}

}
