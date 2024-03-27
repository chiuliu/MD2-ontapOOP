package ra.entity;

import ra.entity.Categories;
import ra.entity.Product;

import java.util.Scanner;

public class ShopManagement {
    static Scanner scanner = new Scanner(System.in);
    static Categories[] arrCategories = new Categories[100];
    static Product[] products = new Product[100];
    static int countCategory = 0;

    public static void main(String[] args) {
        while (true) {
            System.out.println("******************SHOP MENU*******************\n" +
                    "1. Quản lý danh mục sản phẩm\n" +
                    "2. Quản lý sản phẩm\n" +
                    "3. Thoát\n");
            System.out.println("mời bạn nhập lựa chọn");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    displayCategoryManagement();
                    break;
                case 2:
                    displayProductManagement();
                    break;
                case 3:
                    return;
                default:
                    System.out.println("không hợp lệ, mời nhập lại");
                    break;
            }
        }
    }

    public static void displayCategoryManagement() {
        while (true) {
            System.out.println("********************CATEGORIES MENU***********\n" +
                    "1. Nhập thông tin các danh mục\n" +
                    "2. Hiển thị thông tin các danh mục\n" +
                    "3. Cập nhật thông tin danh mục\n" +
                    "4. Xóa danh mục\n" +
                    "5. Cập nhật trạng thái danh mục\n" +
                    "6. Thoát\n");
            System.out.println("mời bạn nhập lựa chọn");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    addCategory();
                    break;
                case 2:
                    displayCategory();
                    break;
                case 3:
                    updateCategory();
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    return;
                default:
                    break;
            }
        }
    }


    // thêm danh mục
    public static void addCategory() {
        System.out.println("bạn muốn thêm mấy danh mục");
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            arrCategories[countCategory] = new Categories();
            arrCategories[countCategory].inputData(scanner, arrCategories);
            countCategory++;
        }
    }

    // in danh mục
    public static void displayCategory() {
        for (int i = 0; i < countCategory; i++) {
            arrCategories[i].displayData();
        }
    }

    // update danh mục
    public static void updateCategory() {
        System.out.println("mời bạn nhập id danh mục muốn update");
        int idEdit = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < countCategory; i++) {
            if (arrCategories[i].getCategoryId() == idEdit) {
                System.out.println("thông tin chưa sửa là ");
                arrCategories[i].displayData();

                System.out.println("mời bạn nhập thông tin cần sửa");
                arrCategories[i].inputData(scanner, arrCategories);

                System.out.println("thông tin sau khi sửa là ");
                arrCategories[i].displayData();
            }
        }
    }

    //

    public static void displayProductManagement() {
        while (true) {
            System.out.println("*******************PRODUCT MANAGEMENT*****************\n" +
                    "1. Nhập thông tin các sản phẩm\n" +
                    "2. Hiển thị thông tin các sản phẩm\n" +
                    "3. Sắp xếp các sản phẩm theo giá\n" +
                    "4. Cập nhật thông tin sản phẩm theo mã sản phẩm\n" +
                    "5. Xóa sản phẩm theo mã sản phẩm\n" +
                    "6. Tìm kiếm các sản phẩm theo tên sản phẩm\n" +
                    "7. Tìm kiếm sản phẩm trong khoảng giá a – b (a,b nhập từ bàn\n" +
                    "phím)\n" +
                    "8. Thoát\n");
        }
    }
}