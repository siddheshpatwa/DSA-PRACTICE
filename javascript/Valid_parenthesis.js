var isValid = function(s) {
    const stack = [];

    const pairs = {
        ')': '(',
        ']': '[',
        '}': '{'
    };

    for (let char of s) {

        // Opening bracket
        if (char === '(' || char === '[' || char === '{') {
            stack.push(char);
        }

        // Closing bracket
        else {
            if (stack.length === 0 || stack[stack.length - 1] !== pairs[char]) {
                return false;
            }

            stack.pop();
        }
    }

    return stack.length === 0;
};

console.log(isValid("()")); // true
console.log(isValid("()[]{}")); // true
console.log(isValid("(]"));