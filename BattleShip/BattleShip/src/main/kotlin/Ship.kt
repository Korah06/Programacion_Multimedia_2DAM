data class Ship(
    val id: Int,
    val start: Point,
    val size: Int,
    val direction: Direction,
    val hits: Set<Point> = setOf()) {

    val destroyed = hits.size == size
}
