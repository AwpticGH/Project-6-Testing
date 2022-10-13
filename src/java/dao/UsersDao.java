/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import java.util.List;
import pojo.Admins;
import pojo.Users;

/**
 *
 * @author rafifajarrr
 */
public class UsersDao extends BaseDao {
    
    public List<Users> getAll() {
        List<Object> results = super.getAll(Users.class);
        List<Users> list = new ArrayList<>();
        
        results.forEach((result) -> {
            list.add(Users.class.cast(result));
        });
        
        return list;
    }
    
    public Users getById(int id) {
        return Users.class.cast(super.getById(Users.class, id));
    }
    
}
