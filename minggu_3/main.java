package minggu_3;

public class main {
    public static void main(String[] args) {
        String nama = "Deru Khairan Djuharianto";
        String id = "22022005";
        int korean = 85;
        int english = 90;
        int math = 95;

        student DataMahasiswa = new student(nama, id, korean, english, math);
        DataMahasiswa.studentInfo();
        DataMahasiswa.changeStudentId("103022300101");
        DataMahasiswa.studentInfo();
    }
}
