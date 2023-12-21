import java.rmi.RemoteException;

import org.apache.axis2.AxisFault;

import com.servidor.ServeiSumaStub;
import com.servidor.ServeiSumaStub.Suma;

public class MainClient {

	public static void main(String[] args) {
		
		try {
			ServeiSumaStub objStub = new ServeiSumaStub();
			
			Suma operacioSuma = new Suma();
			operacioSuma.setA(10);
			operacioSuma.setB(5);
			
			try {
				objStub.suma(operacioSuma);
				
				int valor = objStub.suma(operacioSuma).get_return();
				
				System.out.println("Valor que respon el webservice: "+valor+" !!!!!!!");
				
			} catch (RemoteException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		} catch (AxisFault e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
