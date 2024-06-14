class Gryffindor extends Student {
    int nobility;
    int honor;
    int bravery;
    public Gryffindor (String name, String surname, int magic, int teleportation, int nobility, int honor, int bravery) {
            super(name, surname , magic, teleportation);
            this.nobility = nobility;
            this.honor = honor;
            this.bravery = bravery;
        }

        public int getNobility() {
            return nobility;
        }

        public void setNobility(int nobility) {
            this.nobility = nobility;
        }

        public int getHonor() {
            return honor;
        }

        public void setHonor(int honor) {
            this.honor = honor;
        }

        public int getBravery() {
            return bravery;
        }

        public void setBravery(int bravery) {
            this.bravery = bravery;
        }

        public void printPeople() {
            super.printPeople();
            System.out.println("Свойства Гриффиндорцев: ");
            System.out.println("Благородство: " + nobility);
            System.out.println("Честь: " + honor);
            System.out.println("Храбрость: " + bravery);
        }
        public void compareWith(Gryffindor student1, Gryffindor student2) {
            int sum1 = student1.nobility + student1.honor + student1.bravery;
            int sum2 = student2.nobility + student2.honor + student2.bravery;
            if (sum1 > sum2) {
                System.out.println(student1.name + " является лучшим учеником Гриффиндора.");
            } else if (sum1 < sum2) {
                System.out.println(student2.name + " является лучшим учеником Гриффиндора.");
            } else {
                System.out.println("У " + student1.name + " и " + student2.name + " одинаковая сумма свойств Гриффиндора.");
            }
        }
    }
