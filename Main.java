package IceCreamProject;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static ArrayList<IceCream> IceCreams = new ArrayList<IceCream>();

    public static boolean alreadyExists(IceCream I) {
        boolean flag = false;
        for (IceCream x : IceCreams) {
            if (x.equals(I)) {
                flag = true;
            }
        }
        return flag;
    }

    public static IceCream findMaxIceCream() {
        IceCream max = IceCreams.get(0);
        for (IceCream I : IceCreams) {
            if (I.getIceCreamPrice() > max.getIceCreamPrice()) {
                max = I;
            }
        }
        return max;
    }

    public static void searchByComapny(String company) {
        for (IceCream I : IceCreams) {
            if (I.getIceCreamCompany().equals(company)) {
                System.out.println(I.toString());
            }
        }
    }

public static void sortByPrice() {
     for (int i = 0; i < IceCreams.size(); i++) {
         for (int j = i; j < IceCreams.size(); j++) {
    if (IceCreams.get(i).getIceCreamPrice() > IceCreams.get(j).getIceCreamPrice()) {
          IceCream temp = IceCreams.get(i);
          IceCreams.set(i, IceCreams.get(j));
         IceCreams.set(j, temp);
                }
            }
        }
    }

    public static void main(String[] args) {
        IceCream I1 = new IceCream("Vanilla", "Igloo", 250.0);
        IceCream I2 = new IceCream("Chocolate", "Igloo", 360.0);
      

        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("1. Enter an IceCream\n2. Exit");
            int x = input.nextInt();
            if (x == 2) {
                break;
            } else if (x == 1) {
                System.out.println("Type: ");
                String type = input.next();
                System.out.println("Company: ");
                String company = input.next();
                System.out.println("Price: ");
                double price = input.nextDouble();
                IceCream I = new IceCream(type, company, price);
                if (alreadyExists(I)) {
                    System.out.println("IceCream already exists in the arraylist");
                } else {
                    IceCreams.add(I);
                    System.out.println("IceCream added successfully!");
                }
            }
        }
        System.out.println("Items in the arraylist: ");
        for (IceCream p : IceCreams) {
            System.out.println(p.toString());
        }
        System.out.println("IceCream with highest price: ");
        System.out.println(findMaxIceCream());

        System.out.println("After Sorting: ");
        sortByPrice();
        for (IceCream I : IceCreams) {
            System.out.println(I.toString());
        }

        System.out.println("Enter the company name you are looking for: ");
        String company = input.next();
        searchByComapny(company);

        input.close();
    }
}
