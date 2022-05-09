package nuovoPackage;

import java.rmi.RemoteException;

import prova.ws.StatoPagamento;
import prova.ws.TrovaStatoPagamentoProxy;

public class TrovaStatoPagamentoClient {

	public static void main(String[] args) throws RemoteException {
		TrovaStatoPagamentoProxy trovStatPagProxy = new TrovaStatoPagamentoProxy();
		StatoPagamento statoPagamento;
		
		statoPagamento = trovStatPagProxy.trovaStatoPagamento();
		System.out.println(statoPagamento.toString());
	}
}
