func hasDuplicate(nums []int) bool {
    numsMap := make(map[int]int)
    for _, num := range(nums){
        numsMap[num]++
        if numsMap[num] > 1{
            return true
        }
    }
    return false
}
