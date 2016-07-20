package myspring;

import javax.validation.constraints.Size;

public class Student {
	@Size(min=1, max=3,message="Invalid id")
	private String student_id;
	@Size(min=3, max=20)
	private String student_name;
	@Size(min=3, max=20)
	private String student_msg;
	
		public String getStudent_id() {
		return student_id;
	}
	public void setStudent_id(String student_id) {
		this.student_id = student_id;
	}
	public String getStudent_name() {
		return student_name;
	}
	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}
	public String getStudent_msg() {
		return student_msg;
	}
	public void setStudent_msg(String student_msg) {
		this.student_msg = student_msg;
	}
	

}
