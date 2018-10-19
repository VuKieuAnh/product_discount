import java.io.IOException;
import java.io.PrintWriter;

public class ProductDiscountServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        double listPrice = Double.parseDouble(request.getParameter("listPrice"));
        double discountPercent = Double.parseDouble(request.getParameter("discountPercent"));
        String productDescription = request.getParameter("productDescription");
        PrintWriter writer = response.getWriter();
        writer.print("<html>");
        writer.print("<p>" + productDescription + "</p>");
        writer.print("<p>List Price: " + listPrice +"</p>");
        writer.print("<p>Discount Percent: "  + discountPercent +"</p>");
        writer.print("<p>Resulf: " + listPrice*(1- discountPercent/100)+ "</p>");
        writer.println("</html>");
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }
}
