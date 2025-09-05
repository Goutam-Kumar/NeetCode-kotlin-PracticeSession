package array
/**
 * Two Sum Problem Implementation
 *
 * @see <a href="https://github.com/Goutam-Kumar/NeetCode-kotlin-PracticeSession/blob/master/src/array/problems/TwoSum.md">Two Sum Problem Guide</a>
 * @author Goutam Kumar &lt;goutam.k0711@gmail.com&gt;
 * @version 1.0
 */

class TwoSumArrayUsingHashMap {

    fun twoSum(nums: IntArray, target: Int): IntArray {
        val prevHashMap = hashMapOf<Int,Int>()
        for (i in nums.indices) {
            println("Iteration $i")
            val num = nums[i]
            val diff = target - num

            if (prevHashMap.containsKey(diff)) {
                return intArrayOf(prevHashMap.getValue(diff), i)
            }

            prevHashMap[num] = i
        }
        return intArrayOf()
    }
}

fun main(){
    val result = TwoSumArrayUsingHashMap().twoSum(
        intArrayOf(33,56,23,65,77,23),46
    )
    println("Result: ${result.asList()}")
}