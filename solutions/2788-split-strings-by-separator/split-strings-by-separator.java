class Solution {
    public List<String> splitWordsBySeparator(List<String> words, char separator) {
        return words.stream()
            .flatMap(w -> Arrays.stream(w.split("\\" + separator)))
            .filter(w -> !w.isEmpty())
            .collect(Collectors.toList());
    }
}
