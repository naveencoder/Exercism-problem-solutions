class RotationalCipher {
    private int shiftKey;
    public static final String ALPHABETLOW = "abcdefghijklmnopqrstuvwxyz";
    public static final String ALPHABETUP = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    RotationalCipher(int shiftKey) {
        this.shiftKey = shiftKey;
    }

    String rotate(String data) {
        int size = data.length();
        String rot = "";
        if (shiftKey >= 26) {
            shiftKey = shiftKey % 26;
        }
        char roatation;
        for (int i = 0; i < size; i++) {

            if ((data.charAt(i) >= 'a') && (data.charAt(i) <= 'z')) {
                int position = ALPHABETLOW.indexOf(data.charAt(i));
                roatation = ALPHABETLOW.charAt((shiftKey + position) % 26);
                rot = rot+roatation;
            } else if (data.charAt(i) >= 'A' && data.charAt(i) <= 'Z') {
                int position = ALPHABETUP.indexOf(data.charAt(i));
                roatation = ALPHABETUP.charAt((shiftKey + position) % 26);
                rot = rot+roatation;
            }
            else
                rot= rot + data.charAt(i);

        }

        return rot;
    }

}
