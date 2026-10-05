import java.util.*;

class TopKFrequentWords2{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);

int n=sc.nextInt();
String[]words=new String[n];

for(int i=0;i<n;i++){
words[i]=sc.next();
}

int k=sc.nextInt();

HashMap<String,Integer>map=new HashMap<>();

for(String word:words){
map.put(word,map.getOrDefault(word,0)+1);
}

ArrayList<String>list=new ArrayList<>(map.keySet());

Collections.sort(list,(a,b)->{
if(!map.get(a).equals(map.get(b))){
return map.get(b)-map.get(a);
}
return a.compareTo(b);
});

for(int i=0;i<k;i++){
System.out.print(list.get(i)+" ");
}
}
}