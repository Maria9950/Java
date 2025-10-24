int i = 0;
int value = 2;

switch (value) {
    case 1:
        i = 1;
        break;
    case 2:
        i = 2; // выполнение этого блока и переход к case 3 (нет break)
    case 3:
        i = 3;
        break;
}

// результат: i = 3