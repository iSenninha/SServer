package cn.senninha.db.dao;

import java.util.List;
import java.util.Map;

/**
 * 增删改查接口
 * Coded by senninha on 18-1-20
 */
public interface CommonDao<T> {
    public List<T> selectAll();
    public T selectOne(int id);
    public int update(T t);
    public int insert(T t);
    public int delete(int id);
    public List<T> selectByPage(Map<String, Object> map);
}
