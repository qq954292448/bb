package com.diaoruifeng.common.test;


import org.junit.Test;

import com.diaoruifeng.common.utils.RandomUtil;
/**
 * 
 * @ClassName: RandomUtilTest 
 * @Description: 测试随机数工具类方法
 * @author: 拉了拉啦啦
 * @date: 2019年6月17日 上午9:26:12
 */
public class RandomUtilTest {
	/**
	 * 
	 * @Title: random 
	 * @Description: 返回min-max之间的随机整数（包含min和max值）
	 * @return: void
	 */
	@Test
	public void random() {
		
		for (int i = 0; i <=10; i++) {
			System.out.println(RandomUtil.random(1, 3));
		}
	}
	/**
	 * 
	 * @Title: random2 
	 * @Description: ：在最小值min与最大值max之间截取subs个不重复的随机数
	 * @return: void
	 */
	@Test
	public void random2() {
		
		for (int i = 0; i <=10; i++) {
			System.out.println(RandomUtil.subRandom(1, 10,3));
		}
	}
	/**
	 * 
	 * @Title: random3 
	 * @Description: 返回1个1-9,a-Z之间的随机字符
	 * @return: void
	 */
	@Test
	public void random3() {
		
		for (int i = 0; i <=10; i++) {
			System.out.println(RandomUtil.randomCharacter());
		}
	}
	/**
	 * 
	 * @Title: random4 
	 * @Description: 返回参数length个字符串，方法内部要调用randomCharacter()方法 
	 * @return: void
	 */
	@Test
	public void random4() {
		
		for (int i = 0; i <=10; i++) {
			System.out.println(RandomUtil.randomString(4));
		}
	}


}
