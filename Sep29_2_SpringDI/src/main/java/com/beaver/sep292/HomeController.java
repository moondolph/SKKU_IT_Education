package com.beaver.sep292;

import java.util.Locale;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.beaver.sep292.book.Book;
import com.beaver.sep292.dog.Dog;

@Controller
public class HomeController {
	
	// Spring : Java에서 IoC로 DI해주는 Framework 
	// 		객체를 .java에서 만들기
	//		객체를 외부파일(.xml)에 만들기 -> .java에서 불러서 사용하게끔 
	//		
	
	
	@RequestMapping(value = "/", method = RequestMethod.GET)	//@RequestMapping -->요청에 따라 어떤 컨트롤러, 메소드가 처리될 지 매핑하기 위해 사용			
	public String home(Locale locale, Model model) {
		
		// 원래는 이렇게 객체를 만들었다면...
//		Dog d = new Dog("개", 3);
//		System.out.println(d.getName());
//		System.out.println(d.getAge());
	
		// sep292beans.xml 불러오기 -> xml파일에 등록해놓은 객체를 만들어서 
		// AbstractApplication : Bean 객체를 생성하고 관리하는 기능
		AbstractApplicationContext aac = new ClassPathXmlApplicationContext("sep292beans.xml");
		
		// aac가 없어질 때 등록해놓은 객체들을 다 없애라 
		aac.registerShutdownHook();
		
		// id가 d인 강아지 객체를 불러오기 
		Dog d = aac.getBean("d", Dog.class); // xml 객체 불러오기
		System.out.println(d);
		
		// DI (Dependency Injection - 의존성 주입)
		//		xml에서 객체를 만들고, 속성값 넣고
		//		java에서 가져다쓰는 
		
		Dog d2 = aac.getBean("d2",Dog.class);
		System.out.println(d2.getName());
		System.out.println(d2.getAge());
		System.out.println("--------------");
		
		Dog d3 = aac.getBean("d3", Dog.class);
		System.out.println(d3.getName());
		System.out.println(d3.getAge());
		System.out.println("----------------");
		
		// 책 객체를 만들어서 이름-가격 출력
		
		Book b = aac.getBean("b", Book.class);
		System.out.println(b);
		System.out.println(b.getName());
		System.out.println(b.getPrice());
		
		
		
		
		
		// aac 없애기
		aac.close();
		

		return "home";
	}
	
}
