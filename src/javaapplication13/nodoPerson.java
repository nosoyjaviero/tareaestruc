package javaapplication13;



/**
 * @author Nikole Moraga
 */
public class nodoPerson {

    private nodoPerson right; // Derecha
    private nodoPerson left; // Izquierda
    private String name;
    private String firstLastName;
    private String secondLastName;
    private int id;

    public nodoPerson(int id, String name, String firstLastName, String secondLastName ) {
        this.right = null;
        this.left = null;
        this.name = name;
        this.firstLastName = firstLastName;
        this.secondLastName = secondLastName;
        this.id = id;
    }
    public nodoPerson(){
    
    
    }
    
    public nodoPerson(int info){
        left = null;
        right = null;
        id = info;
        firstLastName = "";
        secondLastName = "";
        
    }

    /**
     * @return the right
     */
    public nodoPerson getRight() {
        return right;
    }

    /**
     * @param right the right to set
     */
    public void setRight(nodoPerson right) {
        this.right = right;
    }

    /**
     * @return the left
     */
    public nodoPerson getLeft() {
        return left;
    }

    /**
     * @param left the left to set
     */
    public void setLeft(nodoPerson left) {
        this.left = left;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the firstLastName
     */
    public String getFirstLastName() {
        return firstLastName;
    }

    /**
     * @param firstLastName the firstLastName to set
     */
    public void setFirstLastName(String firstLastName) {
        this.firstLastName = firstLastName;
    }

    /**
     * @return the secondLastName
     */
    public String getSecondLastName() {
        return secondLastName;
    }

    /**
     * @param secondLastName the secondLastName to set
     */
    public void setSecondLastName(String secondLastName) {
        this.secondLastName = secondLastName;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /*---------------------------------------------------------*/
     public synchronized void insertar(int d,String n,String fn ,String sn) {

        if (d < id) {                   // si d es menor que dato si insertarÃ¡ a la izquierda
            if (left == null) {             // en caso de que el nodo estÃ© vacio
                left = new nodoPerson(d,n,fn,sn);  // se crea uno nuevo
                System.out.println(left.id);
                System.out.println(left.name);
                System.out.println("\nInsertado a la izquierda..."); // se inserta
            } else {
                left.insertar(d,n,fn,sn); // en caso de que ya hubiera uno insertado a la izquierda pero el nuevo es menor se corre al siguiente nodo
            }
        }

        if (d > id) {                       // si d es mayor que dato si insertarÃ¡ a la derecha
            if (right == null) {                 // en caso de que el nodo estÃ© vasio
                right = new nodoPerson(d,n,fn,sn);      // se crea uno nuevo
                System.out.println("\nInsertado a la derecha...");    // se inserta
                System.out.println(right.id);
                System.out.println(right.name);
                System.out.println(right.firstLastName);
                System.out.println(right.secondLastName);
            } else {
                right.insertar(d,n,fn,sn);// en caso de que ya hubiera uno insertado a la derecha pero el nuevo es mayor se corre al siguiente nodo
            }
            
        }

    }//fin insertar

    public int returnValue() {  // Función que vuelva a insertar otro dato
        return (id);          // retorna a dato
    }
}
