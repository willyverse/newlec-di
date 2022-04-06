package spring.di;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import spring.di.ui.ExamConsole;

public class Program {

	public static void main(String[] args) {

		/* ���������� �����ϴ� ������� �ڵ带 ���� -> setting.xml�� bean�� ����
		Exam exam = new NewlecExam();
		ExamConsole console = new GridExamConsole();
		
		console.setExam(exam);
		*/
		
		/* xml ������ �̿����� �ʰ�, ������̼����� ��� �� �����ϱ� ���� �ּ� ó��
		ApplicationContext context =
				new ClassPathXmlApplicationContext("spring/di/setting.xml");
		*/
		
		ApplicationContext context =
				new AnnotationConfigApplicationContext(NewlecDIConfig.class);
		
		// Exam exam = context.getBean("exam", Exam.class);
		// System.out.println(exam.toString());
		
		ExamConsole console = context.getBean("console", ExamConsole.class);
		console.print();
		
		
		/*
		List<NewlecExam> exams = context.getBean("exams", ArrayList.class);
		
		for(Exam e: exams) {
			System.out.println(e);
		}
		*/
	}

}
