package com.todo.app.controller;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.todo.domain.dto.LoginUser;

@Controller
public class IndexController {
  @RequestMapping(value = "/home", method = RequestMethod.GET)
  public String index(@AuthenticationPrincipal LoginUser loginUser) {
    // Object principal =
    // SecurityContextHolder.getContext().getAuthentication().getPrincipal();
    //
    // if (principal instanceof LoginUser) {
    // String username = ((LoginUser) principal).getUserName();
    // } else {
    // String username = principal.toString();
    // }
    return "index";
  }
}
