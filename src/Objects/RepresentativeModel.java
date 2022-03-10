/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objects;

import java.util.Calendar;

/**
 *
 * @author juan barraza
 */
public class RepresentativeModel {

    Integer id;
    String dni;
    String name;
    String address;
    Calendar dateOfBirth;
    String sex;
    OrganizationModel organization;

    public RepresentativeModel(Integer id, String dni, String name, String address, Calendar dateOfBirth, String sex, OrganizationModel organization) {
        this.id = id;
        this.dni = dni;
        this.name = name;
        this.address = address;
        this.dateOfBirth = dateOfBirth;
        this.sex = sex;
        this.organization = organization;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Calendar getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Calendar dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public OrganizationModel getOrganization() {
        return organization;
    }

    public void setOrganization(OrganizationModel organization) {
        this.organization = organization;
    }

    public static RepresentativeModel index(int ind) {
        //TODO add code of Create representative
        return null;
    }

    public static Boolean delete(int id) {
        //TODO add code of delete representative 
        return null;
    }

    public static RepresentativeModel Update(RepresentativeModel representative) {
        //TODO add code of update representative
        return null;
    }

    public static RepresentativeModel Create(RepresentativeModel representative) {
        //TODO add code of Create representative
        return null;
    }
}
