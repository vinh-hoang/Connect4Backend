package connect4Backend.datasource.repository.model;

import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.Table
import java.time.ZonedDateTime
import java.util.UUID

@Entity
@Table(name = "session")
class SessionEntity(
    @Id
    val sessionId: UUID,
    val lastPolledPlayerOne: ZonedDateTime,
    val lastPolledPayerTwo: ZonedDateTime,
    val playerOne: UUID,
    val playerTwo: UUID,
    val game: UUID,
)