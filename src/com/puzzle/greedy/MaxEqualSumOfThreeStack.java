package com.puzzle.greedy;

/**
 * MaxEqualSumOfThreeStack
 * @author gsinha
 * 18 july 2022
 */
public class MaxEqualSumOfThreeStack {
    public static void main(String[] args) {
        int[] stack1 = {3, 2, 1, 1, 1};
        int[] stack2 = {4, 3, 2};
        int[] stack3 = {1, 1, 4, 1};

        int n1 = stack1.length;
        int n2 = stack2.length;
        int n3 = stack3.length;

        System.out.println(maxStackSum(stack1, stack2,
                stack3, n1, n2, n3));
    }

    private static int maxStackSum(int[] stack1, int[] stack2, int[] stack3, int n1, int n2, int n3) {
        int a=0; int b=0;int c=0;

        for(int i: stack1) a+=i;
        for(int i: stack2) b+=i;
        for(int i: stack3) c+=i;

        int i=0; int j=0; int k=0;

        while(a!=b || b!=c)
        {
            //System.out.println(a+" "+b+" "+c);
            if(a>=b && a>=c)
            {
                a-=stack1[i]; i++;
            }
            else if(b>=c)
            {
                b-=stack2[j]; j++;
            }
            else {
                c-=stack3[k]; k++;
            }
        }

        return Math.max(a, 0);
    }
}
