/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DSA;

import DSA.LinkedBinaryTree.Node;

/**
 *
 * @author Giang
 */
public class EmployeeDS extends LinkedBinaryTree<Employee, Node<Employee>> {

    public Node<Employee> insert(Employee e, Node<Employee> root)
            throws IllegalArgumentException {
        if (root == null) {
            root = new Node<Employee>(e, null, null, null);
        } else if (e.getFirstName().compareTo(root.getElement().getFirstName()) < 0) {
            root.left = insert(e, root.left);
        } else if (e.getFirstName().compareTo(root.getElement().getFirstName()) > 0) {
            root.right = insert(e, root.right);
        } else if (e.getFirstName().compareTo(root.getElement().getFirstName()) == 0) {
            if (e.getLastName().compareTo(root.getElement().getLastName()) < 0) {
                root.left = insert(e, root.left);
            } else if (e.getLastName().compareTo(root.getElement().getLastName()) > 0) {
                root.right = insert(e, root.right);
            }
        } else {
            throw new IllegalArgumentException(e.toString() + " already in tree");
        }
        return root;
    }

    public void insertTree(Employee e) {
        root = insert(e, root);
        n++;
    }

    public Node<Employee> findMin(Node<Employee> root) {
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }

    public Node<Employee> search(Employee e, Node<Employee> root) {
        if (root == null) {
            return null;
        }
        if (e.equals(root.getElement())) {
            return root;
        } else if (e.getFirstName().compareTo(root.getElement().getFirstName()) < 0) {
            return search(e, root.left);
        } else if (e.getFirstName().compareTo(root.getElement().getFirstName()) > 0) {
            return search(e, root.right);
        } else if ((e.getFirstName().equalsIgnoreCase(root.getElement().getFirstName()))) {
            if (e.getLastName().compareTo(root.getElement().getLastName()) < 0) {
                return search(e, root.left);
            } else if (e.getFirstName().compareTo(root.getElement().getLastName()) < 0) {
                return search(e, root.right);
            }
        }
        return null;
    }

}
