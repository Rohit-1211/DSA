
class Solution {
public int largestRectangleArea(int[] heights) {
int n = heights.length;
int[] left = new int[n]; // left smaller nearest
int[] right = new int[n]; // right smaller nearest
Stack<Integer> s = new Stack<>();

// Left smaller nearest
for (int i = 0; i < n; i++) {
while (!s.isEmpty() && heights[s.peek()] >= heights[i]) {
s.pop();
}
left[i] = s.isEmpty() ? -1 : s.peek();
s.push(i);
}

while (!s.isEmpty()) {
s.pop();
}

// Right smaller nearest
for (int i = n - 1; i >= 0; i--) {
while (!s.isEmpty() && heights[s.peek()] >= heights[i]) {
s.pop();
}
right[i] = s.isEmpty() ? n : s.peek();
s.push(i);
}

int ans = 0;
for (int i = 0; i < n; i++) {
int width = right[i] - left[i] - 1;
int currArea = heights[i] * width;
ans = Math.max(ans, currArea);
}

return ans;
}
}