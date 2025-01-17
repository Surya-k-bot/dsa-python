class Solution {
    public int threeSumClosest(int[] n, int t) {
        Arrays.sort(n);
        int h=Integer.MAX_VALUE;
        int z=0;
        
        for(int i=0;i<n.length-2;i++){
            int l=i+1;
            int r=n.length-1;
            while(l<r){
                int p=n[l]+n[r]+n[i];
                if(n[l]+n[r]==t-n[i]) return t;
               
                else if(n[l]+n[r]>t-n[i]) r--;
                else l++;
            int v=Math.abs(p-t);
            if(v<h){
                h=v;
                z=p;
            }
            }
        }
        return z;
    }
}