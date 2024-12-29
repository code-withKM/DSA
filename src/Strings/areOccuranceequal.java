 public boolean areOccurrencesEqual(String s) {
        int count[] = new int[256];

        for(int i=0;i<s.length();i++){
            count[s.charAt(i)] ++ ;
        }

        int first = count[s.charAt(0)];

        for(int i=1;i<256;i++){
            if(count[i]>0){
                if(count[i] != first){
                return false;
                }
            }
            
        }

        return true;
    }