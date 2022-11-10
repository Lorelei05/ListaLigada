/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listaligada;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author pamel
 */
public class TestingListaLigada {
        public static void main(String[] args) throws IOException{
        BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
        String entrada;
        int dato;
        char respuesta;
        
        ListaLigada lista = new ListaLigada();
        
        while (true) { //ciclo infinito
        System.out.println("Ingresa un entero: ");
        entrada = bufer.readLine();
        dato = Integer.parseInt(entrada);
        lista.add(dato);
            System.out.println("El dato se a registrado correctamente 😉");
            System.out.println("¿Deseas ingresar mas datos?(s/n):");
            entrada=bufer.readLine();
            respuesta =entrada.charAt(0);
            if(respuesta == 'n' || respuesta == 'N')
                break;
        }
        
        System.out.println("........................................");
        System.out.println("");
        System.out.println("LISTA LIGADA");
        lista.printList();
        
        System.out.println(".......................................");
        System.out.println("");
        System.out.println("INSERTAR ELEMENTO");
        System.out.println("Ingrese el elemento a insertar:");
         entrada = bufer.readLine();
        dato = Integer.parseInt(entrada);
        System.out.println("Posicion se desea insertar: ");
        entrada = bufer.readLine();
        int p = Integer.parseInt(entrada);
        lista.add(dato, p);
        
        System.out.println("............................................");
        System.out.println("");
        System.out.println("Eliminacion especifico de un elemento de la lista 😢");
        System.out.println("Elemento a eliminar: ");
        entrada = bufer.readLine();
        int e = Integer.parseInt(entrada);
        lista.EliminacionEspecifica(e);
    
        System.out.println(".............................................");
        System.out.println("");
        System.out.println("Elimicion de elemento inicial de la lista");
        dato = lista.EliminacionInicial();
        System.out.println("El elemento eliminado es: " + dato);
        
        System.out.println("..............................................");
            System.out.println("");
        System.out.println("Eliminacion de elemento final");
        dato = lista.EliminacionFinal();
        System.out.println("El elemento eliminado es: " + dato);
        
        System.out.println("...............................................");
        System.out.println("");
        System.out.println("Conteo de nodos");
        System.out.println("Cantidad de elementos: " + lista.EncontrarNodos());

        System.out.println("................................................");
        System.out.println("");
        System.out.println("Buscar elemento de lista");
        System.out.println("Elwmnto a buscar: ");
        entrada = bufer.readLine();
        int a = Integer.parseInt(entrada);
        lista.BuscarElemento(a);
        if(lista.BuscarElemento(a) == true){
            System.out.println("Elemento " + a + "se encuentra en la lista");
        }else{
            System.out.println("Elmento " + a + " no encontrado en la lista");
        }

        System.out.println("..................................................");
        System.out.println("");
        System.out.println("Contenido");
        lista.printList();
        
    }
}



