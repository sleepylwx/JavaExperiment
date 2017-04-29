package 实验二.ex3;

/**
 * Created by 36249 on 2016/10/21.
 */
public class ListTest  {

    public static void main(String[] args) {

        DoublelyLinkList doublelyLinkList = new DoublelyLinkList();

        doublelyLinkList.insert("abc");
        doublelyLinkList.insert("find");
        //Teacher a = new Teacher(1,"qwe",24,"qqq");
        //doublelyLinkList.insert(a);
        //doublelyLinkList.insert(new Teacher(2,"qwe",24,"qqq"));
        //doublelyLinkList.delete("abc");
        doublelyLinkList.delete(3);
       // doublelyLinkList.delete(a);
        doublelyLinkList.triverse();

    }
}
