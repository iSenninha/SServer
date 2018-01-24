package cn.senninha.web.authority;

import cn.senninha.sserver.lang.ClassFilter;
import cn.senninha.sserver.lang.ClassUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.lang.reflect.Method;
import java.util.*;

/**
 * Coded by senninha on 18-1-24
 */
public class AuthorityManager {
    private static AuthorityManager instance;
    private Set<String> levelURL[];
    private static final int levelNums = 2;
    private Map<String, HashSet<String>> userAuthority;
    private static Logger logger = LoggerFactory.getLogger(AuthorityManager.class);

    public static AuthorityManager getInstance(){
        if(instance == null){
            synchronized (AuthorityManager.class){
                if(instance == null){
                    instance = new AuthorityManager();
                }
            }
        }
        return instance;
    }

    private AuthorityManager(){
        init();
        logger.error("启动权限管理器成功");
    }

    private void init(){
        levelURL = new HashSet[levelNums];
        for(int i = 0 ; i < levelNums ; i++){
            levelURL[i] = new HashSet<>();
        }
        initURL();
        userAuthority = new HashMap<>();
    }

    /**
     * 扫描所有路径
     */
    private void initURL(){
        ClassUtil.scanPackage("cn", false, new ClassFilter<Object>() {
            @Override
            public boolean filter(Class<Object> clazz) {
                Controller controller = clazz.getAnnotation(Controller.class);
                if(controller != null){
                    Method[] methods = clazz.getDeclaredMethods();
                    for(Method m : methods){
                        RequestMapping requestMapping = m.getAnnotation(RequestMapping.class);
                        if(requestMapping != null){ //接口
                            String[] paths = requestMapping.path();
                            generatePath(paths);
                        }
                    }
                }
                return false;
            }

            private void generatePath(String[] paths){
                for(String path : paths){
                    String[] levels = path.split("/");
                    if(null == levels || levels.length == 0){
                        if(levels.length - 1 > levelNums)
                        logger.error("当前只配置了两级路径,[{}]不符合", path);
                        continue;
                    }
                    StringBuilder sb = new StringBuilder();
                    for(int i = 1 ; i < levels.length; i++){
                        sb.append("/");
                        sb.append(levels[i]);
                        levelURL[i - 1].add(sb.toString());
                    }
                }
            }
        });
    }

    /**
     * 获取路径集合
     * @param level 几级路径
     * @return
     */
    public List<String> getURLS(int level){
        if(level <= 0 || level > levelNums){
            throw new IllegalArgumentException("only has " + levelNums + " level url");
        }
        Iterator<String> iterator = levelURL[level - 1].iterator();
        List<String> list = new ArrayList<>();
        while(iterator.hasNext()){
            list.add(iterator.next());
        }
        return list;
    }
}
