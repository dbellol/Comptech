public class CrearALC {  
    //Se muestra el nodo como una lista 
    public class Node{  
        int dato;  
        Node siguiente;   
        public Node(int dato) {  
            this.dato = dato;  
        }  
    }  
  
    //Se declara la cabeza y la cola como nulos
    public Node cabeza = null;  
    public Node cola = null;  
  
    //esta funcion añade el nuevo nodo al final de la lista 
    public void add(int dato){  

        //Se crea el nuevo nodo
        Node newNode = new Node(dato);  

        //revisa si esta vacio
        if(cabeza == null) {  

             //si esta vacio apuntara la cabeza y la cola al nuevo nodo.  
             cabeza = newNode;  
             cola = newNode;  
            newNode.siguiente = cabeza;  
        }  
        else {  
            //la cola apuntara al nuevo nodo  
            cola.siguiente = newNode;  
            //nuevo nodo se convertira en la cola  
            cola = newNode;  
            //Como es ALCircular la cola apuntara a la cabeza
            cola.siguiente = cabeza;  
        }  
    }  
  
    //Muestra todos los nodos en la lista
        // public void display() {  
        //     Node actual = cabeza;  
        //     if(cabeza == null) {  
        //         System.out.println("La lista esta vacia");  
        //     }  
        //     else {  
        //         System.out.println("Los nodos de la lista circular son: ");  
        //          do{  
        //             //imprime cada nodo incrementando el apuntador   
        //             System.out.print(" "+ actual.dato);  
        //             actual = actual.siguiente;  
        //         }while(actual != cabeza);  
        //         System.out.println();  
        //     }  
        // }  
    
        // public static void main(String[] args) {  
        //     CrearALC cl = new CrearALC();  
        //     //añade datos a la lista 
        //     cl.add(1);  
        //     cl.add(2);  
        //     cl.add(3);  
        //     cl.add(4);  
        //     //Imprime todos los nodos que se encuentran en la lista
        //     cl.display();  
        // }  
}  