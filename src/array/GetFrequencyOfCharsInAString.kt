package array

class GetFrequencyOfCharsInAString {

    fun findFrequencyOfGivenString(inputStr: String): HashMap<Char,Int> {
        val hashMap = hashMapOf<Char, Int>()

        inputStr.forEachIndexed { index, char ->
            println("index: $index")
            hashMap[char] = hashMap.getOrDefault(char, 0) + 1
        }
        return hashMap
    }
}

fun main() {
    val result = GetFrequencyOfCharsInAString().findFrequencyOfGivenString(
        "Hello"
    )
    println("Result: ${result.toList()}")
}