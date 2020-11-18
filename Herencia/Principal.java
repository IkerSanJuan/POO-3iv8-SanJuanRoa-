public class Principal{
    public  static void main(String[] args) {
        
        Perro dog = new Perro("Teddy", "Callejero", "Croquetas", 2, "fuerte");
        Gato cat = new Gato("Miau", "Hogareño", "atun", 1, 7);
        System.out.println("----------");
        dog.mostrarPerro();
        System.out.println("----------");
        cat.mostrarGato();
        System.out.println("----------");
    }
}