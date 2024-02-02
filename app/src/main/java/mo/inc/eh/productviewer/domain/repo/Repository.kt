package mo.inc.eh.productviewer.domain.repo

import kotlinx.coroutines.flow.Flow
import mo.inc.eh.productviewer.data.model.ProductResponse
import mo.inc.eh.productviewer.domain.entity.Product

interface Repository {
    suspend fun getProducts() : Flow<ProductResponse>
}