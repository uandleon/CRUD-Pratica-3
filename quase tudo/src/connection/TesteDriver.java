/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package connection;

/**
 *
 * @author Uriel
 */
public class TesteDriver {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver carregado com sucesso!");
        } catch (ClassNotFoundException e) {
            System.out.println("Driver NÃO encontrado!");
        }
    }
}
