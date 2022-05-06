/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package learningarray;

/**
 *
 * @author D'NIKE
 */
    class Student {
        public int roll_no;
        public String name;
        Student(int roll_no, String name) {
            this.roll_no = roll_no;
            this.name = name;
        }
    }

    public class LearningArray {

        public static void main(String[] args) {
            // declares an Array of integers.
            Student[] arr;

            // allocating memory for 5 objects of type Student.
            arr = new Student[5];

            // initialize the first elements of the array
            arr[0] = new Student(1, "Kanmi");

            // initialize the second elements of the array
            arr[1] = new Student(2, "Oladimeji");

            // so on...
            arr[2] = new Student(3, "Adebola");
            arr[3] = new Student(4, "John");
            arr[4] = new Student(5, "Robinson");

            // accessing the elements of the specified array
            for (int i = 0; i < arr.length; i++)
                System.out.println("Element at " + i + " : " + arr[i].roll_no +" "+ arr[i].name);


        }

    }
