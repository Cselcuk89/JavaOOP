package javaOop;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
//        var textBox1 = new TextBox();
//        textBox1.setText("Box 1");
//        System.out.println(textBox1.text);
//
//        var textBox2 = new TextBox();
//        textBox2.setText("Box 2");
//        System.out.println(textBox2.text);
//        textBox2 = textBox1;
//        textBox2.setText("Hello World");
//        System.out.println(textBox1.text);
        var employee = new Employee();
        employee.setBaseSalary(50_000);
        employee.setHourlyRate(20);
        employee.getBaseSalary();
        int wage = employee.calculateWage(10);
        System.out.println(wage);

    }
}