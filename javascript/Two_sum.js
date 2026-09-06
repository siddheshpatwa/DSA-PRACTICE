// 1. Two Sum Hashmap
function twoSum(nums, target) {
    const map = new Map(); // number → index

    for (let i = 0; i < nums.length; i++) {
        const complement = target - nums[i];

        if (map.has(complement)) {
            return [map.get(complement), i];
        }

        map.set(nums[i], i);
    }
}