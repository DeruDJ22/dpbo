package minggu_3;

class student {
    public String studentName;
    public String studentId;
    public int korean;
    public int english;
    public int math;

    public student(String studentName, String studentId, int korean, int english, int math) {
        this.studentName = studentName;
        this.studentId = studentId;
        this.korean = korean;
        this.english = english;
        this.math = math;
    }

    public double calculateAverage() {
        return (korean + english + math) / 3.0;
    }

    public void changeStudentId(String newId) {
        this.studentId = newId;
    }

    public void studentInfo() {
        System.out.println("Nama Mahasiswa: " + studentName);
        System.out.println("ID Mahasiswa: " + studentId);
        System.out.println("Nilai Korean: " + korean);
        System.out.println("Nilai English: " + english);
        System.out.println("Nilai Math: " + math);
        System.out.println("Rata- rata: " + calculateAverage());
    }
}
