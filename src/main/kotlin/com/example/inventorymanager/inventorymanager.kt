package com.example.inventorymanager

import jakarta.persistence.*
import java.math.BigDecimal

@Entity
@Table(name ="inventory_items")
data class InventoryItem(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? =null,

    var name : String,
    var sku: String,
    var unitPrice: BigDecimal,
    var stockQuantity: Int,
    var warehouseLocation: String,
)