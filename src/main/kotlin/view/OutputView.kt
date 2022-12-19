package view

import domain.Block
import domain.Board

object OutputView {
    private const val MARK_MINE_BLOCK = "*"
    private const val MARK_NORMAL_BLOCK = "C"
    private const val SEPARATOR_ROW = "\n"
    private const val SEPARATOR_BLOCK = " "

    fun printGameStart(board: Board) {
        println("지뢰찾기 게임 시작")
        printBoard(board)
    }

    private fun printBoard(board: Board) {
        println(
            parseListAsBlockMark(board.getBlocks())
                .chunked(board.getWidth())
                .joinMineField()
        )
    }

    private fun parseListAsBlockMark(blocks: List<Block>): List<String> {
        return blocks.map { getBlockMark(it.isMine()) }
    }

    private fun List<List<String>>.joinMineField(): String {
        return this.joinToString(SEPARATOR_ROW) { it.joinToString(SEPARATOR_BLOCK) }
    }

    private fun getBlockMark(isMine: Boolean): String {
        return if (isMine) MARK_MINE_BLOCK else MARK_NORMAL_BLOCK
    }
}
