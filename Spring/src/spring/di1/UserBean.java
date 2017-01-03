package spring.di1;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class UserBean {

//   @Autowired                 Ÿ������ �������� ����(������ ����)
//   @Qualifier("userService2")   
//   @Resource                   //�̸����� �������� ����(�ڹ� ���� JDK6.0 �̻󿡼��� ��밡��)
   
	// @Injex // Ÿ������ �������� ����. �ڹ�����( javax.injex-x.x.x.jar �ʿ�)
	@Resource(name="userService1") // �̸����� �������� ����. �ڹ�����. (JDK 6.0
   private UserService userService;

   
   
   public void excute(){
      System.out.println(userService.msg());
   }
}