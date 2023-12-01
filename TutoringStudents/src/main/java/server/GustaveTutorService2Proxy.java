package server;

public class GustaveTutorService2Proxy implements server.GustaveTutorService2 {
  private String _endpoint = null;
  private server.GustaveTutorService2 gustaveTutorService2 = null;
  
  public GustaveTutorService2Proxy() {
    _initGustaveTutorService2Proxy();
  }
  
  public GustaveTutorService2Proxy(String endpoint) {
    _endpoint = endpoint;
    _initGustaveTutorService2Proxy();
  }
  
  private void _initGustaveTutorService2Proxy() {
    try {
      gustaveTutorService2 = (new server.GustaveTutorService2ServiceLocator()).getGustaveTutorService2();
      if (gustaveTutorService2 != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)gustaveTutorService2)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)gustaveTutorService2)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (gustaveTutorService2 != null)
      ((javax.xml.rpc.Stub)gustaveTutorService2)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public server.GustaveTutorService2 getGustaveTutorService2() {
    if (gustaveTutorService2 == null)
      _initGustaveTutorService2Proxy();
    return gustaveTutorService2;
  }
  
  public java.lang.Object getServer() throws java.rmi.RemoteException{
    if (gustaveTutorService2 == null)
      _initGustaveTutorService2Proxy();
    return gustaveTutorService2.getServer();
  }
  
  
}