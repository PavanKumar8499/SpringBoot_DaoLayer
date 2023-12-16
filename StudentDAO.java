package com.SpringBootCsd.Layer.Dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.SpringBootCsd.Layer.Pojo.StudentPojo;

@Repository
public class StudentDAO {

	@Autowired
	SessionFactory sf;

	public String showStudentRecord(int id) {
		Session s = sf.openSession();
		StudentPojo sp = s.get(StudentPojo.class, id);
		return "show record " + sp;
	}

	public String addStudentRecord(StudentPojo add) {
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		s.save(add);
		t.commit();
		return "add record successfully";
	}

	public String deleteStudentRecord(int id) {
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		StudentPojo student = s.get(StudentPojo.class, id);
		if(student!=null) {
			s.delete(student);
			t.commit();
		}else{return id+" not found record ";}
		return "delete record sucessfuly " + student;
	}
}
