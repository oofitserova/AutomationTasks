public class taskException1 {
    public static void main(String[] args) {
        int x;
        int d=0;
        x=0;
        try{
            d=4/x;
        }
        catch(ArithmeticException e){
            System.out.println("Исключение отловлено.");
            System.out.println("Состояние объекта-исключения:");
            System.out.println(e);
        }
        catch(Exception e){
            System.out.println("Другой блок обработки исключения");
        }
    }
}
