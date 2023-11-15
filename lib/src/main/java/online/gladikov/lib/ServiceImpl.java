package online.gladikov.lib;

import online.gladikov.spi.iface.Service;



public class ServiceImpl  implements Service{

	@Override
	public void serve() {
		System.out.println("Howdy Ho");
		
	}

}
