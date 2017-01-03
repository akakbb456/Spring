package spring.di2;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class UserBean {

   @Autowired // 의존관계를 자료형에따라 설정하겟소
   private UserService userService;

   public void excute(){
      System.out.println(userService.msg());
   }
}