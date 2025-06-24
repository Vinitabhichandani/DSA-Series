import java.util.HashMap;

  class Hash1{

    public static void main(String args[]){ //  hashMap ma add karva ma put ave and set ma add ave 

      HashMap< String,Integer> map = new HashMap<>();
      //HashMap<Integer, String> map = new HashMap<>();
      //HashMap<String, Integer> map = new HashMap<>();

      // add

      map.put("India", 120);
      map.put("Indonesia", 40);
      map.put("Russia", 200);
      map.put("Canada", 100);
      map.put("Singapore", 120);

      System.out.println(map);


      // search

      if(map.containsKey("Singapore")){

        System.out.println(" yes ");
      }else{
        System.out.println(" Not ");
      }

      if(map.containsKey("Russia")){
        System.out.println(" yes ");
      }else{
        System.out.println("Not");
      }

   // get the value and the
      System.out.println(map.get("India"));
      System.out.println(map.get("Indonesia"));
  

      // removeing
      map.remove("Singapore");
      System.out.println(map);

  

      // iteration

      ///for(Map.Entry<String, Integer> e: map.entrySet()){
        //System.out.print(e.getKey());
        //System.out.print(e.getValue());
      //}


    
    }
  }

