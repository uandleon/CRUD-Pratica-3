/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.dao;

/**
 *
 * @author Fatec
 */
public class ClienteDAO {
    
    public void create(){
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try{
            stmt = con.prepareStatement("");
    
        } catch (SQLException ex){    
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
                    
             }
}
