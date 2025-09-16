public class Test {

    public void methPublic1 () {
        System.out.println("call methPublic1");
    }

    @TestAnnotation
    public void methPublic2 (String msg, String msg2) {
        System.out.println("methPublic2 annotated but not called with ..." + msg + "... and ..." + msg2 + "...");
    }

    @TestAnnotation
    protected void methProtected1 (int value) {
        System.out.println("call methProtected1 with" + value + " value");
    }
    protected void methProtected2 () {
        System.out.println("call methProtected2");
    }

    @TestAnnotation(5)
    private void methPrivate1 (double value, int v2) {
        System.out.println("call methPrivate1 with " + value + " double value and int " + v2);
    }
    private void methPrivate2 () {
        System.out.println("call methPrivate2");
    }

}
