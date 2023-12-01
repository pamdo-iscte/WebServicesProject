package server;

public class GustaveTutorServiceProxy implements server.GustaveTutorService {
  private String _endpoint = null;
  private server.GustaveTutorService gustaveTutorService = null;
  
  public GustaveTutorServiceProxy() {
    _initGustaveTutorServiceProxy();
  }
  
  public GustaveTutorServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initGustaveTutorServiceProxy();
  }
  
  private void _initGustaveTutorServiceProxy() {
    try {
      gustaveTutorService = (new server.GustaveTutorServiceServiceLocator()).getGustaveTutorService();
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
  
  public server.GustaveTutorService getGustaveTutorService() {
    if (gustaveTutorService == null)
      _initGustaveTutorServiceProxy();
    return gustaveTutorService;
  }
  
  public java.lang.Object get_server() throws java.rmi.RemoteException{
    if (gustaveTutorService == null)
      _initGustaveTutorServiceProxy();
    return gustaveTutorService.get_server();
  }
  
  
}