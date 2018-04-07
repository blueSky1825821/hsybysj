package com.adempiere.bysj.tools;

import org.apache.commons.lang3.StringUtils;
import org.krysalis.barcode4j.impl.code39.Code39Bean;
import org.krysalis.barcode4j.output.bitmap.BitmapCanvasProvider;
import org.krysalis.barcode4j.tools.UnitConv;

import java.awt.image.BufferedImage;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by wm on 2018/4/7.
 * 条形码生成工具类
 */
public class BarcodeUtil {

    /**
     * 生成图片
     *
     * @param msg
     * @param path
     * @return
     */
    public static File generateFile(String msg, String path) {
        Path picpath = Paths.get(path+ File.separator + msg + ".png");

        if (Files.exists(picpath)) {
            return picpath.toFile();
        }
        try {
            generate(msg, new FileOutputStream(picpath.toFile()));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return picpath.toFile();
    }

    /**
     * 生成字节
     *
     * @param msg
     * @return
     */
    public static byte[] generate(String msg) {
        ByteArrayOutputStream os = new ByteArrayOutputStream();
        generate(msg, os);
        try {
            return os.toByteArray();
        } finally {
            try {
                os.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * 生成到流
     *
     * @param msg
     * @param os
     */
    public static void generate(String msg, OutputStream os) {
        if (StringUtils.isEmpty(msg) || os == null) {
            return;
        }
        Code39Bean bean = new Code39Bean();
        //精细度
        final int dpi = 150;
        //module 宽度
        final double mouduleWidth = UnitConv.in2mm(1.0f / dpi);
        //配置对象
        bean.setModuleWidth(mouduleWidth);
        bean.setWideFactor(3);
        bean.doQuietZone(false);

        String format = "image/png";
        try {
            //输出到流
            BitmapCanvasProvider canvas =
                    new BitmapCanvasProvider(os, format, dpi, BufferedImage.TYPE_BYTE_BINARY, false, 0);
            //生成条码
            bean.generateBarcode(canvas, msg);
            //结束绘制
            canvas.finish();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                os.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        String msg = "123456789nnn";
        String path = "barcode.png";
        generateFile(msg, path);
    }
}
