package parameter;

public class BaseActivity<T> {

    T adapter;
    public void init(){
       adapter =  Utils.getInstance(this);
    }

}
