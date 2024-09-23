#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

// dots_rows는 2차원 배열 dots의 행 길이, dots_cols는 2차원 배열 dots의 열 길이입니다.
int solution(int** dots, size_t dots_rows, size_t dots_cols) {
    int x1 = dots[0][0], y1 = dots[0][1];
    int x2 = dots[1][0], y2 = dots[1][1];
    int x3 = dots[2][0], y3 = dots[2][1];
    int x4 = dots[3][0], y4 = dots[3][1];
    int answer = 0;
        
    double slope1 = (double) (y2 - y1) / (x2 - x1);
    double slope2 = (double) (y4 - y3) / (x4 - x3);
    if (slope1 == slope2) answer = 1;

    slope1 = (double) (y3 - y1) / (x3 - x1);
    slope2 = (double) (y2 - y4) / (x2 - x4);
    if (slope1 == slope2) answer = 1;
        
    slope1 = (double) (y4 - y1) / (x4 - x1);
    slope2 = (double) (y2 - y3) / (x2 - x3);
    if (slope1 == slope2) answer = 1;
    
    return answer;
}