package array

/**
 * Description
 * Given two strings s and t, return true if the two strings are anagrams of each other, otherwise return false.
 *
 * An anagram is a string that contains the exact same characters as another string, but the order of the characters can be different.
 *
 * Example 1:
 *
 * Input: s = "racecar", t = "carrace"
 *
 * Output: true
 *
 * Example 2:
 *
 * Input: s = "jar", t = "jam"
 *
 * Output: false
 * Constraints:
 *
 * s and t consist of lowercase English letters.
 */
class ValidAnagram {
    fun isValidAnagram(s: String, t: String): Boolean {
        if(s.length != t.length) {
            return false
        }

        val mapS = hashMapOf<Char, Int>()
        val mapT = hashMapOf<Char, Int>()

        for(i in s.indices) {
            println("Iteration: $i")
            mapS[s[i]] = mapS.getOrDefault(s[i], 0) + 1
            mapT[t[i]] = mapT.getOrDefault(t[i], 0) + 1
        }
        println("Map S: ${mapS.toList()}")
        println("Map T: ${mapT.toList()}")
        return mapS == mapT
    }
}

fun main() {
    val obj = ValidAnagram()
    println("Result for Set1: ${obj.isValidAnagram("top", "pot")}")
    println("Result for Set2: ${obj.isValidAnagram("aabbccddee", "eeaabbddcc")}")
    println("Result for Set3: ${obj.isValidAnagram("Hellow", "lowhee")}")
}