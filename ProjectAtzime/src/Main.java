import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PhoneForWork Samsung = new PhoneForWork("Blue", 2021, "70x140", 300, 64);
        PhoneForWork Huawei = new PhoneForWork("Black", 2020, "60x135", 380, 128);
        PhoneForBuisness Samsung2 = new PhoneForBuisness("Black", 2022, "65x130", 480, 128);
        PhoneForBuisness Huawei2 = new PhoneForBuisness("Red", 2022, "62x133", 620, 256);
        PhoneForChill iPhone = new PhoneForChill("White", 2024, "60x130", 1100, 256);
        PhoneForChill iPhone2 = new PhoneForChill("Silver", 2023, "60x130", 920, 128);

        String str = "";
        String str2 = "";

        System.out.println("Choose Phone : \n1.PhoneForWork\n2.PhoneForBusiness \n3.PhoneForChill");
        int x = sc.nextInt();
        if (x == 1) {
            str += Samsung.printInfo() + "\n";
            str += Huawei.printInfo() + "\n";
        } else if (x == 2) {
            str2 += Samsung2.printInfo() + "\n";
            str2 += Huawei2.printInfo() + "\n";
        } else if (x == 3) {
            str += iPhone.printInfo() + "\n";
            str += iPhone2.printInfo()+ "\n";
        }

        ArrayList<Phone> phones = new ArrayList<>();

        for (Phone phone : phones) {
            str = phone.printInflo();
        }

        System.out.println(str);
        System.out.println(str2);

        try {
            FileWriter fw = new FileWriter("phones.txt");
            fw.write(str);
            fw.write(str2);
            fw.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}



