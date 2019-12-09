package com.jsti.data.extract.transform;

import com.jsti.data.extract.entity.tran.TranEntity;

import java.util.List;

//项目信息转换
public interface ITransForm<E,V> {
    public TranEntity<V> doTransForm(List<E> oldList);
}
