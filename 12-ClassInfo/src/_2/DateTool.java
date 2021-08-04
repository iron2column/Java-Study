package _2;

import java.util.Date;

/**
 * @Author ChenMingYang
 * @Date 2021-08-04 18:10
 */

public class DateTool {
    /**
     * 获取明天的日期
     * @return
     * @throws InterruptedException
     */
    public static Date getTomorrowDate() throws InterruptedException {
        Thread.sleep(24L * 60 * 60 * 1000);
        return new Date();
    }
}
