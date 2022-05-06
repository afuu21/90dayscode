int maxArea = 0;
for (int i = 0; i < height.length; i++) {
    maxArea = Math.max(maxArea, height[i] * (lessFromRight[i] - lessFromLeft[i] - 1));
}
