package service;

public class GustaveTutorServiceProxy implements service.GustaveTutorService {
  private String _endpoint = null;
  private service.GustaveTutorService gustaveTutorService = null;
  
  public GustaveTutorServiceProxy() {
    _initGustaveTutorServiceProxy();
  }
  
  public GustaveTutorServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initGustaveTutorServiceProxy();
  }
  
  private void _initGustaveTutorServiceProxy() {
    try {
      gustaveTutorService = (new service.GustaveTutorServiceServiceLocator()).getGustaveTutorService();
      if (gustaveTutorService != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)gustaveTutorService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)gustaveTutorService)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (gustaveTutorService != null)
      ((javax.xml.rpc.Stub)gustaveTutorService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public service.GustaveTutorService getGustaveTutorService() {
    if (gustaveTutorService == null)
      _initGustaveTutorServiceProxy();
    return gustaveTutorService;
  }
  
  public java.lang.String[] getAppoimentsNotified() throws java.rmi.RemoteException{
    if (gustaveTutorService == null)
      _initGustaveTutorServiceProxy();
    return gustaveTutorService.getAppoimentsNotified();
  }
  
  public service.StudentWaitingList[] getStudentWaitingList() throws java.rmi.RemoteException{
    if (gustaveTutorService == null)
      _initGustaveTutorServiceProxy();
    return gustaveTutorService.getStudentWaitingList();
  }
  
  public java.lang.String[] getAllSubjects() throws java.rmi.RemoteException{
    if (gustaveTutorService == null)
      _initGustaveTutorServiceProxy();
    return gustaveTutorService.getAllSubjects();
  }
  
  public java.lang.String getStudentName() throws java.rmi.RemoteException{
    if (gustaveTutorService == null)
      _initGustaveTutorServiceProxy();
    return gustaveTutorService.getStudentName();
  }
  
  public void bookAppointment(java.lang.String teacher, java.lang.String appointment) throws java.rmi.RemoteException{
    if (gustaveTutorService == null)
      _initGustaveTutorServiceProxy();
    gustaveTutorService.bookAppointment(teacher, appointment);
  }
  
  public void removeStudentToWaitingList(java.lang.String teacher, java.lang.String subject) throws java.rmi.RemoteException{
    if (gustaveTutorService == null)
      _initGustaveTutorServiceProxy();
    gustaveTutorService.removeStudentToWaitingList(teacher, subject);
  }
  
  public java.lang.String[] getStudentAppointments() throws java.rmi.RemoteException{
    if (gustaveTutorService == null)
      _initGustaveTutorServiceProxy();
    return gustaveTutorService.getStudentAppointments();
  }
  
  public void addStudentToWaitingList(java.lang.String teacher, java.lang.String subject) throws java.rmi.RemoteException{
    if (gustaveTutorService == null)
      _initGustaveTutorServiceProxy();
    gustaveTutorService.addStudentToWaitingList(teacher, subject);
  }
  
  public service.AppointmentsAvailable[] searchAvailabilityForSpecificSubject(java.lang.String subject) throws java.rmi.RemoteException{
    if (gustaveTutorService == null)
      _initGustaveTutorServiceProxy();
    return gustaveTutorService.searchAvailabilityForSpecificSubject(subject);
  }
  
  public java.lang.String[] getAppointmentsForSubjectAndTeacher(java.lang.String teacher, java.lang.String subject) throws java.rmi.RemoteException{
    if (gustaveTutorService == null)
      _initGustaveTutorServiceProxy();
    return gustaveTutorService.getAppointmentsForSubjectAndTeacher(teacher, subject);
  }
  
  public void setStudentName(java.lang.String name, java.lang.String currency, double funds) throws java.rmi.RemoteException{
    if (gustaveTutorService == null)
      _initGustaveTutorServiceProxy();
    gustaveTutorService.setStudentName(name, currency, funds);
  }
  
  
}