data class WeighedDirection(val d: Direction, val len: Int)

enum class Direction {
    HORIZONTAL, VERTICAL;

    operator fun times(n: Int): WeighedDirection {
        return WeighedDirection(this, n)
    }

}

data class Point(val col: Int, val row: Int) {
    operator fun plus(wd: WeighedDirection): Point {
        return when(wd.d) {
            HORIZONTAL -> Point(col + wd.len, row)
            VERTICAL -> Point(col, row + wd.len)
        }
    }
}