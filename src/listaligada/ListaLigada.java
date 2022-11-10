/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listaligada;



/**
 *
 * @author pamel
 */
public class ListaLigada {
    private Nodo head;//Apuntador a la cabecera de la lista (primer nodo)
    private Nodo tail;//Apuntador a la cola de la lista (ultimo nodo)
    private Nodo actual;//Apuntador al nodo seleccionado actualmente
    private int size;//tamaño de la lista (numero de nodos en la lista)
    
    
    //constructor
    public ListaLigada() {
        this.head = null;
        this.actual = null;
        this.tail = null;
        this.size = 0;
    }

   /* public void addFirst(int dato) {
        Nodo nodo = new Nodo(dato);
        this.head = nodo;
        this.tail = nodo;
        this.actual = nodo;
        this.size++;
    } */

    public void add(int dato) {
        Nodo nuevoNodo = new Nodo(dato);
        this.size++;
        tail = nuevoNodo;//Se mueve el apuntador al ultimo nodo
        
        if (head == null){//la lista esta vacia, creamos el primer metodo
           head = nuevoNodo;
           actual= head;
        }
        else{
        
        actual.setSiguiente(nuevoNodo);//actual apunta al nuevo nodo
        actual = nuevoNodo;//Ahora actual es el nuevo nodo
        }
    }
    
    public void add(int dato, int posicion){
    Nodo nuevoNodo=new Nodo(dato);
    int i = 1;
    actual =head;
    while (i < posicion - 1){
    actual = actual.getSiguiente();
    i++;
   }
    Nodo auxiliar=actual.getSiguiente();
    actual.setSiguiente(nuevoNodo);
    actual = nuevoNodo;
    actual.setSiguiente(auxiliar);
   }
    
    public void printList(){
        int posicion = 1;
        actual = head;
        while(actual != null){
            int elemento = actual.getDato();
            System.out.println("Dato = " + elemento + " almacenado en nodo: " + posicion);
            actual = actual.getSiguiente();
            posicion++;
        }
    }
    
    
     //Eliminacion de nodo especifico
    public void EliminacionEspecifica(int elemento){
        if (head == tail && elemento==head.getDato()){
            this.head = null;
            this.tail = null;  
        }else if(elemento == head.getDato()){
            head = head.getSiguiente();
        }else{
            Nodo anterior,temporal;
            anterior = head;
            temporal = head.getSiguiente();
            while(temporal!=null && temporal.getDato()!=elemento){
                anterior=anterior.getSiguiente();
                temporal = temporal.getSiguiente();
            }
            if(temporal!=null){ // Elemento que no llega a null
                anterior.setSiguiente(temporal.getSiguiente());
                if(temporal == tail ){
                    tail = anterior; //llega a el ultimo nodo a eliminar, modificando al anterior
                }
            }
        }
    }
    
    
     //Eliminacion del nodo inicial de la lista
    public int EliminacionInicial(){
        int elemento = head.getDato();//Declaramos un entero
        if(head == tail){ //un solo nodo
            this.head=null;
            this.tail=null;
        }else{ //dos o mas nodos
            head=head.getSiguiente(); 
        }
        return elemento;
    }
    
    
    //Eliminacion de nodo final de lista
    public int EliminacionFinal(){
        int elemento = tail.getDato();
        if(head == tail){
            this.tail=null;
            this.head = null;
        }else{
            Nodo temporal = head; // recorre la lista
            while(temporal.getSiguiente()!= tail){ //recorremos la lista al ultimo elemento
                temporal = temporal.getSiguiente();
            }
            Nodo siguiente = temporal.getSiguiente().getSiguiente();
            //elimina y enlaza al siguiente nodo
            temporal.setSiguiente(siguiente);  
        }
        return elemento;
    }
    
    //Buscar elemento
    public boolean BuscarElemento(int elemento){
        Nodo temporal = head;
        while(temporal !=null && temporal.getDato()!=elemento){
            temporal=temporal.getSiguiente();
        }
        return temporal!=null;
    }
  
    // Encontrar Nodos
    public int EncontrarNodos(){
       return size; 
    }
    
    
  
}
  


