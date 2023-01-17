package com.ajie.lamda.class02_file;

import copm.ajie.lamda.class02_flie.FileService;
import org.junit.Test;

import java.io.IOException;

/**
 * @Author: ajie
 * @Date: 2023/1/17
 */
public class FileServiceTest {

    @Test
    public void test() throws IOException {
        FileService fileService = new FileService();

        fileService.fileHandle("E:\\Ajie_Study\\" +
                "AdvancedProgramming\\situation01\\" +
                "src\\test\\java\\com\\ajie\\lamda\\" +
                "class02_file\\FileServiceTest.java", (fileContent) -> {
            //打印文件内容
            System.out.println(fileContent);
        });
    }
}
