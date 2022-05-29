/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DSA;

import java.util.Date;

/**
 *
 * @author Giang
 */
public class Employee {

    private String id;
    private String lastName;
    private String firstName;
    private Date dateOfBirth;
    private boolean gen;
    private String position;
    private String address;
    private String phoneNum;

    public Employee() {
    }
    
    public Employee(String id, String lastName, String firstName, Date dateOfBirth, 
            boolean gen, String position, String address, String phoneNum) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.dateOfBirth = dateOfBirth;
        this.gen = gen;
        this.position = position;
        this.address = address;
        this.phoneNum = phoneNum;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public boolean getGen() {
        return gen;
    }

    public void setGen(boolean gen) {
        this.gen = gen;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    @Override
    public String toString() {
    //    return "id=" + id + ", lastName=" + lastName + ", firstName=" + firstName + ", dateOfBirth=" + dateOfBirth + ", gen=" + gen + ", position=" + position + ", address=" + address + ", phoneNum=" + phoneNum;
        return lastName + firstName;
    }

}
