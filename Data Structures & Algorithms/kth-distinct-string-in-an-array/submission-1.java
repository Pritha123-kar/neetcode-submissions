class Solution {
    public String kthDistinct(String[] arr, int k) {
      Map<String,Boolean> map=new HashMap();
      for(String a: arr){
        if(map.containsKey(a)){
            map.put(a,false);
        }
        else{
            map.put(a,true);
        }
      }
      for(String a:arr){
        if(map.get(a) && --k==0){
            return a;
        }
      }return "";  
    }
}