package test;

/**
 * @author axikuazei
 * @date 2020/9/24 下午3:16
 */
public class Test04 {

    public static void main(String[] args) {
        try{
            throw new OutOfMemoryError();
        }catch (Throwable e){
            System.out.println(e.toString());
        }
    }

}
