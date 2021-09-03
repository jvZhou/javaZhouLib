package com.java.zhou.Controller;

import com.java.zhou.Common.Result;
import com.java.zhou.Enum.ErrorEnum;
import com.java.zhou.Exception.ImportException;
import com.java.zhou.Service.ImportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller("/import")
public class ImportController {
   @Autowired
   ImportService importService;
   @GetMapping("/resume")
   public Result importResum(){
      Result result =null;
      try {
        result = importService.importResum();
      } catch (Exception e) {
         throw new ImportException(ErrorEnum.import_resume.getCode(),ErrorEnum.import_resume.getMessage());
      }
      return result;
   }
}
