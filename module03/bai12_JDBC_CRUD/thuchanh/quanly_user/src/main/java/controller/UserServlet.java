package controller;

import model.bean.User;
import model.service.ipml.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "UserServlet",urlPatterns = {"","/list","/users"})
public class UserServlet extends HttpServlet {
    private UserServiceImpl userService = new UserServiceImpl();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        switch (action){
            case "update":
                update(request,response);
                break;
            case "create":
                create(request,response);
                break;
        }
    }

    private void create(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String country = request.getParameter("country");

        User user = new User(name,email,country);
        userService.addNewUser(user);
        showListUsers(request,response);
    }

    private void update(HttpServletRequest request, HttpServletResponse response) throws IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String country = request.getParameter("country");

        User user = new User(id,name,email,country);
        userService.updateUser(user);
        response.sendRedirect("/users");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if(action==null){
            action = "";
        }
        switch (action){
            case "update":
                showUpdateForm(request,response);
                break;
            case "delete":
                delete(request,response);
                break;
            case "create":
                showCreateForm(request,response);
                break;
            case "search":
                goSearch(request,response);
                break;
            default:
                showListUsers(request,response);
                break;
        }
    }

    private void goSearch(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String country = request.getParameter("country");
        List<User> userListSearch = new ArrayList<>();
        for(User user : userService.findAllUsers()){
            if(user.getCountry().equals(country)){
                userListSearch.add(user);
            }
        }
        request.setAttribute("listUser", userListSearch);
        request.getRequestDispatcher("list.jsp").forward(request,response);
    }


    private void showCreateForm(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.sendRedirect("create.jsp");
    }

    private void delete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        userService.deleteUser(id);
        showListUsers(request,response);
    }

    private void showUpdateForm(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        User user = userService.findById(id);
        request.setAttribute("user", user);
        request.getRequestDispatcher("update.jsp").forward(request,response);
    }

    private void showListUsers(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<User> userList = userService.findAllUsers();
        System.out.println(userList.size());
        request.setAttribute("listUser", userList);
        request.getRequestDispatcher("list.jsp").forward(request,response);
    }
}
