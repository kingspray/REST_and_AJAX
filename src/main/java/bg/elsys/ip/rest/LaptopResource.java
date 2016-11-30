package bg.elsys.ip.rest;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/laptops")
public class LaptopResource {
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response getLaptops() {
		Items singleton = Items.getInstance();
		List<Laptop> items = singleton.getItems();
		return Response.ok(items).build();
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response addLatop(Laptop laptop) {
		Items singleton = Items.getInstance();
		List<Laptop> items = singleton.getItems();
		items.add(laptop);
		singleton.setItems(items);
		return Response.ok(items).build();
	}
}