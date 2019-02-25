# Использование автоматических генераторов анализаторов ANTLR
Трансляция выражения из префиксной записи в язык высокого
уровня.
На входе — выражение в префиксной записи, должны
поддерживаться арифметические и логические операции, операции
сравнения чисел, ветвление, циклы, присваивание, вывод.
На выходе программа на императивном языке высокого уровня.

Пример:
`if > 2 3 print 3 if > 4 - 7 2 print + 3 4`

Вывод:
```
begin
  if (2 > 3) then
    writeln(3)
  else if (4 > (7 - 2)) then
    writeln(3 + 4);
end.
```