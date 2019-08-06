class IsogramChecker {

    boolean isIsogram(String phrase) {
        String substring = phrase.toLowerCase();
        substring = substring.replaceAll("-", "");
        substring = substring.replaceAll(" ", "");
        Character checkletter;
        for (int i = 0; i < substring.length(); i++) {
            checkletter = substring.charAt(i);
            if (isLetter(checkletter)) {
                for (int j = i + 1; j < substring.length(); j++) {   //check phrase is isogram or not.
                    if (checkletter == substring.charAt(j)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    private boolean isLetter(Character chk) {
        if (chk >= 'a' || chk <= 'z') {
            return true;
        }
        return false;
    }
}
