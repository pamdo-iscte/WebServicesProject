package client;

import java.rmi.RemoteException; 
import java.util.Scanner;
import javax.xml.rpc.ServiceException;

import service.AppointmentsAvailable;
import service.GustaveTutorService;
import service.GustaveTutorServiceServiceLocator;
import service.GustaveTutorServiceSoapBindingStub;




public class StudentClient {
	
	public static void main(String[] args) throws ServiceException, RemoteException {
		Scanner scanner = new Scanner(System.in);
        while (true) {
        	System.out.println("Enter the student name: \n");
            String name = scanner.nextLine();
            
            GustaveTutorService service = new GustaveTutorServiceServiceLocator().getGustaveTutorService();
            ((GustaveTutorServiceSoapBindingStub) service).setMaintainSession(true);
            service.setStudentName(name,"USD",100);
			AppointmentsAvailable[] apps = service.searchAvailabilityForSpecificSubject("math");
			for (AppointmentsAvailable teacherAndApps : apps) {
				for (String app : teacherAndApps.getAppointments()) {
					service.bookAppointment(teacherAndApps.getTeacher(), app);
					for (String app1 : service.getStudentAppointments()) {
						System.out.println("Student appointements " +app1);
					}
					
				}
			}
			
			
			
			
            
        }
	}

}
