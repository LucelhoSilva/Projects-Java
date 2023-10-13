package br.com.lucelhosilva.todolist.user;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Modificador
 * public
 * private
 * protected
 */
@RestController
@RequestMapping("/users")
public class UserController {
  /**
   * String (texto)
   * Integer (int) números inteiros
   * Double (double) números 0.0000
   * Float (float) números 0.000
   * char (A C)
   * Date (data)
   * Void
   */
  @PostMapping("/")
  public void create(@RequestBody UserModel userModel) {
    System.out.println(userModel.getUsername());
  }
  
 }