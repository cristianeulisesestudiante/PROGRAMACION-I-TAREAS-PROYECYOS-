/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tarea2_11;
/**
* @author Cristian Sanchez - 20211899 
* Crear una clase Calculadora con los métodos: sumar, restar, multiplicar, dividir.
* Que reciban 2 parámetros enteros y que retorne el resultado de la operación..
* Investigar sobre la sobrecarga de métodos y sobrecargar los métodos de la
* clase Calculadora para que reciban 3 y 4 parámetros.     
*/

public class Calculadora {
 
	// METODOS DE SUMAR
	public int sumar(int num1, int num2 ) {
	       return num1 + num2;
       }
	public int sumar(int num1, int num2 , int num3 ) {
	       return num1 + num2 + num3;
       }
	public int sumar(int num1, int num2 , int num3 , int num4) {
	       return num1 + num2 + num3 + num4;
       }


	// METODOS DE RESTA
	public int restar(int num1, int num2 ) {
	       return num1 - num2;
       }
	public int restar(int num1, int num2, int num3 ) {
	       return num1 - num2 - num3;
       }
	public int restar(int num1, int num2 , int num3 , int num4) {
	       return num1 - num2 - num3 - num4;
       }


	// METODOS DE MULTIPLICAR
	public int multiplicar(int num1, int num2 ) {
	       return num1 * num2;
       }
	public int multiplicar(int num1, int num2, int num3) {
	       return num1 * num2 * num3;
       }
	public int multiplicar(int num1, int num2 , int num3 , int num4 ) {
	       return num1 * num2 * num3 * num4;
       }


	// METODOS DE DIVISION
	public int dividir(int num1, int num2 ) {
	       return num1 / num2;
       }
	public int dividir(int num1, int num2, int num3 ) {
	       return num1 / num2 / num3;
       }
	public int dividir(int num1 , int num2, int num3, int num4 ) {
	       return num1 / num2 / num3 / num4;
       }

}

