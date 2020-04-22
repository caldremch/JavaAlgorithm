package parameter;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

public class Utils {

    public static <T> T getInstance(Object o) {

        try {
            //项目特殊原因, 分页的时候, 将会有两个泛型

//            JLog.e("[getInstance]参数o-->" + o.getClass().getName());

            Type type = o.getClass().getGenericSuperclass();

            if (type == null) {
                return null;
            }

//            JLog.e("[getInstance]type-->" + type.getClass().getName());

            ParameterizedType parameterizedType = null;
            if (type instanceof ParameterizedType) {
                parameterizedType = (ParameterizedType) type;
            }

            if (parameterizedType == null) {
                return null;
            }

//            JLog.e("[getInstance]parameterizedType-->" + parameterizedType.getClass().getSimpleName());

            Type[] types = parameterizedType.getActualTypeArguments();

            if (types.length == 0) {
                return null;
            }

//            JLog.e("[getInstance]types.size()-->" + types.length);


            Type realType = parameterizedType.getActualTypeArguments()[0];

//            JLog.e("[getInstance]realType-->" + realType.getClass().getSimpleName());

            if (types.length == 2) {
                Type secondType = parameterizedType.getActualTypeArguments()[1];
//                JLog.e("[getInstance]secondType-->" + ((Class) secondType).getSimpleName());

            }

            Class<T> clz = (Class<T>) realType;

//            JLog.e("[getInstance]clz-->" + clz.getSimpleName());

//            ToastUtils.show("clz = "+clz.getSimpleName());

            return clz.newInstance();

        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }
}
