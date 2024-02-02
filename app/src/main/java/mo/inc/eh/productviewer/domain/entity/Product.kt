package mo.inc.eh.productviewer.domain.entity

data class Product(
    val description: String,
    val id: String,
    val imageUrl: String,
    val name: String,
    val price: String,
    val productTypeId: Any,
    val shoppingCartItemId: Any,
    val shoppingListItemId: Any,
    val unitPrice: Any
)