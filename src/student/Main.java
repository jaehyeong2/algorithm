package student;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Student st1 = new Student("학생a","201411111");
        Student st2 = new Student("학생b","201422222");
        Student st3 = new Student("학생c","201433333");

        List<Student> list = new ArrayList<>();
        list.add(st1);
        list.add(st2);
        list.add(st3);

        for (Student student : list) {
            System.out.println("student 이름 = " + student.getName());
            System.out.println("student 학번 = " + student.getNo());
        }

        Scanner sc = new Scanner(System.in);


        while (true){
            System.out.println("계속입력을 원하시면 y/ 아니면 n");
            String input = sc.next();

            if(input.equals("y")){
                System.out.println("이름을 입력해주세요");
                String name = sc.next();
                boolean flag = false;

                for(Student stu : list) {
                    if (stu.getName().equals(name)) {
                        System.out.println("해당학생의 학번은 " + stu.getNo() + "입니다");
                        flag = true;
                    }
                }

                    if(!flag){
                        System.out.println("존재하지 않는 학생입니다.");
                    }

            }else if (input.equals("n")){
                System.out.println("검색을 종료합니다.");
                break;
            }else {
                System.out.println("y나 n을 입력해주세요");
            }
        }
        System.out.println("종료되었습니다.");
    }
}
