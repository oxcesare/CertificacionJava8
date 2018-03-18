/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.certificacion.tema.ocho;

/**
 *
 * @author consultor006
 */
public class Employee {
    public int employeeId;
    public String firstName, lastName;
    public int yearStarted;
    
    //Devuelve el 
    public  int hasCode(){
        return employeeId;
    }
    
    public boolean equals(Employee e){
        return this.employeeId == e.employeeId;
    }
    
    //Validacion de contenido asignaod a un objeto
    //Son dos objetos distintos.
    public static void main(String[] args) {
        Employee one = new Employee();
        one.employeeId=10;
        Employee two = new Employee();
        two.employeeId=101;
        if(one.equals(two)){
            System.out.println("Exito");
        }else{
            System.out.println("Falló");
        }       
    }
    
}
