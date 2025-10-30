package org.example;

public class AnimalManager {
    AnimalDAO animalDAO;

    public AnimalManager(AnimalDAO animalDAO) {
        this.animalDAO = animalDAO;
    }

    public void manage(){
        Animal a = new Animal("zebra", 6, Animal.GenderType.MALE);
        animalDAO.saveAnimal(a);
        Animal b = new Animal("zsiráf", 3, Animal.GenderType.FEMALE);
        animalDAO.saveAnimal(b);

        for (Animal animal: animalDAO.getAnimals())
            System.out.println(animal);

        Animal c = new Animal("gibbon", 25, Animal.GenderType.MALE);

        Zoo zoo = new Zoo("Debrecen Zoo");
        zoo.getAnimals().add(a);
        zoo.getAnimals().add(b);
        zoo.getAnimals().add(c);
        animalDAO.saveZoo(zoo);
    }
}
