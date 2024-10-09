class Solution {
    public int maxNumberOfFamilies(int n, int[][] reservedSeats) 
    {
        Map<Integer,Set<Integer>> m=new HashMap<>();
        for(int i=0;i<reservedSeats.length;i++)
        {
            int temp=reservedSeats[i][0];
            if(!m.containsKey(temp))
                m.put(temp,new HashSet<>());
            m.get(temp).add(reservedSeats[i][1]);
        }
        int res=2*(n-m.size());
        for(Set<Integer> s: m.values())
        {
            res=res+check(s);
        }
        return res;
    }
    public int check(Set<Integer> temp)
    {
        int t=0;
        if(!temp.contains(2) && !temp.contains(3) && !temp.contains(4) && !temp.contains(5))
            t++;
        if(!temp.contains(6) && !temp.contains(7) && !temp.contains(8) && !temp.contains(9))
            t++;
        if(t>0)
           return t;
        if(!temp.contains(6) && !temp.contains(7) && !temp.contains(4) && !temp.contains(5))
            t++;
        return t;
    }
}
