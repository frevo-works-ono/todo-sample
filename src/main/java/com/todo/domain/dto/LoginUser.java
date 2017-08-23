package com.todo.domain.dto;

import org.springframework.security.core.authority.AuthorityUtils;

import com.todo.domain.model.User;

import lombok.Getter;

public class LoginUser extends org.springframework.security.core.userdetails.User {
  /**
   * 
   */
  private static final long serialVersionUID = 1L;

  @Getter
  private int userId;

  @Getter
  private String userName;

  /*
   * コンストラクタ
   * 
   * @param user
   */
  public LoginUser(User user) {
    // スーパークラスのユーザーID、パスワードに値をセットする
    // 実際の認証はスーパークラスのユーザーID、パスワードで行われる
    super(user.getMailAddress(), user.getPassword(),
        AuthorityUtils.createAuthorityList("ROLE_USER"));
    this.userId = user.getId();
    this.userName = user.getUserName();
  }
}
