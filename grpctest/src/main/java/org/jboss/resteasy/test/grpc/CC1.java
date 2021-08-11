package org.jboss.resteasy.test.grpc;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("")
public class CC1 {
   
   @Path("m1")
   @GET
   public String m1(CC2 cc2) {
      return "x";
   }

   String m2(String s) {
      return "x";
   }
   
   @Path("m3")
   @GET
   public String m3(CC4 cc4) {
      return "x";
   }

   @Path("m4")
   @GET
   public boolean m4(int i) {
      return true;
   }
   
   @Path("m5")
   @GET
   public String m5() {
      return "m5";
   }
}