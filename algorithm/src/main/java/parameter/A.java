package parameter;

public class A extends BaseActivity {

    public void start(){
        init();
    }

    public static void main(String[] args) {
        A a = new A();
        a.start();
        System.out.println("a.adapter  " + a.adapter);
    }
}
