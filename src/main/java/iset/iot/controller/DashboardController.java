package iset.iot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DashboardController {
	@GetMapping("/dashboard")
	@ResponseBody
	public String dashboardPage() {
		return "<!DOCTYPE html>\r\n"
				+ "<html>\r\n"
				+ "\r\n"
				+ "<head>\r\n"
				+ "</head>\r\n"
				+ "\r\n"
				+ "<body>\r\n"
				+ "	<p align=\"center\" style=\"font-size:30px\"> Smart Home </p>\r\n"
				+ "	<iframe width=\"100%\" height=\"800\" frameborder=\"0\"\r\n"
				+ "		src=\"https://stem.ubidots.com/app/dashboards/public/dashboard/NskLrk5H6-3KfJZ38jsiD4aGiI487nRS-0wv_-LpyYg\"></iframe>\r\n"
				+ "</body>\r\n"
				+ "\r\n"
				+ "</html>";
	}
}
