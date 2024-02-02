package mo.inc.eh.productviewer.data.remote

import mo.inc.eh.productviewer.data.model.ProductResponse
import retrofit2.http.GET

interface ProductService {

    @GET("featured.txt")
    suspend fun getProducts(): ProductResponse

}
