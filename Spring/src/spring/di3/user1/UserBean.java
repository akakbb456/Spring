package spring.di3.user1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component // ��ü�� �����ȴ�
public class UserBean {

   @Autowired // �������踦 �ڷ��������� �����ϰټ�
   private UserService userService;

   public void excute(){
      System.out.println(userService.msg());
   }
}