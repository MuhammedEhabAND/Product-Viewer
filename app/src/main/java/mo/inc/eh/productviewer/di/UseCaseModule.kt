package mo.inc.eh.productviewer.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import mo.inc.eh.productviewer.domain.repo.Repository
import mo.inc.eh.productviewer.domain.usecases.GetProductsUseCase

@Module
@InstallIn(SingletonComponent::class)
object UseCaseModule {
    @Provides
    fun provideGetProductsUseCase(repository: Repository):GetProductsUseCase{
        return GetProductsUseCase(repository)
    }
}