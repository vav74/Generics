import java.util.Random;

public class MagicBox<T> {
    private T[] items;
    private Random random = new Random();


    public boolean add(T item){
 /* У вас должен быть метод добавления объекта boolean add(T item).
    Если коробка ещё не полна, то элемент должен в ней сохраниться и метод вернуть true.
    Если полна, то коробка не должна измениться, а метод должен вернуть false.*/
        return true;
    }

    public T pick(){
/*  Также нужно реализовать метод T pick(), работающий следующим образом:
    Если коробка не полна, то он выкидывает RuntimeException с сообщением, что коробка не полна
    и осталось ещё столько-то ячеек заполнить.
    Если коробка полна, то метод выбирает случайным образом (см. ниже)
    один из сохранённых элементов и возвращает его из метода.*/
    }


}