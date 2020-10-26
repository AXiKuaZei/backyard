/**
 * @author axikuazei
 * @date 2020/10/15 下午6:01
 */
public class Ten {

    public static void main(String[] args) {
        System.out.println(f(4));
    }

    public static String f(int i){
        StringBuilder sb = new StringBuilder();
        while(i>0){
            sb.insert(0,i%2);
            i/=2;
        }
        return sb.toString();
    }
}
