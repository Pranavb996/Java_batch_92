package student;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Student s[] = new Student[5];

		int ch = 0;
		int i = 0;
		int sid = 100;
		int i1;
		do {
			System.out.println(
					"Menu: \n1.Add Student \n2.Display Student \n3.Update student \n4.Delete Student \n5.exit ");
			System.out.println("Enter your choice: ");
			ch = sc.nextInt();
			switch (ch) {
			case 1:

				System.out.println("Enter roll number : ");
				int roll = sc.nextInt();
				System.out.println("Enter name : ");
				String name = sc.next();
				s[i] = new Student(roll, name, sid);
				sid++;
				i++;

				break;

			case 2:
				System.out.println("Student record : ");
				for (i1 = 0; i1 < s.length; i1++) {
					try {

						s[i1].display(s);

						System.out.println("Student id : " + s[i1].sid);
						System.out.println();

					} catch (NullPointerException e) {
						break;
					}
				}

				break;

			case 3:
				System.out.println("Enter Student id: ");
				int updateid = sc.nextInt();
				System.out.println("Enter choice : \n1.Edit rollno \n2.Edit name");
				int ch1 = sc.nextInt();
				switch (ch1) {

				case 1:
					System.out.println("Enter new roll number : ");
					int updateroll = sc.nextInt();
					s[updateid] = new Student(updateroll, s[updateid].name, sid);
					break;

				case 2:

					System.out.println("Enter new name : ");
					String update_name = sc.next();
					s[updateid] = new Student(s[updateid].roll, update_name, sid);
					break;
				}

			case 4:
				System.out.println("Enter Student roll no: ");
				int deleteroll = sc.nextInt();
				int k = 0;
				for (int i2 = 0; i2 < s.length; i2++) {

					if (s[i2] == s[deleteroll]) {
						s[deleteroll] = new Student(0, null, sid);
						System.out.println("Record deleted successfully !");
						k = 1;
						break;

					}

				}
				if (k == 0) {
					System.out.println("Roll number not present!");
				}
				break;

			case 5:
				System.out.println("Thank You !");
				System.exit(0);
				break;

			default:
				System.out.println("Wrong input! ");

			}
		} while (ch != 5);
		sc.close();

	}

}
