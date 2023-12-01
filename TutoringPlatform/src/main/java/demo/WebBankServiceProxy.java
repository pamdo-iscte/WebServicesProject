package demo;

public class WebBankServiceProxy implements demo.WebBankService {
  private String _endpoint = null;
  private demo.WebBankService webBankService = null;
  
  public WebBankServiceProxy() {
    _initWebBankServiceProxy();
  }
  
  public WebBankServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initWebBankServiceProxy();
  }
  
  private void _initWebBankServiceProxy() {
    try {
      webBankService = (new demo.WebBankServiceServiceLocator()).getWebBankService();
      if (webBankService != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)webBankService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)webBankService)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (webBankService != null)
      ((javax.xml.rpc.Stub)webBankService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public demo.WebBankService getWebBankService() {
    if (webBankService == null)
      _initWebBankServiceProxy();
    return webBankService;
  }
  
  public void addClient(demo.ClientAccount clientAccount) throws java.rmi.RemoteException{
    if (webBankService == null)
      _initWebBankServiceProxy();
    webBankService.addClient(clientAccount);
  }
  
  public boolean makePayment(java.lang.String clientName, double cost) throws java.rmi.RemoteException{
    if (webBankService == null)
      _initWebBankServiceProxy();
    return webBankService.makePayment(clientName, cost);
  }
  
  public void removeClient(demo.ClientAccount clientAccount) throws java.rmi.RemoteException{
    if (webBankService == null)
      _initWebBankServiceProxy();
    webBankService.removeClient(clientAccount);
  }
  
  public int getClientsDB() throws java.rmi.RemoteException{
    if (webBankService == null)
      _initWebBankServiceProxy();
    return webBankService.getClientsDB();
  }
  
  
}