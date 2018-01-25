package in.nic.lambda;

import java.util.HashMap;
import java.util.Locale;

import net.sf.jasperreports.engine.JREmptyDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRParameter;
import net.sf.jasperreports.engine.JasperFillManager;

public class JasperReportFillI18 {

   public static void main(String[] args) {
      /*String sourceFileName = "C://tools/jasperreports-5.0.1/test/"
         + "jasper_report_template.jasper";*/
      String sourceFileName = "D://gituse/VSS/VSS/"
    	         + "jasper_report_template.jasper";
      HashMap parameterMap = new HashMap();
      if (args.length > 0) {
         parameterMap.put(JRParameter.REPORT_LOCALE, new Locale(args[0]));
      }
      try {
         JasperFillManager.fillReportToFile(sourceFileName, null, 
            new JREmptyDataSource());
      } catch (JRException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
        // D:\gituse\VSS\VSS\src\main\java\in\nic\lambda\
      }

   }
}