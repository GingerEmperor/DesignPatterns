package Singleton;

public class SingleClass {
    public static volatile SingleClass uniqueSingleClass;//Ключевое слово volatile гарантирует,
                                                    // что параллельные программные потоки будут правильно работать
                                                    // с переменной uniqueInstance при ее инициализации экземпляром Singleton.
    public int number;
    private SingleClass(int number){
        this.number=number;
    }

    public static  SingleClass getInstance(){
        if (uniqueSingleClass==null){
            synchronized (SingleClass.class) {//Синхронизация выполняется только при первом вызове
                if (uniqueSingleClass==null)//Внутри блока повторяем проверку, и если значение все еще равно null — создаем экземпляр.
                    uniqueSingleClass = new SingleClass(0);
            }
        }
        return uniqueSingleClass;
    }
}
