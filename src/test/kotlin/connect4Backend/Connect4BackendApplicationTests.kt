package connect4Backend

import connect4Backend.datasource.repository.GameRepository
import connect4Backend.datasource.repository.model.GameEntity
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
        gameRepository.save(
            GameEntity(UUID.randomUUID(), "testState", "testBoard")
        )
    }
}
