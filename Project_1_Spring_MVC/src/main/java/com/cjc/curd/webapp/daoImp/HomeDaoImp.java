package com.cjc.curd.webapp.daoImp;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cjc.curd.webapp.daoI.HomeDeoI;
import com.cjc.curd.webapp.model.Student;
import jakarta.persistence.Query;

import java.util.List;

import org.hibernate.*;

@Repository
public class HomeDaoImp implements HomeDeoI{
	@Autowired
	
	SessionFactory sf;
	
	@Override
	
	public void saveStudent(Student s) 
	{
		System.out.println("In Home Servicsdeo");
		
			Session session = sf.openSession();
			session.save(s);
			session.beginTransaction().commit();
			
			System.out.println("out deo");
		
	}

	@Override
	public List<Student> logincheck(String un, String pw) 
	{
		Session session=sf.openSession();
		if(un.equalsIgnoreCase("Admin") && pw.equalsIgnoreCase("Admin"))
		{
			List<Student> ls=session.createQuery("from Student").getResultList();
			return ls;
		}
		else {
			Query q=session.createQuery("from Student where sname=?1 and password=?2");
			q.setParameter(1, un);
			q.setParameter(2, pw);
		     List<Student> ls =	q.getResultList();
		     return ls;
		}
		
	}

	@Override
	public List<Student> deletdata(int sid) {
		
					Session session =sf.openSession();
					Query query=session.createQuery("delete from Student Where sid=?1");
					query.setParameter(1, sid);
					Transaction tx =session.beginTransaction();
					query.executeUpdate();
					tx.commit();
					
					List<Student> ls= session.createQuery("from Student").getResultList();
					
		
		return ls;
	}

	@Override
	public List<Student> updatedate(int id) 
	{
		Session session =sf.openSession();
		Query query=session.createQuery("update Student set sname='vishal' Where id=?1 ");
		query.setParameter(1, id);
		Transaction tx =session.beginTransaction();
		query.executeUpdate();
		tx.commit();
		
		List<Student> ls= session.createQuery("from Student").getResultList();
		
		return 	ls;
	}

}
