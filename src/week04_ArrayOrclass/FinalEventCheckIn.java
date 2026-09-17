package week04_ArrayOrclass;
import java.util.Scanner;
class StudentEntry {
    String studentId;
    String name;
}
public class FinalEventCheckIn {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentEntry[] entries = new StudentEntry[5];
        while (true) {
            System.out.println("\n[취업 특강 접수]");
            System.out.println("1 신청  2 명단  3 취소  4 현황  0 종료");
            System.out.print("선택: ");
            String menu = scanner.nextLine().trim();
            if (menu.equals("0")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }
            switch (menu) {
                case "1":
                    System.out.print("학번: ");
                    String studentId = scanner.nextLine().trim();
                    System.out.print("이름: ");
                    String name = scanner.nextLine().trim();
                    // TODO 1. 빈 학번이나 빈 이름은 거절
                    if (studentId.isEmpty() || name.isEmpty()) {
                        System.out.println("필수 입력입니다.");
                        break;
                    }
                    // TODO 2. 같은 학번이 있는지 확인
                    boolean duplicate = false;
                    for (StudentEntry entry : entries) {
                        if (entry != null && entry.studentId.equals(studentId)) {
                            duplicate = true;
                            break;
                        }
                        System.out.println(entry);
                    }
                    if (duplicate) {
                        System.out.println("중복된 학번입니다.");
                        break;
                    }
                    // TODO 3. 첫 번째 null 위치에 객체 저장
                    boolean registered = false;
                    for (int i = 0; i < entries.length; i++) {
                        if (entries[i] == null) {
                            entries[i] = new StudentEntry();
                            entries[i].studentId = studentId;
                            entries[i].name = name;
                            registered = true;
                            System.out.println("신청이 완료되었습니다.");
                            break;
                        }
                    }
                    // TODO 4. 다섯 칸이 모두 찼다면 정원 마감
                    if (!registered) {
                        System.out.println("정원이 마감되었습니다.");
                    }
                    break;
                case "2":
                    // TODO 5. 등록된 학생 명단 출력
                    boolean hasStudent = false;
                    for (int i = 0; i < entries.length; i++) {
                        if (entries[i] != null) {
                            System.out.println((i + 1) + ". "
                                            + entries[i].studentId
                                            + " / "
                                            + entries[i].name
                            );
                            hasStudent = true;
                        }
                    }
                    if (!hasStudent) {
                        System.out.println("등록된 신청자가 없습니다.");
                    }
                    break;
                case "3":
                    System.out.print("취소할 학번: ");
                    String cancelId = scanner.nextLine().trim();
                    // TODO 6. 학번 찾기
                    int canceledIndex = -1;
                    for (int i = 0; i < entries.length; i++) {
                        if (entries[i] != null
                                && entries[i].studentId.equals(cancelId)) {
                            canceledIndex = i;
                            break;
                        }
                    }
                    if (canceledIndex == -1) {
                        System.out.println("해당 학생의 신청이 없습니다.");
                    } else {
                        String canceledName =
                                entries[canceledIndex].name;
                        entries[canceledIndex] = null;
                        System.out.println(
                                canceledName + "학생의 신청을 취소했습니다."
                        );
                    }
                    break;
                case "4":
                    // TODO 7. 현재 인원과 남은 자리 계산
                    int count = 0;
                    for (StudentEntry entry : entries) {
                        if (entry != null) {
                            count++;
                        }
                    }
                    System.out.println("현재 신청 인원: " + count + "명");
                    System.out.println("남은 자리: "
                            + (entries.length - count) + "명");
                    break;
                default:
                    System.out.println("0부터 4까지 선택하세요.");
            }
        }
        scanner.close();





    }
}