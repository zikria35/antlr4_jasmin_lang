.class public testfile
.super java/lang/Object

.method public static main([Ljava/lang/String;)V
.limit stack 99
.limit locals 99

ldc "test"
astore 1
getstatic java/lang/System/out Ljava/io/PrintStream;
aload 1
invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
ldc 1
ldc 1
getstatic java/lang/System/out Ljava/io/PrintStream;
ldc "hello"
invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
return
.end method
