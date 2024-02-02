package mo.inc.eh.productviewer.data.repo

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import mo.inc.eh.productviewer.data.model.ProductResponse
import mo.inc.eh.productviewer.data.remote.ProductService
import mo.inc.eh.productviewer.domain.entity.Product
import mo.inc.eh.productviewer.domain.repo.Repository
import javax.inject.Inject

class RepositoryImp @Inject constructor(
    private val productService: ProductService
): Repository {
    override suspend fun getProducts(): Flow<ProductResponse> {
        return flow {
            productService.getProducts()
        }
    }
}