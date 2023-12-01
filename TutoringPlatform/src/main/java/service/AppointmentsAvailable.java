package service;


public class AppointmentsAvailable {
	public String teacher = "";
	public String appointments[] = null;
	
	public AppointmentsAvailable() {
	}
	
	public AppointmentsAvailable(String teacher, String[] appointments) {
		this.teacher = teacher;
		this.appointments = appointments;
	}

	public String to_string() {
		String res = "Teacher: " + teacher;
		for (String app: appointments) {
			res += "\n\t"+app;
		}
		return res;
	}
	
	public String[] getAppointments() {
		return appointments;
	}

	public String getTeacher() {
		return teacher;
	}

	
}  
