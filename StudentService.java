package com.SpringBootCsd.Layer.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SpringBootCsd.Layer.Dao.StudentDAO;
import com.SpringBootCsd.Layer.Pojo.StudentPojo;

@Service
public class StudentService {

	@Autowired
	StudentDAO sd ;
	
	public String show(int id) {
		
		return sd.showStudentRecord(id);
	}
	public String add(StudentPojo student) {
		
		return sd.addStudentRecord(student);
	}
	public String delete(int id) {
		
		return sd.deleteStudentRecord(id);
	}
	
	
}
