package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.InventoryRepo;
import com.example.demo.entity.Inventory;

@Service
public class InventoryService {
	
	@Autowired
	private InventoryRepo inventoryRepo;
	
	
	public Inventory createInventory(Inventory inventory)
	{
		return inventoryRepo.save(inventory);
	}
	
	public List<Inventory> createInventory(List<Inventory> inventoryList)
	{
		return inventoryRepo.saveAll(inventoryList);
	}

	public Inventory getItemById(int productId)
	{
		return inventoryRepo.findById(productId).orElse(null);
	}
	
	public List<Inventory> getItems()
	{
		return inventoryRepo.findAll();
	}
	
	public Inventory updateItem(Inventory inventory)
	{
		Inventory temp = inventoryRepo.findById(inventory.getProductId()).orElse(null);
		if(temp!=null)
		{
			temp.setProductName(inventory.getProductName());
			temp.setProductId(inventory.getProductId());
			temp.setProductDesc(inventory.getProductDesc());
			temp.setQuantity(inventory.getQuantity());
			temp.setRate(inventory.getRate());
			inventoryRepo.save(temp);
		}
		else {
			return new Inventory();
		}
		
		return temp;
	}
	
	public String deleteItemById(int productId)
	{
		inventoryRepo.deleteById(productId);
		return "item deleted";
	}
	
	
}
