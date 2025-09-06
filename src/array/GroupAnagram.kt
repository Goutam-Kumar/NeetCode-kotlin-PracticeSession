package array

/**
 * Given an array of strings strs, group all anagrams together into sublists. You may return the output in any order.
 *
 * An anagram is a string that contains the exact same characters as another string, but the order of the characters can be different.
 *
 * Example 1:
 *
 * Input: strs = ["act","pots","tops","cat","stop","hat"]
 *
 * Output: [["hat"],["act", "cat"],["stop", "pots", "tops"]]
 *
 * Example 2:
 *
 * Input: strs = ["x"]
 *
 * Output: [["x"]]
 *
 * Example 3:
 *
 * Input: strs = [""]
 *
 * Output: [[""]]
 *
 * Constraints:
 *
 * 1 <= strs.length <= 1000.
 *
 * 0 <= strs[i].length <= 100
 *
 * strs\[i] is made up of lowercase English letters.
 */
class GroupAnagram {

    fun findGroupAnagram(strs: List<String>){
        val result = HashMap<List<Int>, MutableList<String>>()
        strs.forEachIndexed { index, s ->

            println("Iteration: $index")
            val count = MutableList(26) {0}

            for (c in s) {
                count[ c - 'a']++
            }
            result.putIfAbsent(count, mutableListOf())
            result[count]?.add(s)
        }

        println(result.values.toList())
    }
}

fun main() {
    val obj = GroupAnagram()
    obj.findGroupAnagram(
        listOf(
            "acts",
            "pots",
            "tops",
            "stop",
            "cats",
            "hello",
            "elloh"
        )
    )
}