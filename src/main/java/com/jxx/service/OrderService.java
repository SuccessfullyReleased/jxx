package com.jxx.service;

import com.jxx.entity.User;

public interface OrderService {

    User insertOrder(int uid, int gid, int aid, int amount);

    User insertOrder(int uid, int oid);

    User deleteOrder(int uid,int oid);

}
