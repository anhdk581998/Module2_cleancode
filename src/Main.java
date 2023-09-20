import java.util.List;
import java.util.Scanner;

public class Main {
    static boolean isExit = true;

    public static void main(String[] args) {
        StudentManager studentManager = new StudentManager();
        double[] point2 = {1.2, 3.4, 4.5};
        Student student = new Student("Nam", "nam", point2);
        Student student1 = new Student("Anh", "nam", point2);
        Student student2 = new Student("Dan", "nam", point2);
        Student student3 = new Student("Mai", "nam", point2);
        studentManager.add(student);
        studentManager.add(student1);
        studentManager.add(student2);
        studentManager.add(student3);

        while (isExit) {
            System.out.println("0: Thoat");
            System.out.println("1: Hien thi danh sach");
            System.out.println("2: Hien thi diem trung binh cua lop");
            System.out.println("3: Tim kiem theo ten hoc sinh");
            System.out.println("4: Hien thi hoc sinh co diem trung binh lon nhat");


            Scanner scanner = new Scanner(System.in);
            System.out.println("Chon menu: ");
            String menu = scanner.nextLine();

            switch (menu) {
                case "1":
                    studentManager.showListStudent();
                    break;
                case "2":
                    System.out.println(studentManager.getAvgClazz());
                    break;
                case "3":
                    System.out.println("Nhap ten: ");
                    String name = scanner.nextLine();
                    List<Student> data = studentManager.getStudentByName(name);
                    for (Student item : data) {
                        System.out.println(item);
                    }
                case "0":
                    isExit = false;
                    break;
                case "4":
                    System.out.println("diem trung binh lon nhat la: "+ studentManager.getMaxAvg());
                    break;
            }
        }

    }

}