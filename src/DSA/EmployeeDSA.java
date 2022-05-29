/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DSA;

import java.text.SimpleDateFormat;
/**
 *
 * @author Giang
 */
public class EmployeeDSA {

    public static SimpleArrayList<Employee> eList = new SimpleArrayList<>();

    public static EmployeeDS eTree = new EmployeeDS();
    
    public SimpleDateFormat date = new SimpleDateFormat("dd/MM/yyyy");

    public int add(Employee e) {
        if(find(e)) {
            eList.add(e);
            eTree.insertTree(e);
            return 1;
        }
        return -1;
    }

    public boolean find(Employee e) {
        return eTree.search(e, eTree.root) == null;
    }

    public Employee findByID(String id) {
        if (!eList.isEmpty()) {
            for (int i = 0; i < eList.size(); i++) {
                if (eList.get(i).getId().compareTo(id) == 0) {
                    return eList.get(i);
                }
            }
        }
        return null;
    }
    
    public int update(Employee e) {
        if (!eList.isEmpty()) {
            for (int i = 0; i < eList.size(); i++) {
                if (eList.get(i).getId().equals(e.getId())) {
                    eList.get(i).setId(e.getId());
                    eList.get(i).setLastName(e.getLastName());
                    eList.get(i).setFirstName(e.getFirstName());
                    eList.get(i).setDateOfBirth(e.getDateOfBirth());
                    eList.get(i).setPosition(e.getPosition());
                    eList.get(i).setPhoneNum(e.getPhoneNum());
                    eList.get(i).setAddress(e.getAddress());
                    return 1;
                }
            }
        }
        return -1;
    }
    
    public int del(String id) {
        Employee e = findByID(id);
        if(e != null) {
            eList.remove(e);
            return 1;
        }
        return -1;
    }
}
