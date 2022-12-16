package domain

import io.kotest.assertions.throwables.shouldThrow
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource

class RectangleTest {
    @CsvSource("1,-1", "1, 0", "0,1", "-1,1", "-1,-1")
    @ParameterizedTest
    fun `직사각형은 높이 너비가 양수가 아니면 예외 발생`(width: Int, height: Int) {
        shouldThrow<IllegalArgumentException> {
            Rectangle(width, height)
        }
    }
}
