package controller;

import factory.Factory;
import pojo.Admin;
import pojo.Message;
import pojo.User;
import pojo.Video;
import service.IAdminService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {

    IAdminService adminService;

    public LoginServlet() {
        adminService = Factory.getInstance("adminService", IAdminService.class);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //获取登录时的参数（用户名，密码）
        String name = request.getParameter("userName");
        String password = request.getParameter("passWord");

        if (adminService.getAdmin(name, password) != null) {
            Admin admin = adminService.getAdmin(name, password);
            ListAll(request, adminService);
            request.getSession().setAttribute("admin", admin);
            request.getRequestDispatcher("manager/admin.jsp").forward(request, response);
        } else if (adminService.findByUserName(name) != null &&
                adminService.findByUserName(name).getPassWord().equals(password)) {
            //扑通用户跳转主页--index.jsp
            User user = adminService.findByUserName(name);
            request.getSession().setAttribute("user", user);
            request.getRequestDispatcher("pilipala/index.jsp").forward(request, response);
        }
    }

    protected static void ListAll(HttpServletRequest request, IAdminService adminService) {
        List<Video> totalVideo = adminService.getAllVideo();
        List<User> totalUser = adminService.getAllUser();
        List<Message> totalMessage = adminService.getAllMessage();
        List<Admin> totalAdmin = adminService.getAllAdmin();
        request.getSession().setAttribute("totalVideo", totalVideo);
        request.getSession().setAttribute("totalUser", totalUser);
        request.getSession().setAttribute("totalMessage", totalMessage);
        request.getSession().setAttribute("totalAdmin", totalAdmin);
    }
}
