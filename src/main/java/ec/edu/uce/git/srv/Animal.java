package ec.edu.uce.git.srv;

import lombok.Data;

import java.util.Scanner;

@Data
public class Animal {
    private Integer id;
    private String nombre;

    public void adatos(){
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingresar el id del animal: ");
        id= leer.nextInt();
    }
    public void aedatos(){
        System.out.println("Id del animal: " + id+"\n");
    }
}
