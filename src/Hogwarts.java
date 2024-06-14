public class Hogwarts {
    public static void compareStudents(Student student1, Student student2) {
        int magicalPower1 = student1.getMagic();
        int magicalPower2 = student2.getMagic();

        int teleportDistance1 = student1.getTeleportation();
        int teleportDistance2 = student2.getTeleportation();

        if (magicalPower1 > magicalPower2) {
            System.out.println(student1.getName() + " превосходит " + student2.getName() + " по силе магии.");
        } else if (magicalPower1 < magicalPower2) {
            System.out.println(student2.getName() + " превосходит " + student1.getName() + " по силе магии.");
        } else {
            System.out.println("Сравнение между " + student1.getName() + " и " + student2.getName() + " невозможно, так как их силы равны.");
        }

        if (teleportDistance1 > teleportDistance2) {
            System.out.println(student1.getName() + " превосходит " + student2.getName() + " по трансгерссии.");
        } else if (teleportDistance1 < teleportDistance2) {
            System.out.println(student2.getName() + " превосходит " + student1.getName() + " по трансгрессии.");
        } else {
            System.out.println("Сравнение между " + student1.getName() + " и " + student2.getName() + " невозможно, так как их силы равны.");
        }
    }
    public static void main(String[] args) {
        Gryffindor harryPotter = new Gryffindor("Гарри",  "Поттер", 9, 85, 35, 74, 5);
        Gryffindor hermioneGranger = new Gryffindor("Гермиона", "Грейнджер", 55, 10, 15, 85, 80);
        Gryffindor ronWeasley = new Gryffindor("Рон" ,"Уизли", 80, 5, 10, 20, 85);

        Slytherin dracoMalfoy = new Slytherin("Драко",  "Малфой", 85, 75, 90, 95, 80, 22,25);
        Slytherin grahamMontague = new Slytherin("Грэхэм", "Монтегю", 85, 81, 33, 75, 90,11,48);
        Slytherin gregoryGoyle = new Slytherin("Грегори",  "Гойл", 75, 70, 80, 80, 85, 11,21);

        Hufflepuff zachariasSmith = new Hufflepuff("Захария" ,"Смит", 14, 85, 90, 85, 80);
        Hufflepuff cedricDiggory = new Hufflepuff("Седрик",  "Диггори", 90, 90, 80, 85, 85);
        Hufflepuff justinFinchFletchley = new Hufflepuff("Джастин", "Финч-Флетчли", 84, 81, 85, 80, 80);

        Ravenclaw choChang = new Ravenclaw("Чжоу"," Чанг", 85, 32, 98, 85, 80,15);
        Ravenclaw padmaPatil = new Ravenclaw("Падма"," Патил", 90, 5, 90, 80, 85,10);
        Ravenclaw marcusBelby = new Ravenclaw("Маркус"," Белби", 8, 80, 66, 75, 31,11);

        harryPotter.printPeople();
        harryPotter.compareWith(hermioneGranger, ronWeasley);
        dracoMalfoy.printPeople();
        gregoryGoyle.compareWith(grahamMontague,gregoryGoyle);
        zachariasSmith.printPeople();
        cedricDiggory.compareWith(cedricDiggory,justinFinchFletchley);
        choChang.printPeople();
        padmaPatil.compareWith(padmaPatil, marcusBelby);
        compareStudents(justinFinchFletchley,grahamMontague);
    }
}
