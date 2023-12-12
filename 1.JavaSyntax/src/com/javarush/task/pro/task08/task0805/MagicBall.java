package com.javarush.task.pro.task08.task0805;

import java.util.Random;

public class MagicBall {
    private static final String CERTAIN = "Бесспорно";
    private static final String DEFINITELY = "Определённо да";
    private static final String MOST_LIKELY = "Вероятнее всего";
    private static final String OUTLOOK_GOOD = "Хорошие перспективы";
    private static final String ASK_AGAIN_LATER = "Спроси позже";
    private static final String TRY_AGAIN = "Попробуй снова";
    private static final String NO = "Мой ответ — нет";
    private static final String VERY_DOUBTFUL = "Весьма сомнительно";

    public static String getPrediction() {
        //напишите тут ваш код
        Random random = new Random();
        int x = random.nextInt(8);
        String result;

        switch (x) {
            case 0:
                result = CERTAIN;
                break;
            case 1:
                result = DEFINITELY;
                break;
            case 2:
                result = MOST_LIKELY;
                break;
            case 3:
                result = OUTLOOK_GOOD;
                break;
            case 4:
                result = ASK_AGAIN_LATER;
                break;
            case 5:
                result = TRY_AGAIN;
                break;
            case 6:
                result = NO;
                break;
            case 7:
                result = VERY_DOUBTFUL;
                break;
            default:
                result = null;
                break;
        }

        return result;
    }
}
