package service;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import interfaces.IAppointment;
import interfaces.IStudent;
import interfaces.ITeacher;

public class OutsideStudent extends UnicastRemoteObject implements IStudent {
	
	private Set<IAppointment> studentAppointments = new HashSet<IAppointment>();
	private Set<IAppointment> appoimentsNotified = new HashSet<IAppointment>();
	private Map<String, List<ITeacher>> studentWaitingList = new HashMap<>();
	private String name;

	public OutsideStudent(String name) throws RemoteException {
		super();
		this.name = name;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public void addStudentToWaitingList(String subject, ITeacher teacher) throws RemoteException {
		if (studentWaitingList.containsKey(subject)) {
			studentWaitingList.get(subject).add(teacher);
		}
		List<ITeacher> list = new ArrayList<ITeacher>();
		list.add(teacher);
		studentWaitingList.put(subject, list);
	}
	
	public void removeStudentToWaitingList(String subject, ITeacher teacher) throws RemoteException {
		studentWaitingList.get(subject).remove(teacher);
	}
	
	public Set<IAppointment> getStudentAppointments() throws RemoteException {
		return studentAppointments;
	}
	
	public Set<IAppointment> getAppoimentsNotified() throws RemoteException {
		System.out.println("Outside getAppointmentsNotified");
		return appoimentsNotified;
	}

	@Override
	public void appointmentAvailable(IAppointment appointments) throws RemoteException {
		appoimentsNotified.add(appointments);
		
	}

	@Override
	public void addAppointment(IAppointment appointment) throws RemoteException {
		studentAppointments.add(appointment);	
		
	}

	@Override
	public String to_string() throws RemoteException {
		return "Student [number of student_appointments=" + studentAppointments.size() + "]" + " name: " + name;
	}

	@Override
	public String getName() throws RemoteException {
		return this.name;
	}

	@Override
	public Map<String, ArrayList<ITeacher>> getStudentWaitingList() throws RemoteException {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'getStudentWaitingList'");
	}

}
