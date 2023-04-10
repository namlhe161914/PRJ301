/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Controller;

import DAO.BookDAO;
import Models.Book_HE161914;
import Models.Category_HE161914;
import Models.Publisher_HE161914;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.util.List;

/**
 *
 * @author ADMIN
 */
@WebServlet(name = "AddBook", urlPatterns = {"/addbook"})
public class AddBook extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String bid = request.getParameter("bid");
        String category = request.getParameter("category");
        String bname = request.getParameter("bname");
        String author = request.getParameter("author");
        String image = request.getParameter("image");
        String publisher = request.getParameter("publisher");
        String quantity = request.getParameter("quantity");
        String describe = request.getParameter("describe");
        String price = request.getParameter("price");

        BookDAO b = new BookDAO();
        List<Book_HE161914> list = b.getAllBook();
        List<Category_HE161914> listC = b.getAllCategory();
        List<Publisher_HE161914> listP = b.getAllPublisher();

        try {
            Book_HE161914 book = b.getBook_HE161914ByBid(bid);
            if (book != null) {
                String error = "name " + bname + " existed!!!";
                request.setAttribute("listB", list);
                request.setAttribute("listC", listC);
                request.setAttribute("listP", listP);
                request.setAttribute("error", error);
                request.getRequestDispatcher("error.jsp").forward(request, response);
                
            } else {
                if(bname.equals("")){
                response.sendRedirect("manager");
                }else{
                b.insert(category, bname, author, image, publisher, quantity, describe, price);
                response.sendRedirect("manager"); }
            }
        } catch (NumberFormatException e) {
            System.out.println(e);
        }

    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);

    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
