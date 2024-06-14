public class Student {
    String name;
    String surname;
    int magic;
    int teleportation;
    public Student(String name, String surname, int magic, int teleportation) {
            this.name = name;
            this.surname = surname;
            this.magic = magic;
            this.teleportation = teleportation;
        }
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
        public String getSurname() {
            return surname;
        }
        public void setSurname(String surname) {
            this.surname = surname;
        }
        public int getMagic() {
            return magic;
        }
        public void setMagic(int magic) {
            this.magic = magic;
        }
        public int getTeleportation() {
            return teleportation;
        }
        public void setTeleportation(int teleportation) {
            this.teleportation = teleportation;
        }
        public void printPeople() {
            System.out.println("Ученик: " + getName() + " " + getSurname());
            System.out.println("Магия: " + getMagic() + ", телепортация: " + getTeleportation());
        }
    }
