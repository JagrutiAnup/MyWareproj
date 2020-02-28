package in.nit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import in.nit.model.ShipmentType;
import in.nit.service.IShipmentTypeService;
import in.nit.view.ShipmentTypeExcelView;
import in.nit.view.ShipmentTypePdfView;
@Controller
@RequestMapping("/shipment")
public class ShipmentTypeController {


	@Autowired 
	private IShipmentTypeService service;


	@RequestMapping("/register") //GET
	public String showRegPage(@ModelAttribute ShipmentType shipmentType,Model model) {
		//form backing object
		model.addAttribute("shipmentType",new ShipmentType());
		return "ShipmentTypeRegister";
	}


	@RequestMapping(value="/save",method=RequestMethod.POST)
	public String saveShipment(@ModelAttribute ShipmentType shipmentType,Model model) {
		Integer id=service.saveShipmentType(shipmentType);
		String message="Shipment Type '"+id+"' saved";
		model.addAttribute("message",message);
		//form backing object
		model.addAttribute("shipmentType",new ShipmentType());
		return "ShipmentTypeRegister";

	}


	@RequestMapping("/delete")
	public String deleteShipment(@RequestParam("sid")Integer id,Model model) {
		service.deleteShipmentType(id);
		String message="Shipment '"+id+"' Deleted";
		model.addAttribute("message", message);
		//fetch new data
		List<ShipmentType>list=service.getAllShipmentTypes();
		model.addAttribute("list",list);
		return "ShipmentRegisterData";//pageName 
	}


	@RequestMapping(value ="/all" ,method=RequestMethod.GET)
	public String getAllShipmentTypes(Model model) {
		List<ShipmentType> list=service.getAllShipmentTypes();
		model.addAttribute("list",list);
		return "ShipmentRegisterData";
	}



	@RequestMapping(value ="/view" ,method=RequestMethod.GET)
	public String showOneShipment(@RequestParam("sid")Integer id,Model model) {
		ShipmentType st=service.getOneShimentType(id);
		model.addAttribute("ob",st);
		return "ShipmentTypeView";
	}

	@RequestMapping(value ="/edit" ,method=RequestMethod.GET)
	public String showEditPage(@RequestParam("sid")Integer id,Model model) {
		ShipmentType st=service.getOneShimentType(id);
		model.addAttribute("shipmentType",st);
		return "ShipmentTypeEdit";
	}

	@RequestMapping(value ="/update" ,method=RequestMethod.POST)
	public String updateShipmentType(@ModelAttribute ShipmentType shipmentType,Model model) {
		service.updateShipmentType(shipmentType);
		String message="shipmentType '" +shipmentType.getShipId()+ "' Updated";
		model.addAttribute("message",message);
		List<ShipmentType>list=service.getAllShipmentTypes();
		model.addAttribute("list",list);
		return "ShipmentRegisterData";
	}


	@RequestMapping("/excel")
	public ModelAndView showExcel() {
		ModelAndView m=new ModelAndView();
		m.setView(new ShipmentTypeExcelView());
		//fetching data from DB
		List<ShipmentType> list=service.getAllShipmentTypes();
		m.addObject("list",list);
		return m;
	}


	@RequestMapping("/pdf")
	public ModelAndView showPdf() {
		ModelAndView m=new ModelAndView();
		m.setView(new ShipmentTypePdfView());
		List<ShipmentType> list=service.getAllShipmentTypes();
		//send data to Pdf file
		m.addObject("list",list);
		return m;
	}
}
