package com.java.zhou.Service.Impl;

import com.java.zhou.Common.Result;
import com.java.zhou.Enum.ErrorEnum;
import com.java.zhou.Enum.SuccessEnum;
import com.java.zhou.Exception.ImportException;
import com.java.zhou.Service.ImportService;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

@Service
public class ImportServiceImpl implements ImportService {
    @Override
    public Result importResum() {
        File file = new File("E:\\pruduceMe\\src\\main\\resources\\static\\resume\\周明威-简历.pdf");
        try {
            FileReader fr = new FileReader(file);
            File file1=new File("C:\\Users\\Administrator\\Desktop\\周明威-简历.pdf");
            FileWriter fw = new FileWriter(file1);
            fw.write(fr.read());
        } catch (IOException e) {
            throw new ImportException(ErrorEnum.import_resume.getCode(),ErrorEnum.import_resume.getMessage());

        }
        return Result.success(SuccessEnum.import_resume.getCode(),SuccessEnum.import_resume.getMessage());
    }
}
