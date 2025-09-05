package array

class FindDuplicateElementsInArray {
    /**
     *  This function would help to identify whether an array has duplicate item or not.
     *
     *  Given an integer array nums, return true if any value appears more than once in the array, otherwise return false.
     *
     * ```
     * Input: nums = [1, 2, 3, 3]
     *
     * Output: true
     * ```
     *
     */
    fun hasDuplicate(intArray: IntArray): Boolean {
        val hashSet = HashSet<Int>()

        for(num in intArray) {
            if (num in hashSet) {
                return true
            }
            hashSet.add(num)
        }
        return false
    }

    fun hasDuplicate2(intArray: IntArray): Boolean {
        return intArray.toSet().size < intArray.size
    }

}