## Урок 3. Структуры данных. Связный список.
Реализация выполнена в IDE Eclipse. Проект состоит из двух классов: LinkedList.java и TestLinkedList.java. 

Для решения задачи обращения списка создаются три переменные: `previos`, `current`, и `next`. Алгоритм начинается `current = head` и `previos = null`. Затем идет  перебир всех узло в списке, сохраняя `current.next` в `next`, затем обрабатывается указатель `current.next` обратно на `previos`, затем обновляется `previos` на `current`, а затем `current` на `next`. Если достигнут конец списка, то head списка становится `previos`.

![image](images/result.png)