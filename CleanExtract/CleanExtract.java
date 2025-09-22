public class CleanExtract {
    public static String extract(String s) {
        String[] splStr = s.split("\\|");
        StringBuilder res = new StringBuilder();

        for (String subStr : splStr) {
            int start = subStr.indexOf(".");
            int end = subStr.lastIndexOf(".");
            String clean;

            if (start != -1 && end != -1 && start < end) {
                String extract = subStr.substring(start + 1, end);
                clean = extract.trim();
            } else if (start != -1 && end != -1 && start == end) {
                String extract = subStr.substring(start);
                clean = extract.replace(".", "").trim();
            } else {
                clean = subStr.trim();
            }

            if (!clean.isEmpty()) {
                if (res.length() > 0) {
                    res.append(" ");
                }
                res.append(clean);
            }
        }
        return res.length() > 0 ? res.toString() : "";
    }
}