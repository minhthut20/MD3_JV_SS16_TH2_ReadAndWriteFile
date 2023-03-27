import java.util.List;
public class FindMaxValue {
    public static int findMax(List<Integer> numbers) {
        int max = numbers.get(0);
        for (int i = 0; i < numbers.size(); i++) {
            if (max < numbers.get(i)) {
                max = numbers.get(i);
            }
        }
        return max;
    }
    public static void main(String[] args) {
        ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();
        String PATH_NUMBER = "D:\\Java\\MD3-SS16-PreparationIOTextFile\\src\\Rikkei\\academy\\TH2_FindMaxValueThenWriteFile\\number.txt";
        String PATH_RESULT = "D:\\Java\\MD3-SS16-PreparationIOTextFile\\src\\Rikkei\\academy\\TH2_FindMaxValueThenWriteFile\\result.txt";
        List<Integer> numbers = readAndWriteFile.readFile(PATH_NUMBER);
        int maxValue = findMax(numbers);
        readAndWriteFile.writeFile(PATH_RESULT, maxValue);
    }
}
