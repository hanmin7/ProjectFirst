package interfaces;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EmpMain {
	static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
		// 1.입력 2.전체리스트 3.수정 4.삭제 5.종료
		EmpService service = new EmpServiceImpl();

		while (true) {
			System.out.println("=======================================");
			System.out.println("1.입력 2.전체리스트 3.수정 4.삭제 5.종료");
			System.out.println("=======================================");
			System.out.print("선택> ");
			int menu = 0;
			try {
				menu = scn.nextInt();
			} catch(InputMismatchException e) {
				System.out.println("다시 입력하세요");
				scn.nextLine();
			}
			
			
			if (menu == 1) {
				System.out.println("사원번호 입력 : ");
				int empId = 0;
				try {
					empId = scn.nextInt();
				} catch (InputMismatchException e) {
					System.out.println("숫자를 입력하세요");
					scn.nextLine();
					empId = excute("사원번호 입력: ");
				}
				scn.nextLine();
				
				System.out.println("성 입력 : ");
				
				String lastName = null;
				try {
					lastName = scn.nextLine();
				} catch (InputMismatchException e) {
					System.out.println("성을 입력하세요");
					scn.nextLine();
					lastName = excute1("성 입력: ");
				}
				scn.nextLine();
				
				System.out.println("급여 입력 : ");
				int salary = scn.nextInt();
				scn.nextLine();
				System.out.println("입사일 입력(2020/05/05) : ");
				String hireDate = scn.nextLine();

				Employee emp = new Employee(empId, lastName, salary, hireDate);
				service.createEmp(emp);

			} else if (menu == 2) {
				service.getEmpList();

			} else if (menu == 3) {
				System.out.print("변경 사원번호 입력 : ");
				int empId = scn.nextInt();
				System.out.print("급여 입력 : ");
				int salary = scn.nextInt();
				Employee emp = new Employee(empId, "", salary, "");
				service.changeEmp(emp);

			} else if (menu == 4) {
				System.out.print("삭제할 사원번호 입력 : ");
				int empId = scn.nextInt();
				service.removeEmp(empId);

			} else if (menu == 5) {
				break;
			}
		} // while
		System.out.println("프로그램 종료.");
	}
	
	public static int excute(String str) {
		int menu = 0;
		while(true) {
			System.out.println(str);
			try{
				scn.nextInt();
				break;
			} catch (Exception e) {
				System.out.println("다시 입력하세요");
				scn.nextLine();
			}
		}
		return menu;
	}
	
	public static String excute1(String str) {
		String menu = null;
		while(true) {
			System.out.println(str);
			try{
				scn.nextInt();
				break;
			} catch (Exception e) {
				System.out.println("다시 입력하세요");
				scn.nextLine();
			}
		}
		return menu;
	}
	
}
