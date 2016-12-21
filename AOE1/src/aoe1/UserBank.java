/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aoe1;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author dam2
 */
public class UserBank
{
    private Driver driver;
    
    public UserBank()
    {
        try
        {
            driver = new com.mysql.jdbc.Driver();
            DriverManager.registerDriver(driver);
        } catch (SQLException ex)
        {
            Logger.getLogger(UserBank.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
    }
    
    
    
}
