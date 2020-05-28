
package javaapplication13;

import javaapplication13.nodoPerson;

/**
 * @author Nikole Moraga
 */
public class Person {
    private nodoPerson nodoP;
    
    public Person() {
        nodoP = null;
    }

    public nodoPerson returnRoot() {
        return (nodoP);
    }

    public synchronized void insertNodo(int id,String name,String fname, String sname) {
        nodoPerson nuevo= new nodoPerson();
        if (nodoP == null) { // si el arbol esta vacio, entonces, se inserta como raiz
            nuevo = new nodoPerson(id,name,fname,sname);
//            nuevo.setId(id);
//            nuevo.setName(name);
//            nuevo.setSecondLastName(sname);
//            nuevo.setFirstLastName(fname);
            nodoP=nuevo;
            System.out.println("\nInsertado en la Raiz...");
            System.out.println(nodoP.getId());
            System.out.println(nodoP.getName());
            System.out.println(nodoP.getFirstLastName());
            System.out.println(nodoP.getSecondLastName());
        } else {
            nodoP.insertar(id,name,fname,sname);
        }
    }
    
    
    
    
    
    
    
    public synchronized void simetrico(nodoPerson person) {
        if (nodoP.getLeft() != null) {
            simetrico(nodoP.getLeft()); 
        }
        System.out.print(" " + person.getName());
        if (person.getRight() != null) {
            simetrico(person.getRight()); 
        }
    }

    public synchronized void preOrden(nodoPerson person) {
        System.out.print(" " + person.getName());
        if (person.getLeft() != null) {
            preOrden(person.getLeft());
        }
        if (person.getRight() != null) {
            preOrden(person.getRight());
        }
    }

    public synchronized void postOrden(nodoPerson person) {
        if (person.getLeft() != null) {
            postOrden(person.getLeft());
        }
        if (person.getRight() != null) {
            postOrden(person.getRight());
        }
        System.out.print(" " + person.getName());
    }
    
}
