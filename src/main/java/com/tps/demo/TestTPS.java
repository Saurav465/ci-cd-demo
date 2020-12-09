package com.tps.demo;

import java.io.IOException; 
import java.io.OutputStream;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Servlet implementation class TestTPS
 */
public class TestTPS extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	private static Logger logger = LogManager.getLogger("TestTPS");
	private int hitCount;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TestTPS() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		logger.info("servlet initialized !");
		
		
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		process(request, response);
		
	}
	
	protected void process(HttpServletRequest request, HttpServletResponse response) {

		OutputStream out = null;
		logger.info("request recieved");
		try {

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				response.setContentType("text/json; charset=UTF-8");
				response.setHeader("Cache-Control", "no-cache");
				out = response.getOutputStream();

				out.write(
						"{\"Response\":{\"result_code\":\"SC000\",\"request_id\":\"12310209842389\",\"request_timestamp\":\"2019/12/25 12:12:12 \",\"response_timestamp\":\"2020-10-16 17:18:52\",\"source_node\":\"CRM\"}}"
								.getBytes("UTF-8"));
				out.flush();

			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				try {
					if (out != null)
						out.close();
				} catch (IOException e) {
				}

			}
		}
	}
	
}
