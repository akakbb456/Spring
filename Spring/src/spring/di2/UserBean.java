package spring.di2;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class UserBean {

   @Autowired // �������踦 �ڷ��������� �����ϰټ�
   private UserService userService;

   public void excute(){
      System.out.println(userService.msg());
   }
}