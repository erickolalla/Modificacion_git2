package ec.edu.uce.git.srv;

import lombok.Data;

import java.util.Scanner;

@Data
public class Persona {
    private Integer id;
    private String nombre;
    private String apellido;
    public void datos(){
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingresar el id de la persona: ");
        id= leer.nextInt();
    }
    public void edatos(){
        System.out.println("Id de la persona :" + id+"\n");
    }

}