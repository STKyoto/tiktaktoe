
import java.util.Scanner;

public static void main(String[] args){
    String[][] array = new String[][]{{" "," "," "},{" "," "," "},{" "," "," "}};
    maingame(array);
}
    public static void maingame(String[][] array) throws IndexOutOfBoundsException{
        Scanner scanner = new Scanner(System.in);
        print(array);
        while(isWin(array) && isArrayFilled(array)){
            System.out.println("Гравець X: ");
            try{
                int one = scanner.nextInt();
                int two = scanner.nextInt();
                if (array[one][two].equals(" ")){
                    array[one][two] = "X";
                }else {
                    System.out.println("Ця комірка вже зайнята");
                }
            }catch (IndexOutOfBoundsException e){
                System.out.println("Такого поля не існує. Ви пропускаєте хід");
            }
            print(array);

            System.out.println("Гравець O: ");
            try {
                int on = scanner.nextInt();
                int tw = scanner.nextInt();
                if (array[on][tw].equals(" ")){
                    array[on][tw] = "O";
                }else {
                    System.out.println("Ця комірка вже зайнята");
                }
            } catch (IndexOutOfBoundsException e){
                System.out.println("Такого поля не існує. Ви пропускаєте хід");
            }
            print(array);
        }
    }
    public static boolean isArrayFilled(String[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
              if (array[i][j].equals(" ")) {
                 return true;
             }
          }
        }
        System.out.println("Гру завершенно, перемогла дружба");
        return false;
    }
    public static boolean isWin(String[][] arrays){
        String winner = "Виграв гравець - ";
        if ((arrays[0][0].equals(arrays[0][1])) && (arrays[0][2].equals(arrays[0][1])) && !arrays[0][0].equals(" ")){
            System.out.println(winner + arrays[0][0]);
            return false;
        }
        if ((arrays[1][0].equals(arrays[1][1])) && (arrays[1][2].equals(arrays[1][1])) && !arrays[1][0].equals(" ")){
            System.out.println(winner + arrays[1][0]);
            return false;
        }
        if ((arrays[2][0].equals(arrays[2][1])) && (arrays[2][2].equals(arrays[2][1])) && !arrays[2][0].equals(" ")){
            System.out.println(winner + arrays[2][0]);
            return false;
        }
        if ((arrays[0][0].equals(arrays[1][0])) && (arrays[1][0].equals(arrays[2][0])) && !arrays[0][0].equals(" ")){
            System.out.println(winner + arrays[0][0]);
            return false;
        }
        if ((arrays[0][1].equals(arrays[1][1])) && (arrays[1][1].equals(arrays[2][1])) && !arrays[0][1].equals(" ")){
            System.out.println(winner + arrays[0][0]);
            return false;
        }
        if ((arrays[0][2].equals(arrays[1][2])) && (arrays[2][2].equals(arrays[1][2])) && !arrays[0][2].equals(" ")){
            System.out.println(winner + arrays[0][0]);
            return false;
        }
        if ((arrays[0][0].equals(arrays[1][1])) && (arrays[2][2].equals(arrays[1][1])) && !arrays[0][0].equals(" ")){
            System.out.println(winner + arrays[0][0]);
            return false;
        }
        if ((arrays[0][2].equals(arrays[1][1])) && (arrays[0][2].equals(arrays[2][0])) && !arrays[0][2].equals(" ")){
            System.out.println(winner + arrays[0][2]);
            return false;
        }
        return true;
    }
    public static void print(String[][] newString){
        System.out.printf("%s | %s | %s\n%s | %s | %s\n%s | %s | %s\n%n", newString[0][0], newString[0][1], newString[0][2], newString[1][0], newString[1][1], newString[1][2], newString[2][0], newString[2][1], newString[2][2]);
    }

