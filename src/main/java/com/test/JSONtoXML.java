package com.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONObject;
import org.json.XML;

/**
 * Servlet implementation class JSONtoXML
 */
public class JSONtoXML extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public JSONtoXML() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    private String json_data;
    public void init() throws ServletException 
    {      
    	 json_data = "{\r\n" + 
				"  \"Request\": {\r\n" + 
				"    \"requestId\": \"12310209842389\",\r\n" + 
				"    \"timeStamp\": \"2019/12/25 12:12:12 \",\r\n" + 
				"    \"msisdn\": \" 865545\",\r\n" + 
				"    \"keyWord\": \"CANCEL_ORDER_API\",\r\n" + 
				"    \"dataSet\": {\r\n" + 
				"      \"param\": [\r\n" + 
				"        {\r\n" + 
				"          \"id\": \"order_id\",\r\n" + 
				"          \"value\": \"12310209842396\"\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"          \"id\": \"entity_id\",\r\n" + 
				"          \"value\": \"1\"\r\n" + 
				"        }\r\n" + 
				"      ]\r\n" + 
				"    }\r\n" + 
				"  }\r\n" + 
				"}";
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		 response.setContentType("text/xml");
		JSONObject obj = new JSONObject(json_data);

		String xml_data = XML.toString(obj);

		PrintWriter out = response.getWriter();     
		
		out.println(xml_data);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
	}
	
	public void destroy() 
    {      
       // Leaving empty. Use this if you want to perform  
       //something at the end of Servlet life cycle.   
    }

}
