import Impl.SimpleDrawer;
import abstractFactory.FileImageCreator;
import utils.RandomValueUtil;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            StringBuffer sb = new StringBuffer();
           String  email= RandomValueUtil.getEmail(10,12);
            sb.append(email);
            FileImageCreator creator = new FileImageCreator(new SimpleDrawer(), "/Users/caopan1/Downloads/trainImgs/"+email+".jpeg");
            creator.setWidth(288); //图片宽度
            creator.setHeight(30); //图片高度
           // creator.setLineNum(0); //干扰线条数
            creator.setFontSize(15); //字体大小
            creator.setFontName("new roman");

            creator.generateImage(sb.toString());

            System.out.println("ok");

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
