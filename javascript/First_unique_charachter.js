// 387. First Unique Character in a String
/**
 * @param {string} s
 * @return {number}
 */
var firstUniqChar = function(s)  {
    const map = new Map()
    for(let i = 0; i < s.length; i++) {
        if(map.has(s[i])) {
            map.set(s[i], map.get(s[i]) + 1)
        // console.log(map)
        } else {
            map.set(s[i], 1)
            console.log(map)
        }
    }
    for(let i = 0; i < s.length; i++) {
        if(map.get(s[i]) === 1) {
            return i
        }
    }
    return -1
};
 console.log(firstUniqChar("loveleetcode"))
