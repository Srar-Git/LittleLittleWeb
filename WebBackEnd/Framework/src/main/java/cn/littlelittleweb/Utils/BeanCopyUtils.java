package cn.littlelittleweb.Utils;

import com.fasterxml.jackson.databind.util.BeanUtil;
import org.springframework.beans.BeanUtils;

import java.util.List;
import java.util.stream.Collectors;

public class BeanCopyUtils {

    private BeanCopyUtils(){}


    //单个对象拷贝
    public static <V> V copyBean(Object source, Class<V> targetClass){
        //创建目标对象
        V target = null;
        try {
            target = targetClass.newInstance();
            //实现属性拷贝
            BeanUtils.copyProperties(source, target);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        //返回结果
        return target;
    }

    public static <O,V> List<V> copyBeanList(List<O> list, Class<V> targetClass){
        return list.stream()
                .map(o -> copyBean(o, targetClass))
                .collect(Collectors.toList());
    }


}
