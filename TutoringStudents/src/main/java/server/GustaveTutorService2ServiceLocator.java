/**
 * GustaveTutorService2ServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package server;

public class GustaveTutorService2ServiceLocator extends org.apache.axis.client.Service implements server.GustaveTutorService2Service {

    public GustaveTutorService2ServiceLocator() {
    }


    public GustaveTutorService2ServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public GustaveTutorService2ServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for GustaveTutorService2
    private java.lang.String GustaveTutorService2_address = "http://localhost:8080/TutoringPlatform/services/GustaveTutorService2";

    public java.lang.String getGustaveTutorService2Address() {
        return GustaveTutorService2_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String GustaveTutorService2WSDDServiceName = "GustaveTutorService2";

    public java.lang.String getGustaveTutorService2WSDDServiceName() {
        return GustaveTutorService2WSDDServiceName;
    }

    public void setGustaveTutorService2WSDDServiceName(java.lang.String name) {
        GustaveTutorService2WSDDServiceName = name;
    }

    public server.GustaveTutorService2 getGustaveTutorService2() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(GustaveTutorService2_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getGustaveTutorService2(endpoint);
    }

    public server.GustaveTutorService2 getGustaveTutorService2(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            server.GustaveTutorService2SoapBindingStub _stub = new server.GustaveTutorService2SoapBindingStub(portAddress, this);
            _stub.setPortName(getGustaveTutorService2WSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setGustaveTutorService2EndpointAddress(java.lang.String address) {
        GustaveTutorService2_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (server.GustaveTutorService2.class.isAssignableFrom(serviceEndpointInterface)) {
                server.GustaveTutorService2SoapBindingStub _stub = new server.GustaveTutorService2SoapBindingStub(new java.net.URL(GustaveTutorService2_address), this);
                _stub.setPortName(getGustaveTutorService2WSDDServiceName());
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
        if ("GustaveTutorService2".equals(inputPortName)) {
            return getGustaveTutorService2();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://server", "GustaveTutorService2Service");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://server", "GustaveTutorService2"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("GustaveTutorService2".equals(portName)) {
            setGustaveTutorService2EndpointAddress(address);
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
