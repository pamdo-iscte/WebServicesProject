/**
 * GustaveTutorService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package service;

public interface GustaveTutorService extends java.rmi.Remote {
    public java.lang.String[] getAppoimentsNotified() throws java.rmi.RemoteException;
    public service.StudentWaitingList[] getStudentWaitingList() throws java.rmi.RemoteException;
    public java.lang.String[] getAllSubjects() throws java.rmi.RemoteException;
    public void setStudentName(java.lang.String name, java.lang.String currency, double funds) throws java.rmi.RemoteException;
    public java.lang.String getStudentName() throws java.rmi.RemoteException;
    public void bookAppointment(java.lang.String teacher, java.lang.String appointment) throws java.rmi.RemoteException;
    public void removeStudentToWaitingList(java.lang.String teacher, java.lang.String subject) throws java.rmi.RemoteException;
    public java.lang.String[] getStudentAppointments() throws java.rmi.RemoteException;
    public void addStudentToWaitingList(java.lang.String teacher, java.lang.String subject) throws java.rmi.RemoteException;
    public service.AppointmentsAvailable[] searchAvailabilityForSpecificSubject(java.lang.String subject) throws java.rmi.RemoteException;
    public java.lang.String[] getAppointmentsForSubjectAndTeacher(java.lang.String teacher, java.lang.String subject) throws java.rmi.RemoteException;
}
