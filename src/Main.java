import util.SwingUtils;

import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Queue;
/*
Требуется решить задачу в 2-х вариантах:
1. С использованием стека / очереди, самостоятельно реализованных на основе
связного списка.
2. С использованием реализации стека / очереди, которая уже есть в стандартной
библиотеки языка Java.
Решение задачи предполагает наличие оконного интерфейса для демонстрации работы
программы. Должен быть предусмотрен ввод исходных данных из файла.
Если в условии задачи что-то непонятно – попросить пояснить преподавателя.

Смоделировать игру ход карточной игры «Пьяница»:
https://ru.wikipedia.org/wiki/Пьяница_(карточная_игра). 36 перемешиваются и раздаются
2-м игрокам поровну. Карты каждого игрока представлены в виде очереди. Каждый ход
оба игрока берут по карте из очереди сравнивают и тот, у кого карта старше, добавляет
обе карты в конец очереди (остальные правила, как минимум «Спор», надо также
смоделировать).
«Рисовать» анимацию не требуется, но в каком-то виде требуется показывать карты
одного и другого игрока (как вариант, в строке через запятую) и по кнопке осуществлять
ход.

 */
public class Main {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.ROOT);
        //UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        SwingUtils.setDefaultFont("Times New Roman", 18);

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameMain().setVisible(true);
            }
        });
    }
}