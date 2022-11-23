fun main() {
    print(solution(100, 20, 170))
}

fun solution(deposit: Int, rate: Int, threshold: Int): Int {
    var currentValue: Float = deposit.toFloat()
    var index = 0
    do {
        index++
        currentValue += currentValue * (rate.toFloat() / 100)
    } while (currentValue < threshold)

    return index
}
