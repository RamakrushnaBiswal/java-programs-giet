class Days{
int day;
    void Dai(){
        for ( day = 0; day < 7; day++) {
        if (day == 0) {
            System.out.println("0 -> Sunday");
        } else if (day == 1) {
            System.out.println("1 -> Monday");
        } else if (day == 2) {
            System.out.println("2 -> Tuesday");
        } else if (day == 3) {
            System.out.println("3 -> Wednesday");
        } else if (day == 4) {
            System.out.println("4 -> Thursday");
        } else if (day == 5) {
            System.out.println("5 -> Friday");
        } else if (day == 6) {
            System.out.println("6 -> Saturday");
        } else {
            System.out.println("Invalid day value");
        }
    }
    }
}

//             for (int i = 0; i < 7; i++) {
//         switch (i) {
//     case 0:System.out.println("0->Sunday");
//         break;
//     case 1:System.out.println("1->Monday");
//         break;
//     case 2:System.out.println("2->Tuesday");
//         break;
//     case 3:System.out.println("3->Wednesday");
//         break;
//     case 4:System.out.println("4->Thursday");
//         break;
//     case 5:System.out.println("5->Friday");
//         break;
//     case 6:System.out.println("6->Saturday");
//         break;
//     default:System.out.println("not needed");
//         break;
// }
//         }
class DaysMain{
    public static void main(String[] args){
        Days ob1 = new Days();
        ob1.Dai();
    }
}

