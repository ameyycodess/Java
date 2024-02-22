import java.io.File;

class FileDemo {

static void p(String s) {

System.out.println(s);

}

public static void main(String args[]) {

File fl = new File("/java/COPYRIGHT");

p("File Name: " + f1.getName());

p("Path: + f1.getPath()); 11

p("Abs Path: + f1.getAbsolutePath());

p("Parent: + f1.getParent());

p(fl.exists() ? "exists" : "does not exist");
p(f1.canWrite() ? "is writeable" : "is not writeable");

p(f1.canRead() ? "is readable" : "is not readable");

p("is + (fl.isDirectory() ? a directory")); p(fl.isFile() ? "is normal file" : "might be a named pipe");

:

11 "not" +

p(fl.isAbsolute() ? "is absolute" : "is not absolute");

p("File last modified: + f1.lastModified());

p("File size: " + fl.length() + Bytes");

11

}

}