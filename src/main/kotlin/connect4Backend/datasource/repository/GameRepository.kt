package connect4Backend.datasource.repository


import connect4Backend.datasource.repository.model.GameEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import java.util.UUID

@Repository
interface GameRepository: JpaRepository<GameEntity, UUID>
