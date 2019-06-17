package com.diaoruifeng.common.entiy;

import java.util.Date;
/**
 * 
 * @ClassName: Person 
 * @Description: person类 用于测试
 * @author: 拉了拉啦啦
 * @date: 2019年6月17日 上午9:17:10
 */
public class Person {
	private String name;
	private int age;
	private String about;
	private Date created;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAbout() {
		return about;
	}
	public void setAbout(String about) {
		this.about = about;
	}
	public Date getCreated() {
		return created;
	}
	public void setCreated(Date created) {
		this.created = created;
	}
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Person(String name, int age, String about, Date created) {
		super();
		this.name = name;
		this.age = age;
		this.about = about;
		this.created = created;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", about=" + about + ", created=" + created + "]";
	}
	
	
}
