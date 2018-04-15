package com.eric.base;

import java.util.List;
import java.util.Map;

/**
 * @项目名称：project-common
 * @类名称：BaseDao
 * @类描述：
 * @创建人：YangChao
 * @作者单位：北京宝库在线网络技术有限公司
 * @联系方式：YangChao@baoku.com
 * @创建时间：2016年9月5日 下午2:51:19
 * @version 1.0.0
 */
public interface BaseMapper<T> {

    public T selectByPrimaryKey(Integer id);

    public int deleteByPrimaryKey(Integer id);

    public int insertSelective(T t);

    public int updateByPrimaryKeySelective(T t);

    public List<T> getList(T t);

    public int getCountSelective(T t);

    /**
     *
     * @Title: findPage
     * @Description: TODO()
     * @param page
     *            分页参数
     * @param sql
     *            mybatis sql语句
     * @param values
     *            命名参数,按名称绑定
     * @return 分页查询结果, 附带结果列表及所有查询时的参数.
     * @author YangChao
     * @date 2016年9月7日 下午5:30:28
     */
//    public PageView<T> findPage(final PageView<T> page, final String sql, final Map<String, Object> values);
}