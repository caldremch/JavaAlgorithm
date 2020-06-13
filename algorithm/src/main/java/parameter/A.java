package parameter;

import sun.misc.LRUCache;

public class A extends BaseActivity {

    public void start(){
        init();
    }

    public static void main(String[] args) {
        A a = new A();
        a.start();
        System.out.println("a.adapter  " + a.adapter);

        String c = "121";
        String b = "121";

        System.out.println(c==b);
        System.out.println(c.equals(b));

        LRUCache<String, A> cache = new LRUCache<String, A>(4) {
            @Override
            protected A create(String s) {
                return null;
            }

            @Override
            protected boolean hasName(A a, String s) {
                return false;
            }
        };

        cache.forName("asd");

    }
}
