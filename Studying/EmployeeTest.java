package Studying;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee empOne = new Employee("LiuXingyu");
        Employee empTwo = new Employee("Tslasjfk");

        //调用这两个对象的成员方法
        empOne.empAge(22);
        empOne.empDesignation("高级程序员");
        empOne.empSalary(100000);
        empOne.printEmployee();

        System.out.println("----------------");

        empTwo.empAge(35);
        empTwo.empDesignation("菜鸡");
        empTwo.empSalary(5000);
        empTwo.printEmployee();
    }
}
