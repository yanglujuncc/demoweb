package demo.controllers;

import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.URL;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;






import java.util.Map;
import java.util.Map.Entry;
import java.util.TimeZone;
import java.util.TreeMap;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

//import org.apache.log4j.xml.DOMConfigurator;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

//import com.alibaba.fastjson.JSON;

@Controller
public class SimpleController {

	//static Logger logger=LoggerFactory.getLogger(SimpleController.class);

	//TimeZone zone =null;
	//SimpleDateFormat ISO_time_format=null;

	
	public SimpleController() {
		
		System.out.println("SimpleController created .");
	
	}
	
	//@SuppressWarnings("restriction")
	//@PostConstruct
	public void init() {
		System.out.println("SimpleController init ...");

	//	DOMConfigurator.configure(HouseController.class.getResource("/conf/log4j.xml"));
		
	}
	
	//@SuppressWarnings("restriction")
	//@PreDestroy
	void destroy() {

	}

	@RequestMapping(value = "/path", method = RequestMethod.GET)
	@ResponseBody
	public String handleRequest() throws Exception {
		 // HttpSession session
		return "hello ";
	}
		
	
}
