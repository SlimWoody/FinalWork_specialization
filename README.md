# Операционные системы и виртуализация (Linux)
_________________________________________________________________________________
Выполнил Лузин Павел Геннадьевич, дата выполнения задач 23.04.2024 г. 

slimwoody@slimwoody-VirtualBox:~$ mkdir FinalWork 
slimwoody@slimwoody-VirtualBox:~$ cd FinalWork/

__________________________________________________________________________________
## 1. Использование команды cat в Linux

- Создать два текстовых файла: "Pets"(Домашние животные) 
и "Pack animals"(вьючные животные), используя команду 
`cat` в терминале Linux. В первом файле перечислить собак,
кошек и хомяков. Во втором — лошадей, верблюдов и ослов.
___________________________________________________________________________________

slimwoody@slimwoody-VirtualBox:~/FinalWork$ cat > Pets << EOF
Собаки: Ночка, Джесси, Бобик, Рекс
Кошки: Тигра, Мура, Вася, Буся
Хомяки: Жора, Генри, Хома  
EOF

slimwoody@slimwoody-VirtualBox:~/FinalWork$ cat > PackAnimals << EOF
Лошади: Принц, Катя, Молния, Харвест
Верблюды: Колючка, Миниган, Рудлинг, Артем
Ослы: Марина, Добрый, Дрон, Шангин
EOF
____________________________________________________________________________________
### - Объединить содержимое этих двух файлов в один и просмотреть его содержимое.
###   - Переименовать получившийся файл в "Human Friends"(.
____________________________________________________________________________________

slimwoody@slimwoody-VirtualBox:~/FinalWork$ cat Pets PackAnimals > HumanFriends


slimwoody@slimwoody-VirtualBox:~/FinalWork$ cat HumanFriends 
Собаки: Ночка, Джесси, Бобик, Рекс
Кошки: Тигра, Мура, Вася, Буся
Хомяки: Жора, Генри, Хома  
Лошади: Принц, Катя, Молния, Харвест
Верблюды: Колючка, Миниган, Рудлинг, Артем
Ослы: Марина, Добрый, Дрон, Шангин
____________________________________________________________________________________
## Пример конечного вывода после команды “ls” :
____________________________________________________________________________________

slimwoody@slimwoody-VirtualBox:~/FinalWork$ ls
HumanFriends  PackAnimals  Pets

____________________________________________________________________________________
## 2. Работа с директориями в Linux
- Создать новую директорию и переместить туда файл "Human Friends".
____________________________________________________________________________________


slimwoody@slimwoody-VirtualBox:~/FinalWork$ mkdir newFolder
slimwoody@slimwoody-VirtualBox:~/FinalWork$ mv HumanFriends newFolder/

slimwoody@slimwoody-VirtualBox:~/FinalWork$ tree
.
├── newFolder
│   └── HumanFriends
├── PackAnimals
└── Pets

1 directory, 3 files

______________________________________________________________________________________

## 3. Работа с MySQL в Linux. “Установить MySQL на вашу вычислительную машину ”
- Подключить дополнительный репозиторий MySQL и установить один из пакетов 
из этого репозитория.
______________________________________________________________________________________

slimwoody@slimwoody-VirtualBox:~$ sudo apt update 

slimwoody@slimwoody-VirtualBox:~$ sudo apt install software-properties-common
Чтение списков пакетов… Готово
Построение дерева зависимостей… Готово
Чтение информации о состоянии… Готово         
Уже установлен пакет software-properties-common самой новой версии (0.99.22.9).
Следующие пакеты устанавливались автоматически и больше не требуются:
  bridge-utils ubuntu-fan
Для их удаления используйте «sudo apt autoremove».
Обновлено 0 пакетов, установлено 0 новых пакетов, для удаления отмечено 0 пакетов, и 49 пакетов не обновлено.

slimwoody@slimwoody-VirtualBox:~$ sudo add-apt-repository 'deb http://archive.ubuntu.com/ubuntu bionic main universe'
Репозиторий: 'deb http://archive.ubuntu.com/ubuntu bionic universe main'
Описание:
Archive for codename: bionic components: universe,main
Дополнительные сведения: http://archive.ubuntu.com/ubuntu
Добавление репозитория.
Нажмите [ENTER] для продолжения или Ctrl-C для отмены.
Found existing deb entry in /etc/apt/sources.list
Updating existing entry instead of using /etc/apt/sources.list.d/archive_uri-http_archive_ubuntu_com_ubuntu-jammy.list
Found existing deb-src entry in /etc/apt/sources.list.d/archive_uri-http_archive_ubuntu_com_ubuntu-jammy.list
Updating existing entry instead of using /etc/apt/sources.list
Сущ:1 http://security.ubuntu.com/ubuntu jammy-security InRelease
Сущ:2 http://archive.ubuntu.com/ubuntu bionic InRelease                                                                                              
Сущ:3 http://ru.archive.ubuntu.com/ubuntu jammy InRelease                                                                                            
Сущ:4 https://download.docker.com/linux/ubuntu jammy InRelease                            
Сущ:5 http://ru.archive.ubuntu.com/ubuntu jammy-updates InRelease                 
Сущ:6 http://ru.archive.ubuntu.com/ubuntu jammy-backports InRelease
Чтение списков пакетов… Готовоttp://archive.ubuntu.com/ubuntu bionic main universe'
W: http://archive.ubuntu.com/ubuntu/dists/bionic/InRelease: Ключ хранится в унаследованной связке ключей trusted.gpg (/etc/apt/trusted.gpg), подробности см. в разделе DEPRECATION в apt-key(8).

