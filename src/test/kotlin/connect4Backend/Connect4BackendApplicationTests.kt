package connect4Backend

import connect4Backend.datasource.repository.GameRepository
import connect4Backend.datasource.repository.model.GameEntity
import connect4Backend.datasource.repository.model.GameEntity.GameState
import connect4Backend.datasource.repository.model.GameEntity.PLAYER
import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.ActiveProfiles
import java.util.UUID

@SpringBootTest
@ActiveProfiles("test")
class DemoApplicationTests(
    val gameRepository: GameRepository
) {

    @Test
    fun contextLoads() {
        val id = UUID.randomUUID()
        gameRepository.save(
            GameEntity(
                id,
                GameState.PLAYER_ONES_TURN,
                GameEntity.GameBoardEntity(rowFour = arrayOf(PLAYER.PLAYER_TWO, PLAYER.PLAYER_TWO))
            )
        )

        val gameEntity = gameRepository.getReferenceById(id)
        gameEntity.gameBoard
    }
}
