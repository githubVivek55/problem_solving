import java.io.IOException;
import java.lang.reflect.Array;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class pair{
    long first, second;
    public pair(long first, long second)
    {
        this.first = first;
        this.second = second;
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
//        Path path = Paths.get("files/fileInput2.txt");
//        try(Stream<String> lines = Files.lines(path);){
//            Long[] s = lines.flatMap(line -> Pattern.compile(" ").splitAsStream(line)).limit(1).toArray(Long[]::new);
//            Arrays.stream(s).forEach(System.out::println);
//        }
        long[] A = {1,2,4,5,7};
        long[] B ={5,6,3,4,8};
        int N =5;
        long X=9;
        Arrays.sort(A);
        Arrays.sort(B);
        List<pair> res = new ArrayList<>();
        for(int i=0;i<N;i++){
            long t = X-A[i];
            int j=Arrays.binarySearch(B,t);
            System.out.println(j);
            if(j>=0){
                res.add(new pair(A[i],B[j]));
            }
        }
        res.stream().forEach((p)->System.out.println(p.first+"-------"+p.second));
    }
}