slimwoody@slimwoody-VirtualBox:~$ sudo apt update
Сущ:1 http://ru.archive.ubuntu.com/ubuntu jammy InRelease
Пол:2 http://ru.archive.ubuntu.com/ubuntu jammy-updates InRelease [119 kB]                                                                                                                  
Сущ:3 http://security.ubuntu.com/ubuntu jammy-security InRelease                                                                                                                            
Сущ:4 http://archive.ubuntu.com/ubuntu bionic InRelease                                                                                                           
Сущ:5 http://ru.archive.ubuntu.com/ubuntu jammy-backports InRelease                                                                            
Сущ:6 https://download.docker.com/linux/ubuntu jammy InRelease                                       
Получено 119 kB за 2с (53,7 kB/s)                            
Чтение списков пакетов… Готово
Построение дерева зависимостей… Готово
Чтение информации о состоянии… Готово         
Может быть обновлено 49 пакетов. Запустите «apt list --upgradable» для их показа.
W: http://archive.ubuntu.com/ubuntu/dists/bionic/InRelease: Ключ хранится в унаследованной связке ключей trusted.gpg (/etc/apt/trusted.gpg), подробности см. в разделе DEPRECATION в apt-key(8).


slimwoody@slimwoody-VirtualBox:~$ sudo apt install mysql-server
Чтение списков пакетов… Готово
Построение дерева зависимостей… Готово
Чтение информации о состоянии… Готово         
Уже установлен пакет mysql-server самой новой версии (8.0.36-0ubuntu0.22.04.1).
Следующие пакеты устанавливались автоматически и больше не требуются:
  bridge-utils ubuntu-fan
Для их удаления используйте «sudo apt autoremove».
Обновлено 0 пакетов, установлено 0 новых пакетов, для удаления отмечено 0 пакетов, и 49 пакетов не обновлен


______________________________________________________________________________________

## 4. Управление deb-пакетами
- Установить и затем удалить deb-пакет, используя команду `dpkg`.

______________________________________________________________________________________


slimwoody@slimwoody-VirtualBox:~/FinalWork$ ll
итого 104644
drwxrwxr-x  3 slimwoody slimwoody      4096 апр 23 11:21 ./
drwxr-x--- 18 slimwoody slimwoody      4096 апр 23 10:54 ../
-rw-rw-r--  1 slimwoody slimwoody 107128128 апр 23 11:20 google-chrome-stable_current_amd64.deb
drwxrwxr-x  2 slimwoody slimwoody      4096 апр 23 10:32 newFolder/
-rw-rw-r--  1 slimwoody slimwoody       203 апр 23 10:14 PackAnimals
-rw-rw-r--  1 slimwoody slimwoody       161 апр 23 10:05 Pets


slimwoody@slimwoody-VirtualBox:~/FinalWork$ sudo dpkg -i google-chrome-stable_current_amd64.deb 
Выбор ранее не выбранного пакета google-chrome-stable.
(Чтение базы данных … на данный момент установлено 206626 файлов и каталогов.)
Подготовка к распаковке google-chrome-stable_current_amd64.deb …
Распаковывается google-chrome-stable (124.0.6367.60-1) …
Настраивается пакет google-chrome-stable (124.0.6367.60-1) …
update-alternatives: используется /usr/bin/google-chrome-stable для предоставления /usr/bin/x-www-browser (x-www-browser) в автоматическом режиме
update-alternatives: используется /usr/bin/google-chrome-stable для предоставления /usr/bin/gnome-www-browser (gnome-www-browser) в автоматическом режиме
update-alternatives: используется /usr/bin/google-chrome-stable для предоставления /usr/bin/google-chrome (google-chrome) в автоматическом режиме
Обрабатываются триггеры для mailcap (3.70+nmu1ubuntu1) …
Обрабатываются триггеры для gnome-menus (3.36.0-1ubuntu3) …
Обрабатываются триггеры для desktop-file-utils (0.26-1ubuntu3) …
Обрабатываются триггеры для man-db (2.10.2-1) …

slimwoody@slimwoody-VirtualBox:~/FinalWork$ google-chrome


slimwoody@slimwoody-VirtualBox:~/FinalWork$ sudo dpkg -r google-chrome-stable
(Чтение базы данных … на данный момент установлено 206739 файлов и каталогов.)
Удаляется google-chrome-stable (124.0.6367.60-1) …
update-alternatives: используется /usr/bin/firefox для предоставления /usr/bin/x-www-browser (x-www-browser) в автоматическом режиме
update-alternatives: используется /usr/bin/firefox для предоставления /usr/bin/gnome-www-browser (gnome-www-browser) в автоматическом режиме
Обрабатываются триггеры для man-db (2.10.2-1) …
Обрабатываются триггеры для mailcap (3.70+nmu1ubuntu1) …
Обрабатываются триггеры для gnome-menus (3.36.0-1ubuntu3) …
Обрабатываются триггеры для desktop-file-utils (0.26-1ubuntu3) …

# Объектно-ориентированное программирование 
___________________________________________________________________________________________________________________________________________________________________

## 6. Диаграмма классов
   - Создать диаграмму классов с родительским классом "Животные", и двумя подклассами: "Pets" и "Pack animals".
В составы классов которых в случае Pets войдут классы: собаки, кошки, хомяки, а в класс Pack animals войдут: Лошади, верблюды и ослы).
Каждый тип животных будет характеризоваться (например, имена, даты рождения, выполняемые команды и т.д)
Диаграмму можно нарисовать в любом редакторе, такими как Lucidchart, Draw.io, Microsoft Visio и других.

![alt text](https://github.com/SlimWoody/FinalWork_specialization/blob/main/Model%20databases.png)



