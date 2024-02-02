package mo.inc.eh.productviewer.domain.entity

data class ProductMerchant(
    val merchant: Merchant,
    val merchantProduct: MerchantProduct,
    val productMerchant: ProductMerchants
)