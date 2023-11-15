package online.gladikov.spi.app;


import java.util.ServiceLoader;


import online.gladikov.spi.iface.Service;

public class App {
    public static void main(String[] args) {
    	    	

    			ServiceLoader.load(Service.class)
			    			       .stream()
                .map(ServiceLoader.Provider::get)
                .forEach(Service::serve);
    	
    }
}
