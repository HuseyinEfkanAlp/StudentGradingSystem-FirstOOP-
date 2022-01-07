public class Main {

    public static void main(String[] args) {
        Teacher t1 = new Teacher("David","9511325614","HTY");
        Teacher t2 = new Teacher("Einstein","035456559","PYS");
        Teacher t3 = new Teacher("Mendel","53552566","BIO");

        Course history = new Course("History","101","HTY");
        history.addTeacher(t1);

        Course physics = new Course("Physics","102","PYS");
        physics.addTeacher(t2);

        Course biology = new Course("Biology","103","BIO");
        biology.addTeacher(t3);

        Student s1 = new Student("Adrian","123","4",history,physics,biology);
        s1.addBulkExamNote(100,78,50);
        s1.isPass();

        Student s2 = new Student("Bella","234","2",physics,history,biology);
        s2.addBulkExamNote(60,52,48);
        s2.isPass();
    }
}
