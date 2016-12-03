package kr.ac.hansung.hansol.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.ac.hansung.hansol.model.Offer;
import kr.ac.hansung.hansol.service.OffersService;

@Controller    //항상 controller annotation을 달아줘야 함.
public class OffersController {

	private OffersService offersService;
	
	@Autowired
	public void setOffersService(OffersService offersService) {
		this.offersService = offersService;
	}

	@RequestMapping("/offers")
	public String showOffers(Model model){
		
		List<Offer> offers = offersService.getCurrent();
		model.addAttribute("offers",offers);
		return "offers";
	}
	
	@RequestMapping("/createoffer")
	public String createOffer(Model model){
		return "createoffer";
	}
}
