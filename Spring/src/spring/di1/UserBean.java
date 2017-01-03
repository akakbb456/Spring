package spring.di1;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class UserBean {

//   @Autowired                 타입으로 의존관계 설정(스프링 전용)
//   @Qualifier("userService2")   
//   @Resource                   //이름으로 의존관계 설정(자바 전용 JDK6.0 이상에서만 사용가능)
   
	// @Injex // 타입으로 의존관계 설정. 자바전용( javax.injex-x.x.x.jar 필요)
	@Resource(name="userService1") // 이름으로 의존관계 설정. 자바전용. (JDK 6.0
   private UserService userService;

   
   
   public void excute(){
      System.out.println(userService.msg());
   }
}