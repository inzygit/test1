package com.example.demo.contorlayer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.bucketList.BucketList;
import com.example.demo.serviceInt.ServiceInt;

@Controller
public class ContorLayer {
	
	@Autowired
	public ServiceInt serviceInt;
	
	@GetMapping("/")
	public String viewHomePage(Model model) {
		model.addAttribute("listUsers", serviceInt.getallBucketList());
		return "index";
	}
	
	@GetMapping("/newForm")
	public String newForm(Model model) {
		BucketList bucketList = new BucketList();
		model.addAttribute("BucketList1", bucketList);
		return "new";		
	}
	
	@PostMapping("/saveLists")
	public String saveLists(BucketList bucketList) {
		serviceInt.saveList(bucketList);
		return "redirect:/";
	}
	
	@GetMapping("/updateForm/{id}")
	public String showUpdateForm(@PathVariable(value="id") int id, Model model) {
		BucketList bucketList = serviceInt.getList(id);
		model.addAttribute("BucketList1", bucketList);
		return "update";
	}
	
	@GetMapping("/deleteForm/{id}")
	public String deleteForm(@PathVariable(value="id") int id) {
		serviceInt.deleteList(id);
		return "redirect:/";
	}
	
}
