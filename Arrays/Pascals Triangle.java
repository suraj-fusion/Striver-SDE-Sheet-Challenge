class Solution {
    public List<List<Integer>> generate(int numRows) {
      
      //my approach using extra space
      numRows=numRows-1;
      List<List<Integer>> al = new ArrayList<>();

        if(numRows>=0)
        {
            List<Integer> temp=new ArrayList<Integer>();
            temp.add(1);
            al.add(temp);
         if(numRows==0)
            return al;
        }
        if(numRows>=1)
        { 
           
           List<Integer> temp2=new ArrayList<Integer>();
            temp2.add(1);  
            temp2.add(1);
            al.add(temp2);
            if(numRows==1)
            return al;
        }
        
       
        for(int i=2;i<=numRows;i++)
        {
           List<Integer> curr= new ArrayList<Integer>();
           curr.add(1);
           for(int j=1;j<al.get(i-1).size()+1-1;j++)
           {
               curr.add( al.get(i-1).get(j-1) +al.get(i-1).get(j));
           }
           curr.add(1);
           al.add(curr);
        }

        return al;
       

       //TC-O(N^2) SC-O(N) 


        
    }
}





