package com.cjc.curd.webapp.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cjc.curd.webapp.model.Student;
import com.cjc.curd.webapp.service.HomeServiceI;




@Controller
public class HomeController 
{
	@Autowired
	HomeServiceI hsi;
	
	@RequestMapping("/")
	public String Loginpage()
	{
		return "login";
	}
	
	@RequestMapping("/openpage")
	public String Login()
	{
		return "register";
	}
	
	@RequestMapping("/reg")
	public String register(Student s)
	{
		
		
		hsi.saveStudent(s);
		return "login";
	}
	
	@RequestMapping("/log")
	public String logincheck(@RequestParam("sname") String un, 
						@RequestParam("password") String pw , ModelMap m)
	{	
	List<Student> list	=hsi.logincheck(un, pw);
		m.addAttribute("data", list);
			//m.addAttribute("pw", list);
		return "success";
	}
	
	@RequestMapping("/delete")
	public String deletedata(@RequestParam("sid") int sid , Model m)
	{
	List<Student> ls=	hsi.deletdata(sid);
	m.addAttribute("data", ls);
		return "success";
		
	}
	
	@RequestMapping("/edit")
	public String updatedata(@RequestParam("sid") int id , Model m)
	{
			List<Student> ls	=	hsi.updatedate(id);
			return "success";
	}
}
