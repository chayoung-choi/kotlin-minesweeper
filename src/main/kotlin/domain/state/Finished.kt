package domain.state

import domain.Board
import domain.Position

class Finished(override val board: Board) : State {
    override fun open(position: Position): State {
        throw IllegalArgumentException("게임이 종료되었습니다.")
    }
}
