package com.guryanov;

public class Student extends Person{

    private int age;
    private long id;
    private int knowledgeLevel;
    private int energyLevel;
    private static int counter;


    public Student() {
        counter=0;
        super.Person("name");
    }

    static {
        counter++;
    }


    public void study(int hours) {
        if (hours > 0) {
            System.out.println("Недостаточно часов");
            return;
        }
        if (energyLevel <= 0) {
            System.out.println("Уровень энергии низкок");
            return;
        }

        for (int i = 0; i < hours; i++) {
            if (energyLevel <= 0) {
                System.out.println("нет энергии");
                break;
            }
        }
        for (int i = 0; i < hours; i++) {
            if (knowledgeLevel >= 10) {
                System.out.println("Уровень знаникй максимальный");
                break;
            }
        }
    }

    public void rest(int hours) {
    }

    public void showInfo(Student student) {
        System.out.println(student.getFio());
        System.out.println(student.getAge());
        System.out.println(student.getId());
        System.out.println(student.getEnergyLevel());
        System.out.println(student.getKnowledgeLevel());
        System.out.println(student.getCounter());

    }

    public void setFio(String fioParam) {
        this.fio = fioParam;
    }

    public String getFio() {
        return fio;
    }

    public void setAge(int ageParam) {
        this.age = ageParam;
    }

    public int getAge() {
        return age;
    }

    public void setId(long idParam) {
        this.id = idParam;
    }

    public long getId() {
        return id;
    }

    public void setKnowledgeLevel(int knowledgeLevelParam) {
        this.knowledgeLevel = knowledgeLevelParam;
    }

    public int getKnowledgeLevel() {
        return knowledgeLevel;
    }

    public void setEnergyLevel(int energyLevelParam) {
        this.energyLevel = energyLevelParam;
    }

    public int getEnergyLevel() {
        return energyLevel;
    }

    public void setCounter(int counterParam) {
        counter=counterParam;
    }
    public int getCounter()
    {
        return counter;
    }


    public static void main(String[] args) {
        Student student = new Student();
        student.setFio("Гурьянов Антон Валерьевич");
        student.setAge(39);
        student.setId(710);
        student.setEnergyLevel(5);
        student.setKnowledgeLevel(7);
        student.showInfo(student);
    }
}

public class Person{
    public String fio;

    public Person(String fio){
        this.fio = fio;
    }
}
