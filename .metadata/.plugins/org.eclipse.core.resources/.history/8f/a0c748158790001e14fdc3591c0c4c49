/**
 * WebBankServiceServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package demo;

public class WebBankServiceServiceLocator extends org.apache.axis.client.Service implements demo.WebBankServiceService {

    public WebBankServiceServiceLocator() {
    }


    public WebBankServiceServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public WebBankServiceServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for WebBankService
    private java.lang.String WebBankService_address = "http://localhost:8080/WebBankService/services/WebBankService";

    public java.lang.String getWebBankServiceAddress() {
        return WebBankService_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String WebBankServiceWSDDServiceName = "WebBankService";

    public java.lang.String getWebBankServiceWSDDServiceName() {
        return WebBankServiceWSDDServiceName;
    }

    public void setWebBankServiceWSDDServiceName(java.lang.String name) {
        WebBankServiceWSDDServiceName = name;
    }

    public demo.WebBankService getWebBankService() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(WebBankService_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getWebBankService(endpoint);
    }

    public demo.WebBankService getWebBankService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            demo.WebBankServiceSoapBindingStub _stub = new demo.WebBankServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getWebBankServiceWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setWebBankServiceEndpointAddress(java.lang.String address) {
        WebBankService_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (demo.WebBankService.class.isAssignableFrom(serviceEndpointInterface)) {
                demo.WebBankServiceSoapBindingStub _stub = new demo.WebBankServiceSoapBindingStub(new java.net.URL(WebBankService_address), this);
                _stub.setPortName(getWebBankServiceWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("WebBankService".equals(inputPortName)) {
            return getWebBankService();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://demo", "WebBankServiceService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://demo", "WebBankService"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("WebBankService".equals(portName)) {
            setWebBankServiceEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
