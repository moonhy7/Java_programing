package ch09_2_anonymous.anonymous_class;

// �θ� Ŭ���� ����
class Person {
	void wake() {
		System.out.println("6�ÿ� �Ͼ�ϴ�.");
	}
}


// �͸� �ڽ� ��ü ������ Ŭ���� ����
public class Anonymous {
		
		// ��� 1. �ʵ��� �ʱⰪ���� ����
		Person field = new Person() {
			void work() {
				System.out.println("����մϴ�.");
			}
			
			@Override
			void wake() {
				System.out.println("6�ÿ� �Ͼ�ϴ�.");
				work();
			}
		};
		
		// ��� 2. ���� ������ ����
		void method1() {	
			//���� ���� ����
			Person localVar = new Person() {
				void walk() {
					System.out.println("��å�մϴ�.");
				}
				
				@Override
				void wake() {
					System.out.println("7�ÿ� �Ͼ�ϴ�.");
					walk();
				}
			};
			// ���� ���� ���
			localVar.wake();
		}
		
		// ��� 3. �Ű� ������ ����
		void method2(Person person) {
			person.wake();
		}
}
