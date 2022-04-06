package spring.di.ui;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import spring.di.entity.Exam;

@Component("console")
public class InlineExamConsole implements ExamConsole {

	@Autowired(required=false)
//	@Qualifier("exam") // 인스턴스 변수 위에 @Autowired를 붙일 땐 반드시 기본 생성자가 있어야 함
	private Exam exam;
	
	
	public InlineExamConsole() {
		System.out.println("basic constructor");
	}

	public InlineExamConsole(Exam exam) {
		System.out.println("overloaded constructor");
		this.exam = exam;
	}

	@Override
	public void print() {
		if (this.exam == null)
			System.out.printf("total is %d, avg is %f\n", 0, 0.1);
		else
			System.out.printf("total is %d, avg is %f\n", exam.total(), exam.avg());
	}
	

	@Override
	public void setExam(Exam exam) {
		this.exam = exam;
	}

}
