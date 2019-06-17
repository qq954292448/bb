package com.diaoruifeng.common.test;


import java.util.Date;

import org.junit.Test;

import com.diaoruifeng.common.entiy.Person;
import com.diaoruifeng.common.utils.RandomUtil;
import com.diaoruifeng.common.utils.StringUtil;
/**
 * 
 * @ClassName: PersonTest 
 * @Description: person测试类 测试一万个person对象
 * @author: 拉了拉啦啦
 * @date: 2019年6月17日 上午9:17:36
 */
public class PersonTest {
	/**
	 * 
	 * @Title: test 
	 * @Description: 批量生成1万个
	 * @return: void
	 */
	@Test
	public void test() {
		for (int i = 0; i < 10000; i++) {
			Person per = new Person(StringUtil.generateChineseName(), 
					RandomUtil.random(1,120), StringUtil.randomChineseString(140)
				, new Date());
			System.out.print(i+1);
			System.out.println(per);
		}
	
	}

}
