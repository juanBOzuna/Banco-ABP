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
class Representative {

    Integer id;
    String dni;
    String name;
    String address;
    Calendar dateOfBirth;
    String sex;
    Organization organization;

    public Representative(Integer id, String dni, String name, String address, Calendar dateOfBirth, String sex, Organization organization) {
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

    public Organization getOrganization() {
        return organization;
    }

    public void setOrganization(Organization organization) {
        this.organization = organization;
    }

}
