package nl.ordina.leaky;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/login")
public class LeakyResource {
	
	@GET
    public String get() {
        System.out.println("GET");
        return "Hello World ;)";
    }
}
