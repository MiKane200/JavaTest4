package com.hand;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Map;

import com.hand.api.service.FilmService;
import com.hand.domain.entity.Film;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext(
                "classpath:applicationContext.xml");
        ((ClassPathXmlApplicationContext) context).start();
        Map<String, String> map = System.getenv();
        String languageId = map.get("LANGUAGEID");
        String title = map.get("TITLE");
        String description = map.get("DESCRIPTION");

        Film film = new Film();
        film.setLanguageId(Byte.valueOf(languageId));
        film.setDescription(description);
        film.setTitle(title);
        film.setRentalDuration((byte) 1);
        film.setRentalRate(BigDecimal.valueOf(0.99));
        film.setRentalDuration((byte) 1);
        film.setReplacementCost(BigDecimal.valueOf(1));
        film.setLastUpdate(new Date());

        FilmService filmService = (FilmService) context.getBean("filmServiceImpl");

        System.out.println("Film Title:");
        System.out.println(title);
        System.out.println("Film Description:");
        System.out.println(description);
        System.out.println("Film LanguageId:");
        System.out.println(languageId);

        //错误插入，抛出异常并回滚
        System.out.println("this is rollback test !!!!");
        try {
            filmService.saveFail(film);
        } catch (Exception e) {
            System.out.println("there is rollback test exception !!!!");
        }
        System.out.println("rollback test over!!!!");

        //正确插入
        try {
            filmService.saveSuccess(film);
        } catch (Exception e) {
            e.printStackTrace();
        }
        ((ClassPathXmlApplicationContext) context).stop();
    }
}
