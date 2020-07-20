package com.example.manage.web.upload;

import com.example.manage.exception.ErrorMessageException;
import com.example.manage.util.CommonUtil;
import com.example.manage.vo.ReturnVO;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

@RestController
@Slf4j
@RequestMapping("/upload")
public class ImageUpload {
    @Value("${upload.temp}")
    private String tempFilePath;

    @PostMapping("/uploadImage")
    public ReturnVO uploadImage(MultipartFile file) throws IOException {
        log.info("上传产品图片");
        String fileName = file.getOriginalFilename();
        if (StringUtils.isBlank(fileName)) {
            throw new ErrorMessageException("上传的文件名错误");
        }
        String substring = fileName.substring(fileName.lastIndexOf("."));
        String transFilePath = tempFilePath + "/" + CommonUtil.getUUID() + substring;
        log.info("上传图片路径:{}", transFilePath);
        file.transferTo(new File(transFilePath));
        return ReturnVO.getSuccess(transFilePath);
    }
}
