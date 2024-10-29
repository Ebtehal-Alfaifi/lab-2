import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


//        1.Write a program to find all of the longest word in a given dictionary
//        ArrayList<String> name = new ArrayList<>();
//        ArrayList<String> newarrylist = new ArrayList();
//        name.add("cat");
//        name.add("dog");
//        name.add("red");
//        name.add("is");
//        name.add("am");
//        int maxLength = 0;
//        for (String i : name) {
//            if (i.length() > maxLength) {
//                maxLength = i.length();
//            }
//        }
//        for (String i : name) {
//            if (i.length() == maxLength) {
//                newarrylist.add(i);
//            }
//        }
//        System.out.print(newarrylist);
//    }}


//        2. Write a program that displays the number of occurrences of an element in the array.
//        ArrayList<Integer> num = new ArrayList<>();
//        num.add(1);
//        num.add(1);
//        num.add(1);
//        num.add(3);
//        num.add(3);
//        num.add(5);
//        ArrayList<Integer> numbers = new ArrayList<>();
//        // عشان اخزن فيها القيم الجديدة
//
//        for (int n : num) {   // استخدمت فور اول واحده عشان اتأكد اذا الرقم موجود او لا اذا كان موجود قلت له يضيفه
//            if (!numbers.contains(n)) {
//                int count = 0;
//                for (int m : num) {
//                    if (m == n) {                                                                    //مع الارقام دائما بتستخدمين == بدل كلمة equal
//                        count++;
//                    }                                     // استخدمت فور اول واحده عشان اتأكد اذا الرقم موجود او لا اذا كان موجود قلت له يضيفه
//                }
//                System.out.println(n + " occurs " + count + " times");
//                numbers.add(n);
//            }
//        }
//
//        int elementToCheck = 7; // فرضت قيمة من عندي
//        int count = 0;
//        for (int m : num) {                                                // استخدمت هذي الفور عشان اخليه يقارن اذا القيمه الي اضفتها موجودة او لا وكم تكررت مرات
//            if (m == elementToCheck) {
//                count++;
//            }
//        }
//        System.out.println(elementToCheck + " occurs " + count + " times");
//    }
//}
//***************************************************************************************


//
//        4. Create a method to reverse an array of integers. Implement the method without creating a new
//                array.

//            int[] array = {5, 4, 3, 2, 1};
//            reversearray(array);
//        System.out.println("the reverc number");
//            for (int num : array) {
//                System.out.print( num + " ");
//            }
//        }
//
//    public static void reversearray(int[] array) {
//        int left = 0;
//        int right = array.length - 1;
//        while (left < right) {
//            int temp = array[left];
//            array[left] = array[right];
//            array[right] = temp;
//            left++;
//            right--;
//        }
//    }
//}


//        5. Write a menu driven Java program with following option:
//
        Scanner eb = new Scanner(System.in);
//        System.out.print(" enter the size of Array ");
//        int size = eb.nextInt();
//        int[] array = new int[size];
//        boolean exit = false;
//        while (!exit) {
//            System.out.println("\nchose any number :");
//            System.out.println("  Accept elements of an array 1 ");
//            System.out.println(" Display elements of an array 2 ");
//            System.out.println(" Search the element within array 3");
//            System.out.println("Sort the array 4");
//            System.out.println(" Stop 5 ");
//
//            int choice = eb.nextInt();
//            switch (choice) {
//                case 1:
//                    acceptElements(array);
//                    break;
//                case 2:
//                    displayElements(array);
//                    break;
//                case 3:
//                    searchElement(array);
//                    break;
//                case 4:
//                    sortArray(array);
//                    break;
//                case 5:
//                    exit = true;
//                    break;
//                default:
//                    System.out.println(" enter right number");
//            }
//        }
//
//    }
//
//    public static void acceptElements(int[] array) {
//        Scanner e=new Scanner(System.in);
//        System.out.println("enter element of array");
//        for (int i = 0; i < array.length; i++) {
//            array[i] = e.nextInt();
//        }
//    }
//
//    public static void displayElements(int[] array) {
//        System.out.println("Array element");
//        for (int element : array) {
//            System.out.print(element + " ");
//        }
//        System.out.println();
//    }
//
//    public static void searchElement(int[] array) {
//        Scanner e=new Scanner(System.in);
//
//        System.out.print(" enter the element that you want to find ");
//        int key = e.nextInt();
//        boolean found = false;
//        for (int element : array) {
//            if (element == key) {
//                found = true;
//                break;
//            }
//        }
//        if (found) {
//            System.out.println("is fonded");
//        } else {
//            System.out.println("is not founded");
//        }
//    }
//
//    public static void sortArray(int[] array) {
//        Arrays.sort(array);
//        System.out.println(" Sort the array");
//    }
//}

 //


