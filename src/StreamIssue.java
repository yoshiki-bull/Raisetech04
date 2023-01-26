import java.util.List;

public class StreamIssue {
    public static void main(String[] args) {
        List<String> names = List.of("paddington", "pooh", "kumamon", "lotso");
        System.out.println("------------------------------------------------------------");
        System.out.println("Listを表示: " + names);
        System.out.println("------------------------------------------------------------");

        System.out.print("6文字以上の名前でフィルターにかけ大文字に変換: ");
        System.out.println(names.stream().filter(name -> name.length() >= 6).map(String::toUpperCase).toList());
        System.out.println("------------------------------------------------------------");

        List<String> sortedResult = names.stream().sorted().toList();
        System.out.println("アルファベット順:" + sortedResult);
        System.out.println("------------------------------------------------------------");

        long count = names.stream().filter(bear -> bear.startsWith("p")).count();
        System.out.println("pから始まる名前のキャラクターの数: " + count);
        System.out.println("------------------------------------------------------------");

        boolean startsP = names.stream().allMatch(bear -> bear.startsWith("p"));
        System.out.println("全てのキャラクターが「p」から始まるか: " + startsP);
        System.out.println("------------------------------------------------------------");
    }
}
