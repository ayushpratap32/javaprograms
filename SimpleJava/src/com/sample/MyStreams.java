package  com.sample;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MyStreams {

    private static List<Employee> allemployee=new ArrayList<>();

    static {

        Employee employee=new Employee("ayush","se","meerut",1400);
        allemployee.add(employee);
        Employee employee2=new Employee("zunaid","ase","fatehpur",5000);
        allemployee.add(employee2);
        Employee employee3=new Employee("vikram","pe","hapur",9000);
        allemployee.add(employee3);
        Employee employee4=new Employee("binod","ta","meerut",7200);
        allemployee.add(employee4);
    }

    public static void main(String[] args) {
        allemployee.stream().forEach(System.out::println);

        System.out.println("------------sort on name--------");
        allemployee.stream().sorted(Comparator.comparing(Employee::getName)).forEach(System.out::println);

        System.out.println("---------sort on city then on salary------------------");
        allemployee.stream().sorted(Comparator.comparing(Employee::getCity).thenComparing(Employee::getSalary,Comparator.reverseOrder())).forEach(System.out::println);

        System.out.println("---------------top 2 salary------------");
        allemployee.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).limit(2).forEach(System.out::println);

        System.out.println("-----------Distinct city List of Employee---------------");
        allemployee.stream().map(e->e.getCity()).distinct().forEach(System.out::println);

        System.out.println("--------------------------peek-----------------------");
        allemployee.stream().peek(e->e.setSalary(e.getSalary()+100)).forEach(System.out::println);

        System.out.println("---------------------skip and limit-------------------------");
        allemployee.stream().map(e->e.getDesignation()).skip(2).limit(1).forEach(System.out::println);


        System.out.println("------------------maptoint---------------------------------");
        int sum = allemployee.stream().mapToInt(e -> e.getName().length()).sum();
        System.out.println(sum);

        System.out.println("-----------------------summing salary------------------");
        Integer collect = allemployee.stream().mapToInt(Employee::getSalary).sum();
        System.out.println(collect);


    }
}
