import org.ictclas4j.bean.SegResult;  
import org.ictclas4j.segment.SegTag;  
  
public class TextSegmentation {  
  
    public static void main(String[] args) {  
        String fileContent = "�й���ѧԺ���㼼���о����ڶ����о������ϣ�" +  
                "��ʱһ�����Ƴ���ICTCLAS����ʷ�����ϵͳ";  
        SegTag segTag = new SegTag(1);// �ִ�·������Ŀ          
        SegResult segResult = segTag.split(fileContent.trim());  
        String classifyContent = segResult.getFinalResult();  
        System.out.println("�ִʽ��\n"+classifyContent);  
    }  
}  