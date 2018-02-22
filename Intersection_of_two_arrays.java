class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        HashSet<Integer> set = new HashSet<Integer>();
        // Push the elements of num1 array onto Hashset.
        
        for(int i=0; i<nums1.length;i++)
        {
            if(!set.contains(nums1[i]))
                set.add(nums1[i]);
        }
        
        for(int i=0;i<nums2.length;i++)
        {
            if(!set.isEmpty()&& set.contains(nums2[i]))
            {
                list.add(nums2[i]);
                set.remove(nums2[i]);
            }
        }
        
        int[] arr = new int[list.size()];

for(int i = 0; i < list.size(); i++) {
    if (list.get(i) != null) {
        arr[i] = list.get(i);
    }
}
       return  arr;
        
    }
}
