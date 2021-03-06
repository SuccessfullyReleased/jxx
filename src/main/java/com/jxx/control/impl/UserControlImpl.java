package com.jxx.control.impl;

import com.jxx.control.UserControl;
import com.jxx.entity.User;
import com.jxx.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping(value = "user")
public class UserControlImpl implements UserControl {

    @Autowired
    UserService userService;

    @RequestMapping(value = "insertUser", method = RequestMethod.POST)
    @Override
    public User insertUser(@RequestParam("username") String username,
                          @RequestParam("password") String password) {
        return userService.insertUser(username, password);
    }

}
