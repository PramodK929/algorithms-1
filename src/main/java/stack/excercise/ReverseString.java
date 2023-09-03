package stack.excercise;

import stack.concept.Stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author #pramodkumar on 03/09/23
 * @project algorithms-1
 */
public class ReverseString {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack stack = new Stack();
        String s = br.readLine();
        System.out.println("Before : "+ s);
        Arrays.stream(s.split("")).forEach(i -> {
            stack.push(i);
        });
        s = "";
        while(!stack.isEmpty()) {
            s += stack.pop();
        }
        System.out.println("After : "+ s);

    }
}
