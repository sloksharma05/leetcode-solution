class Solution {
public:
    double findMedianSortedArrays(vector<int>& nums1, vector<int>& nums2) {
        int n = nums1.size() , m= nums2.size();
        double arr[n+m];
        for(int i = 0; i<n+m;i++){
            if(i<n)
                arr[i]=nums1[i];
            else
                arr[i]=nums2[i-n];}


            sort(arr,arr+m+n);
        if((n+m)%2==0){

            return static_cast<double>((arr[(n+m)/2-1]+arr[(n+m)/2]))/2 ;


        }
        else{

            return static_cast<double>(arr[(n+m-1)/2]);

        }
    
    }
    

};