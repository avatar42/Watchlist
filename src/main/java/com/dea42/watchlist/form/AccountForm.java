package com.dea42.watchlist.form;

import java.io.Serializable;
import lombok.Data;

import com.dea42.watchlist.utils.MessageHelper;
import com.dea42.watchlist.entity.Account;

import com.dea42.watchlist.controller.FieldMatch;
import com.dea42.watchlist.controller.UniqueEmail;
import com.dea42.watchlist.controller.ValidatePassword;
import com.fasterxml.jackson.annotation.JsonIgnore;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import org.hibernate.validator.constraints.Length;

/**
 * Title: account Form <br>
 * Description: Class for holding data from the account table for editing. <br>
 * Copyright: Copyright (c) 2001-2020<br>
 * Company: RMRR<br>
 * @author Gened by com.dea42.build.GenSpring version 0.5.2<br>
 * @version 0.5.2<br>
 */
@UniqueEmail.List({ @UniqueEmail(fieldName = "email", message = "email.unique") })
@FieldMatch.List({
		@FieldMatch(fieldName = "password", secondFieldName = "passwordConfirm", message = "password.mismatch")
		})
@Data
public class AccountForm implements Serializable {
	private static final long serialVersionUID = 1L;

    @Email(message = "{"+MessageHelper.email_message+"}")
    @Length(max=254)
    @NotBlank(message = "{"+MessageHelper.notBlank_message+"}")
	private String email;
	private Integer id;
    @JsonIgnore
    @ValidatePassword(fieldName = "passwordConfirm")
    @Length(max=30)
    @NotBlank(message = "{"+MessageHelper.notBlank_message+"}")
	private String password;
    @ValidatePassword(fieldName = "password")
	private String passwordConfirm;
    @Length(max=25)
    @NotBlank(message = "{"+MessageHelper.notBlank_message+"}")
	private String role;

	/**
	 * Clones Account obj into form
	 *
	 * @param obj
	 */
	public static AccountForm getInstance(Account obj) {
		AccountForm form = new AccountForm();
		form.setEmail(obj.getEmail());
		form.setId(obj.getId());
//		form.setPassword(obj.getPassword());
//		form.setPasswordConfirm(obj.getPassword());
		form.setRole(obj.getRole());
		return form;
	}
}
