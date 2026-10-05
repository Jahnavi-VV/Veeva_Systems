import java.util.*;
class TopKFrequentWords{
static void findTopK(String[]words,int k){
HashMap<String,Integer>map=new HashMap<>();
for(String word:words){
map.put(word,map.getOrDefault(word,0)+1);
}
for(int i=0;i<k;i++){
String maxKey="";
int max=0;
for(String key:map.keySet()){
if(map.get(key)>max){
max=map.get(key);
maxKey=key;
}
}
System.out.println(maxKey);
map.remove(maxKey);
}
}
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
String[]words=new String[n];
for(int i=0;i<n;i++){
words[i]=sc.next();
}
int k=sc.nextInt();
findTopK(words,k);
}
}