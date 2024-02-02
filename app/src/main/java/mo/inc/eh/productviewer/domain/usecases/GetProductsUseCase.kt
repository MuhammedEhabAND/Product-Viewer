package mo.inc.eh.productviewer.domain.usecases

import kotlinx.coroutines.flow.Flow
import mo.inc.eh.productviewer.data.model.ProductResponse
import mo.inc.eh.productviewer.domain.repo.Repository
import javax.inject.Inject

class GetProductsUseCase @Inject constructor(
    private val repository: Repository
) {
    suspend operator fun invoke() : Flow<ProductResponse> {
        return repository.getProducts()
    }
}