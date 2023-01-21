package copm.ajie.part_01_lamda.class02_flie;

import java.io.*;

/**
 * 文件服务类
 *
 * @Author: ajie
 * @Date: 2023/1/17
 */
public class FileService {
    /**
     * 通过 url 获取文件地址，通过函数式接口读取文件内容
     *
     * @param url
     * @param consumer
     */
    public void fileHandle(String url, FileConsumer consumer) throws IOException {
        //创建文件读取流
        BufferedReader bufferedReader =
                new BufferedReader(new InputStreamReader(new FileInputStream(url)));
        //定义行变量和内容sb
        String line;
        StringBuilder sb = new StringBuilder();
        //循环读取文件内容
        while ((line = bufferedReader.readLine()) != null) {
            sb.append(line + "\n");
        }
        //调用函数式接口，处理文件内容
        consumer.fileHandler(sb.toString());
    }
}
