package com.ll.a.basic;

public class Practice {
    public static void main(String[] args) {
        System.out.println("===========짝수 홀수 판단===========");
        int num = 17;
        if (num % 2 == 0) {
            System.out.println("짝수 입니다.");
        } else {
            System.out.println("홀수 입니다.");
        }
        System.out.println("===========학점 계산===========");
        int score = 85;
        if (score >= 90) {
            System.out.println("A");
        } else if (score >= 80) {
            System.out.println("B");
        } else if (score >= 70) {
            System.out.println("C");
        } else if (score >= 60) {
            System.out.println("D");
        } else {
            System.out.println("E");
        }
        System.out.println("===========윤년 판별===========");
        int year = 2024;
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.printf("%d 는 윤년입니다.\n", year);
        } else {
            System.out.println("윤년이 아닙니다.");
        }
        System.out.println("===========삼각형 유효성 검사===========");
        int a = 3, b = 4, c = 5;
        if (a >= b) {
            if (a >= c) {
                if (a <= b + c) {
                    System.out.println("삼각형 ok");
                } else {
                    System.out.println("삼각형 no");
                }
            } else {
                if (c <= a + b) {
                    System.out.println("삼각형 ok");
                } else {
                    System.out.println("삼각형 no");
                }
            }
        } else if (b >= c) {
            if (b <= a + c) {
                System.out.println("삼각형 ok");
            } else {
                System.out.println("삼각형 no");
            }
        } else {
            if (c <= a + b) {
                System.out.println("삼각형 ok");
            } else {
                System.out.println("삼각형 no");
            }
        }

        if((a +b > c) && (a+c>b) && (b+c>a)) {
            System.out.println("삼각형 ok");
        } else {
            System.out.println("삼각형 no");
        }

        System.out.println("===========계절 판별===========");
        int month = 7;
        switch (month) {
            case 3:
            case 4:
            case 5:
                System.out.println("봄");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("여름");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("가을");
                break;
            case 12:
            case 1:
            case 2:
                System.out.println("겨울");
                break;
            default:
                System.out.println("잘못 입력");
                break;

        }
        System.out.println("===========요일 판별===========");
        int day = 6;
        String season = switch (day) {
            case 1, 2, 3, 4, 5 -> "평일";
            case 6, 7 -> "주말";
            default -> "잘못된 요일";
        };
        System.out.printf("%d는 %s\n", day, season);

        System.out.println("===========BMI 계산 및 판정===========");
        double height = 175.0;  // cm
        double weight = 70.0;   // kg

        String judgement;
        double pig = weight / (height * height) * 10000;

        if (pig < 18.5) {
            judgement = "저체중";
        } else if (pig >= 18.5 && pig < 23) {
            judgement = "정상체중";
        } else if (pig >= 23 && pig < 25) {
            judgement = "과체중";
        } else {
            judgement = "비만";
        }
        System.out.printf("%f는 %s\n", pig, judgement);

        System.out.println("===========최댓값 구하기===========");
        int num1 = 10, num2 = 25, num3 = 17;
        int max;
        if (num1 >= num2) {
            if (num1 >= num3) {
                max = num1;
            } else {
                max = num3;
            }
        } else {
            if (num2 >= num3) {
                max = num2;
            } else {
                max = num3;
            }
        }
        System.out.printf("%d\n",max);

        System.out.println("===========시험 합격 여부===========");
        int math = 39, english = 70, science = 95;
        double avg = (math + english + science)/3.0;
        int cutAvg = 60;
        int cutNum = 40;
        int m = 0, e = 0, s = 0;

        if(math > cutNum) {
            m = 1;
        }
        if(english > cutNum) {
            e = 1;
        }
        if(science > cutNum) {
            s = 1 ;
        }

        if(avg > cutAvg) {
            if (m == 1 && e == 1 && s == 1) {
                System.out.println("합격");
            } else if (m == 1 && e == 1 && s == 0) {
                System.out.println("과학 불합격");
            } else if (m == 1 && e == 0 && s == 0) {
                System.out.println("영어, 과학 불합격");
            } else if (m == 0 && e == 0 && s == 0) {
                System.out.println("수학, 영어, 과학 불합격");
            } else if (m == 1 && e == 0 && s == 1) {
                System.out.println("영어 불합격");
            } else if (m == 0 && e == 1 && s == 1) {
                System.out.println("수학 불합격");
            } else if (m == 0 && e == 1 && s == 0) {
                System.out.println("수학, 과학 불합격");
            } else {
                System.out.println("수학, 영어 불합격");
            }
        } else {
            System.out.println("평균 불합격");
        }

        System.out.println("===========할인율 계산===========");
        int price = 120000;
        boolean isMember = true;
        int sale = 1;
        int result  = 0;

        if (price >= 100000) {
            sale = 10;
        } else if (price >= 50000) {
            sale = 5;
        }
        if(isMember) {
            sale += 5;
        }
        result = price - price * sale / 100;
        System.out.println(price);
        System.out.println(sale);
        System.out.println(result);
    }
}
