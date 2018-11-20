// HackerRank Sparse Arrays Function.



// USING HASHMAP

    static int[] matchingStrings(String[] strings, String[] queries) {
        Map<String,Integer> stringsmap=new HashMap<String,Integer>();

        int count[]=new int[queries.length];
       

      for(String s: strings){
            if(stringsmap.containsKey(s)){
                stringsmap.put(s,stringsmap.get(s)+1);
            }else{
                stringsmap.put(s,1);
            }
        }

        for(int i=0;i<queries.length;i++){
            count[i]=0;
            if(stringsmap.containsKey(queries[i])){
                count[i]=stringsmap.get(queries[i]);
            }

            
        }
        return count;
        
        }
        
        
        
        
        //USING ARRAY ITERATIONS
        
        static int[] matchingStrings(String[] strings, String[] queries) {

        int count[]=new int[queries.length];
       

        for(int i=0;i<queries.length;i++){
            count[i]=0;
            for(int j=0;j<strings.length;j++){
                if(queries[i].equals(strings[j])){
                 count[i]++;
            
           
                }
            }
        }

        return count;

    }

       
            
