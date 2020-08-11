package kr.co.tjoeun.listview_20200810.datas

class Student(
    val name : String,
    val address : String,
    val isMale : Boolean,
    val birthYear : Int
) {

    // 학생이 갖는 하위 정보 목록을
    // 멤버변수로 만들자

//    성별을 String 형태로 가공해서 출력해주는 기능 - function
    fun getGenderString() : String {
        when (this.isMale){
            true -> {return "남성"}
            else -> {return "여성"}
        }
    }
}

}