package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Inventory;
import com.example.demo.service.InventoryService;


//@RequestMapping("/inventory")
@RestController
public class InventoryController {

	@Autowired
	private InventoryService inventoryService;

	@PostMapping("/addItem")
	public Inventory addItem(@RequestBody Inventory item) {
		return inventoryService.createInventory(item);
	}

	@PostMapping("/addItems")
	public List<Inventory> addItems(@RequestBody List<Inventory> items) {
		return inventoryService.createInventory(items);
	}

	@GetMapping("/item/{productId}")
	public Inventory getItemById(@PathVariable int productId) {
		return inventoryService.getItemById(productId);
	}
	
	@GetMapping("/items")
	public List<Inventory> getAllItems() {
		return inventoryService.getItems();
	}
	
	@PutMapping("/updateItem")
	public Inventory updateItem(@RequestBody Inventory inventory)
	{
		return inventoryService.updateItem(inventory);
	}
	
	@DeleteMapping("/item/{productId}")
	public String deleteItem(@PathVariable int productId)
	{
		return inventoryService.deleteItemById(productId);
	}
	
}
