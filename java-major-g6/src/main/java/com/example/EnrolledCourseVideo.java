package com.example;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class EnrolledCourseVideo {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int ecvId;
	private int timeSeen;
	private boolean completed;
}
