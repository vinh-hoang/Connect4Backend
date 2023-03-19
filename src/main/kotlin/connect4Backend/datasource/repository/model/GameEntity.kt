package connect4Backend.datasource.repository.model

import io.hypersistence.utils.hibernate.type.json.JsonType
import jakarta.persistence.Entity
import jakarta.persistence.EnumType
import jakarta.persistence.Enumerated
import jakarta.persistence.Id
import jakarta.persistence.Table
import org.hibernate.annotations.Type
import java.util.UUID

@Entity
@Table(name = "game")
class GameEntity(
    @Id
    val gameId: UUID,

    @Enumerated(EnumType.STRING)
    val gameState: GameState,

    @Type(value = JsonType::class)
    val gameBoard: GameBoardEntity
) {
    enum class GameState {
        //game in-progress
        PLAYER_ONES_TURN,
        PLAYER_TWOS_TURN,

        //game over
        PLAYER_ONE_WINS,
        PLAYER_TWO_WINS,
        DRAW;

        override fun toString() = this.name
    }

    enum class PLAYER {
        PLAYER_ONE,
        PLAYER_TWO;

        override fun toString() = this.name
    }

    class GameBoardEntity(
        val rowOne: Array<PLAYER> = emptyArray(),
        val rowTwo: Array<PLAYER> = emptyArray(),
        val rowThree: Array<PLAYER> = emptyArray(),
        val rowFour: Array<PLAYER> = emptyArray(),
        val rowFive: Array<PLAYER> = emptyArray(),
        val rowSix: Array<PLAYER> = emptyArray(),
        val rowSeven: Array<PLAYER> = emptyArray(),
    )
}