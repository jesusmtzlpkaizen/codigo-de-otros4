package com.generation;
//no se importo el scanner
import java.util.Scanner;

public class Codigo4 {
	
	public static void main(String[] args) {//no se utilizaba main

	    Scanner s = new Scanner(System.in);//no se indican los valores pertinentes en los parentesis pa su correcto funcionamiento
	    
	    System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
	    String j1 = s.nextLine();
	    //no se menciona al siguiente jugador
	    System.out.print("Turno del jugador 2 (introduzca piedra, papel o tijeras): ");
	    Scanner s2 = new Scanner(System.in);//el scanner esta vacio
	    String j2 = s2.nextLine();//no se almacenaba el valor en el lugar correcto
	    
	    s.close();
	    s2.close();//hay que cerrar la escucha
	    
	    if (j1.equals(j2)) {//parentesis de mas, sustitucion a equals
	      System.out.println("Empate");
	    } else {
	      int g = 2;
	      switch(j1) {
	        case "piedra":
	          if (j2.equals("tijeras")) {//sustitucion a equals
	            g = 1;
	          }

	        case "papel":
	          if (j2.equals("piedra") ) {//sustitucion a equals
	            g = 1; } // llave de cierre
	          
	        case "tijera":
	          if (j2.equals("papel")) {
	            g = 1;
	          }
	          break;
	        default:
	        break; //mo hay un break default

	      }
	      System.out.println("Gana el jugador " + g);
	    }

	  } 

}

