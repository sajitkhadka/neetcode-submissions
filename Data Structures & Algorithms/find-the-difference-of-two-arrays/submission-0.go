func findDifference(nums1 []int, nums2 []int) [][]int {
	nums1Set := make(map[int]struct{})
	for _, val := range nums1 {
		nums1Set[val] = struct{}{}
	}
	nums2Set := make(map[int]struct{})
	for _, val:= range nums2 {
		nums2Set[val] = struct{}{}
	}

	var nums1List []int
	for key, _ := range nums1Set {
		if _, exists := nums2Set[key]; !exists {
			nums1List = append(nums1List, key)
		} 
	}
	var nums2List []int
	for key, _ := range nums2Set {
		if _, exists := nums1Set[key]; !exists {
			nums2List = append(nums2List, key)
		}
	}
	return [][]int{nums1List, nums2List};
}
