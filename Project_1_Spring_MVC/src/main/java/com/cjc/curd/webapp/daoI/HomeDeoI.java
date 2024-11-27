package com.cjc.curd.webapp.daoI;

import java.util.List;

import com.cjc.curd.webapp.model.Student;

public interface HomeDeoI 
{
	public void saveStudent(Student s);
	
	public List<Student> logincheck(String un, String pw);
	
	public List<Student> deletdata(int sid);
	
	public List<Student> updatedate(int id);
}
