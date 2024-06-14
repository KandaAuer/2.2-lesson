public class Hufflepuff extends Student {
    int diligence;
    int loyalty;
    int honesty;
    public Hufflepuff(String name, String surname, int magic, int teleportation, int diligence, int loyalty, int honesty) {
        super(name, surname, magic, teleportation);
        this.diligence = diligence;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getDiligence() {
        return diligence;
    }

    public void setDiligence(int diligence) {
        this.diligence = diligence;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }

    public void printPeople() {
        super.printPeople();
        System.out.println("Свойства Пуффендуев: ");
        System.out.println("Трудолюбие: " + diligence);
        System.out.println("Верность: " + loyalty);
        System.out.println("Честность: " + honesty);
    }
    public void compareWith(Hufflepuff student1, Hufflepuff student2) {
        int sum1 = student1.diligence + student1.loyalty + student1.honesty;
        int sum2 = student2.diligence + student2.loyalty + student2.honesty;
        if (sum1 > sum2) {
            System.out.println(student1.name + " является лучшим учеником Пуффендуя.");
        } else if (sum1 < sum2) {
            System.out.println(student2.name + " является лучшим учеником Пуффендуя.");
        } else {
            System.out.println("У " + student1.name + " и " + student2.name + " одинаковая сумма свойств Пуффендуя.");
        }
    }
}
