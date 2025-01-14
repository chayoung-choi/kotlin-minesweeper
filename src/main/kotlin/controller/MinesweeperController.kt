package controller

import domain.BoardFactory
import domain.Rectangle
import view.InputView
import view.OutputView

class MinesweeperController {
    private val inputView = InputView
    private val outputView = OutputView

    fun run() {
        val height = inputView.inputHeight()
        val width = inputView.inputWidth()
        val mineCount = inputView.inputMineCount()

        val rectangle = Rectangle(width, height)
        val board = BoardFactory().generate(rectangle, mineCount)
        outputView.printGameStart()
        outputView.printBoard(board)
    }
}

fun main() {
    MinesweeperController().run()
}
