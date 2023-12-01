package service;

public class StudentWaitingList {
	
	private String subject = "";
	private String[] teachers = null;
	
	public StudentWaitingList() {
		this.subject = "";
		this.teachers = new String[1];
	}
	
	public StudentWaitingList(String subject, String[] teachers) {
		super();
		this.subject = subject;
		this.teachers = teachers;
	}

	public String getSubject() {
		return subject;
	}

	public String[] getTeachers() {
		return teachers;
	}
	
	
	
	

}