//        6. Create a method that generates a random number within a given range. Allow the user to
//        specify the range and call the method to display random numbers.

//        System.out.print("Enter the minimum value of the range: ");
//        int min = eb.nextInt();
//
//        System.out.print("Enter the maximum value of the range: ");
//        int max = eb.nextInt();
//
//        System.out.print("Enter the number of random numbers to generate: ");// تي فايدتها كم مره بيكرر الكود
//        int count = eb.nextInt();

        // استدعيت الداله وارسلت لها القيم المدخلة بواسطة اليوزر
//        randomnumber(min, max, count);
//    }
//
//    private static void randomnumber(int min, int max, int count) {
//        Random random = new Random();                       //  import java.util.Random;      دائما اذا بنشئ كائن من نوع راندوم استخدم
//        System.out.println("Random numbers within the specified range:");
//        for (int i = 0; i < count; i++) {
//            int randomNumber = random.nextInt(max - min + 1) + min; // يضمن توليد عدد عشوائي صحصح ضمن القيم المدخله
//            System.out.print(randomNumber);
//            if (i < count -1) {   // اضفت -1 في لاخير فقط لتنسيق لأن بدونها بينطبع بعد الرقم الاخير شرطة
//                System.out.print(" - ");
//            }
//        }
//        }}

//     ********************************************************************

//        7. Write a program that checks the strength of a password. Create a method that evaluates a
//        password based on criteria like length, inclusion of special characters, and
//        uppercase/lowercase letters.

//        System.out.print("Enter password: ");
//        String password = eb.nextLine();
//
//        int score = checkLength(password) + checkSpecialChar(password) + checkUpperLowerCase(password); //  بجمع النقاط الي من المثودات واقارنها ب 8و 5 و اقل من 5
//
//        if (score >= 8) {
//            System.out.println("Password is strong.");
//        } else if (score >= 5) {
//            System.out.println("Password is moderately strong.");
//        } else {
//            System.out.println("Password is weak.");
//        }
//    }
//
//    public static int checkLength(String password) {
//        if (password.length() >= 8) {
//            return 3;                                 // هنا بتأكد من شروط طول كلمة السر هل هي مطابقة او لا
//        } else if (password.length() >= 6) {
//            return 2;
//        } else {
//            return 0;
//        }
//    }
//
//    public static int checkSpecialChar(String password) {
//        if (password.matches(".*[!@%&*].*")) {   // احدد لو الرموز تي ابغاها حاضره في كلمة السر اذا كانت حاضره يرجع 2
//            return 2;
//        } else {
//            return 0;
//        }
//    }
//
//    public static int checkUpperLowerCase(String password) {
//        if (password.matches(".*[A-Z].*") && password.matches(".*[a-z].*"))      // matches استخدمها ل اتحقق اذا كلمة السر تتطابق مع الي حطيته داخل الاقواس
//         {
//            return 3;
//        } else {
//            return 0;
//        }
//    }
//}



















//        8. Create a method that generates the Fibonacci sequence up to a specified number of terms.
//                Hint: The Fibonacci sequence is a mathematical sequence of numbers that starts with 0 and 1,
//                and each subsequent number in the sequence is the sum of the two preceding ones.
//
//        System.out.print("Enter the number of Fibonacci terms to generate: ");
//        int term = eb.nextInt();
//
//        fibonacci(term); //ارسلت لها القيمه المدخله المكرر عليها
//    }                                                                   //تجمع كل رقم مع الي قبله
//
//    public static void fibonacci(int terms) {
//        int num1 = 0;
//        int num2 = 1;
//        System.out.print("Fibonacci sequence with " + terms + " terms: ");
//        for (int i = 1; i <= terms; ++i) {  // بيتوقف اذا وصل للعدد الي ادخله اليوزر
//            System.out.print(num1 + " ");
//
//            int nextn = num1 + num2;
//            num1 = num2;     // خليته يخزن القيمة الي كانت في 1 تصير بثنين ويكمل على هذا الاساس
//            num2 = nextn;     // خليتها بنفس الفور لأن كل مره بتجمع مع الرقم الي قبلها
//        }
//    }
//}
