package me.dio.githubsearchrepository.domain

import me.dio.githubsearchrepository.core.UseCase
import me.dio.githubsearchrepository.data.model.Repo
import me.dio.githubsearchrepository.data.repositories.RepoRepository
import kotlinx.coroutines.flow.Flow

class ListUserRepositoriesUseCase(
    private val repository: RepoRepository
) : UseCase<String, List<Repo>>() {

    override suspend fun execute(param: String): Flow<List<Repo>> {
        return repository.listRepositories(param)
    }
}