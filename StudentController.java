package com.SpringBootCsd.Layer.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.SpringBootCsd.Layer.Pojo.StudentPojo;
import com.SpringBootCsd.Layer.Service.StudentService;

@Controller
@RequestMapping("/crud")
public class StudentController {

	@Autowired
	StudentService sr;
	
	@GetMapping("/show/{id}")
	@ResponseBody
	public String showrecord(@PathVariable int id) {
		return sr.show(id);
	}
	@PostMapping("/add")
	@ResponseBody
	public String postrecord(@RequestBody StudentPojo student) {
		return sr.add(student);
	}
	@DeleteMapping("/delete/{id}")
	@ResponseBody
	public String deleterecord(@PathVariable int id) {
		return sr.delete(id);
	}
}
