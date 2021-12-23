import java.util.Scanner;

public class MainStudent {
    public static void main(String[] args) {


        ManageStudent manageStudent = new ManageStudent();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("danh sách chọn");
            System.out.println("1.hiển thị tất cả sinh viên ");
            System.out.println("2. thêm sinh viên theo id");
            System.out.println("3.sửa sinh viên theo id ");
            System.out.println("4.xóa sinh viên theo id ");
            System.out.println("5.tìm kiếm sinh viên theo id");
            System.out.println("6.in ra danh sách được xắp xếp theo điểm trung bình ");
            System.out.println("7.sinh viên có điểm cao nhất ");
            System.out.println("0. thoát");

            System.out.print("Mời bạn nhập: ");

            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("hiển thị tất cả sinh viên");
                    ManageStudent.displayAllStudent();
                    break;
                case 2:
                    System.out.println("thêm sinh viên theo id ");
                    ManageStudent.displayAddByid();

                    break;
                case 3:
                    System.out.println("sửa sinh viên theo id");
                    ManageStudent.displayEditByid();
                    break;
                case 4:
                    System.out.println("xóa sinh viên theo id");
                    ManageStudent.displayDeleteByid();
                    break;
                case 5:
                    System.out.println("hiển thị tất cả sinh viên");
                    ManageStudent.displaySearchByid();
                    break;
                case 6:
                    System.out.println("in ra danh sách được xắp xếp theo điểm trung bình");
                    ManageStudent.displayAVG();
                    break;
                case 7:
                    System.out.println(".sinh viên có điểm cao nhất");
                    ManageStudent.displayMaxscore();
                    break;
            }
        } while (choice != 0);

    }
}
