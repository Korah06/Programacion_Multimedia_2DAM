data class Board(
    val id: Int,
    val user: User,
    val width: Int, val height: Int,
    val ships: List<Ship> = listOf(),
    val hits: Set<Point> = setOf(),
    val misses: Set<Point> = setOf(),
    val opponentHits: Set<Point> = setOf(),
    val opponentMisses: Set<Point> = setOf()) {

    val activeShips = ships.filter { !it.destroyed }.map { it.id }
    val destroyedShips: ships.filter { it.destroyed }.map { it.id }
    val lost = ships.isNotEmpty() && activeShips.isEmpty()


    operator fun contains(p: Point): Boolean {
        return p.col >= 0 && p.row >= 0
                && p.col < width && p.row < height
    }
}