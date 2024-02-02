package mo.inc.eh.productviewer.data.model

import mo.inc.eh.productviewer.domain.entity.Product
import mo.inc.eh.productviewer.domain.entity.ProductMerchant

data class ProductResponseItem(
    val product: Product,
    val productMerchants: List<ProductMerchant>
)