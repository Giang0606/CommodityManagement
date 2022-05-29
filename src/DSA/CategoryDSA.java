/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DSA;

/**
 *
 * @author Giang
 */
public class CategoryDSA {

    public SimpleArrayList<Category> lsCa = new SimpleArrayList<>();

    public int add(Category c) {
        if (lsCa.isExist(c) == false) {
            lsCa.add(c);
            return 1;
        }
        return -1;
    }

    public Category findByID(String id) {
        if (!lsCa.isEmpty()) {
            for (int i = 0; i < lsCa.size(); i++) {
                if (lsCa.get(i).getId().compareTo(id) == 0) {
                    return lsCa.get(i);
                }
            }
        }
        return null;
    }

    public int update(Category c) {
        if (!lsCa.isEmpty()) {
            for (int i = 0; i < lsCa.size(); i++) {
                if (lsCa.get(i).getId().equals(c.getId())) {
                    lsCa.get(i).setId(c.getId());
                    lsCa.get(i).setName(c.getName());
                    lsCa.get(i).setProducer(c.getProducer());
                    lsCa.get(i).setPrice(c.getPrice());
                    lsCa.get(i).setDvt(c.getDvt());
                    lsCa.get(i).setNumber(c.getNumber());
                    return 1;
                }
            }
        }
        return -1;
    }

    public int del(String id) {
        Category c = findByID(id);
        if (c != null) {
            lsCa.remove(c);
            return 1;
        }
        return -1;
    }

}
