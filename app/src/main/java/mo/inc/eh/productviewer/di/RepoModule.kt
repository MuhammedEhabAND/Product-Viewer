package mo.inc.eh.productviewer.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import mo.inc.eh.productviewer.data.remote.ProductService
import mo.inc.eh.productviewer.data.repo.RepositoryImp
import mo.inc.eh.productviewer.domain.repo.Repository

@Module
@InstallIn(SingletonComponent::class)
object RepoModule {
    @Provides
    fun providesRepo(productService: ProductService): Repository {
        return RepositoryImp(productService)
    }
}