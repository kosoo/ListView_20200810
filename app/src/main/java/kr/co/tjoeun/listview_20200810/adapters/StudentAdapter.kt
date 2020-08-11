package kr.co.tjoeun.listview_20200810.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import kr.co.tjoeun.listview_20200810.R
import kr.co.tjoeun.listview_20200810.datas.Student

class StudentAdapter(
    val mContext: Context,
    val resId: Int,
    val mList: List<Student>
) : ArrayAdapter<Student>(mContext, resId, mList) {
    //    xml ->  객체로 변환 (Inflate) 해주는 변수
    val inf = LayoutInflater.from(mContext)

//    각각의 줄에 뿌려질 모양 + 데이터 조합 함수
//    기본 모양이 아니라 => 우리가 그린 xml로 뿌려지게 하려면 => 오버라이딩으로 커스터마이징

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

//        convertView 변수는 내용물 변경 불가
//        => tempRow를 var로 만들어서 담아주면 상황에 따라 내용물 변경 가능
        var tempRow = convertView

//        상황 : tempRow (convertView)에 아무것도 안담겨 있다면
        if (tempRow == null) {
//            student_list_item의 모양을 tempRow에  담아서 채워주자
            tempRow = inf.inflate(R.layout.student_list_item, null)
        }
//        tempRow에는 절대 null일 가능성이 없다. => row에 절대 null이 아니라고 하면서(!!) 대입
//        각각의 줄에 뿌려질 모양이 row에 담김
        val row = tempRow!!

//        row가 뿌려지기 전에 => 데이터와 조합해서 적당히 문구등등 수정하고 나서 뿌려주자

//        뿌려줄 row 안에 있는 텍스트뷰를 변수로 담지
        val nameTxt = row.findViewById<TextView>(R.id.nameTxt)

//        상황에 맞게 (position에 맞게) 뿌려줄 근거 데이터 변수 (mList에서) 가져오기
        val data = mList[position]

//        UI에 근거 데이터 반영하기
        nameTxt.text = data.name


//        최종 완성된 row를 뿌려달라고 리턴처리
        return row

    }
}