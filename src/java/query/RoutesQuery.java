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
    
    public static String query = "SELECT routes.id as id, ap1.code as from_ap_code, ap1.name as from_ap_name, ap2.code as to_ap_code, ap2.name as to_ap_name, routes.time_of_flight as time_of_flight\n" +
                            "FROM routes\n" +
                            "INNER JOIN airports ap1 ON routes.departure_id = ap1.id\n" +
                            "INNER JOIN airports ap2 ON routes.destination_id = ap2.id";
}
