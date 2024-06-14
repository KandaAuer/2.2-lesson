class Slytherin extends Student {
    int cunning;
    int determination;
    int ambition;
    int resourcefulness;
    int thirstForPower;
    public Slytherin(String name, String surname, int magic, int teleportation,
                     int cunning, int determination, int ambition, int resourcefulness, int thirstForPower) {
        super(name, surname , magic, teleportation);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.thirstForPower = thirstForPower;
    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getThirstForPower() {
        return thirstForPower;
    }

    public void setThirstForPower(int thirstForPower) {
        this.thirstForPower = thirstForPower;
    }

    public void printPeople() {
        super.printPeople();
        System.out.println("Свойства Слизеринов: ");
        System.out.println("Хитрость: " + cunning);
        System.out.println("Решительность: " + determination);
        System.out.println("Амбициозность: " + ambition);
        System.out.println("Находчивость: " + resourcefulness);
        System.out.println("Жажда власти: " + thirstForPower);
    }
    public void compareWith(Slytherin student1, Slytherin student2) {
        int sum1 = student1.cunning + student1.determination + student1.ambition;
        int sum2 = student2.cunning + student2.determination + student2.ambition;
        if (sum1 > sum2) {
            System.out.println(student1.name + " является лучшим учеником Слизерина.");
        } else if (sum1 < sum2) {
            System.out.println(student2.name + " является лучшим учеником Слизерина.");
        } else {
            System.out.println("У " + student1.name + " и " + student2.name + " одинаковая сумма свойств Слизерина.");
        }
    }
}
