package ec.edu.uce.git.srv;

public class PASrv {

    public static void main(String[] args) {
        Persona p = new Persona();
        Persona p1 = new Persona();
        Animal a = new Animal();
        Animal a1= new Animal();
        Integer cp, ca;

        //p.setId(4);
        //System.out.println(p.getId());

        System.out.println("Datos 1");
        p.datos();
        p.edatos();
        System.out.println("Datos 2");
        a.adatos();
        a.aedatos();
        System.out.println("Intercambiando datos");
        cp = p.getId();
        p.setId(a.getId());
        a.setId(cp);

        System.out.println("Id Persona: " + p.getId());
        System.out.println("Id Animal: " + a.getId());

    }

}
