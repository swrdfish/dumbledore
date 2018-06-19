package com.swrdfish.tools.dumbledore;

import com.ochafik.lang.jnaerator.runtime.NativeSize;
import com.swrdfish.tools.dumbledore.types.magickcore.MagickCore;
import com.swrdfish.tools.dumbledore.types.magickcore.MagickCore.ExceptionInfo;
import com.swrdfish.tools.dumbledore.types.magickcore.MagickCore.Image;
import com.swrdfish.tools.dumbledore.types.magickcore.MagickCore.ImageInfo;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;


public class Demo {

  public static void main(String[] args) throws UnsupportedEncodingException {
    MagickCore magickInstance = MagickCore.INSTANCE;
    Scanner s = new Scanner(System.in);
    s.nextLine();
    ExceptionInfo.ByReference e = new ExceptionInfo.ByReference();
    e.signature = new NativeSize(magickInstance.MagickCoreSignature);
    ImageInfo.ByReference imageInfo = new ImageInfo.ByReference();
    imageInfo.signature = new NativeSize(magickInstance.MagickCoreSignature);
    imageInfo.filename = "/home/binayak/Downloads/test.jpg".getBytes();
    imageInfo.file = null;
    Image.ByReference image = magickInstance.ReadImage(imageInfo, e);
    System.out.println(image.compression);
//    System.out.println(image);

  }
}
