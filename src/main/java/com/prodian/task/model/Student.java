package com.prodian.task.model;

 
import java.sql.Date;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.Data;

@Entity
@Table(name="student_second_table")
@Data
public class Student {


	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private long id;
	
	@Column(name="name")
	private String name;

	@Column(name="age")
	private int age;

	@Column(name="date_of_birth")
	private Date dob;

	@Column(name="joining_date")
	private Date jd;

	@Column(name="student_id")
	private String studentId;

	@CreationTimestamp
	@Column(name="created_at",nullable=false,updatable=false)
	private Timestamp createdAt;
	
	@UpdateTimestamp
	@Column(name="updated_at")
	private Timestamp updatedAt;
	
	
	
}
