/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author B.Aja
 */
public class Pengguna {
    /* attributes */
    private int id;
    private String username;
    private String password;
    private String email;
    private String nama;
    private int jabatan;
    private boolean is_aktif;
    
    
    List <Pengguna> user = new ArrayList();
    
    /* constructor */
    public Pengguna(int id, String nama, String username, String email, String password){
        this.id = id;
        this.nama = nama;
        this.email = email;
        this.username = username;
        this.password = password;
        this.jabatan = 1;
        this.is_aktif = true;
    }
    

    /* methods */
    /*
    public int getPengguna () {
        //int ?
    
    */

    public String getPassword() {
        return password;
    }

    public String getUsername() {
        return username;
    }
    
    

}
