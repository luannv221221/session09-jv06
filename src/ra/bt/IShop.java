package ra.bt;

import ra.bt.entity.Category;

import java.util.List;
import java.util.Scanner;

public interface IShop {
    void inputData(Scanner scanner, List<Category> categories);
    void displayData();
}
