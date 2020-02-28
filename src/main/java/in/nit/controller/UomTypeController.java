package in.nit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import in.nit.model.UomType;
import in.nit.service.IUomTypeService;

@Controller
@RequestMapping("/Uomtype")
public class UomTypeController {
	@Autowired
	private IUomTypeService service;
	
	@RequestMapping(value="/save",method=RequestMethod.POST)
	public String saveUomType(@ModelAttribute UomType uomtype,Model model) {
		Integer id=service.saveUomType(uomtype);
		String message="Uom Type '"+id+"' saved";
		model.addAttribute("message",message);
		return "UomTypeRegister";
	}
	@RequestMapping("/register") //GET
	public String showRegPage() {
		return "UomTypeRegister";
	}
	@RequestMapping(value ="/all" ,method=RequestMethod.GET)
	public String getAllUomTypes(Model model) {
		List<UomType> list=service.getAllUomTypes();
		model.addAttribute("list",list);
		return "UomRegisterData";
	}
	@RequestMapping("/delete")
	public String deleteUomType(@RequestParam("umid")Integer id,Model model) {
		service.deleteUomType(id);
		String message="Uom '"+id+"' Deleted";
		model.addAttribute("message", message);
		//fetch new data
		List<UomType>list=service.getAllUomTypes();
		model.addAttribute("list",list);
		return "UomRegisterData";//pageName 
	}
}
