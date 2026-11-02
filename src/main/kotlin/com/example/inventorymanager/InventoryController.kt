package com.example.inventorymanager

import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/inventory")

class InventoryController (private val inventoryRepository: InventoryRepository) {
    @GetMapping
    fun getAllItems(): List<InventoryItem> = inventoryRepository.findAll()

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    fun createItem(@RequestBody item: InventoryItem): InventoryItem = inventoryRepository.save(item)

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    fun deleteItem(@PathVariable id: Long) {
        inventoryRepository.deleteById(id)
    }

}