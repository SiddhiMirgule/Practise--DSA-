package _00_MAIN_TOPICS;

import java.util.Arrays;

public class _01_buildTree {

    public static void main(String[] args) {

        int[] arr = {2,4,6,8};

        int n = arr.length;

        int[] tree = new int[4 * n];

        // build tree
        build(1,0,n-1,arr,tree);

        System.out.println("Before Update:");
        System.out.println(Arrays.toString(tree));

        // update index 2 with value 10
        update(1,0,n-1,2,10,tree);

        System.out.println("After Update:");
        System.out.println(Arrays.toString(tree));
    }

    // BUILD FUNCTION
    public static void build(int node,
                             int start,
                             int end,
                             int[] arr,
                             int[] tree) {

        if(start == end) {

            tree[node] = arr[start];
        }
        else {

            int mid = (start + end) / 2;

            build(2 * node,
                    start,
                    mid,
                    arr,
                    tree);

            build(2 * node + 1,
                    mid + 1,
                    end,
                    arr,
                    tree);

            tree[node] =
                    tree[2 * node]
                            + tree[2 * node + 1];
        }
    }

    // UPDATE FUNCTION
    public static void update(int node,
                              int start,
                              int end,
                              int idx,
                              int val,
                              int[] tree) {

        // leaf node
        if(start == end) {

            tree[node] = val;
        }
        else {

            int mid = (start + end) / 2;

            // left subtree
            if(idx <= mid) {

                update(2 * node,
                        start,
                        mid,
                        idx,
                        val,
                        tree);
            }

            // right subtree
            else {

                update(2 * node + 1,
                        mid + 1,
                        end,
                        idx,
                        val,
                        tree);
            }

            // recompute parent
            tree[node] =
                    tree[2 * node]
                            + tree[2 * node + 1];
        }
    }
}