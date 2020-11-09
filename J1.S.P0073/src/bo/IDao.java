/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo;

/**
 *
 * @author Admin
 */
public interface IDao<E> {

    boolean add();

    void display();

    boolean remove(int ID);

    void resetID();
}
