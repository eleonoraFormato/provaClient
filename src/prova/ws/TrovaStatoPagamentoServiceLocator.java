/**
 * TrovaStatoPagamentoServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package prova.ws;

public class TrovaStatoPagamentoServiceLocator extends org.apache.axis.client.Service implements prova.ws.TrovaStatoPagamentoService {

    public TrovaStatoPagamentoServiceLocator() {
    }


    public TrovaStatoPagamentoServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public TrovaStatoPagamentoServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for TrovaStatoPagamento
    private java.lang.String TrovaStatoPagamento_address = "http://localhost:8080/prova/services/TrovaStatoPagamento";

    public java.lang.String getTrovaStatoPagamentoAddress() {
        return TrovaStatoPagamento_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String TrovaStatoPagamentoWSDDServiceName = "TrovaStatoPagamento";

    public java.lang.String getTrovaStatoPagamentoWSDDServiceName() {
        return TrovaStatoPagamentoWSDDServiceName;
    }

    public void setTrovaStatoPagamentoWSDDServiceName(java.lang.String name) {
        TrovaStatoPagamentoWSDDServiceName = name;
    }

    public prova.ws.TrovaStatoPagamento getTrovaStatoPagamento() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(TrovaStatoPagamento_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getTrovaStatoPagamento(endpoint);
    }

    public prova.ws.TrovaStatoPagamento getTrovaStatoPagamento(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            prova.ws.TrovaStatoPagamentoSoapBindingStub _stub = new prova.ws.TrovaStatoPagamentoSoapBindingStub(portAddress, this);
            _stub.setPortName(getTrovaStatoPagamentoWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setTrovaStatoPagamentoEndpointAddress(java.lang.String address) {
        TrovaStatoPagamento_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (prova.ws.TrovaStatoPagamento.class.isAssignableFrom(serviceEndpointInterface)) {
                prova.ws.TrovaStatoPagamentoSoapBindingStub _stub = new prova.ws.TrovaStatoPagamentoSoapBindingStub(new java.net.URL(TrovaStatoPagamento_address), this);
                _stub.setPortName(getTrovaStatoPagamentoWSDDServiceName());
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
        if ("TrovaStatoPagamento".equals(inputPortName)) {
            return getTrovaStatoPagamento();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://ws.prova", "TrovaStatoPagamentoService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://ws.prova", "TrovaStatoPagamento"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("TrovaStatoPagamento".equals(portName)) {
            setTrovaStatoPagamentoEndpointAddress(address);
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
