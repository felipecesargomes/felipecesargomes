import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MeuServlet
 */
@WebServlet("/meuservlet")
public class MeuServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		int maior = -999999999;
		int menor = 0;
		Enumeration<String> parametros = request.getParameterNames();
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		while(parametros.hasMoreElements()) {
			String str = parametros.nextElement();
			numeros.add(Integer.parseInt(request.getParameter(str)));
		}
		
		for (Integer integer : numeros) {
			if(integer > maior) {
				menor = maior;
				maior = integer;
			} else {
				menor = integer;
			}
		}
		
		if(maior == menor) {
			out.println("O número: " + maior + " é igual à: " + menor);
		} else {
			out.println("O maior número é: " + maior + " o menor número é: " + menor);
		}
		
	}

}
