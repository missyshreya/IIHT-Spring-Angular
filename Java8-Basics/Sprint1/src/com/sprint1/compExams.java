package com.sprint1;

public class compExams {
	//declaring the properties of the competitive xams we have
	String course_name, course_teacher;
	Integer course_id, course_duration, total_fees;
	
	//constructor to get the data
	public compExams(int course_id, String course_name, String course_teacher, int course_duration, int total_fees) {
		this.course_id=course_id;
		this.course_name=course_name;
		this.course_teacher=course_teacher;
		this.course_duration=course_duration;
		this.total_fees=total_fees;
	}
	
	//getter and setter methods
	public Integer get_course_id(){
		return course_id;
	}
	
	public void set_course_id(Integer course_id) {
		this.course_id=course_id;
	}
	
	public String get_course_name(){
		return course_name;
	}
	
	public void set_course_name(String course_name) {
		this.course_name=course_name;
	}
	
	public String get_course_teacher(){
		return course_teacher;
	}
	
	public void set_course_teacher(String course_teacher) {
		this.course_teacher=course_teacher;
	}
	
	public Integer get_course_duration(){
		return course_duration;
	}
	
	public void set_course_duration(Integer course_duration) {
		this.course_duration=course_duration;
	}
	
	public Integer get_total_fees(){
		return total_fees;
	}
	
	public void set_total_fees(Integer total_fees) {
		this.total_fees=total_fees;
	}
	
	@Override
	public String toString() {
		return "Course ID:"+course_id+", Course Name: "+course_name+", Course Teacher:"+course_teacher+", Course Duration: "+course_duration+", Total Fees: "+total_fees+" ";
	}
	
	
}