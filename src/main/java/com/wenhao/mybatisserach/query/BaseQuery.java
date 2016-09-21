package com.wenhao.mybatisserach.query;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/9/21 0021.
 */
public abstract class BaseQuery {
    //创建list用于存放sql
    private List<String> condtion = new ArrayList<String>();

    //用于子类调用该方法进行sql的添加
    protected void addQuery(String sql) {
        condtion.add(sql);
    }

    //子类拼接自己的sql
    protected abstract void customizeSql();

    public String getQuerySql() {
        StringBuilder sql = new StringBuilder();
        //获得子类拼接的sql
        this.customizeSql();
        if (condtion.size() > 0) {
            sql.append(" where ");
            //设置一个状态值
            boolean isNotFirst = true;
            for (String c : condtion) {
                //如果是第一条就不添加add，并且将状态值设置为false
                if (isNotFirst) {
                    sql.append(c);
                    isNotFirst = false;
                } else {
                    //不是第一条就添加and
                    sql.append(" and ").append(c);
                }
            }
        }
        return sql.toString();
    }
}
