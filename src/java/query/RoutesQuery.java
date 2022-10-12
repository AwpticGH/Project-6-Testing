/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package query;

/**
 *
 * @author rafifajarrr
 */
public class RoutesQuery {
    
    public static String query = "SELECT routes.id as id, ap1.id as airportsByDestinationId, ap2.id as airportsByDepartureId, routes.time_of_flight as timeOfFlight\n" +
                            "FROM routes\n" +
                            "INNER JOIN airports ap1 ON routes.departure_id = ap1.id\n" +
                            "INNER JOIN airports ap2 ON routes.destination_id = ap2.id";
}
