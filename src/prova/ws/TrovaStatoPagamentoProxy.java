package prova.ws;

public class TrovaStatoPagamentoProxy implements prova.ws.TrovaStatoPagamento {
  private String _endpoint = null;
  private prova.ws.TrovaStatoPagamento trovaStatoPagamento = null;
  
  public TrovaStatoPagamentoProxy() {
    _initTrovaStatoPagamentoProxy();
  }
  
  public TrovaStatoPagamentoProxy(String endpoint) {
    _endpoint = endpoint;
    _initTrovaStatoPagamentoProxy();
  }
  
  private void _initTrovaStatoPagamentoProxy() {
    try {
      trovaStatoPagamento = (new prova.ws.TrovaStatoPagamentoServiceLocator()).getTrovaStatoPagamento();
      if (trovaStatoPagamento != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)trovaStatoPagamento)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)trovaStatoPagamento)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (trovaStatoPagamento != null)
      ((javax.xml.rpc.Stub)trovaStatoPagamento)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public prova.ws.TrovaStatoPagamento getTrovaStatoPagamento() {
    if (trovaStatoPagamento == null)
      _initTrovaStatoPagamentoProxy();
    return trovaStatoPagamento;
  }
  
  public java.lang.String randomStringa() throws java.rmi.RemoteException{
    if (trovaStatoPagamento == null)
      _initTrovaStatoPagamentoProxy();
    return trovaStatoPagamento.randomStringa();
  }
  
  public int randomInt() throws java.rmi.RemoteException{
    if (trovaStatoPagamento == null)
      _initTrovaStatoPagamentoProxy();
    return trovaStatoPagamento.randomInt();
  }
  
  public prova.ws.StatoPagamento trovaStatoPagamento() throws java.rmi.RemoteException{
    if (trovaStatoPagamento == null)
      _initTrovaStatoPagamentoProxy();
    return trovaStatoPagamento.trovaStatoPagamento();
  }
  
  
}