package Concrete;

import Abstract.UserCheckService;
import Entity.User;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class UserCheckManager implements UserCheckService {

	
	public boolean CheckIfRealPerson(User user) {
		boolean result=false;
		KPSPublicSoapProxy proxy=new KPSPublicSoapProxy();
		try {
			result=proxy.TCKimlikNoDogrula(Long.parseLong(user.getNationalId()), user.getFirstName().toUpperCase(), user.getLastName().toUpperCase(), user.getBirthDate().getYear());
		}
		catch(Exception e) {
			System.out.println("Person is not valid!");
		}
		
		return result;
	}

} 
