public class IntersectionArr {
    public static int[] intersection(int[] nums1, int[] nums2) {
        int ans[] ={};
        int count =0;
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if(nums1[i]==nums2[j]){
                    ans[count]=nums1[i];
                    count++;
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int nums1[] = {1,2,2,1};
        int nums2[] = {2,2};
        int ans[]=intersection(nums1, nums2);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i]);
        }
    }
}
//incomplete