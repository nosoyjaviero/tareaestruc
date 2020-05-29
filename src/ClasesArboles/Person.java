package ClasesArboles;

import ClasesArboles.nodoPerson;

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

    public synchronized void insertNodo(int id, String name, String fname, String sname) {
        nodoPerson nuevo = new nodoPerson();
        if (nodoP == null) { // si el arbol esta vacio, entonces, se inserta como raiz
            nuevo = new nodoPerson(id, name, fname, sname);
            nodoP = nuevo;
            System.out.println("\nInsertado en la Raiz...");
            System.out.println(nodoP.getId() + "\n");
        } else {
            nodoP.insertar(id, name, fname, sname);
        }
    }

    public void inorden(nodoPerson r) {

        if (r != null) {
            inorden(r.getLeft());
            System.out.println(r.getId());
            inorden(r.getRight());

        }

    }

    public synchronized void simetrico(nodoPerson r) {
        if (r.getLeft() != null) {
            simetrico(r.getLeft());
        }
        System.out.print(" " + r.getId());
        if (r.getRight() != null) {
            simetrico(r.getRight());
        }

    }

    public synchronized void preOrden(nodoPerson person) {
        
        System.out.print(" " + person.getId());
        if (person.getLeft() != null) {
            preOrden(person.getLeft());
        }
        if (person.getRight() != null) {
            preOrden(person.getRight());
        }
    }

    public synchronized void postOrden(nodoPerson r) {
        
        if (r.getLeft() != null) {
            postOrden(r.getLeft());

        }

        if (r.getRight() != null) {
            postOrden(r.getRight());
        }
        System.out.print(" " + r.getId());
    }

}
