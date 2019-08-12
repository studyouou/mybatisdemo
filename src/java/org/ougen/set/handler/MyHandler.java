package org.ougen.set.handler;

import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.MappedJdbcTypes;
import org.ougen.set.enumdate.MyEnum;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Author: OuGen
 * Discription:
 * Date: 22:11 2019/7/22
 */
public class MyHandler extends BaseTypeHandler<MyEnum> {

    @Override
    public void setNonNullParameter(PreparedStatement preparedStatement, int i, MyEnum myEnum, JdbcType jdbcType) throws SQLException {
        preparedStatement.setInt(i,myEnum.getCode());
    }

    @Override
    public MyEnum getNullableResult(ResultSet resultSet, String s) throws SQLException {
        int em = resultSet.getInt(s);
        return MyEnum.getFamat(em);
    }

    @Override
    public MyEnum getNullableResult(ResultSet resultSet, int i) throws SQLException {
        int em = resultSet.getInt(i);
        return MyEnum.getFamat(em);
    }

    @Override
    public MyEnum getNullableResult(CallableStatement callableStatement, int i) throws SQLException {
        int anInt = callableStatement.getInt(i);
        return MyEnum.getFamat(anInt);
    }
}
