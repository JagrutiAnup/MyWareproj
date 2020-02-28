package in.nit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import in.nit.model.WhUserType;
import in.nit.service.IWhUserTypeService;

@Controller
@RequestMapping("/whtype")
public class WhUserTypeController {
	
	@Autowired
	private IWhUserTypeService service;
	
	@RequestMapping("/register") //GET
	public String showRegPage() {
		return "WhUserTypeRegister";
	}
	
	@RequestMapping(value="/save",method=RequestMethod.POST)
	public String saveWhUserType(@ModelAttribute WhUserType whUserType,Model model) {
		Integer id=service.saveWhUserType(whUserType);
		String message="WhUserType '"+id+"' saved";
		model.addAttribute("message",message);
		return "WhUserTypeRegister";
	}	
	@RequestMapping(value ="/all" ,method=RequestMethod.GET)
	public String getAllWhUserTypes(Model model) {
		List<WhUserType> list=service.getAllWhUserTypes();
		model.addAttribute("list",list);
		return "WhUserRegisterData";
	}

}
