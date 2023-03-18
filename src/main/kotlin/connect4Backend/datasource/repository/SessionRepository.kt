package connect4Backend.datasource.repository

import connect4Backend.datasource.repository.model.SessionEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import java.util.UUID

@Repository
interface SessionRepository: JpaRepository<SessionEntity, UUID>
