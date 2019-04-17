package com.sms.model;

/**
 * 学生表的实体对象
 * @author hp
 *
 */
public class StudentInfo {
	
	private long id;
	
	private long classInfoId;
	
	private String name;
	
	private int age;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getClassInfoId() {
		return classInfoId;
	}

	public void setClassInfoId(long classInfoId) {
		this.classInfoId = classInfoId;
	}

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
	
}
