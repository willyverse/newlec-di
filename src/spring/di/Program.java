package spring.di;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import spring.di.ui.ExamConsole;

public class Program {

	public static void main(String[] args) {

		/* 스프링에게 지시하는 방법으로 코드를 변경 -> setting.xml에 bean을 세팅
		Exam exam = new NewlecExam();
		ExamConsole console = new GridExamConsole();
		
		console.setExam(exam);
		*/
		
		/* xml 파일을 이용하지 않고, 어노테이션으로 모든 걸 세팅하기 위해 주석 처리
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
