package com.example.demo.service.impl;

import com.codingapi.tx.annotation.ITxTransaction;
import com.codingapi.tx.annotation.TxTransaction;
import com.example.demo.dao.TestMapper;
import com.example.demo.entity.Test;
import com.example.demo.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by lorne on 2017/6/26.
 */
@Service
public class DemoServiceImpl implements DemoService, ITxTransaction {

    @Autowired
    private TestMapper testMapper;


    @Override
    public List<Test> list() {
        return testMapper.findAll();
    }


    @Override
    @Transactional
    @TxTransaction
    public int save() {

        int rs = testMapper.save("mybatis-hello-2");

        return rs;
    }

    @Override
    public int saveByName(String name) {
        return testMapper.save(name);
    }

    @Override
    public int deleteById(Integer id) {
        return testMapper.delete(id);
    }

    @Override
    public int update(Integer id, String name) {
        return testMapper.update(1,"1");
    }
}
