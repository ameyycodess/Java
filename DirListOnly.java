import java.io.*;

class DirListOnly {

public static void main(String args[]) {

String dirname = "/java";

File f1 = new File(dirname)

Filename Filter only = new OnlyExt("html");

String s[] = f1.list (only);

for (int i=0; i < s.length; i++) {

System.out.println(s[i]);

}

}
}