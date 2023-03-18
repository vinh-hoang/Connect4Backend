package connect4Backend.datasource.repository.model

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.util.UUID;

@Entity
@Table(name = "game")
class GameEntity(
    @Id
    val gameId: UUID,
    val gameState: String,
    val gameBoard: String,
)
