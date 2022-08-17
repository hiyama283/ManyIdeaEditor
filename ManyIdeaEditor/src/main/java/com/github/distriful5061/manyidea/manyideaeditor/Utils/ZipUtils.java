package com.github.distriful5061.manyidea.manyideaeditor.Utils;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

public class ZipUtils {
    public static String compress(String str) throws IOException {
        if (str == null || str.length() == 0) {
            return str;
        }

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        GZIPOutputStream gzip = new GZIPOutputStream(out);
        gzip.write(str.getBytes());
        gzip.close();
        return out.toString(StandardCharsets.ISO_8859_1);
    }

    public static String unCompress(String str) throws IOException {
        if (str == null || str.length() == 0) {
            return str;
        }

        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(str.getBytes());
        GZIPInputStream gzipInputStream = new GZIPInputStream(byteArrayInputStream);
        byte[] bytes = gzipInputStream.readAllBytes();
        gzipInputStream.close();
        byteArrayInputStream.close();
        return new String(bytes, StandardCharsets.ISO_8859_1);
    }

    public static void main(String[] args) throws IOException {
        String sample = "stringSample1";
        String compressed = compress(sample);
        System.out.println(sample);
        System.out.println(compressed);
        System.out.println(unCompress(compressed));
    }
}
