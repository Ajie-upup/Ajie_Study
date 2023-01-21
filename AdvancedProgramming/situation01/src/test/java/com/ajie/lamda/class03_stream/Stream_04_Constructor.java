package com.ajie.lamda.class03_stream;

import org.junit.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * 流的四种创建形式
 *
 * @Author: ajie
 * @Date: 2023/1/21
 */
public class Stream_04_Constructor {

    /**
     * 根据值生成流
     */
    @Test
    public void streamFromValue() {
        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5);

        stream.forEach(System.out::println);
    }

    /**
     * 通过数组构建流
     */
    @Test
    public void streamFromArray() {
        int[] nums = {1, 2, 3, 4, 5, 6};
        IntStream stream = Arrays.stream(nums);

        stream.forEach(System.out::println);
    }

    /**
     * 通过文件生成流
     *
     * @throws IOException
     */
    @Test
    public void streamFromFile() throws IOException {
        Stream<String> stream = Files.lines(
                Paths.get("E:\\Ajie_Study\\AdvancedProgramming\\situation01\\src\\test\\java\\com\\ajie\\lamda\\class03_stream\\Stream_04_Constructor.java")
        );
        stream.forEach(System.out::println);
    }

    /**
     * 通过函数生成流(无限流，需要使用limit来限制)
     */
    public void streamFromFunction() {
        Stream<Integer> iterateStream = Stream.iterate(0, n -> n + 2);

        iterateStream.limit(100)
                .forEach(System.out::println);

        Stream<Double> generateStream = Stream.generate(Math::random);
        generateStream.limit(100)
                .forEach(System.out::println);
    }

}
