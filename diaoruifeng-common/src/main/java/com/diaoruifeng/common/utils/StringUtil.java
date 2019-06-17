package com.diaoruifeng.common.utils;

import java.util.Random;
import java.util.Set;

/**
 * 
 * @ClassName: StringUtil 
 * @Description:字符串工具类及方法
 * @author: 拉了拉啦啦
 * @date: 2019年6月17日 上午9:25:47
 */
public class StringUtil {
	//方法1：判断源字符串是否有值，空引号(空白字符串)也算没值
	public static boolean hasLength(String src){
		return null!=src&&src.length()>0;
	//TODO 实现代码
	}
	//方法2：判断源字符串是否有值，空引号(空白字符串)和空格也算没值
	public static boolean hasText(String src){
		return null!=src&&src.trim().length()>0;
	//TODO 实现代码
	}
	//方法3：返回参数length个中文汉字字符串，字符集必须在GB2312(相当于中文简体)范围内
	public static String randomChineseString(int length){
		Random r= new Random();
		int SS=r.nextInt(40869-19960+1)+19960;
		
		return r.toString();
	//TODO 实现代码
	}
	//方法4：返回中文姓名，必须以真实姓开头，百家姓在“六、附百家姓”里，名使用1-2个随机汉字，内部调用randomChineseString()方法d
	public static String generateChineseName(){
		return null;
	//TODO 实现代码
	}
}
