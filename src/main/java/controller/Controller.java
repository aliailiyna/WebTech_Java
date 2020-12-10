package controller;

<<<<<<< HEAD
import bean.User;
import service.ClientService;
import service.factory.ServiceFactory;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class Controller extends HttpServlet{
    private final ClientService clientService = ServiceFactory.getInstance().getClientService();

    private String dispatch(String url, String destination) {
        return url.substring(0, url.lastIndexOf("/")) + "/" + destination;
    }

    private void signIn(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        HttpSession session = request.getSession();
        var user = new User();
        user.setLogin(request.getParameter("login"));
        user.setPassword(request.getParameter("password"));
        request.getRequestDispatcher("/WEB-INF/jsp/log-in.jsp").forward(request, response);
    }

    private void signUp(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        HttpSession session = request.getSession();
        var user = new User();
        user.setLogin(request.getParameter("login"));
        user.setPassword(request.getParameter("password"));
        /*user.setFirstName(request.getParameter("firstName"));
        user.setLastName(request.getParameter("lastName"));*/
        request.getRequestDispatcher("/WEB-INF/jsp/sign-up.jsp").forward(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        System.out.println(request.getRequestURI());
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String action = request.getParameter("action");
        switch (action) {
            case "log-in" -> {
                signIn(request, response);
            }
            case "sign-up" -> {
                signUp(request, response);
            }
        }
    }
=======
import javax.servlet.http.HttpServlet;

public class Controller extends HttpServlet{
>>>>>>> 8a241d8a3b22173744448d7a10665f95bfe182e9
}
