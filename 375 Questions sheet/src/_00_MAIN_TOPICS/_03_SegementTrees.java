package _00_MAIN_TOPICS;

import java.util.Arrays;

public class _03_SegementTrees {

    public static void main(String[] args) {

        // original array
        int[] arr = {2,4,6,8};

        int n = arr.length;

        // segment tree
        int[] tree = new int[4 * n];

        // BUILD TREE
        build(1,0,n-1,arr,tree);

        System.out.println("Built Tree:");
        System.out.println(Arrays.toString(tree));

        // QUERY BEFORE UPDATE
        int sum1 = query(1,0,n-1,1,3,tree);

        System.out.println("Sum from index 1 to 3:");
        System.out.println(sum1);

        // UPDATE
        update(1,0,n-1,2,10,arr,tree);

        System.out.println("Updated Tree:");
        System.out.println(Arrays.toString(tree));

        // QUERY AFTER UPDATE
        int sum2 = query(1,0,n-1,1,3,tree);

        System.out.println("Sum from index 1 to 3 after update:");
        System.out.println(sum2);
    }

    // BUILD SEGMENT TREE
    public static void build(int node,
                             int start,
                             int end,
                             int[] arr,
                             int[] tree) {

        // leaf node
        if(start == end) {

            tree[node] = arr[start];
        }
        else {

            int mid = (start + end) / 2;

            // left subtree
            build(2 * node,
                    start,
                    mid,
                    arr,
                    tree);

            // right subtree
            build(2 * node + 1,
                    mid + 1,
                    end,
                    arr,
                    tree);

            // parent stores sum
            tree[node] =
                    tree[2 * node]
                            + tree[2 * node + 1];
        }
    }

    // QUERY
    public static int query(int node,
                            int start,
                            int end,
                            int l,
                            int r,
                            int[] tree) {

        // CASE 1 : NO OVERLAP
        if(r < start || end < l) {

            return 0;
        }

        // CASE 2 : COMPLETE OVERLAP
        if(l <= start && end <= r) {

            return tree[node];
        }

        // CASE 3 : PARTIAL OVERLAP

        int mid = (start + end) / 2;

        int leftSum =
                query(2 * node,
                        start,
                        mid,
                        l,
                        r,
                        tree);

        int rightSum =
                query(2 * node + 1,
                        mid + 1,
                        end,
                        l,
                        r,
                        tree);

        return leftSum + rightSum;
    }

    // UPDATE
    public static void update(int node,
                              int start,
                              int end,
                              int index,
                              int val,
                              int[] arr,
                              int[] tree) {

        // leaf node
        if(start == end) {

            arr[index] = val;
            tree[node] = val;
        }
        else {

            int mid = (start + end) / 2;

            // left subtree
            if(index <= mid) {

                update(2 * node,
                        start,
                        mid,
                        index,
                        val,
                        arr,
                        tree);
            }

            // right subtree
            else {

                update(2 * node + 1,
                        mid + 1,
                        end,
                        index,
                        val,
                        arr,
                        tree);
            }

            // recompute parent
            tree[node] =
                    tree[2 * node]
                            + tree[2 * node + 1];
        }
    }
}