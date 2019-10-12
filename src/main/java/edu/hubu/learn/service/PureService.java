package edu.hubu.learn.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.hubu.learn.dao.PureDao;
import edu.hubu.learn.entity.Pure;

@Service
public class PureService {

    @Autowired
    private PureDao pureDao;

    public Pure getPure(Long id) {
        return pureDao.findById(id).get();
    }

    public List<Pure> getPures(){
        return pureDao.findAll();
    }
}