package spring.di3.user2;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component // 객체가 생성된다
public class UserBean {

   @Resource(name="userService")
   private UserService userService;

   public void excute(){
      System.out.println(userService.msg());
   }
}