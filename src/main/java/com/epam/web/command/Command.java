package com.epam.web.command;



import jakarta.servlet.http.HttpServletRequest;

public interface Command {
String execute(HttpServletRequest request);
}
