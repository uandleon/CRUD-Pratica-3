package model.dao;

import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.Date;  // java.sql.Date
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.bean.Cliente;

public class ClienteDAO {

    public void create(Cliente c){
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try{
            stmt = con.prepareStatement("INSERT INTO cliente (nome,cpf,email,telefone,endereco,datanascimento) VALUES(?,?,?,?,?,?)");
            stmt.setString(1, c.getNome());
            stmt.setString(2, c.getCpf());
            stmt.setString(3, c.getEmail());
            stmt.setString(4, c.getTelefone());
            stmt.setString(5, c.getEndereco());

            // Converter java.util.Date para java.sql.Date
            java.util.Date utilDate = c.getDataNascimento();
            java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
            stmt.setDate(6, sqlDate);

            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Salvo com sucesso");
        } catch (SQLException ex){    
           JOptionPane.showMessageDialog(null, "Erro ao salvar: "+ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
}
