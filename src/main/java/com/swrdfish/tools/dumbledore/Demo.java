package com.swrdfish.tools.dumbledore;

import com.ochafik.lang.jnaerator.runtime.NativeSize;
import com.swrdfish.tools.dumbledore.types.magickcore.SaMagickCore;
import com.swrdfish.tools.dumbledore.types.magickcore.SaMagickCore.ExceptionInfo;
import com.swrdfish.tools.dumbledore.types.magickcore.SaMagickCore.Image;
import com.swrdfish.tools.dumbledore.types.magickcore.SaMagickCore.ImageInfo;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;


public class Demo {

  public static void main(String[] args) throws UnsupportedEncodingException {
    SaMagickCore magickInstance = SaMagickCore.INSTANCE;
    Scanner s = new Scanner(System.in);
    s.nextLine();
    ExceptionInfo e = new ExceptionInfo();
    e.signature = new NativeSize(magickInstance.MagickCoreSignature);
    ImageInfo imageInfo = new ImageInfo.ByValue();
    imageInfo.signature = new NativeSize(magickInstance.MagickCoreSignature);
    imageInfo.filename = "/home/binayak/Downloads/test.jpg".getBytes();
    imageInfo.file = null;
    Image image = magickInstance.ReadImage(imageInfo, e);

//    System.out.println(new String(image.image_info.filename, "UTF8"));
    System.out.println(image.image_info.type);

  }
}
