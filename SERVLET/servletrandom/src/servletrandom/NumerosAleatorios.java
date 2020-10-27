package servletrandom;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;


public class NumerosAleatorios implements Servlet {

	@Override
	public void destroy() {
		System.out.println("Destruíndo Servlet");
	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void init(ServletConfig arg0) throws ServletException {
		// TODO Auto-generated method stub

	}

	@Override
	public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {
		int numero = Integer.parseInt(req.getParameter("numero"));
		
		PrintWriter out = resp.getWriter();
		
		Random r = new Random();
		out.println("Número Máximo escolhido para sorteio é: " + numero);
		
		for(int i = 1; i <= Integer.parseInt(req.getParameter("rep")); i++) {
			out.println("Número " + i + " sorteado foi: " + r.nextInt(numero));
		}
	}

}