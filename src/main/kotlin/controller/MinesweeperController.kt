package controller

import domain.Board
import domain.BoardFactory
import domain.Rectangle
import domain.state.Running
import domain.state.State
import view.InputView
import view.OutputView

class MinesweeperController {
    private val inputView = InputView
    private val outputView = OutputView

    fun play() {
        val board = initBoard()

        var state = initState(board)
        while (!state.isFinished()) {
            state = playNextRound(state)
        }
        outputView.printGameResult(state)
    }

    private fun initBoard(): Board {
        val height = inputView.inputHeight()
        val width = inputView.inputWidth()
        val mineCount = inputView.inputMineCount()

        val rectangle = Rectangle(width, height)
        return BoardFactory().generate(rectangle, mineCount)
    }

    private fun initState(board: Board): State {
        outputView.printGameStart()
        return Running(board)
    }

    private fun playNextRound(state: State): State {
        if (state.isFinished()) {
            return state
        }
        val position = inputView.inputOpenPosition()
        val nextState = state.open(position)
        outputView.printBoard(nextState.board)
        return nextState
    }
}

fun main() {
    MinesweeperController().play()
}
