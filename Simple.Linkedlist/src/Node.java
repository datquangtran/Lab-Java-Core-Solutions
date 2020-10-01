/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ADMIN
 */
public class Node {
    int info; //Truong chua thong tin cho cac node trong danh sach
    Node next; // Lien ket toi node ke tiep trong danh sach
    public Node(){
    }
    public Node(int x,Node p){
        info = x;
        next = p;
    }
}


