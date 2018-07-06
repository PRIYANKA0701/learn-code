int makeArrayConsecutive2(int[] statues) {
    int n = 0;
    Arrays.sort(statues);
    for(int i=0;i<statues.length-1;i++) 
    {
        n = n + statues[i+1]-statues[i]-1;
    }
    return n;

}

