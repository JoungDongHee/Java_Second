package chap_05;

import java.sql.Struct;

public class _04_MultiArrayLoop {
    public static void main(String[] args) {
        // 3 X 5 크기의 5차원 배열
        String[][] seats = new String[][] {
                {"A1","A2","A3","A4","A5"},
                {"B1","B2","B3","B4","B5"},
                {"C1","C2","C3","C4","C5"}
        };
        for(int i =0 ;i<3;i++){
            for(int j=0;j<5;j++){
                System.out.print(seats[i][j]+ " ");
            }
            System.out.println();
        }

        System.out.println("================================");
        //첫줄에는 3칸 둘째 줄에는 4칸 셋째 줄에는 5칸
        String[][] seats2 = new String[][] {
                {"A1","A2","A3"},
                {"B1","B2","B3","B4"},
                {"C1","C2","C3","C4","C5"}
        };

        for(int i =0 ;i<seats2.length;i++){
            for(int j=0;j<seats2[i].length;j++){
                System.out.print(seats2[i][j]+ " ");
            }
            System.out.println();
        }
        System.out.println("================================");

        // 세로크기 10 X 15 에 해당하는 영화관 좌석
        String[][] seats3 = new String[10][15];
        String[] eng = {"A","B","C","D","E","F","G","H","I","J"};
        for (int i = 0; i < seats3.length; i++) {
            for (int j = 0; j < seats3[i].length; j++) {
                seats3[i][j] = eng[i] + (j+1);
            }
        }

        //표구매
        seats3[7][8] = "__";
        seats3[7][9] = "___";

        for(int i =0 ;i<seats3.length;i++){
            for(int j=0;j<seats3[i].length;j++){
                System.out.print(seats3[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
