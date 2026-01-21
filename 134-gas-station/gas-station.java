class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int gsum=0;
        int csum=0;
        int tank=0;
        int load=0;
        for(int i=0;i<gas.length;i++){
            gsum=gsum+gas[i];
            csum=csum+cost[i];

            tank=tank +gas[i]-cost[i];

            if (tank < 0) {
            load = i + 1;
            tank = 0;}
        }
        if(gsum<csum){
            return -1;
        }
        return load;   
    }
}