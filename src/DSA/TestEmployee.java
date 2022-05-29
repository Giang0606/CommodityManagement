/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DSA;

import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 *
 * @author Giang
 */
public class TestEmployee {

    public static void main(String[] args) throws ParseException {
        EmployeeDS employeeDSA = new EmployeeDS();
        SimpleDateFormat date = new SimpleDateFormat("dd/MM/yyyy");
        Employee e1 = new Employee("1", "Nguyen", "A", date.parse("06/06/2000"), false, "a", "a", "1");
        Employee e2 = new Employee("2", "Nguyen", "B", date.parse("06/06/2000"), false, "b", "b", "2");
        Employee e3 = new Employee("3", "Vu", "B", date.parse("06/06/2000"), false, "c", "c", "3");
        Employee e4 = new Employee("4", "Bui", "A", date.parse("06/06/2000"), false, "d", "d", "4");
        employeeDSA.insertTree(e1);
        employeeDSA.insertTree(e2);
        employeeDSA.insertTree(e3);
        employeeDSA.insertTree(e4);
        employeeDSA.insertTree(e1);
        employeeDSA.output(employeeDSA.root);

        LinkedBinaryTree.Node<Employee> min = employeeDSA.findMin(employeeDSA.root);
        System.out.println(min.getElement());
        if (employeeDSA.search(e2, employeeDSA.root).getElement() == e2) {
            System.out.println("Tree contains " + e2.toString());
        } else {
            System.out.println("Tree doesn't contain " + e2.toString());
        }
    }
}
