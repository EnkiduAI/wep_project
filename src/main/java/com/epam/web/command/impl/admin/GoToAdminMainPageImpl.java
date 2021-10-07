package com.epam.web.command.impl.admin;

import com.epam.web.command.Command;
import com.epam.web.entity.ApplicationEntity;
import com.epam.web.exception.ServiceException;
import com.epam.web.service.impl.AdminServiceImpl;
import static com.epam.web.command.ParameterProvider.*;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

import static com.epam.web.command.PagePath.*;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class GoToAdminMainPageImpl implements Command{
	private static final Logger logger = LogManager.getLogger();
	@Override
	public String execute(HttpServletRequest request) {
		AdminServiceImpl adminService = AdminServiceImpl.getInstance(); 
		HttpSession session = request.getSession();
		List<ApplicationEntity> applications = new ArrayList<>();
		try {
			applications = adminService.findUnpostedApplications();
			session.setAttribute(UNPOSTED_APPLICATION_LIST, applications);
		}catch(ServiceException e) {
			logger.error("error during GoToMainAdminCommand", e);
		}
		return MAIN_ADMIN;
	}

}
