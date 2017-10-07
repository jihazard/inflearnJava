package Calendar;

import java.util.*;

public class CalendarA {
	static Scanner scanner=new Scanner(System.in);
	static Calendar cal = Calendar.getInstance();
	static Map sch = new HashMap();
	static List list = new ArrayList();
	public static void main(String[] args) {
		
		while(true){
			
			System.out.println("------------------------------------");
			System.out.println("1.일정 추가");
			System.out.println("2.일정 검색");
			System.out.println("3.달력 보기");
			System.out.println("------------------------------------");
			System.out.println(">>>");
			int inputValue = scanner.nextInt();
			
			if(inputValue==1){
				//일정추가.
				insert();
				
			}else if(inputValue==2){
				search();
				
			}else if(inputValue==3){
				//달력보기
				seeCalendar();
				
			}else{
				System.out.println("종료합니다.");
				break;
			}
			
			
			
		}
		
		
		
	
	}
	
	public static void seeCalendar(){
		
		
		int month=1;
		while(true){
			System.out.println("원한는 년을 선택하세요 : ");
			int year = scanner.nextInt();
			System.out.println("원하는 달을 선택하세요 : ");
			System.out.println(">>>");
			month=scanner.nextInt();
			
			if(month==-1){
				System.out.println("bye~!");
				break;
			}else if(month > 12)
			{
				continue;
				
			}
			cal.set(year, month-1, 1);
			System.out.printf("%d년   %d월달은 %2d일 까지 있습니다.",year,month ,cal.getActualMaximum(Calendar.DAY_OF_MONTH));
			System.out.println();
			int lastday = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
			
			System.out.println("   월    화    수    목    금    토    일");
			for(int i=1;i<=lastday;i++){
				System.out.printf("%3d",i);
				if(i % 7 == 0){
					System.out.println();
				}
			}
			
			
			
			System.out.println();
		}
		 
	 }	
	
	public static void insert(){
		
		System.out.println("일정추가합니다. ex)yyyy-mm-dd");
		String[] StringDate=null;
		scanner.nextLine();
		String insertDate=scanner.nextLine();
		System.out.println("일정을 입력해주세요");
		String insertSch=scanner.nextLine();
		
		StringDate=insertDate.split("-");
		for(String x : StringDate){
			System.out.println(x);
		}
		list.add(insertSch);
		sch.put(insertDate, list);
		
		
		System.out.println("일정입력이 완료 되었습니다.");
		
		
		
		
		
	}
	public static void search(){
		System.out.println("[일정검색] 검색할 날짜를 입력하세요 ");
		scanner.nextLine();
		String searchDate = scanner.nextLine();
		sch.get(searchDate);
		System.out.printf("총 %d 건의 일정이 있습니다." , list.size());
		System.out.println(sch.get(searchDate));
		
		
	}
}
