package MetodosAbstractos;

public class EjemploAbstractos {

    public static void main(String[] args) {
        Planta p = new Planta();
        p.alimentar();
        
        AnimalCarnivoro carnivoro = new AnimalCarnivoro();
        carnivoro.alimentar();
        
        AnimalHerviboro herviboro = new AnimalHerviboro();
        herviboro.alimentar();
    }
    
}
