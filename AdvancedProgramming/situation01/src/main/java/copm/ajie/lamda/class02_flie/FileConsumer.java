package copm.ajie.lamda.class02_flie;

/**
 * 文件服务类函数式接口
 *
 * @Author: ajie
 * @Date: 2023/1/17
 */
@FunctionalInterface
public interface FileConsumer {
    /**
     * 函数式接口
     *
     * @param fileContent 文件内容字符串
     */
    void fileHandler(String fileContent);
}
