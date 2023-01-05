package domain

import domain.state.Finished
import domain.state.Running
import io.kotest.assertions.throwables.shouldThrow
import io.kotest.matchers.types.shouldBeInstanceOf
import org.junit.jupiter.api.Test

class StateTest {

    private val board: Board = fakeBoard(3, 3, 1 to 1)

    @Test
    fun `Running 상태에서 일반블록 open하면 Running 상태 반환`() {
        val selectPosition = Position.of(2, 2)
        val state = Running(board).open(selectPosition)
        state.shouldBeInstanceOf<Running>()
    }

    @Test
    fun `Running 상태에서 지뢰를 open하면 Finished 상태 반환`() {
        val selectPosition = Position.of(1, 1)
        val state = Running(board).open(selectPosition)
        state.shouldBeInstanceOf<Finished>()
    }

    @Test
    fun `Finished 상태는 open 예외 처리`() {
        val state = Finished(board)
        shouldThrow<IllegalArgumentException> { state.open(Position.of(0, 0)) }
    }
}