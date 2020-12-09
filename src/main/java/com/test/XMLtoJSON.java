package com.test;

import java.io.IOException;
import java.io.OutputStream;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class XMLtoJSON
 */
public class XMLtoJSON extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	public void init() throws ServletException {

		System.out.println("servlet initialized");
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		process(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub

		process(request, response);
	}

	protected void process(HttpServletRequest request, HttpServletResponse response) {

		OutputStream out = null;
		System.out.println("request recieved");
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
