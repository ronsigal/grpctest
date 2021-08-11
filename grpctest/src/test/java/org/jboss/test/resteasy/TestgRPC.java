package org.jboss.test.resteasy;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;

import org.junit.Test;

public class TestgRPC {
   
   @Test
   public void testJaxRs() {
      Client client = ClientBuilder.newClient();
      WebTarget target = client.target("http://localhost:8080/grpctest-0.0.1-SNAPSHOT/app/m4");
      Response response = target.request().get();
      System.out.println("response: " + response.readEntity(String.class));
   }

}
