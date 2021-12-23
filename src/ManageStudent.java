import java.util.ArrayList;
import java.util.Scanner;

public class ManageStudent {
    static ArrayList<Student> students = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    public static void displayAllStudent(){
        for (Student student: students) {
            System.out.println(student);
        }
    }
    public static void displayAddByid(){
        System.out.print("nhập id ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.print("nhập tên: ");
        String name = scanner.nextLine();
        scanner.nextLine();
        System.out.print("Enhập tuổi: ");
        int age = scanner.nextInt();
        System.out.print("Enhập điểm toán: ");
        double mathScore = scanner.nextDouble();
        System.out.print("nhập điểm lý: ");
        double physicalScore = scanner.nextDouble();
        System.out.print("nhập điểm hóa ");
        double chemistryScore = scanner.nextDouble();
        Student student = new Student(id,name,age,mathScore,physicalScore,chemistryScore);
        students.add(student);
        System.out.println("thêm thành công");

    }
    public static void displayEditByid(){
        System.out.print("nhập id sinh viên bạn muốn sửa: ");
        int id = scanner.nextInt();
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getId() == id) {
                scanner.nextLine();
                System.out.print("nhập tên ");
                String name = scanner.nextLine();
                scanner.nextLine();
                System.out.print("nhập tuổi: ");
                int age = scanner.nextInt();
                System.out.print("nhập điểm toán: ");
                double mathScore = scanner.nextDouble();
                System.out.print("nhập điểm lý: ");
                double physicalScore = scanner.nextDouble();
                System.out.print("nhập điểm hóa: ");
                double chemistryScore = scanner.nextDouble();
                Student newStudent = new Student(id,name,age,mathScore,physicalScore,chemistryScore);
                students.set(i,newStudent);
                break;
            }
        }
        System.out.println("id không tồn tại");

    }
    public static void displayDeleteByid(){
        System.out.print("Nhập id sinh viên bạn muốn xóa: ");
        int id = scanner.nextInt();
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getId() == id) {
                students.remove(students.get(i));
            }
        }

    }
    public static void displaySearchByid(){
        System.out.print("nhập id sinh viên bạn muốn tìm: ");
        int id = scanner.nextInt();
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getId() == id) {
                System.out.println(students.get(i));
            }
        }

    }
    public static void displayAVG(){

    }
    public static void displayMaxscore(){
        double max = students.get(0).getMathscore() + students.get(0).getPhysicalscore() + students.get(0).getChemicalscore();
        int i;
        for (i = 0; i < students.size(); i++) {
            if (students.get(i).getMathscore() + students.get(i).getPhysicalscore() + students.get(i).getChemicalscore() > max) {
                max = students.get(i).getMathscore() + students.get(i).getPhysicalscore() + students.get(i).getChemicalscore();
            }
        }
        System.out.println(students.get(i));
    }


}


