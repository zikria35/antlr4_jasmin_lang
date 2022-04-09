.class public testfile
.super java/lang/Object

.field public static scanner Ljava/util/Scanner;
.method public static main([Ljava/lang/String;)V
.limit stack 99
.limit locals 99

return
.end method
.method public static printText(Ljava/lang/String;)Ljava/lang/String;
.limit stack 99
.limit locals 99
getstatic java/lang/System/out Ljava/io/PrintStream;
aload 0
invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
return
.end method
.method static <clinit>()V
.limit stack 3
.limit locals 0
new java/util/Scanner
dup
getstatic java/lang/System/in Ljava/io/InputStream;
invokespecial java/util/Scanner/<init>(Ljava/io/InputStream;)V
putstatic testfile/scanner Ljava/util/Scanner;
return
.end method
