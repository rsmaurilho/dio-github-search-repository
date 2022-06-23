package me.dio.githubsearchrepository.data.repositories

import me.dio.githubsearchrepository.data.model.Repo
import kotlinx.coroutines.flow.Flow

interface RepoRepository {
    suspend fun listRepositories(user: String): Flow<List<Repo>>
}