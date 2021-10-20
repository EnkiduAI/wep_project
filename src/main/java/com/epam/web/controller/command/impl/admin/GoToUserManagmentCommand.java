package com.epam.web.controller.command.impl.admin;
import static com.epam.web.controller.command.PagePath.*;

import com.epam.web.controller.command.Command;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

public class GoToUserManagmentCommand implements Command{

	@Override
	public String execute(HttpServletRequest request) {
		HttpSession session = request.getSession();
		session.setAttribute(CURRENT_PAGE, USER_MANAGMENT);
		
		return USER_MANAGMENT;
	}

}
