
import java.io.*;
import java.util.*;
import java.util.zip.*;

public class JavaBitSetExample {
    public static void main(String[] args) throws Exception {
        BitSet test = new BitSet();
        test.set(123);
        test.set(456);
        System.out.println("RawVersion:");
        System.out.println(Base64.getEncoder().encodeToString(test.toByteArray()));

        System.out.println("Compressed:");
        ByteArrayOutputStream dest = new ByteArrayOutputStream();
        DeflaterOutputStream decorator = new DeflaterOutputStream(dest);
        decorator.write(test.toByteArray());
        decorator.flush();
        decorator.close();
        byte [] compressed = dest.toByteArray();
        System.out.println(Base64.getEncoder().encodeToString(compressed));
    }

}
