package com.folxora.convert;

import java.util.ArrayList;

public class MainClass {
    public static void main(String[] args) {

    }
}

class Solution{
    public String convert(String s, int numRows){
        if (numRows == 1) return s;

        ArrayList<StringBuilder> rows = new ArrayList<>();

        for (int i = 0; i < Math.min(numRows,s.length());i++){
            rows.add(new StringBuilder());
        }

        int curRow = 0;
        boolean goingDown = false;

        for (char c: s.toCharArray()){
            rows.get(curRow).append(c);
            if (curRow == 0 || curRow == numRows -1) goingDown = !goingDown;
            curRow += goingDown ? 1 : -1;
        }

        //合并
        StringBuilder res = new StringBuilder();
        for (StringBuilder row : rows){
            res.append(row);
        }

        return res.toString();
    }
}