package chapter15_facade.pagemaker;

import java.io.IOException;
import java.io.Writer;

/**
 * Created by nanca on 11/23/2017.
 */
public class HtmlWriter {
    private Writer writer;

    public HtmlWriter(Writer writer) {
        this.writer = writer;
    }

    public void title(String title) throws IOException {
        // 输出标题
        writer.write("<htnml>");
    }

    public void paragraph(String msg) throws IOException {
        // 输出段落
    }

    public void link(String href, String caption)  throws IOException {
        // 输出超链接
    }

    public void mailto(String mailaddr, String useername)  throws IOException {
        // 输出邮件地址
    }

    public void close() throws IOException {
        // 结束输出 HTML
        writer.write("</body>");
        writer.write("</html>\n");
        writer.close();
    }
}
