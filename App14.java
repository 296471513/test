/**
 * @author Administrator
 */
public class App14 {
  public static void main(String[] args) {
    // 当条件为 true 时, 会一直执行里面的代码
    int a = 0;
    while (a < 5) {
      a++;
      System.out.println(a);
    }
    // do while 循环, 先执行代码然后在进行判断, 如果条件是 false 也会执行一次里面的代码
    do {
      System.out.println(999);
    } while (a > 5);
  }
}