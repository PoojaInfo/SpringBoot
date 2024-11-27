package com.cjc.curd.webapp.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.curd.webapp.daoI.HomeDeoI;
import com.cjc.curd.webapp.model.Student;
import com.cjc.curd.webapp.service.HomeServiceI;
@Service
public class HomeServiceImpl implements HomeServiceI{
	@Autowired
	HomeDeoI hdi;
	@Override
	public void saveStudent(Student s) 
	{
		System.out.println("in Service");
		hdi.saveStudent(s);
	
		
	}
	@Override
	public List<Student> logincheck(String un, String pw) {
		
		return hdi.logincheck(un, pw);
	}
	@Override
	public List<Student> deletdata(int sid) {
		
		return hdi.deletdata(sid);
	}
	@Override
	public List<Student> updatedate(int id) {
		
		
		return hdi.updatedate(id);
	}
	
	
	
}
