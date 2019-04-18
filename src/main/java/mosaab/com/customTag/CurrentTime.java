package mosaab.com.customTag;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CurrentTime extends SimpleTagSupport {
    String color;
    String size;

    // render custom tag
    public void doTag() throws JspException, IOException {

        Date dNow = new Date();
        SimpleDateFormat ft = new SimpleDateFormat("E yyyy.MM.dd 'at' hh:mm:ss a zzz");

        JspWriter out = getJspContext().getOut();
        if (color != null && size !=null) {
            out.write("<span style='color:"+color+"  ;font-size: "+size+"'>"+ ft.format(dNow) +"</span>");
        }
    }
    // Need a setter for each attribute of custom tag
    public void setColor(String color) {
        this.color = color;
    }
    public void setSize(String size) {
        this.size = size;
    }



}

