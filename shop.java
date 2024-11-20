import java.util.ArrayList;
import java.util.Scanner;

public class shop {
    private ArrayList<item> items;


    public shop() {
        this.items = new ArrayList<>();
    }


    public void add_product(String name, String category, String sku) {
        item newItem = new item(name, category, sku);
        items.add(newItem);
        System.out.println("Product added: " + newItem);
    }


    public void remove_product(String sku) {
        boolean removed = items.removeIf(item -> item.getSku().equals(sku));
        if (removed) {
            System.out.println("Product with SKU " + sku + " has been removed.");
        } else {
            System.out.println("No product found with SKU: " + sku);
        }
    }

    public void edit_product(String sku, String newName, String newCategory) {
        for (item item : items) {
            if (item.getSku().equals(sku)) {
                item.setName(newName);
                item.setCategory(newCategory);
                System.out.println("Product updated: " + item);
                return;
            }
        }
        System.out.println("No product found with SKU: " + sku);
    }


    public void delete_product(String sku) {
        remove_product(sku);
    }


    public void displayProducts() {
        if (items.isEmpty()) {
            System.out.println("No products in the shop.");
        } else {
            System.out.println("Products in the shop:");
            for (item item : items) {
                System.out.println(item);
            }
        }
    }


    public static void main(String[] args) {
        shop shop = new shop();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nShop Management System:");
            System.out.println("1. Add Product");
            System.out.println("2. Remove Product");
            System.out.println("3. Edit Product");
            System.out.println("4. Delete Product");
            System.out.println("5. Display Products");
            System.out.println("6. Exit");

            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter product name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter product category: ");
                    String category = scanner.nextLine();
                    System.out.print("Enter product SKU: ");
                    String sku = scanner.nextLine();
                    shop.add_product(name, category, sku);
                    break;

                case 2:
                    System.out.print("Enter SKU of the product to remove: ");
                    String removeSku = scanner.nextLine();
                    shop.remove_product(removeSku);
                    break;

                case 3:
                    System.out.print("Enter SKU of the product to edit: ");
                    String editSku = scanner.nextLine();
                    System.out.print("Enter new name: ");
                    String newName = scanner.nextLine();
                    System.out.print("Enter new category: ");
                    String newCategory = scanner.nextLine();
                    shop.edit_product(editSku, newName, newCategory);
                    break;

                case 4:
                    System.out.print("Enter SKU of the product to delete: ");
                    String deleteSku = scanner.nextLine();
                    shop.delete_product(deleteSku);
                    break;

                case 5:
                    shop.displayProducts();
                    break;

                case 6:
                    System.out.println("Exiting Shop Management System. Goodbye!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}