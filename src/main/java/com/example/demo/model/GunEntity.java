package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class GunEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String gunname;
    private String gundamage;
    private String gunmobility;
    private String gunmagazine;
    private String guncolor;

    public GunEntity() {

    }

    public String getGuncolor() {
        return guncolor;
    }

    public void setGuncolor(String guncolor) {
        this.guncolor = guncolor;
    }

    public String getGunmagazine() {
        return gunmagazine;
    }

    public void setGunmagazine(String gunmagazine) {
        this.gunmagazine = gunmagazine;
    }

    public String getGunmobility() {
        return gunmobility;
    }

    public void setGunmobility(String gunmobility) {
        this.gunmobility = gunmobility;
    }

    public String getGundamage() {
        return gundamage;
    }

    public void setGundamage(String gundamage) {
        this.gundamage = gundamage;
    }

    
    public String getGunname() {
        return gunname;
    }

    public void setGunname(String gunname) {
        this.gunname = gunname;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    
 
    
    

}
