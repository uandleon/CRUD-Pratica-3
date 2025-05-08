/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.bean;

import java.util.Date;

/**
 *
 * @author uande
 */
public class Cliente {
    
    private int id;
    private String nome; 
    private String cpf;
    private String email;
    private String telefone;
    private String endereco;
    private Date dataNascimento;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    public static boolean isCPFValido(String cpf) {
    cpf = cpf.replaceAll("[^\\d]", ""); // Remove pontos e traços

    if (cpf.length() != 11 || cpf.matches("(\\d)\\1{10}")) return false;

    try {
        int soma = 0;
        for (int i = 0; i < 9; i++) soma += (cpf.charAt(i) - '0') * (10 - i);
        int dig1 = 11 - (soma % 11);
        dig1 = (dig1 >= 10) ? 0 : dig1;

        soma = 0;
        for (int i = 0; i < 10; i++) soma += (cpf.charAt(i) - '0') * (11 - i);
        int dig2 = 11 - (soma % 11);
        dig2 = (dig2 >= 10) ? 0 : dig2;

        return dig1 == (cpf.charAt(9) - '0') && dig2 == (cpf.charAt(10) - '0');
    } catch (Exception e) {
        return false;
    }
}
}
