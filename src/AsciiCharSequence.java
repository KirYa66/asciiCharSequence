public class AsciiCharSequence implements CharSequence/* extends/implements */ {
    byte[] massiveByte;

    public AsciiCharSequence(byte[] massiveByte) {
        this.massiveByte = massiveByte;
    }

    @Override
    public int length() {
        return massiveByte.length;
    }

    @Override
    public char charAt(int index) {
        return (char)massiveByte[index];
    }

    @Override
    public AsciiCharSequence subSequence(int start, int end) {
        byte[] subMassiveByte = new byte[end-start];
        for (int i = 0; i < end - start; i++) {
            subMassiveByte[i] = massiveByte[start+i];
        }
        AsciiCharSequence charSequence = new AsciiCharSequence(subMassiveByte);
        return charSequence;
    }

    @Override
    public String toString() {
        return (new String(massiveByte));
    }


    // implementation
}
