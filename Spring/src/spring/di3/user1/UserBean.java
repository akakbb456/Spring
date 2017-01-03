package spring.di3.user1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component // 객체가 생성된다
public class UserBean {

   @Autowired // 의존관계를 자료형에따라 설정하겟소
   private UserService userService;

   public void excute(){
      System.out.println(userService.msg());
   }
}