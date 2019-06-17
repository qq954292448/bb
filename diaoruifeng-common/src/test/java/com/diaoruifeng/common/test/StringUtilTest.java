package com.diaoruifeng.common.test;


import org.junit.Test;

import com.diaoruifeng.common.utils.StringUtil;
/**
 * 
 * @ClassName: StringUtilTest 
 * @Description: 测试字符串工具类及方法
 * @author: 拉了拉啦啦
 * @date: 2019年6月17日 上午9:24:38
 */
public class StringUtilTest {
	/**
	 * 
	 * @Title: test 
	 * @Description: 判断源字符串是否有值，空引号(空白字符串)也算没值
	 * @return: void
	 */
	@Test
	public void test() {
		System.out.println(StringUtil.hasLength(""));
		System.out.println(StringUtil.hasLength(" "));
		System.out.println(StringUtil.hasLength("ccc"));
	}
	/**
	 * 
	 * @Title: test1 
	 * @Description: 判断源字符串是否有值，空引号(空白字符串)和空格也算没值
	 * @return: void
	 */
	@Test
	public void test1() {
		System.out.println(StringUtil.hasText(""));
		System.out.println(StringUtil.hasText(" "));
		System.out.println(StringUtil.hasText("ccc"));
	}
	/**
	 * 
	 * @Title: test2 
	 * @Description: 返回参数length个中文汉字字符串，字符集必须在GB2312(相当于中文简体)范围内
	 * @return: void
	 */
	@Test
	public void test2() {
		System.out.println(StringUtil.randomChineseString(3));
	}
	
}
