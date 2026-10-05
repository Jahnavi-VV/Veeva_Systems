import java.util.*;

class WordFrequency{

static void findFrequency(String[]words){
HashMap<String,Integer>map=new HashMap<>();

for(String word:words){
map.put(word,map.getOrDefault(word,0)+1);
}

for(String key:map.keySet()){
System.out.println(key+" "+map.get(key));
}
}

public static void main(String[]args){
Scanner sc=new Scanner(System.in);

int n=sc.nextInt();
String[]words=new String[n];

for(int i=0;i<n;i++){
words[i]=sc.next();
}

findFrequency(words);
}
}/*import java.util.*;

class WordFrequency{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);

int n=sc.nextInt();
HashMap<String,Integer>map=new HashMap<>();

for(int i=0;i<n;i++){
String word=sc.next();
map.put(word,map.getOrDefault(word,0)+1);
}

for(String key:map.keySet()){
System.out.println(key+" "+map.get(key));
}
}
}
*/