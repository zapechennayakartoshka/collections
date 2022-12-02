
import java.util.List;
/**
 * Класс, содержащий информацию о подсчете времени
 * @author Yulia Kuznetsova
 * @version 1.0
 */
public class Timer {

        /** Поле количества повторений */
        private int N;
        /** Поле начала отсчёта времени */
        long timeStart;
        /** Поле конца отсчёта времени */
        long timeEnd;
        /** Для присвоения ArrayList или LinkedList */
        private List<Integer> list;
        /**
         * Заполнение поля количества повторений
         * @param n количество задаваемых повторений
         */
        public void setN(int n) {
            N = n;
        }
        /**
         * Конструктор для ArrayList или LinkedList
         * @param list пустой параметр
         */
        public Timer(List<Integer> list) {
            this.list = list;
        }
        /**
        * Подсчет времени для метода получения элемента из списка get
        * @return время, затраченное на метод get
        */
       public long get() {
        for (int i = 0; i < N; i++)
        {
            list.add(i);
        }
        timeStart = System.nanoTime();
        for (int i = 0; i < N; i++)
        {
            list.get(i);
        }
        timeEnd = System.nanoTime();
        list.clear();
        return timeEnd - timeStart;
        }
        /**
         * Подсчет времени для метода add
         * @return время, затраченное на метод add
         */
        public long add() {
            timeStart = System.nanoTime();
            for (int i = 0; i < N; i++)
            {
                list.add(i);
            }
            timeEnd = System.nanoTime();
            list.clear();
            return timeEnd - timeStart;
        }
        /**
         * Подсчет времени для метода удаления элементов с конца списка deleteTail
         * @return время, затраченное на метод deleteTail
         */
        public long deleteTail() {
            for (int i = 0; i < N; i++)
            {
                list.add(i);
            }
            timeStart = System.nanoTime();
            for (int i = N - 1; i >= 0; i--)
            {
                list.remove(i);
            }
            timeEnd = System.nanoTime();
            return timeEnd - timeStart;
        }
        /**
         * Подсчет времени для метода для удаления элементов c начала списка deleteBegin
         * @return время, затраченное на метод deleteBegin
         */
        public long deleteBegin() {
            for (int i = 0; i < N; i++)
            {
                list.add(i);
            }
            timeStart = System.nanoTime();
            for (int i = 0; i < N; i++)
            {
                list.remove(0);
            }
            timeEnd = System.nanoTime();
            return timeEnd - timeStart;
        }

}
