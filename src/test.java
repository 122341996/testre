import org.ictclas4j.bean.SegResult;  
import org.ictclas4j.segment.SegTag;  
  
public class TextSegmentation {  
  
    public static void main(String[] args) {  
        String fileContent = "中国科学院计算技术研究所在多年研究基础上，" +  
                "耗时一年研制出了ICTCLAS汉语词法分析系统";  
        SegTag segTag = new SegTag(1);// 分词路径的数目          
        SegResult segResult = segTag.split(fileContent.trim());  
        String classifyContent = segResult.getFinalResult();  
        System.out.println("分词结果\n"+classifyContent);  
    }  
}  