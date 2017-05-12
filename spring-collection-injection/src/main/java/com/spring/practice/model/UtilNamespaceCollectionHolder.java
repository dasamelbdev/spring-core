package com.spring.practice.model;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Created by dasun on 5/13/17.
 */
public class UtilNamespaceCollectionHolder {
    private List<Student> list;
    private Set<Student> set;
    private Map<String, Student> map;

    public List<Student> getList() {
        return list;
    }

    public void setList(List<Student> list) {
        this.list = list;
    }

    public Set<Student> getSet() {
        return set;
    }

    public void setSet(Set<Student> set) {
        this.set = set;
    }

    public Map<String, Student> getMap() {
        return map;
    }

    public void setMap(Map<String, Student> map) {
        this.map = map;
    }
}
